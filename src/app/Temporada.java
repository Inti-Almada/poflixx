package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Infomacion
 */
public class Temporada extends Contenido {

   public int numero;
   public List<Episodio> episodios = new ArrayList<>();
   public List<Temporada> temporadas = new ArrayList<>();

   public Episodio getEpisodio(int numeroDeEpisodio) {
      for (Episodio epi : this.episodios) {
         if (epi.numero == numeroDeEpisodio) {

            return epi;
         }
      }
      return null;
   }
}
