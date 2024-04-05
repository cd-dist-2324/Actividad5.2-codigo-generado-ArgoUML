
package teis.ciclos;

import java.util.Date;


public abstract class Persona implements MyComparable, Comparable<Persona> {

  private String nombre;

  private Date fechaNacimiento;

  protected static int contador;

  public Persona() {
    //incrementamos el contador estático
    Persona.contador++;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public int comparar(Persona p) {
    if (p == null)
      return 1;
    if (p.fechaNacimiento == null) {
      if (this.fechaNacimiento != null)
        return 1;
      else
        return 0; // ambas fechas son null
    } else {
      if (this.fechaNacimiento == null) {
        return -1; // si el propio objeto no tiene establecida la fecha, pero el que viene por
                   // parámetro sí, entonces es "mayor el objeto que viene por parám"
      } else {
        // ambas fechas son distintas de null, habrá que compararlas
        return this.fechaNacimiento.compareTo(p.fechaNacimiento);
      }
    }

  }

  @Override
  public int compareTo(Persona o) {
    return this.comparar(o);
  }

}