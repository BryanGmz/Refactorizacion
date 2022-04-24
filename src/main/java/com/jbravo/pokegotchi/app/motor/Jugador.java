package com.jbravo.pokegotchi.app.motor;

import com.jbravo.pokegotchi.app.PokeGotchi;
import com.jbravo.pokegotchi.app.motor.vida.VidaMascota;
import com.jbravo.pokegotchi.app.pokemons.Pokemon;
import com.jbravo.pokegotchi.app.pokemons.PokemonVacio;

import javax.swing.*;

public class Jugador {

    private int monedas;
    private int contadorManzanas;
    private int contadorCereal;
    private int contadorWaffles;
    private int contadorVitaminas;
    private int contadorAnalgesico;
    private int contadorAntibiotico;
    private static Jugador instanciaDeJugador;

    private static Pokemon [] pokemons = new Pokemon[5];      //pokemones disponibles
    private static Pokemon [] cementerio = new Pokemon[5];    //pokemones muertos que pueden revivir :c

    private Jugador(){
        monedas             = 100;
        contadorManzanas    =   0;
        contadorCereal      =   0;
        contadorWaffles     =   0;
        contadorVitaminas   =   0;
        contadorAnalgesico  =   0;
        contadorAntibiotico =   0;

        for(int i = 0; i < 5; i++){
            pokemons[i] = new PokemonVacio();
            cementerio[i] = new PokemonVacio();
        }
    }

    public static Jugador getInstancia() {
        if (instanciaDeJugador == null) {
            instanciaDeJugador = new Jugador();
        } return instanciaDeJugador;
    }

    public Pokemon getPokemons(int posicion) {return pokemons[posicion];} //GET Y SET POKEMON
    public void setPokemons(int posicion, Pokemon cambio) {pokemons[posicion] = cambio;}

    public int getMonedas() {return monedas;}public void setMonedas(int monedas) {this.monedas = monedas;}
    public int getContadorManzanas() {return contadorManzanas;}public void setContadorManzanas(int contadorManzanas) {this.contadorManzanas = contadorManzanas;}
    public int getContadorCereal() {return contadorCereal;}public void setContadorCereal(int contadorCereal) {this.contadorCereal = contadorCereal;}
    public int getContadorWaffles() {return contadorWaffles;}public void setContadorWaffles(int contadorWaffles) {this.contadorWaffles = contadorWaffles;}
    public int getContadorVitaminas() {return contadorVitaminas;}public void setContadorVitaminas(int contadorVitaminas) {this.contadorVitaminas = contadorVitaminas;}
    public int getContadorAnalgesico() {return contadorAnalgesico;} public void setContadorAnalgesico(int contadorAnalgesico) {this.contadorAnalgesico = contadorAnalgesico;}
    public int getContadorAntibiotico() {return contadorAntibiotico;} public void setContadorAntibiotico(int contadorAntibiotico) {this.contadorAntibiotico = contadorAntibiotico;}

    public Pokemon getCementerio(int posicion) {return cementerio[posicion];}

    public void setCementerio(int posicion, Pokemon cambio) {cementerio[posicion] = cambio;}

    // Metodos funcionales para el jugador
    public static void colocarNuevoPokemon(Pokemon nuevo){
        int colocar = comprobarEspacios();
        String mensaje = colocarMascota(colocar, nuevo);
        JOptionPane.showMessageDialog(null, mensaje);
        if (colocar < 5){
            VidaMascota vida = new VidaMascota(colocar);
            vida.start();
        }
    }

    public static void colocarCementerio(Pokemon nuevo){
        int colocar = comprobarEspacios();
        String mensaje = colocarMascota(colocar, nuevo);
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, mensaje);
    }

    public static void muerteMascota(int posicionMascota){
        colocarCementerio(pokemons[posicionMascota]);
        pokemons[posicionMascota] = new PokemonVacio();
        PokeGotchi.ventanaPrincipal.dibujarEnFrame();
    }

    private static int comprobarEspacios() {
        for (int i = 0; i < cementerio.length; i++) {
            if(cementerio[i] instanceof PokemonVacio){
                return i;
            }
        } return 11;
    }

    private static String colocarMascota(int colocar, Pokemon pokemon) {
        if (colocar == 11){
            return "No hay espacios disponibles para colocar esta mascota";
        } else {
            pokemons[colocar] = pokemon;
            pokemons[colocar].setPosicionMascota(colocar);
            return  "¡Mascota adoptada exitosamente!";
        }
    }
}
