# Lab6m
Project Manager - Lucas

Dean, Nathanial, Herve

Subtask #1 - Nathanial
You will complete TermFrequencyCalculator class, the method getTermFrequency.
This method will take in a TreeMap with the song title as the key and its lyrics as the value.
The return value is a TreeMap of TreeMaps. The key for this map is the song title. The inner
TreeMap has the words (in the song) as the key and the term frequency of that word as the
value. The term frequency is calculated as how many times that term is repeated in that song
divided by the total number of words in that song. (For term X in song Y, TF is calculated as
#X/#words in Y).


Subtask #2 - Dean
You will complete InverseDocumentFrequencyCalculator class, the method
getInverseDocumentFrequency. This method will take in a TreeMap with the song title as the
key and its lyrics as the value.
In the method, you are calculating IDF value for each term X, defined as N/T. N is the total
number of songs and T is the number of songs in which the term X has appeared.

SubTask #3 - Herve
You will complete SearchEngine class, the method search. When users search for
something, it is expressed as a String, query, which has several words. For example, the query
“All we hear is”, has four words. For each word, you have to calculate the TFxIDF (provided by
your other team members) score per song. The summation of these scores is the search engine
score for that song. The song with the highest score is the top result and its title should be
returned.
To calculate the score for each song, find the corresponding TF values for that song. Then for
each word in the query, multiply the TF and IDF values of that word.
