/**
 * Rot13.java
 *
 * @author Nothando Tshuma
 * created - 15/02/20
 * <p>
 * This class works implements the ROT-13 algorithm and also allows
 * the user to chose their rotation value.
 * @version 1.0.0
 */
public class Rot13 {

    /**
     * The text which the user inputs.
     */
    String userText;

    /**
     * The new text, after applying the ROT function.
     */
    String newString;

    /**
     * The rotation value which the user chooses.
     */
    int rotValue;

    /**
     * Array storing the alphabet as small letters.
     */
    char[] smallLetters = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    /**
     * Array storing the alphabet as capital letters.
     */
    char[] capitalLetters = {
            'A', 'B', 'B', 'C', 'D', 'E', 'F', 'G', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    /**
     * Constructor for the ROT13 class.
     *
     * @param userText
     * @param rotValue
     */
    public Rot13(String userText, int rotValue) {
        this.userText = userText;
        this.rotValue = rotValue;
    }

    /**
     * Splits the user text, from a string to an array of characters.
     *
     * @param userText
     * @return array of type char
     */
    public char[] splitIntoArray(String userText) {
        return userText.toCharArray();
    }

    /**
     * Finds the array index for characters from the user text.
     *
     * @param charToGet
     * @return index
     */
    public int getIndex(char charToGet) {
        for (int i = 0; i < 26; i++)
                if (smallLetters[i] == charToGet) {
                    return i;
                }
        return -1;
    }

    /**
     * Increments the letter, using the rotation value chosen by the user.
     *
     * @param index
     * @return new index (which will be used to choose the new letter
     * from either the alphabet arrays)
     */
    public int incrementLetter(int index) {
        int newIndex = index + rotValue;
        while (newIndex > 25) {
            newIndex = newIndex % 26; //
        }
        return newIndex;
    }

    /**
     * Puts all methods together and works out what the new string will be.
     *
     * @param userText
     */
    public void finalUserText(String userText) {
        char[] userChars = splitIntoArray(userText);
        int indexAfterRot;

        for (int i = 0; i < userChars.length; i++) {
            if (Character.isLetter(userChars[i])) {
                int indexInAlphabet = getIndex(userChars[i]);
                indexAfterRot = incrementLetter(indexInAlphabet);
                if (Character.isUpperCase(userChars[i])){
                    userChars[i] = capitalLetters[indexAfterRot];
                 } else {
                    userChars[i] = smallLetters[indexAfterRot];
                }
                newString = new String(userChars);
                System.out.println(newString);
            }
        }
        System.out.println(newString);
    }

}

