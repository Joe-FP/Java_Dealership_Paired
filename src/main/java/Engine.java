public class Engine extends Component implements IWear, IRepair {

    private int size;

    public Engine(String make, int condition, int size) {
        super(make, condition);
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public void componentWear(int wear) {
        this.applyWear(wear);
    }

    public void repair(int repairAmount) {
        this.applyRepair(repairAmount);
    }
}
