import java.util.Date;

public class Car {
    private final Date MANUFACTURE_DATE;
    private String engineType;
    private int maxSpeed;
    private int accelerationTime;
    private int maxPassengers;
    private int passengersCount;
    private int currentSpeed;
    private CarWeel [] weels;
    private CarDoor [] doors;

    public void showCarInfo(){
        System.out.println("Car info is :\n" +
                "MANUFACTURE_DATE = " + MANUFACTURE_DATE +
                "engineType = " + engineType +
                "maxSpeed = " + maxSpeed +
                "accelerationTime = " + accelerationTime +
                "passengersCount = " + passengersCount +
                "currentSpeed = " + currentSpeed);
    }

    public Car(Date MANUFACTURE_DATE) {
        this.MANUFACTURE_DATE = MANUFACTURE_DATE;
    }

    public Car(Date MANUFACTURE_DATE, String engineType, int maxSpeed, int accelerationTime, int maxPassengers, int passengersCount, int currentSpeed) {
        this.MANUFACTURE_DATE = MANUFACTURE_DATE;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.accelerationTime = accelerationTime;
        this.maxPassengers = maxPassengers;
        this.passengersCount = passengersCount;
        this.currentSpeed = currentSpeed;
        this.weels = new CarWeel[4];
        createWeels(weels);
        this.doors = new CarDoor[4];
        createDoors(doors);
    }

    private void createDoors(CarDoor[] doors) {
        for(CarDoor door : doors){
            door = new CarDoor();
        }
    }

    private void createWeels(CarWeel[] weels) {
        for(CarWeel weel : weels){
            weel = new CarWeel();
        }
    }

    public void changeSpeed(int newSpeed){
        this.currentSpeed = newSpeed;
    }

    public void addPassenger(){
        this.passengersCount++;
    }

    public void disembarkPassanger(){
        this.passengersCount--;
    }

    public void disembarkAllPassangers(){
        this.passengersCount = 0;
    }

    public CarWeel getWeel(int weelIndex){
        return weels[weelIndex];
    }

    public CarDoor getDoor(int doorlIndex){
        return doors[doorlIndex];
    }

    public void deleteAllWeels(){
        weels = new CarWeel[0];
    }

    public void addWeels(int x){
        CarWeel [] newCarWeels = new CarWeel[this.weels.length + x];
        for(int i = 0; i<newCarWeels.length; i++){
            if(i<weels.length){
                newCarWeels[i] = weels[i];
            }else {
                newCarWeels[i] = new CarWeel();
            }
        }

        this.weels = newCarWeels;
    }

    public void calculateMaxPossibleCurrentSpeed(){
        if(passengersCount == 0){
            maxSpeed = 0;
        }else {
            maxSpeed *= getMostErasedWeel();
        }
    }

    private double getMostErasedWeel() {
        double minIntegrity = 0;
        for(CarWeel weel:weels){
            double weelIntegrity = weel.getTireIntegrity();
            minIntegrity = weelIntegrity<minIntegrity?weelIntegrity:minIntegrity;
        }
        return minIntegrity;
    }
}
