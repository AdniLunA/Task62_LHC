
public class ControlCenter {

    private IPhysicianListener physician = new PhysicianListener();

    public IPhysicianListener getListener() {
        return physician;
    }

    public void setListener(IPhysicianListener physician) {
        this.physician = physician;
    }

    public void foundHibo(int result){
        boolean hiboFound = false;
        if(result>-1){
            hiboFound=true;
        }


        if (hiboFound){
            physician.hearThatHiboIsFound();
        }
        else {
            physician.isSad();
        }

    }

}
