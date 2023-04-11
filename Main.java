class Main {
  public static void main(String[] args) {

    int w=10;
    int h=10;

    for(int i=0;i<w;i++)
      {
        System.out.print("*");
      }
    System.out.println();

    for(int i=0;i<h-2;i++)
      {
        System.out.print("*");
        
      for(int k=0;k<w-2;k++)
          {
            if(i==k)
            {
              System.out.print("*");
            }
            else
            {
               System.out.print(" "); 
            }
          }
        System.out.print("*");
        System.out.println(" ");
      }

     for(int i=0;i<w;i++)
      {
        System.out.print("*");
      }
    
  }
}
    
  