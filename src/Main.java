public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.width = 5;
        box1.height = 5;
        box1.length = 5;

        box2.width = 10;
        box2.height = 10;
        box2.length = 10;
/*
        box1.showVolume();
        box2.showVolume();
*/
        double volume1 = box1.Volume();
        System.out.println(volume1);

        double volume2 = box2.Volume();
        System.out.println(volume2);
    }
}
