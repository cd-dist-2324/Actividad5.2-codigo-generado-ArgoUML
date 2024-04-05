

class Matricula{
    private String curso;
    private Float calificacion;
    private Modulo modulo;
    private Alumno alumno;

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Float getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(Float calificacion) {
        this.calificacion = calificacion;
    }
    public Modulo getModulo() {
        return modulo;
    }
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    public Alumno getAlumno() {
        return alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    
}