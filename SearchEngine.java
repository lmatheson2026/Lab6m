package Lab6; // herve Eden Badege

import java.util.TreeMap;

public class SearchEngine {
    // TreeMap of songs title and TreeMap of 
    TreeMap<String, TreeMap<String, Double>> TFValues;
    
    // TreeMap of words and their IDF values
    TreeMap<String, Double> IDFValues;
    
    // TreeMap of song titles and their lyrics
    TreeMap<String, String> songTitleLyrics;
    public SearchEngine(LyricsReader lyricsReader, ITermFrequency TF, IInverseFreq IDF)
    {
        songTitleLyrics = lyricsReader.songLyricsMap;
        TFValues = TF.getTermFrequency(songTitleLyrics);
        IDFValues = IDF.getInverseDocumentFrequency(songTitleLyrics);        
    }
    
    public String search(String query)
    {
        String [] queryWords = query.split(" ");
        
        String resultSong = "";
        double maxScore = -1;
      
        // Iterating on each song to calculate its TF-IDF value for the query
        for(String songTitle: songTitleLyrics.keySet())
        {
            // TF-IDF score for the current song
            double score = 0;
            
            // Iterating 
            for(String queryWord: queryWords)
            {
                // Here you should get the corresponding TF and IDF values of that query word
                // And then modify the code to calculate the TF-IDF value
            	
            	
                TreeMap<String, Double> termFrequencies = TFValues.get(songTitle);
                Double tf = termFrequencies.get(queryWord);
                
                
                // Score for a song, is summation of TF*IDF values for each query word
                // Note that IDF are global and not related to a specific song
                // But TF values for a query word is different among different songs
                
                Double idf = IDFValues.get(queryWord);
                if(tf != null && idf != null) {
               
                	 double tfidf = tf * idf;

                     // Add the TF-IDF value to the total score for the current song
                     score += tfidf;
                 }
                
                
            }
            
            if (score>maxScore)
            {
                maxScore = score;
                resultSong = songTitle;
            }
        }
        
        // You should return the name of the song with the highest TF-IDF value
        return resultSong;
    }
}
