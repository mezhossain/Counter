package counter;
import java.util.HashMap;

public class array {

	public static void main(String[] args) {
		StringBuffer text = new StringBuffer();
		text.append("The situation is even more apparent when considering the infinity of time. A human being currently lives to be about 80 years old on the average. But the earth itself is billions of years old. Even by earthly standards an individual life is a mere flash. All human history itself is a unnoticeable blip in the vast sea of time. Most of us realize that 100 years from now what we do today will make no difference one way or the other. Well, one billion years from now when the sun explodes taking out most of the galaxy, none of human history will make a bit of difference either");
		// convert buffer into string
		String s = String.valueOf(text);
		// separate each word into an array
		String [] allWords = s.split(" ");
		// create hashmap for each word's occurance
		HashMap<String, Integer> wordOccurances = new HashMap<>();
		// initialize max number of occurrances
		int maxOccurance = -1;
		// initialize most used word string
		String maxOccuringWord = null;
		// iterate for each word in the words array
		for (int i = 0; i < allWords.length; i++) {
			String oneWord = allWords[i];
			// initialise count for each word
			int occurance = 0;
			
			if (wordOccurances.containsKey(oneWord)) {
				occurance = wordOccurances.get(oneWord);
			}
			occurance = occurance + 1;
			wordOccurances.put(oneWord, occurance);
			if (occurance > maxOccurance) {
				maxOccurance = occurance;
				maxOccuringWord = oneWord;
			}
		}
		System.out.println(maxOccuringWord);
	}
}


























