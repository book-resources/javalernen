public class Exercise {
	public static void main(String args []) {
		String[][] schachbrett = { 
			new String[]{ "A8","B8","C8","D8","E8","F8","G8","H8" },
			new String[]{ "A7","B7","C7","D7","E7","F7","G7","H7" },
			new String[]{ "A6","B6","C6","D6","E6","F6","G6","H6" },
			new String[]{ "A5","B5","C5","D5","E5","F5","G5","H5" },
			new String[]{ "A4","B4","C4","D4","E4","F4","G4","H4" },
			new String[]{ "A3","B3","C3","D3","E3","F3","G3","H3" },
			new String[]{ "A2","B2","C2","D2","E2","F2","G2","H2" },
			new String[]{ "A1","B1","C1","D1","E1","F1","G1","H1" } 
		};

		for (int i = 0; i < schachbrett.length; i++) {
			for (int j = schachbrett[i].length - 1; j >= 0; j--) {
				System.out.println(schachbrett[j][i]);
			}
		}
	}
}