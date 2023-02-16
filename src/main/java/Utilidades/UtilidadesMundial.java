package Utilidades;

import Modelos.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesMundial {


    public static Map<Seleccion, List<Jugador>> crearMapa() {

        Map<Seleccion, List<Jugador>> MapaSeleccionJUgador = new HashMap<>();

        Pais españa = new Pais();

        españa.setNombre("España");

        Pais argentina = new Pais();

        argentina.setNombre("Argentina");

        Pais francia = new Pais();

        francia.setNombre("Francia");


        Seleccion seleccionespañola = new Seleccion();

        seleccionespañola.setContinente(Continentes.Europa);
        seleccionespañola.setNombre("España");
        seleccionespañola.setPais(españa);


        Seleccion seleccionargentina = new Seleccion();

        seleccionargentina.setContinente(Continentes.America);
        seleccionargentina.setNombre("Argentina");
        seleccionargentina.setPais(argentina);

        Liga ligaespañola = new Liga();

        ligaespañola.setNombre("Liga Santander");
        ligaespañola.setPais(españa);

        Liga ligafrancesa = new Liga();

        ligafrancesa.setNombre("League1");
        ligafrancesa.setPais(francia);


        Jugador jugadorEspaña = new Jugador();
        jugadorEspaña.setNombre("Pedri");
        jugadorEspaña.setLiga(ligaespañola);
        jugadorEspaña.setPosicion(Posicion.MC);
        jugadorEspaña.setFechaNacimiento(LocalDate.of(10, 1, 1998));

        Jugador jugadorEspaña1 = new Jugador();
        jugadorEspaña1.setNombre("Gabi");
        jugadorEspaña1.setLiga(ligaespañola);
        jugadorEspaña1.setPosicion(Posicion.MC);
        jugadorEspaña1.setFechaNacimiento(LocalDate.of(14, 2, 1998));

        Jugador jugadorargentino = new Jugador();
        jugadorargentino.setNombre("Messi");
        jugadorargentino.setLiga(ligafrancesa);
        jugadorargentino.setPosicion(Posicion.MC);
        jugadorargentino.setFechaNacimiento(LocalDate.of(14, 2, 1986));

        Jugador jugadorargentino1 = new Jugador();
        jugadorargentino1.setNombre("DiMaria");
        jugadorargentino1.setLiga(ligafrancesa);
        jugadorargentino1.setPosicion(Posicion.MC);
        jugadorargentino1.setFechaNacimiento(LocalDate.of(14, 2, 1988));


        List<Jugador> JugEspaña = List.of(jugadorEspaña, jugadorEspaña1);
        List<Jugador> JugArgentina = List.of(jugadorargentino, jugadorargentino1);


        MapaSeleccionJUgador.put(seleccionespañola, JugEspaña);
        MapaSeleccionJUgador.put(seleccionargentina, JugArgentina);

        return MapaSeleccionJUgador;

    }

    //EJERCICIO2
    public static List<Jugador> GetPorPaisyPosicion(Map<Seleccion, List<Jugador>> mapa, Pais pais, Posicion posicion) {

        List<Jugador> JugadoresCoinciden = new ArrayList<>();

        for (Seleccion seleccion : mapa.keySet()) {

            if (seleccion.getPais().equals(pais)) {

                for (Jugador jugador : mapa.get(seleccion)) {

                    if (jugador.getPosicion().equals(posicion)) {
                        JugadoresCoinciden.add(jugador);
                    }
                }
            }

        }
        return JugadoresCoinciden;

    }


    //Ejercicio 3

    public static Map<Pais, List<Seleccion>> getSeleccionPais (Map < Seleccion, List < Jugador >> mapa){

        Map<Pais, List<Seleccion>> SeleccionesPorPais = new HashMap<>();


        for (Seleccion seleccion: mapa.keySet()){

            SeleccionesPorPais.put(seleccion.getPais(),new ArrayList<>());
            SeleccionesPorPais.get(seleccion.getPais()).add(seleccion);

        }
        return SeleccionesPorPais;



    }

}