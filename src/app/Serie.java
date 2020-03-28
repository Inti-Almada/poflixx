package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Series
 */
public class Serie extends Contenido {

    public List<Serie> series = new ArrayList<>();
    public List<Temporada> temporadas = new ArrayList<>();

    public Temporada getTemporada(int numeroDeTemporada) {
        // Recorrer cada temporada
        // Si el nro de temporada del cliclo es igual a "nro"
        // Devolver esa temporada

        for (Temporada tempo : this.temporadas) {
            if (tempo.numero == numeroDeTemporada) {
                return tempo;

            }
        }

        return null;
    }

}