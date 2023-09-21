public class chap0802 {
    class Cbbb {
        double x;
        double y;
    }

    public static void main(String[] args) {
        chap0802 outerInstance = new chap0802();
        Cbbb obj1, obj2;
        obj1 = outerInstance.new Cbbb();
        obj2 = outerInstance.new Cbbb();
        Cbbb avg = new chap0802().new Cbbb(); // You can create avg like this too
        obj1.x = 5.2;
        obj1.y = 3.9;
        obj2.x = 6.5;
        obj2.y = 4.6;
        avg.x = (obj1.x + obj2.x) / 2;
        avg.y = (obj1.y + obj2.y) / 2;

        System.out.println("obj1=" + obj1.x + ", " + obj1.y);
        System.out.println("obj2=" + obj2.x + ", " + obj2.y);
        System.out.println("avg=" + avg.x + ", " + avg.y);
    }
}

