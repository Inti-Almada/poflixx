package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Decarga
 */
public class Episodio extends Contenido {

   public List<Episodio> episodios = new ArrayList<>();

   public int numero;
   public String nombre;
   public double duracion;

   public void reproducir() {
      System.out.println("Reproduciendo episodio");

   }

public void add(Episodio epOtro) {
}
}
