import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hola, encantado de verte. ¿Cómo estás?";
    }

    public String guestGreeting(String name) {
        String saludo = String.format("Hola, %s. Encantado de verte.", name);
        return saludo;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        List<String> dias = Arrays.asList("Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado");
        List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Sptiembre", "Octubre", "Noviembre", "Diciembre");
        String dia = dias.get(date.getDay());
        String mes = meses.get(date.getMonth());

        String cadenaFinal = String.format("Actualmente es %1$s, %2$s de %3$s a las %4$s:%5$s:%6$s del %7$s", dia, date.getDate(), mes, date.getHours(), date.getMinutes(), date.getSeconds(), (date.getYear()+1900));
        return cadenaFinal;
    }

    public String respondBeforeAlexis(String conversation) {
        int alexis = conversation.indexOf("Alexis");
        int alfred = conversation.indexOf("Alfred");
        String frase = null;
        System.out.println("Alexis" + alexis);
        System.out.println("Alfred" + alfred);
        if(alexis == -1 && alfred == -1){
            frase = "Bien. Y con eso, me retiraré";
        }else if(alexis != -1){
            frase = "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
        }else{
            frase = "A su servicio. Como desee, naturalmente";
        }
        return frase;
    }

    // BONUS NINJA
    // Ver las especificaciones para sobrecargar el método guessGreeting
    // ="comment from-rainbow">// BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos
    // String que has aprendido!
}
