import java.util.List;

public class FilterX implements IFilter{
    public String filterObjects(String bosonString) {
        System.out.println("Deleting the \"x\"-Symbols in BosonString...");
        String xLessString = "";
        for (int i = 0; i < bosonString.length();i++){
            if (!(bosonString.charAt(i) == 'x')){
                xLessString += bosonString.charAt(i);
            }
        }
        return  xLessString;
    }

}
