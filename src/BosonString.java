import java.util.Random;

public class BosonString {
    private String bosonString;
    private int stringLength = 1000;
    private String usuableSymbols = "abcdefghijklmnopqrstuvwxyz0123456789";
    Random rand = new Random();


    public String insertHibo(String xyzLessString){
        int randomNumber = rand.nextInt(xyzLessString.length()-4);
        String stringToReplace = findStringToReplace(xyzLessString,randomNumber);
        String hiboString = xyzLessString.replace(stringToReplace, "hibo");
        return hiboString;
    }

    private String findStringToReplace(String xyzLessString, int randomNumber) {
        char[] foundChars = new char[4];
        int charIndex = 0;
        for(int stringIndex = randomNumber; charIndex < 4; stringIndex++){
            foundChars[charIndex] = xyzLessString.charAt(stringIndex);
        }
        String replacementString = new String(foundChars);
        return replacementString;
    }

    public BosonString(){
        int randomNumber;
        for (int i = 0; i < stringLength; i++){
            randomNumber = rand.nextInt(36);
            bosonString += usuableSymbols.charAt(randomNumber);
        }

    }


    public String getBosonString(){
        return this.bosonString;
    }
}
