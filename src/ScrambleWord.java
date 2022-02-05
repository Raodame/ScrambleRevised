import java.util.ArrayList;

public class ScrambleWord {

	public static String scrambleWord(String word){
		String[] wordArray = new String[word.length()];
		if (word.indexOf(word) == -1){
			return word;
		}
		for (int x = 0; x < wordArray.length; x++){
			wordArray[x] = word.substring(x, x + 1);
		}
		for (int y = 0; y < wordArray.length - 1; y++){
			if (wordArray[y].equals("A")){
				if (!wordArray[y + 1].equals("A")) {
					wordArray[y] = wordArray[y + 1];
					wordArray[y + 1] = "A";
					y++;
				}
			}
		}

		String newWord = "";
		for (int z = 0; z < wordArray.length; z++){
			newWord += wordArray[z];
		}
		return newWord;
	}
	public static void scrambleOrRemove(ArrayList<String> wordList){
//		ArrayList<String> wordListCopy = new ArrayList<String>();
//
//		for (int z = 0; z < wordList.size(); z++){
//			wordListCopy.add(wordList.get(z));
//		}
//
//		for (int x = 0; x < wordList.size(); x++){
//			wordList.set(x, scrambleWord(wordList.get(x)));
//		}
//
//		int i = 0;
//		for (int y = 0; y < wordList.size(); y++){
//			if (!wordListCopy.get(y).equals(wordList.get(i))){
//				i++;
//			}
//			else
//				wordList.remove(i);
//		}
// not removing final String "EGGS"

		for (int x = 0; x < wordList.size(); x++){
			if (wordList.get(x).equals(scrambleWord(wordList.get(x)))){
				wordList.remove(x);
				x--;
			}
			else {
				wordList.set(x, scrambleWord(wordList.get(x)));
			}
		}
	}



}