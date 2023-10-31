package Lab6;

import java.util.TreeMap;
import java.util.Math;

public class InverseDocumentFrequencyCalculator implements IInverseFreq {
    
/***
 * 
 * @author dean casbay
 * 
 * Subtask 2: You will complete InverseDocumentFrequencyCalculator class, the method
 * getInverseDocumentFrequency. This method will take in a TreeMap with the song title as the
 * key and its lyrics as the value.
 * 
 * In the method, you are calculating IDF value for each term X, defined as N/T. N is the total
 * number of songs and T is the number of songs in which the term X has appeared.
 * 
 */

    @Override
    public TreeMap<String, Double> getInverseDocumentFrequency(TreeMap<String, String> songLyrics) {
        TreeMap<String, Double> result = new TreeMap<String, Double> ();
        int totalNumberOfSongs = songLyrics.size(); // N
        
        for(String songTitle : songLyrics.keySet()) 
        {
            // current lyrics
            String lyric = songLyrics.get(songTitle);
            String[] words = lyric.split(" ");
            
            for (String word : words) {
                int songsWithTermX = countSongsWithTerm(songLyrics, word); // count songs containing term
                double IDF = Math.log((double)totalNumberOfSongs / songsWithTermX); // calculate IDF value 
                
                result.put(word, IDF);
            }
        }
        return result;
    }
    
    // method that helps to count the number of songs
    private int countSongsWithTerm(TreeMap<String, String> songLyrics, String term) {
        int count = 0;
        for (String lyric : songLyrics.values()) {
            if (lyric.contains(term)) {
                count++;
            }
        }
        return count;
    }
}