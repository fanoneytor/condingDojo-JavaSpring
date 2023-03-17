class TestVehiculo {
    public static void main(String[] args) {
        //Crear un vehiculo
        Vehiculo auto1 = new Vehiculo();//Hacemos una nueva instancia
        auto1.setAnio(2001);
        auto1.setMarca("Honda");
        auto1.setColor("Blanco");
        auto1.setRuedas(4);

        System.out.println("Marca Auto1: " + auto1.getMarca());

        //Creamos un auto 2
        Vehiculo auto2 = new Vehiculo();
        auto2.setAnio(2018);
        auto2.setMarca("Mazda");
        auto2.setColor("CX-3");
        auto2.setRuedas(4);

        System.out.println("Marca Auto2: " + auto2.getMarca());

        
    }    
}
