import java.beans.Customizer;
import java.util.ArrayList;

public class CafeUtil {
    public static int getStreakGoal(int numWeeks) {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        return suma;
    }

    public static double getOrderTotal(double[] prices) {
        double sumatoria = 0;
        for (double d : prices) {
            sumatoria += d;
        }
        return sumatoria;
    }

    public static void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public static void addCustomer(ArrayList<String> customers) {
        System.out.println("Por favor, ingresa tu nombre: ");
        String userName = System.console().readLine();

        System.out.println("¡Hola, " + userName + "!");

        System.out.println("Hay " + customers.size() + " personas frente a ti.");

        customers.add(userName);

        customers.forEach(user -> System.out.println(user));
    }

    public static void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        for(int i=1; i<=maxQuantity; i++){
            System.out.format("%d - $%.3f%n", i, ((price*i)-((0.4*i)-0.4)));
        }
    }
}