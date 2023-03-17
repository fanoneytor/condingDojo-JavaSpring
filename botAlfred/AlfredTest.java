public class AlfredTest {
    /*
    * Este método principal siempre será el punto de inicio de una aplicación Java
    * Por ahora, estamos usando main para probar todos nuestros
    * métodos AlfredQuotes.
    */
    public static void main(String[] args) {
        // Crea una instancia de AlfredQuotes para acceder a todos tus métodos
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Haz algunos saludos de prueba, proporcionando los datos necesarios
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        
        String alexisTest = alfredBot.respondBeforeAlexis(
                            "¡Alexis! Toca algunos beats low-fi."
                            );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "No puedo encontrar mi yo-yo. Quizas Alfred sepa donde está");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Quizas de eso se trata Batman. No de ganar. Si no que de fallar..."
        );
        
        // Imprime los saludos para probar.
        System.out.println(testGreeting);
        
        // Quita los comentarios uno a la vez a medida que implementas cada método.
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}
