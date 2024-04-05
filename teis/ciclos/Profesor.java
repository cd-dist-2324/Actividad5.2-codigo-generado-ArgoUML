
package teis.ciclos;

import java.util.Vector;


public class Profesor extends Persona {

  private String nrp;

    /**
   * 
   * @element-type Modulo
   */
  private Vector<Modulo>  modulos;

  public String getNrp() {
  return this.nrp;
  }

  public String setNrp(String nrp) {
  return this.nrp= nrp;
  }

  public Profesor() {
    super();

  }

}