class CRectangle
{
 int width;
 int height;

 public CRectangle(int w,int h)
 {
  width=w;
  height=h;
 }
 public CRectangle()//沒有引數的建構元只能一組
 {
  
  width=10;
  height=8;
  
 }

    public void show()
    {
     
  System.out.println("width="+width);
  System.out.println("height="+height+"\n");
    }
  
}

  public class class01
  {
   public static void main(String args[])
   {
   CRectangle aa=new CRectangle(5,2);
   aa.show();
   CRectangle bb=new CRectangle();
   bb.show(); 
   }
  }