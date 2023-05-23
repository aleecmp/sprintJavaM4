package cl.awakelab.sprintfinalm4;

class Accidente {
    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    public Accidente() {
    }

    public Accidente(int identificador, int rutCliente, String dia, String hora, String lugar, String origen, String consecuencias) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public String getOrigen() {
        return origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    public void mostrarDetalle() {
        System.out.println("El accidente ocurrió en " + lugar + " a las " + hora + " del día " + dia + ", y tuvo como origen " + origen);
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "identificador=" + identificador +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}

