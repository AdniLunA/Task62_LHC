
public class FilterZ implements IFilter {

    public String filterObjects(String xyLessString) {
        System.out.println("Deleting the \"z\"-Symbols in BosonString...");
        String xyzLessString = "";
        for (int i = 0; i < xyLessString.length();i++){
            if (!(xyLessString.charAt(i) == 'z')){
                xyzLessString += xyLessString.charAt(i);
            }
        }
        System.out.println("xyz-Less BosonString with length "+xyzLessString.length()+":");
        System.out.println(xyzLessString);
        return  xyzLessString;
    }

}

