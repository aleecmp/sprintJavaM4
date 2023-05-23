package cl.awakelab.sprintfinalm4;


public class Revision {
    private int identificador;
    private int idVisitaTerreno;
    private String nombreAlusivo;
    private String detalleRevisar;
    private int estado;

    public Revision() {
    }

    public Revision(int identificador, int idVisitaTerreno, String nombreAlusivo, String detalleRevisar, int estado) {
        this.identificador = identificador;
        this.idVisitaTerreno = idVisitaTerreno;
        this.nombreAlusivo = nombreAlusivo;
        this.detalleRevisar = detalleRevisar;
        this.estado = estado;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getIdVisitaTerreno() {
        return idVisitaTerreno;
    }

    public void setIdVisitaTerreno(int idVisitaTerreno) {
        this.idVisitaTerreno = idVisitaTerreno;
    }

    public String getNombreAlusivo() {
        return nombreAlusivo;
    }

    public void setNombreAlusivo(String nombreAlusivo) {
        this.nombreAlusivo = nombreAlusivo;
    }

    public String getDetalleRevisar() {
        return detalleRevisar;
    }

    public void setDetalleRevisar(String detalleRevisar) {
        this.detalleRevisar = detalleRevisar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Identificador: " + identificador + "\n" +
                "ID Visita en Terreno: " + idVisitaTerreno + "\n" +
                "Nombre alusivo: " + nombreAlusivo + "\n" +
                "Detalle a revisar: " + detalleRevisar + "\n" +
                "Estado: " + getEstadoString() + "\n";
    }

    public String getEstadoString() {
        switch (estado) {
            case 1:
                return "Sin problemas";
            case 2:
                return "Con observaciones";
            case 3:
                return "No aprueba";
            default:
                return "Desconocido";
        }
    }
}