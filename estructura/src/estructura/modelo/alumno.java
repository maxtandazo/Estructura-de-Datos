
package estructura.modelo;

public class alumno {
    private int id;
    private String nombres;
    private String apellidos;
    private String cedula;

    public alumno () { }
    
    public alumno (int prmId, String prmNom, String prmApe, String prmCed) {
        id = prmId;
        nombres = prmNom;
        apellidos = prmApe;
        cedula = prmCed;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String toString() {
        return id + " - " + nombres + " " + apellidos;
    }
}
