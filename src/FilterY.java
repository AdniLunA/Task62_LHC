
public class FilterY implements IFilter{

    public String filterObjects(String xLessString) {

        String xyLessString = "";
        for (int i = 0; i < xLessString.length();i++){
            if (!(xLessString.charAt(i) == 'y')){
                xLessString += xLessString.charAt(i);
            }
        }
        return  xyLessString;
    }

}
