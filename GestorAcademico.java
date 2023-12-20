import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico {
    ArrayList<Estudiante> estudiantes;
    ArrayList<Curso> cursos;
    HashMap asignacion;

    public ArrayList<Estudiante> getEstudiantes() {
        if(estudiantes==null) estudiantes= new ArrayList<Estudiante>();
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Curso> getCursos() {
        if(cursos==null) cursos = new ArrayList<Curso>();
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public HashMap getAsignacion() {
        if(asignacion==null) asignacion=new HashMap();
        return asignacion;
    }

    public void setAsignacion(HashMap asignacion) {
        this.asignacion = asignacion;
    }
}
