/*
The purpose of this program is to go through every combination of characters
to find the secret word/string.
 */
package passwordfinder;

/**
 * @author Debrah Wyatt
 */
public class PasswordFinder {

    public static void main(String[] args) {

        String secretWord = "12p"; //This is the String to guess.
        String programWord = ""; //This is the programs current String.

        for (int i = 32; i < 126; i++) {

            programWord = programWord + (char) i;
            System.out.println(programWord);

            if (programWord.equals(secretWord)) {
                System.out.println("Password found: " + programWord);
                return;

            } else {
                programWord = "";
            }
        }

        for (int i = 32; i < 126; i++) {
            for (int j = 32; j < 126; j++) {

                programWord = programWord + (char) i + (char) j;
                System.out.println(programWord);

                if (programWord.equals(secretWord)) {
                    System.out.println("Password found: " + programWord);
                    return;

                } else {
                    programWord = "";
                }
            }
        }

        for (int i = 32; i < 126; i++) {
            for (int j = 32; j < 126; j++) {
                for (int k = 32; k < 126; k++) {

                    programWord = programWord + (char) i + (char) j + (char) k;
                    System.out.println(programWord);

                    if (programWord.equals(secretWord)) {
                        System.out.println("Password found: " + programWord);
                        return;

                    } else {
                        programWord = "";
                    }
                }
            }
        }
    }
}
