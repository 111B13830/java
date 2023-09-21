public class chap0812{
class CWin
{
  int width;
  int height;
  String name;

  void setW(int w)  //設定寬度的函數
     {
         width=w;
     }
   void setH(int h) //設定高度的函數
    {
      height=h;
    }
   void setName(String s)  //設定視窗名稱的函數
   {
       name=s;
   }

   public void show()
  {
     System.out.println("Name="+name);
     System.out.println("W="+width+", H="+height);
  }
}
   public class eel
{
      public static void main (String args[])
      {
        chap0812 outerInstance = new chap0812();
         CWin cw= outerInstance.new CWin();
         cw.setName("My Window");
         cw.setW(5);
         cw.setH(3);
         cw.show();
      }
}
}