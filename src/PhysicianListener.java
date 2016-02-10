
public class PhysicianListener implements IPhysicianListener {

    @Override
    public void hearThatHiboIsFound() {
        System.out.println("The Higgs Boson is found!");
    }

    @Override
    public void isSad() {
        System.out.println("There is no Higgs Boson.");
    }
}
