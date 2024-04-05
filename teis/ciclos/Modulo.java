package teis.ciclos;

import java.util.Vector;

public class Modulo {

  private String codigo;

  private Profesor docente;
  /**
   * 
   * @element-type Matricula
   */
  private Vector<Matricula> matriculas;
 
  private Examen examen;



  public Modulo() {
  }

  public Vector<Matricula> getMatriculas() {
    return this.matriculas;
  }

  public void setMatriculas(Vector<Matricula> matriculas) {
    this.matriculas = matriculas;
  }

}