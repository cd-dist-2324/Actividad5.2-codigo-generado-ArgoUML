package teis.ciclos;

import java.util.Vector;

public class Alumno extends Persona {

  private Float notaMedia;



  /**
   * 
   * @element-type Matricula
   */
  
  private Vector<Matricula> matriculas;

  public Alumno() {
    super();
  }

  public Float getNotaMedia() {
    return this.notaMedia;
  }
  //generado en VS Code
  public void setNotaMedia(Float notaMedia) {
    this.notaMedia = notaMedia;
  }

  public Vector<Matricula> getMatriculas() {
    return matriculas;
  }

  public void setMatriculas(Vector<Matricula> matriculas) {
    this.matriculas = matriculas;
  }

 

}