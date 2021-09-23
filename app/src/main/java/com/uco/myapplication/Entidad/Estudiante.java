package com.uco.myapplication.Entidad;

public class Estudiante {
    private int idEstudiante;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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

    public String getInstitucionEducativa() {
        return institucionEducativa;
    }

    public void setInstitucionEducativa(String institucionEducativa) {
        this.institucionEducativa = institucionEducativa;
    }

    public Estudiante(int idEstudiante, String tipoDocumento, String numeroDocumento, String nombres, String apellidos, String institucionEducativa) {
        this.idEstudiante = idEstudiante;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.institucionEducativa = institucionEducativa;
    }

    private String tipoDocumento;
    private String numeroDocumento;
    private String nombres;
    private String apellidos;
    private String institucionEducativa;
}
