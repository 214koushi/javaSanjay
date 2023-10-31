package InterviewPrograms;

import org.testng.annotations.Test;

public class wordsCount {
	
	@Test
	public void countOfWords() {
		 String input = "i am koud a";
	        int wordCount = countWords(input);
	        System.out.println("Word count: " + wordCount);
	    }

	    public static int countWords(String str) {
	        int wordCount = 0;
	        boolean isWord = false;

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);

	            // Check if the current character is a letter or an apostrophe (to handle contractions like "I'm")
	            if (Character.isLetter(c) || c == '\'') {
	                isWord = true;
	            } else {
	                // If a non-letter character is encountered after a word, increment the word count
	                if (isWord) {
	                    wordCount++;
	                    isWord = false;
	                }
	            }
	        }

	        // Increment word count if the string ends with a word
	       /* if (isWord) {
	            wordCount++;
	        }*/

	        return wordCount;
	    }
	}

