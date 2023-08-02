public class Main {
    public static void main(String[] args) {

       MovablePoint mp1 = new MovablePoint(10,5,3,4);

        System.out.println(mp1.toString());

        mp1.moveDown();
        mp1.moveRight();

        System.out.println("//// ////");
        System.out.println(mp1.toString());

        mp1.moveUp();
        mp1.moveLeft();
        System.out.println("//// ////");
        System.out.println(mp1.toString());


    }
}