public abstract class Component {

    private String make;
    private int condition;

    public Component(String make, int condition) {
        this.make = make;
        this.condition = condition;
    }

    public String getMake() {
        return this.make;
    }

    public int getCondition() {
        return this.condition;
    }

    public void applyWear(int wear) {
        this.condition -= wear;
    }

    public void applyRepair(int repairAmount){
        this.condition += repairAmount;
        if (this.condition > 100){this.condition = 100;}
    }
}
