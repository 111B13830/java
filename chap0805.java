public class chap0805 {
    class Cbox {
        int length;
        int width;
        int height;

        void volume() {
            System.out.println("volume=" + length * width * height);
        }

        void surfaceArea() {
            System.out.println("surfaceArea=" + (2 * (length * width + width * height + height * length)));
        }

        void showData() {
            System.out.println("length=" + length);
            System.out.println("width=" + width);
            System.out.println("height=" + height);
        }

        void showAll() {
            showData();
            surfaceArea();
            volume();
        }
    }

    public static void main(String args[]) {
        chap0805 outerInstance = new chap0805();
        Cbox box = outerInstance.new Cbox(); // Create an instance of Cbox using the outerInstance
        box.length = 1;
        box.width = 1;
        box.height = 1;
        box.showAll();
    }
}
