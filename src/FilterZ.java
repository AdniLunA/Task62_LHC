
public class FilterZ implements IFilter {

    public String filterObjects(String xyLessString) {

        String xyzLessString = "";
        for (int i = 0; i < xyLessString.length();i++){
            if (!(xyLessString.charAt(i) == 'x')){
                xyLessString += xyLessString.charAt(i);
            }
        }
        return  xyzLessString;
    }

}

