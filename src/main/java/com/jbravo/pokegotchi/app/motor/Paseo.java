package com.jbravo.pokegotchi.app.motor;

import com.jbravo.pokegotchi.app.PokeGotchi;
import com.jbravo.pokegotchi.app.pokemons.PokemonVacio;

import javax.swing.*;
import java.util.Random;

public class Paseo {

    public static void pasear(int posicion){

        if(Jugador.getInstancia().getPokemons(posicion) instanceof PokemonVacio){
            alertaWindow("Este es un espacio vacío, puedes adoptar en tienda");

        }else{

            Random random = new Random();
            Jugador.getInstancia().getPokemons(posicion).setContPeticionPaseo(0);

            int encontrarPokemonSalvaje = random.nextInt(2);

            if (encontrarPokemonSalvaje == 0) {  //Si encuentra un pokemon
                alertaWindow("Durante el paseo " + Jugador.getInstancia().getPokemons(posicion).getNombrePokemon() + " se encontró a un pokemon salvaje");
                Jugador.getInstancia().getPokemons(posicion).setContadorBatallas(Jugador.getInstancia().getPokemons(posicion).getContadorBatallas() + 1);

                int ganar = random.nextInt(2);
                if (ganar == 0) { //Le gana?
                    int dineroGanado = Jugador.getInstancia().getPokemons(posicion).DineroGanado();
                    alertaWindow("¡" + Jugador.getInstancia().getPokemons(posicion).getNombrePokemon() + " ganó la batalla y obtuvo " + dineroGanado + " monedas!");
                    Jugador.getInstancia().setMonedas(Jugador.getInstancia().getMonedas() + dineroGanado);
                } else {
                    //perdió

                    alertaWindow("¡" + Jugador.getInstancia().getPokemons(posicion).getNombrePokemon() + " perdió la batalla!");
                }

            } else {
                alertaWindow("Durante el paseo " + Jugador.getInstancia().getPokemons(posicion).getNombrePokemon() + " no se encontró ningún pokemon salvaje");
            }
            Jugador.getInstancia().getPokemons(posicion).SubirNivel();
            PokeGotchi.ventanaPrincipal.dibujarEnFrame();
        }
    }
    
    public static void alertaWindow(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
