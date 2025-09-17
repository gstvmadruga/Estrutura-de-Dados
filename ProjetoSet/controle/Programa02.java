package controle;

import java.util.HashSet;

public class Programa02 {

	public static void main(String[] args) {
		HashSet<String> games = new HashSet<String>();
				games.add("FIFA");
				games.add("GTA");
				games.add("Far Cry");
				games.add("Super Mario Bross");
				games.add("Formula 1");
				
				System.out.println(games);
				
				games.add("Megaman");
				
				System.out.println(games);
				
				games.add("GTA");
				
				
	}

}
