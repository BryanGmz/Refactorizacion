package com.jbravo.pokegotchi.ui;

import com.jbravo.pokegotchi.app.PokeGotchi;
import com.jbravo.pokegotchi.app.motor.Jugador;
import com.jbravo.pokegotchi.app.motor.Paseo;
import com.jbravo.pokegotchi.app.motor.tienda.ListadoPokemons;
import com.jbravo.pokegotchi.app.pokemons.Pokemon;
import com.jbravo.pokegotchi.app.pokemons.PokemonGen;
import com.jbravo.pokegotchi.app.pokemons.PokemonVacio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PrincipalFrame extends JFrame{
    private JTabbedPane PrincipalJtp;
    private JPanel MascotasPnl;
    private JPanel TiendaPnl;
    private JPanel principalPanelPnl;
    private JTabbedPane MascotasJtp;
    private JPanel mascota1Pnl;
    private JPanel mascota2Pnl;
    private JPanel mascota3Pnl;
    private JPanel mascota4Pnl;
    private JButton curarMasc1Btn;
    private JButton alimentarMasc1Btn;
    private JButton limpiarMasc1Btn;
    private JLabel aspMasc1Lbl;
    private JLabel nombMasc1Lbl;
    private JLabel apMasc1Lbl;
    private JLabel fnMasc1Lbl;
    private JLabel nivelMasc1Lbl;
    private JLabel batMasc1Lbl;
    private JLabel batSubNivMasc1Lbl;
    private JLabel contEnfMasc1Lbl;
    private JLabel contComidasMasc1Lbl;
    private JLabel contPetComidaMasc1Lbl;
    private JLabel contPoposMasc1Lbl;
    private JLabel contPetPaseoMasc1Lbl;
    private JButton pasearMasc1Btn;
    private JLabel aspMasc2Lbl;
    private JButton pasearMasc2Btn;
    private JButton alimentarMasc2Btn;
    private JButton curarMasc2Btn;
    private JButton limpiarMasc2Btn;
    private JLabel nombMasc2Lbl;
    private JLabel apMasc2Lbl;
    private JLabel fnMasc2Lbl;
    private JLabel contPetPaseoMasc2Lbl;
    private JLabel nivelMasc2Lbl;
    private JLabel batMasc2Lbl;
    private JLabel batSubNivMasc2Lbl;
    private JLabel contEnfMasc2Lbl;
    private JLabel contComidasMasc2Lbl;
    private JLabel contPetComidaMasc2Lbl;
    private JLabel contPoposMasc2Lbl;
    private JButton pasearButton;
    private JButton alimentarButton;
    private JButton curarButton;
    private JButton limpiarButton;
    private JLabel nombMasc3Lbl;
    private JLabel apMasc3Lbl;
    private JLabel fnMasc3Lbl;
    private JLabel contPetPaseoMasc3Lbl;
    private JLabel nivelMasc3Lbl;
    private JLabel batMasc3Lbl;
    private JLabel batSubNivMasc3Lbl;
    private JLabel contEnfMasc3Lbl;
    private JLabel contComidasMasc3Lbl;
    private JLabel contPetComidaMasc3Lbl;
    private JLabel contPoposMasc3Lbl;
    private JLabel aspMasc3Lbl;
    private JButton Pasear;
    private JButton alimentarMasc4Btn;
    private JButton Curar;
    private JButton limpiarButton1;
    private JLabel nombMasc4Lbl;
    private JLabel apMasc4Lbl;
    private JLabel fnMasc4Lbl;
    private JLabel contPetPaseoMasc4Lbl;
    private JLabel nivelMasc4Lbl;
    private JLabel batMasc4Lbl;
    private JLabel batSubNivMasc4Lbl;
    private JLabel contEnfMasc4Lbl;
    private JLabel contComidasMasc4Lbl;
    private JLabel contPetComidaMasc4Lbl;
    private JLabel contPoposMasc4Lbl;
    private JLabel aspMasc4Lbl;
    private JButton pasearButton1;
    private JButton alimentarMasc5Btn;
    private JButton curarButton1;
    private JButton limpiarButton2;
    private JLabel nombMasc5Lbl;
    private JLabel apMasc5Lbl;
    private JLabel fnMasc5Lbl;
    private JLabel contPetPaseoMasc5Lbl;
    private JLabel nivelMasc5Lbl;
    private JLabel batMasc5Lbl;
    private JLabel batSubNivMasc5Lbl;
    private JLabel contEnfMasc5Lbl;
    private JLabel contComidasMasc5Lbl;
    private JLabel contPetComidaMasc5Lbl;
    private JLabel contPoposMasc5Lbl;
    private JLabel aspMasc5Lbl;
    private JSpinner posicionPokemonSpnr;
    private JButton previsualizarPokemonButton;
    private JButton adoptarPokemonBtn;
    private JLabel previsualizarPokemonLbl;
    private JTextField apodoMascTxf;
    private JLabel contManzanasLbl;
    private JLabel contCerealLbl;
    private JLabel contWafflesLbl;
    private JLabel contVitaminasLbl;
    private JLabel contAnalgesicoLbl;
    private JLabel contAntibioticoLbl;
    private JComboBox medicinaCbxMasc1;
    private JComboBox comidaCbxMasc1;
    private JComboBox comidaCbxMasc2;
    private JComboBox medicinaCbxMasc2;
    private JComboBox medicinaCbxMasc3;
    private JComboBox comidaCbxMasc3;
    private JComboBox medicinaCbxMasc4;
    private JComboBox comidaCbxMasc4;
    private JComboBox comidaCbxMasc5;
    private JComboBox medicinaCbxMasc5;
    private JButton $10Button;
    private JButton $30Button;
    private JButton $50Button;
    private JButton $20Button;
    private JButton $50Button1;
    private JButton $80Button;
    private JLabel monedasJugadorLbl;
    private JLabel nombreMascotaPrevLbl;
    private JLabel alertasLbl;
    private JButton button1;
    private JButton ayudaButton;
    private JButton opcionesDeDesarrolladorButton;
    private JButton cem1Lbl;
    private JButton cem2Lbl;
    private JButton cem3Lbl;
    private JButton cem4Lbl;
    private JButton cem5Lbl;
    private JLabel precioLbl1;
    private JLabel precioLbl2;
    private JLabel precioLbl3;
    private JLabel precioLbl4;
    private JLabel precioLbl5;
    private JLabel lblRevivirMascotas;

    private int precioARevivir1;
    private int precioARevivir2;
    private int precioARevivir3;
    private int precioARevivir4;
    private int precioARevivir5;

    private final JFrame alerta = new JFrame();

    public PrincipalFrame(){
        setSize(750,640);
        setContentPane(principalPanelPnl);
        this.setTitle("PokeGotchi");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setIconImage(new ImageIcon(getClass().getResource("/Sprites/025.png")).getImage());

        llenarCbx();
        dibujarEnFrame();
        dibujarMonedas();

        previsualizarPokemonButton.addActionListener(new ActionListener() { //PREVISUALIZAR POKEMON ------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                int posicion = 1;
                try{
                    posicion = Integer.parseInt(posicionPokemonSpnr.getValue().toString());
                }catch (Exception a){
                    //manejar excepcion
                    alertaWindow("Ha introducido un valor que no se puede procesar, se tomará 1 por defecto");
                }
                String pokemonAGenerar = ListadoPokemons.Pokemon(posicion);
                String[] propiedades = pokemonAGenerar.split("-");
                previsualizarPokemonLbl.setIcon(new ImageIcon(getClass().getResource(propiedades[0])));
                nombreMascotaPrevLbl.setText("El Pokemon seleccionado es: " + propiedades[1]);
            }
        });
        adoptarPokemonBtn.addActionListener(new ActionListener() { //ADOPTAR POKEMON ---------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                int posicion = 1;
                try{
                    posicion = Integer.parseInt(posicionPokemonSpnr.getValue().toString());
                }catch (Exception a){
                    //manejar excepcion
                    alertaWindow("Ha introducido un valor que no se puede procesar, se tomará 1 por defecto");
                    posicion = 1;
                }
                if(Jugador.getInstancia().getMonedas() >= 50){
                    if(posicion <1 || posicion>151){
                        alertaWindow("Imposible, posición inválida");
                    }else{
                        String pokemonAGenerar = ListadoPokemons.Pokemon(posicion);
                        String[] propiedades = pokemonAGenerar.split("-");
                        String apodo = apodoMascTxf.getText();
                        Pokemon nuevo = new PokemonGen(apodo,propiedades[0],propiedades[1]);
                        Jugador.colocarNuevoPokemon(nuevo);
                        apodoMascTxf.setText("");
                        Jugador.getInstancia().setMonedas(Jugador.getInstancia().getMonedas() - 50);
                    }
                }else{
                    alertaWindow("Usted no tiene dinero suficiente para adoptar una mascota :c");
                }
                dibujarEnFrame();
                nombreMascotaPrevLbl.setText("Seleccione una posicion");
            }
        });
        $10Button.addActionListener(new ActionListener() {//VENDER MANZANA, VALE 10 -------------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Jugador.getInstancia().getMonedas() >= 10){
                    Jugador.getInstancia().setMonedas(Jugador.getInstancia().getMonedas() - 10);
                    Jugador.getInstancia().setContadorManzanas(Jugador.getInstancia().getContadorManzanas()+1);
                    JOptionPane.showMessageDialog(alerta, "Compra realizada exitosamente");
                }else{
                    JOptionPane.showMessageDialog(alerta, "No tiene suficiente dinero :c");
                }
                dibujarMonedas();dibujarInventario();
            }
        });
        $30Button.addActionListener(new ActionListener() {//VENDER CEREAL, VALE 30
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Jugador.getInstancia().getMonedas() >= 30){
                    Jugador.getInstancia().setMonedas(Jugador.getInstancia().getMonedas() - 30);
                    Jugador.getInstancia().setContadorCereal(Jugador.getInstancia().getContadorCereal()+1);
                    JOptionPane.showMessageDialog(alerta, "Compra realizada exitosamente");
                }else{
                    JOptionPane.showMessageDialog(alerta, "No tiene suficiente dinero :c");
                }
                dibujarMonedas();dibujarInventario();
            }
        });
        $50Button.addActionListener(new ActionListener() { // VENDER WAFFLES
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Jugador.getInstancia().getMonedas() >= 50){
                    Jugador.getInstancia().setMonedas(Jugador.getInstancia().getMonedas() - 50);
                    Jugador.getInstancia().setContadorWaffles(Jugador.getInstancia().getContadorWaffles()+1);
                    JOptionPane.showMessageDialog(alerta, "Compra realizada exitosamente");
                }else{
                    JOptionPane.showMessageDialog(alerta, "No tiene suficiente dinero :c");
                }
                dibujarMonedas();dibujarInventario();
            }
        });
        $20Button.addActionListener(new ActionListener() { //VENDER VITAMINAS
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Jugador.getInstancia().getMonedas() >= 20){
                    Jugador.getInstancia().setMonedas(Jugador.getInstancia().getMonedas() - 20);
                    Jugador.getInstancia().setContadorVitaminas(Jugador.getInstancia().getContadorVitaminas()+1);
                    JOptionPane.showMessageDialog(alerta, "Compra realizada exitosamente");
                }else{
                    JOptionPane.showMessageDialog(alerta, "No tiene suficiente dinero :c");
                }
                dibujarMonedas();dibujarInventario();
            }
        });
        $50Button1.addActionListener(new ActionListener() { //VENDER ANALGESICO
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Jugador.getInstancia().getMonedas() >= 50){
                    Jugador.getInstancia().setMonedas(Jugador.getInstancia().getMonedas() - 50);
                    Jugador.getInstancia().setContadorAnalgesico(Jugador.getInstancia().getContadorAnalgesico()+1);
                    JOptionPane.showMessageDialog(alerta, "Compra realizada exitosamente");
                }else{
                    JOptionPane.showMessageDialog(alerta, "No tiene suficiente dinero :c");
                }
                dibujarMonedas();dibujarInventario();
            }
        });
        $80Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Jugador.getInstancia().getMonedas() >= 80){
                    Jugador.getInstancia().setMonedas(Jugador.getInstancia().getMonedas() - 80);
                    Jugador.getInstancia().setContadorAntibiotico(Jugador.getInstancia().getContadorAntibiotico()+1);
                    JOptionPane.showMessageDialog(alerta, "Compra realizada exitosamente");
                }else{
                    JOptionPane.showMessageDialog(alerta, "No tiene suficiente dinero :c");
                }
                dibujarMonedas();dibujarInventario();
            }
        });
        alimentarMasc1Btn.addActionListener(new ActionListener() { //ALIMENTAR MASCOTAS-------------------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                String comida = Objects.requireNonNull(comidaCbxMasc1.getSelectedItem()).toString();
                comida = comidaCbxMasc1.getSelectedItem().toString();

                Jugador.getInstancia().getPokemons(0).alimentar(comida);
                dibujarEnFrame();
            }
        });
        alimentarMasc2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comida = Objects.requireNonNull(comidaCbxMasc2.getSelectedItem()).toString();
                comida = comidaCbxMasc2.getSelectedItem().toString();

                Jugador.getInstancia().getPokemons(1).alimentar(comida);
                dibujarEnFrame();
            }
        });
        alimentarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comida = Objects.requireNonNull(comidaCbxMasc3.getSelectedItem()).toString();
                comida = comidaCbxMasc3.getSelectedItem().toString();

                Jugador.getInstancia().getPokemons(2).alimentar(comida);
                dibujarEnFrame();
            }
        });
        alimentarMasc4Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comida = Objects.requireNonNull(comidaCbxMasc4.getSelectedItem()).toString();
                comida = comidaCbxMasc4.getSelectedItem().toString();

                Jugador.getInstancia().getPokemons(3).alimentar(comida);
                dibujarEnFrame();
            }
        });
        alimentarMasc5Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comida = Objects.requireNonNull(comidaCbxMasc5.getSelectedItem()).toString();
                comida = comidaCbxMasc5.getSelectedItem().toString();

                Jugador.getInstancia().getPokemons(4).alimentar(comida);
                dibujarEnFrame();
            }
        });
        limpiarMasc1Btn.addActionListener(new ActionListener() { // LIMPIAR MASCOTAS ---------------------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarMascota(0);
            }
        });
        limpiarMasc2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarMascota(1);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarMascota(2);
            }
        });
        limpiarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarMascota(3);
            }
        });
        limpiarButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarMascota(4);
            }
        });
        curarMasc1Btn.addActionListener(new ActionListener() { //CURAR POKEMONES -------------------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicina = Objects.requireNonNull(medicinaCbxMasc1.getSelectedItem()).toString();
                medicina = medicinaCbxMasc1.getSelectedItem().toString();
                Jugador.getInstancia().getPokemons(0).curar(medicina);
                dibujarEnFrame();
            }
        });
        curarMasc2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicina = Objects.requireNonNull(medicinaCbxMasc2.getSelectedItem()).toString();
                medicina = medicinaCbxMasc2.getSelectedItem().toString();
                Jugador.getInstancia().getPokemons(1).curar(medicina);
                dibujarEnFrame();
            }
        });
        curarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicina = Objects.requireNonNull(medicinaCbxMasc3.getSelectedItem()).toString();
                medicina = medicinaCbxMasc3.getSelectedItem().toString();
                Jugador.getInstancia().getPokemons(2).curar(medicina);
                dibujarEnFrame();
            }
        });
        Curar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicina = Objects.requireNonNull(medicinaCbxMasc4.getSelectedItem()).toString();
                medicina = medicinaCbxMasc4.getSelectedItem().toString();
                Jugador.getInstancia().getPokemons(3).curar(medicina);
                dibujarEnFrame();
            }
        });
        curarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicina = Objects.requireNonNull(medicinaCbxMasc5.getSelectedItem()).toString();
                medicina = medicinaCbxMasc5.getSelectedItem().toString();
                Jugador.getInstancia().getPokemons(4).curar(medicina);
                dibujarEnFrame();
            }
        });
        button1.addActionListener(new ActionListener() { //MENU ACERCA DE, AYUDA Y OPCIONES DE DESARROLLADOR ---------------------------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                AcercaDeFrame acercaDeFrame = new AcercaDeFrame();
                acercaDeFrame.setLocationRelativeTo(null);
                acercaDeFrame.setVisible(true);
            }
        });
        ayudaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ayuda ayuda = new Ayuda();
                ayuda.setLocationRelativeTo(null);
                ayuda.setVisible(true);
            }
        });
        opcionesDeDesarrolladorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OpcionesDeDesarrollador opcionesDeDesarrollador = new OpcionesDeDesarrollador();
                opcionesDeDesarrollador.setLocationRelativeTo(null);
                opcionesDeDesarrollador.setVisible(true);
            }
        });
        cem1Lbl.addActionListener(new ActionListener() { // REVIVIR POKEMONES ---------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                revivirMascota(0, precioARevivir1);
            }
        });
        cem2Lbl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                revivirMascota(1, precioARevivir2);
            }
        });
        cem3Lbl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                revivirMascota(2, precioARevivir3);
            }
        });
        cem4Lbl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                revivirMascota(3, precioARevivir4);
            }
        });
        cem5Lbl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                revivirMascota(4, precioARevivir5);
            }
        });
        pasearMasc1Btn.addActionListener(new ActionListener() { //PASEAR -----------------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                Paseo.pasear(0);
            }
        });
        pasearMasc2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paseo.pasear(1);
            }
        });
        pasearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paseo.pasear(2);
            }
        });
        Pasear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paseo.pasear(3);
            }
        });
        pasearButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paseo.pasear(4);
            }
        });
    }

    public void revivirMascota(int numeroDeMascota, int precioDeRevivir) {
        if(Jugador.getInstancia().getCementerio(numeroDeMascota) instanceof PokemonVacio){
            alertaWindow("Este es un espacio vacío");
        } else {
            if (Jugador.getInstancia().getMonedas() >= precioDeRevivir){
                Jugador.getInstancia().getCementerio(numeroDeMascota).revivir();
                Jugador.colocarNuevoPokemon(Jugador.getInstancia().getCementerio(numeroDeMascota));
                Jugador.getInstancia().setCementerio(numeroDeMascota, new PokemonVacio());
                Jugador.getInstancia().setMonedas(Jugador.getInstancia().getMonedas() - precioDeRevivir);
            } else{
                alertaWindow("No tiene suficientes monedas para revivir a esta mascota :c");
            }
        }
        dibujarEnFrame();
    }

    public void dibujarEnFrame() {
        for (int i = 0; i < 5; i++) {
            asignarIconoAMascota(getLabelIconoMascota(i), Jugador.getInstancia().getPokemons(i).getAspecto());
            asignarCaracteristicasAMascota(obtenerListadoDeLabels(i), obtenerCaracteristicas(i, Jugador.getInstancia()));
        }
        dibujarInventario();
        dibujarCementerio();
        dibujarMonedas();
    }

    public JLabel getLabelIconoMascota(int numeroPokemon) {
        return switch (numeroPokemon) {
            case 0 -> aspMasc1Lbl;
            case 1 -> aspMasc2Lbl;
            case 2 -> aspMasc3Lbl;
            case 3 -> aspMasc4Lbl;
            case 4 -> aspMasc5Lbl;
            default -> null;
        };
    }

    public void asignarIconoAMascota(JLabel aspecto, String pathIcono) {
        aspecto.setIcon(new ImageIcon(getClass().getResource(pathIcono)));
    }

    public void asignarCaracteristicasAMascota(List<JLabel> listaDeLabels, List<String> listaDeCaracteristicas){
        for (int i = 0; i < listaDeLabels.size(); i++) {
            listaDeLabels.get(i).setText(listaDeCaracteristicas.get(i));
        }
    }

    public List<JLabel> obtenerListadoDeLabels(int numeroDePokemon) {
        return switch (numeroDePokemon) {
            case 0 -> Arrays.asList(nombMasc1Lbl, apMasc1Lbl, fnMasc1Lbl, contPetPaseoMasc1Lbl, nivelMasc1Lbl,
                    batMasc1Lbl, batSubNivMasc1Lbl, contEnfMasc1Lbl, contComidasMasc1Lbl, contPetComidaMasc1Lbl, contPoposMasc1Lbl);
            case 1 -> Arrays.asList(nombMasc2Lbl, apMasc2Lbl, fnMasc2Lbl, contPetPaseoMasc2Lbl, nivelMasc2Lbl,
                    batMasc2Lbl, batSubNivMasc2Lbl, contEnfMasc2Lbl, contComidasMasc2Lbl, contPetComidaMasc2Lbl, contPoposMasc2Lbl);
            case 2 -> Arrays.asList(nombMasc3Lbl, apMasc3Lbl, fnMasc3Lbl, contPetPaseoMasc3Lbl, nivelMasc3Lbl,
                    batMasc3Lbl, batSubNivMasc3Lbl, contEnfMasc3Lbl, contComidasMasc3Lbl, contPetComidaMasc3Lbl, contPoposMasc3Lbl);
            case 3 -> Arrays.asList(nombMasc4Lbl, apMasc4Lbl, fnMasc4Lbl, contPetPaseoMasc4Lbl, nivelMasc4Lbl,
                    batMasc4Lbl, batSubNivMasc4Lbl, contEnfMasc4Lbl, contComidasMasc4Lbl, contPetComidaMasc4Lbl, contPoposMasc4Lbl);
            case 4 -> Arrays.asList(nombMasc5Lbl, apMasc5Lbl, fnMasc5Lbl, contPetPaseoMasc5Lbl, nivelMasc5Lbl,
                    batMasc5Lbl, batSubNivMasc5Lbl, contEnfMasc5Lbl, contComidasMasc5Lbl, contPetComidaMasc5Lbl, contPoposMasc5Lbl);
            default -> new ArrayList<>();
        };
    }

    public List<String> obtenerCaracteristicas(int numeroDePokemon, Jugador jugador) {
        if (numeroDePokemon >= 0 && numeroDePokemon < 5) {
            return Arrays.asList(
                    jugador.getPokemons(numeroDePokemon).getNombrePokemon(),
                    jugador.getPokemons(numeroDePokemon).getApodo(),
                    jugador.getPokemons(numeroDePokemon).getFechaDeNacimiento(),
                    Integer.toString(jugador.getPokemons(numeroDePokemon).getContPeticionPaseo()),
                    Integer.toString(jugador.getPokemons(numeroDePokemon).getNivel()),
                    Integer.toString(jugador.getPokemons(numeroDePokemon).getContadorBatallas()),
                    Integer.toString(jugador.getPokemons(numeroDePokemon).getBatallasParaSubirDeNivel()),
                    Integer.toString(jugador.getPokemons(numeroDePokemon).getContadorEnfermedades()),
                    Integer.toString(jugador.getPokemons(numeroDePokemon).getContadorComida()),
                    Integer.toString(jugador.getPokemons(numeroDePokemon).getContPeticionComida()),
                    Integer.toString(jugador.getPokemons(numeroDePokemon).getContPopo())
            );
        }
        return new ArrayList<>();
    }

    private void dibujarInventario(){
        asignarTextoEIconoAContadoresDelInventario(contManzanasLbl, Jugador.getInstancia().getContadorManzanas(), PokeGotchi.manzana.getAspecto());
        asignarTextoEIconoAContadoresDelInventario(contCerealLbl, Jugador.getInstancia().getContadorManzanas(), PokeGotchi.cereal.getAspecto());
        asignarTextoEIconoAContadoresDelInventario(contWafflesLbl, Jugador.getInstancia().getContadorManzanas(), PokeGotchi.waffles.getAspecto());
        asignarTextoEIconoAContadoresDelInventario(contVitaminasLbl, Jugador.getInstancia().getContadorManzanas(), PokeGotchi.vitaminas.getAspecto());
        asignarTextoEIconoAContadoresDelInventario(contAnalgesicoLbl, Jugador.getInstancia().getContadorManzanas(), PokeGotchi.analgesico.getAspecto());
        asignarTextoEIconoAContadoresDelInventario(contAntibioticoLbl, Jugador.getInstancia().getContadorManzanas(), PokeGotchi.antibiotico.getAspecto());
    }

    private void asignarTextoEIconoAContadoresDelInventario(JLabel recurso, int contador, String pathIcono) {
        recurso.setText(Integer.toString(contador));
        recurso.setIcon(new ImageIcon(getClass().getResource(pathIcono)));
    }

    private  void llenarCbx(){
        List<String> medicamentos = Arrays.asList("Vitaminas", "Analgesicos", "Antibioticos");
        List<String> alimentos = Arrays.asList("Manzana", "Cereal", "Waffles");
        List<JComboBox> comboBoxListMedicinas = Arrays.asList(medicinaCbxMasc1, medicinaCbxMasc2, medicinaCbxMasc3, medicinaCbxMasc4, medicinaCbxMasc5);
        List<JComboBox> comboBoxListAlimentos = Arrays.asList(comidaCbxMasc1, comidaCbxMasc2, comidaCbxMasc3, comidaCbxMasc4, comidaCbxMasc5);
        agregarItemsAlComboBox(comboBoxListAlimentos, alimentos);
        agregarItemsAlComboBox(comboBoxListMedicinas, medicamentos);
    }


    private void agregarItemsAlComboBox(List<JComboBox> comboBoxs, List<String> items) {
        for (JComboBox comboBox : comboBoxs) {
            for (String item: items) {
                comboBox.addItem(item);
            }
        }
    }

    private void dibujarMonedas(){
        monedasJugadorLbl.setText("Sus monedas disponibles son: " + Jugador.getInstancia().getMonedas());
    }

    public void alerta(String mensaje){
        alertasLbl.setText(mensaje);
    }

    public void alertaWindow(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private void limpiarMascota(int posicion){
        Jugador.getInstancia().getPokemons(posicion).setContPopo(0);
        alertaWindow("¡Se ha limpiado correctamente!");
        dibujarEnFrame();
    }

    public void dibujarCementerio(){

        cem1Lbl.setIcon(new ImageIcon(getClass().getResource(Jugador.getInstancia().getCementerio(0).getAspecto())));
        precioARevivir1 = 5 * Jugador.getInstancia().getCementerio(0).getNivel() + 10;
        precioLbl1.setText("Revivir por: $" + precioARevivir1);

        cem2Lbl.setIcon(new ImageIcon(getClass().getResource(Jugador.getInstancia().getCementerio(1).getAspecto())));
        precioARevivir2 = 5 * Jugador.getInstancia().getCementerio(1).getNivel() + 10;
        precioLbl2.setText("Revivir por: $" + precioARevivir2);

        cem3Lbl.setIcon(new ImageIcon(getClass().getResource(Jugador.getInstancia().getCementerio(2).getAspecto())));
        precioARevivir3 = 5 * Jugador.getInstancia().getCementerio(2).getNivel() + 10;
        precioLbl3.setText("Revivir por: $" + precioARevivir3);

        cem4Lbl.setIcon(new ImageIcon(getClass().getResource(Jugador.getInstancia().getCementerio(3).getAspecto())));
        precioARevivir4 = 5 * Jugador.getInstancia().getCementerio(3).getNivel() + 10;
        precioLbl4.setText("Revivir por: $" + precioARevivir4);

        cem5Lbl.setIcon(new ImageIcon(getClass().getResource(Jugador.getInstancia().getCementerio(4).getAspecto())));
        precioARevivir5 = 5 * Jugador.getInstancia().getCementerio(4).getNivel() + 10;
        precioLbl5.setText("Revivir por: $" + precioARevivir5);

        lblRevivirMascotas.setText("Seleccione la mascota que desea revivir    (Sus monedas disponibles son: " + Jugador.getInstancia().getMonedas() + " monedas)");

    }

}
