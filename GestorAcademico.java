import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestorAcademico implements ServiciosAcademicosI{
    ArrayList<Estudiante> estudiantes;
    ArrayList<Curso> cursos;
    Map<Estudiante, Curso> asignacion = new HashMap<Estudiante, Curso>();


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

    public Map getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(HashMap asignacion) {
        this.asignacion = asignacion;
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        boolean found = false;
        for(Estudiante e: estudiantes){
            if(e.getId()==estudiante.getId()) {
                found = true;
                break;
            }
        }
        if(!found) estudiantes.add(estudiante);
    }

    @Override
    public void agregarCurso(Curso curso) {
        boolean found = false;
        for(Curso c: cursos){
            if(c.getId()==curso.getId()) {
                found = true;
                break;
            }
        }
        if(!found) cursos.add(curso);
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) {
        Curso curso = null;
        for(Curso c: cursos){
            if(c.getId()==idCurso) {
                curso=c;
                break;
            }
        }
        if(curso!=null){
            asignacion.putIfAbsent(estudiante,curso);
        }
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) {
        Estudiante estudiante=null;
        for(Estudiante e: estudiantes){
            if(e.getId()==idEstudiante){
                estudiante=e;
                break;
            }
        }
        Curso curso = null;
        for(Curso c: cursos){
            if(c.getId()==idCurso) {
                curso=c;
                break;
            }
        }
        if(estudiante!=null&&curso!=null){
            asignacion.remove(estudiante,curso);
        }
    }
}
