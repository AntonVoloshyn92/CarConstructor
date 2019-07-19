public class CarDoor {
    private boolean door;
    private boolean window;

    public CarDoor(){
        this.door = false;
        this.window = false;
    }

    public CarDoor(boolean door, boolean window) {
        this.door = door;
        this.window = window;
    }

    public void openDoor(){
        this.door = true;
    }

    public void clodeDoor(){
        this.door = false;
    }

    public void openCloseDoor(){
        this.door = !this.door;
    }

    public void opeWindow(){
        this.window = true;
    }

    public void clodWindow(){
        this.window = false;
    }

    public void openCloseWindow(){
        this.window = !this.window;
    }

    public void showDoorStatus(){
        System.out.println("Двкрь ");
        if(this.door = false){
            System.out.print("закрытая\n");
        }else {
            System.out.print("открытая\n");
        }
        System.out.println("Окно ");
        if(this.window = false){
            System.out.print("закрыто\n");
        }else {
            System.out.print("открыто\n");
        }
    }
}
