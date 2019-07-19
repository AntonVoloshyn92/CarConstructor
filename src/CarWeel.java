public class CarWeel {
    private double tireIntegrity;

    public CarWeel() {
        this.tireIntegrity = 1;
    }

    public CarWeel(double tireIntegrity) {
        this.tireIntegrity = tireIntegrity;
    }

    public void changeTire(){
        this.tireIntegrity = 1;
    }

    public void eraseTire(int x){
        this.tireIntegrity = this.tireIntegrity *((100-x)/100d);
    }

    public double getTireIntegrity() {
        return tireIntegrity;
    }

    public void showTireIntegrityStatus(){
        System.out.println("Целосность шины = " + tireIntegrity);
    }
}
