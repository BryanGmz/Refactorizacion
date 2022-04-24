package com.jbravo.pokegotchi.app.motor.vida;

import com.jbravo.pokegotchi.app.PokeGotchi;
import com.jbravo.pokegotchi.app.motor.Jugador;
import com.jbravo.pokegotchi.app.pokemons.Pokemon;

import java.util.Random;

public class VidaMascota extends Thread {

    private int posicionMascota;
    private boolean vivo;
    private String pokemon;
    private int vida;
    private Random random;
    private Pokemon instanciaPokemon;

    public VidaMascota (int posicionMascota) {
        this.posicionMascota = posicionMascota;
        this.vivo = true;
        this.pokemon = " '" + Jugador.getInstancia().getPokemons(posicionMascota).getNombrePokemon() + "' ";
        this.vida = Jugador.getInstancia().getPokemons(posicionMascota).getVida();
        this.random = new Random();
        this.instanciaPokemon = Jugador.getInstancia().getPokemons(posicionMascota);
    }

    @Override
    public void run() {
        try{
            do {
                instanciaPokemon.vida();
                vida = instanciaPokemon.getVida();
                Thread.sleep(tiempoADetener(random, vida));
                instanciaPokemon.necesitaNuevoPaseo();
                notificarAccionEnPantalla("La mascota " + (posicionMascota + 1) + pokemon +" quiere salir a pasear");
                if(instanciaPokemon.getContPeticionPaseo() == 4){
                    instanciaPokemon.nuevaEnfermedad();
                    instanciaPokemon.setContPeticionPaseo(0);
                    notificarAccionEnPantalla("La mascota " + (posicionMascota + 1) + pokemon + " se enfermó por no pasear");
                    comprobarEnfermedadesPokemon();
                }

                Thread.sleep(tiempoADetener(random, vida));
                instanciaPokemon.necesitaComida();
                notificarAccionEnPantalla("La mascota " + (posicionMascota + 1) + pokemon + " quiere comer");
                if (instanciaPokemon.getContPeticionComida() == instanciaPokemon.getCantidadComidasParaMorir()){
                    notificarAccionEnPantalla("La mascota " + (posicionMascota + 1) + pokemon + " ha muerto de hambre");
                    break;
                }

                if (instanciaPokemon.getContadorComida() >= 2){
                    Thread.sleep(tiempoADetener(random, vida));
                    instanciaPokemon.setContPopo(instanciaPokemon.getContPopo()+1);
                    notificarAccionEnPantalla("La mascota " + (posicionMascota + 1) + pokemon + " se hizo popo :c");
                    instanciaPokemon.setContadorComida(0);
                    if (instanciaPokemon.getContPopo() == 3){
                        instanciaPokemon.nuevaEnfermedad();
                        instanciaPokemon.setContPopo(0);
                        notificarAccionEnPantalla("La mascota " + (posicionMascota + 1) + pokemon + " se ha enfermado por no limpiarlo");
                        comprobarEnfermedadesPokemon();
                    }
                }

                if(instanciaPokemon.getNivel() == 5){
                    Thread.sleep(tiempoADetener(random, vida));
                    vivo = false;
                }

            } while (vivo);
            Jugador.muerteMascota(posicionMascota);
            PokeGotchi.ventanaPrincipal.dibujarEnFrame();
        }catch(Exception e){
            //implementar una logica para manejar la excepcion
        }
    }

    private void notificarAccionEnPantalla (String mensage) {
        PokeGotchi.ventanaPrincipal.alerta(mensage);
        PokeGotchi.ventanaPrincipal.dibujarEnFrame();
    }

    private int tiempoADetener(Random random, int vidaActual) {
        return (random.nextInt(vidaActual) + 2) * 10000;
    }

    private void comprobarEnfermedadesPokemon(){
        if (instanciaPokemon.getContadorEnfermedades()==6){
            Jugador.muerteMascota(posicionMascota);
            notificarAccionEnPantalla("La mascota " + (posicionMascota + 1) + pokemon + " ha muerto por enfermedades :c");
        }
    }

}
