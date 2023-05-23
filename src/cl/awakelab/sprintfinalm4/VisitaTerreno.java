package cl.awakelab.sprintfinalm4;

import java.util.ArrayList;
import java.util.List;

public class VisitaTerreno {
    private int idVisitaTerreno;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;
    private List<Revision> revisiones;

    public VisitaTerreno() {
        revisiones = new ArrayList<>();
    }

    public VisitaTerreno(int idVisitaTerreno, int rutCliente, String dia, String hora, String lugar, String comentarios) {
        this.idVisitaTerreno = idVisitaTerreno;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
        revisiones = new ArrayList<>();
    }

    public int getIdentificador() {
        return idVisitaTerreno;
    }

    public void setIdentificador(int idVisitaTerreno) {
        this.idVisitaTerreno = idVisitaTerreno;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public List<Revision> getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(List<Revision> revisiones) {
        this.revisiones = revisiones;
    }

    public void agregarRevision(Revision revision) {
        revisiones.add(revision);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Identificador visita a terreno: ").append(idVisitaTerreno).append("\n");
        builder.append("RUT Cliente: ").append(rutCliente).append("\n");
        builder.append("Día: ").append(dia).append("\n");
        builder.append("Hora: ").append(hora).append("\n");
        builder.append("Lugar: ").append(lugar).append("\n");
        builder.append("Comentarios: ").append(comentarios).append("\n");

        if (!revisiones.isEmpty()) {
            builder.append("Revisiones: \n");
            for (Revision revision : revisiones) {
                builder.append(revision);
            }
        }

        return builder.toString();
    }
}
