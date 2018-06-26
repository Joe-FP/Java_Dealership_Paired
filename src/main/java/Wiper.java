public class Wiper extends Component implements IWear {

    private String model;

    public Wiper(String make, int condition, String model) {
        super(make, condition);
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void componentWear(int wear) {
        this.applyWear(wear);
    }
}
