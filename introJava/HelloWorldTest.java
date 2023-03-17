public class HelloWorldTest {
    public static void main(String[] args) {
        HelloWorld helloApp = new HelloWorld();
        System.out.println(helloApp.hola());
        System.out.println(helloApp.hola("Elena")); 
        System.out.println(helloApp.hola("Elena", "De Troya"));    
        System.out.println(helloApp.hola("Elena", 25)); 
        helloApp.hola_void();  
    }    
}
