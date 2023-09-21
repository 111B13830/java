public class chap0807 {
    class CTest
    {
        int x;
      void test(int x)
      {
       if(x%2==1)
        System.out.println("此數為奇數");
       else if (x==0)
        System.out.println("此數為0");
       else
        System.out.println("此數為偶數");
       
       
      }
     }
      public class eel
      {
      public static void main(String args[])
      {
       chap0807 outerInstance = new chap0807();
       CTest ss=outerInstance.new CTest();
       System.out.println("test(0)");
       ss.test(0);
       System.out.println("test(3)");
       ss.test(3);
       System.out.println("test(8)");
       ss.test(8);
      }
      }
}
