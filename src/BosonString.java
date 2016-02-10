import java.util.Random;

public class BosonString {
    private String bosonString;
    private int stringLength = 1000;
    private String usuableSymbols = "abcdefghijklmnopqrstuvwxyz0123456789";
    Random rand = new Random();

    public String insertHibo(String xyzLessString){
        System.out.println("Starting the insertion of \"hibo\"...");
        int randomNumber = rand.nextInt(xyzLessString.length()-4);
        String stringToReplace = findStringToReplace(xyzLessString,randomNumber);
        String hiboString = xyzLessString.replace(stringToReplace, "hibo");
        System.out.println("Insertion of \"hibo\" complete. Length = "+hiboString.length()+":");
        System.out.println(hiboString);
        return hiboString;
    }

    private String findStringToReplace(String xyzLessString, int randomNumber) {
        char[] foundChars = new char[4];
        int charIndex = 0;
        for(int stringIndex = randomNumber; charIndex < 4; stringIndex++){
            foundChars[charIndex] = xyzLessString.charAt(stringIndex);
            charIndex++;
        }
        String replacementString = new String(foundChars);
        return replacementString;
    }

    public BosonString(){
        System.out.println("Creating a random BosonString...");
        int randomNumber = rand.nextInt(36);
        char firstSymbol = usuableSymbols.charAt(randomNumber);
        bosonString = ""+firstSymbol;
        for (int i = 1; i < stringLength; i++){
            randomNumber = rand.nextInt(36);
            bosonString += usuableSymbols.charAt(randomNumber);
        }
        System.out.println("BosonString with lenght "+bosonString.length()+" createt:");
        System.out.println(bosonString);
    }


    public String getBosonString(){
        return this.bosonString;
    }
}
