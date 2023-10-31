package Lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class TermFrequencyCalculator implements ITermFrequency {

	//Creates a treemap of the treemap passed to it. 
	@Override
    public TreeMap<String, TreeMap<String, Double>> getTermFrequency(TreeMap<String, String> songLyrics) {
		
		//This will contain the return results.       
		TreeMap<String, TreeMap<String, Double>> result = new TreeMap<String, TreeMap<String, Double>> ();
        
		//This loop creates the treemaps of the lyrics passed to it. 		
        for(String songTitle: songLyrics.keySet())
        {
            // For each song you have to create TF values
            TreeMap<String, Double> tempMap = new TreeMap<String, Double>();

            // current lyrics
            String lyric = songLyrics.get(songTitle);
            String[] words = lyric.split(" ");
            
            // Calculate the Term Frequency (TF) Values here and save them in tempMap
            // You might need to introduce other methods and additional variables
            
            // TF for Term (word) X in Song S is calculated as frequency of that X divided 
            // by total number of words in the lyric
            
            ////////////////////////////
            int totalWords = words.length; //This takes the length of the words array
			// the loop walks along the array gathering the frequency of each unique word in the array            
            for (String word : words) {
            	double freq = (double)Collections.frequency(Arrays.asList(words), word )/totalWords;
            	tempMap.put(word, freq);// this stores each unique word and its frequency ratio in tempMap
            }
            //////////////////////////
            
            
            // After Calculation
            result.put(songTitle, tempMap);// Stores the tempMap generated above as result
        }
        
        return result;
    }

}
