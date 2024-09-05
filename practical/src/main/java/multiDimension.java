public class multiDimension {
    public static void main(String[] args) {
        int a[][]=new int[4][3];
        for(int i=0;i<4;i++)
        {
           for(int j=0;j<3;j++)
           {
               a[i][j]=(int)(Math.random()*10);
               System.out.print(a[i][j]+" ");      
           }
            System.out.println();
        }
    }
}
