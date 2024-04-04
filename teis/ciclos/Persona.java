package teis.ciclos;

import java.util.Date;

public abstract class Persona implements MyComparable, Comparable {

  private String nombre;

  public Date fechaNacimiento;

  protected static int contador;

  public void getNombre() {
  }

  public void setNombre(String nombre) {
  }

  public Persona() {
  }

}