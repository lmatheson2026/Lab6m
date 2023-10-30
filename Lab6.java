
public class Lab6 {

	public static void main(String[] args) {
		/*
		 * Creates an object of each class created by each 
		 * team member
		 */
		LyricsReader x = new LyricsReader(); //Already present
		TermFrequencyCalculator y = new TermFrequencyCalculator(); // Nathanial
		InverseDocumentFrequencyCalculator Z = new InverseDocumentFrequencyCalculator();//Dean
		SearchEngine SE = new SearchEngie(x,y,z); // Herve
		
			System.out.println(SE.search);	

	}

}
