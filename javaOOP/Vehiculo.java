class Vehiculo{
    private int anio;
    private String marca;
    private String modelo;
    private String color;
    private int ruedas;

    //Metodo constructor: es aquel metodo que se encarga de inicializar nuestra instancia
    public Vehiculo(){

    }

    //SOBRECARGA
    public Vehiculo(String marca){
        //Configurar el atributo de marca
        //al valor del parametro de marca.
        this.marca = marca;
    }

    public Vehiculo(String marca, String color){
        this.marca = marca;
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public int getRuedas() {
        return ruedas;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

}