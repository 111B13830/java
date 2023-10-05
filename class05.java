class CCount{
    static int cnt = 0;
    public CCount(){
      cnt++;
    }
    public void count (){
    System.out.println(cnt+"object(s)created");
    }
  
    void setValue(int n){
      cnt=n;
    }
  }
  
   public class class05{
    public static void main (String args[]){
      CCount a=new CCount();
      a.count();
      CCount b=new CCount();
      CCount c=new CCount();
      b.count();
  
      a.setValue(10);
      c.count();
    }
  }