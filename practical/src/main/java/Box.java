public class Box {
    private int l,b,h;
    public Box(int L,int B,int H)
            
    {
        l=L;
        h=H;
        b=B;         
          System.out.println("Len="+l+"breadth="+b+"he="+h);              
    }
//    Box()
//    {
//        System.out.println("Len="+l+"breadth="+b+"he="+h); 
//    }
    public static void main(String[] args) {
        Box b=new Box(10,20,30);
//        Box b1=new Box();
    }
}
