public class Wheel extends Component implements IWear, IRepair {

    private String treadType;

    public Wheel(String make, int condition, String treadType) {
        super(make, condition);
        this.treadType = treadType;
    }

    public String getTreadType() {
        return this.treadType;
    }

    public void componentWear(int wear) {
        this.applyWear(wear);
    }

    public void repair(int repairAmount) {
        this.applyRepair(repairAmount);
    }
}
