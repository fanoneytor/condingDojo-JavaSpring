import java.util.ArrayList;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
        ArrayList<String> palabrasAleatorias = generator.getNewPasswordSet(10);
        ArrayList<String> palabrasAleatoriasRand = generator.shuffleArray(palabrasAleatorias);
		System.out.println(randomRolls);
        System.out.println(palabrasAleatorias);
        System.out.println(palabrasAleatoriasRand);
	}
}
