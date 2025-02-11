import java.util.Arrays;

public class IntroTo2DArrays{
  public static void main(String[] args){

    int[][] ray = new int[2][3];

 //row 1 | col 1-3
    ray[0][0] = 1;
    ray[0][1] = 2;
    ray[0][2] = 3;

 //row 2 | col 1-3
    ray[1][0] = 4;
    ray[1][1] = 5;
    ray[1][2] = 6;

    System.out.println(ray);
    System.out.println(ray[0]);
    

    //System.out.println(Arrays.toString(ray[0]));

    for(int row=0; row<ray.length; row++)
      for(int col=0; col<ray[row].length; col++)
        ray[row][col] = 7;
      
    
     
    //ray.length represents the # of rows
    for(int row=0; row<ray.length; row++)
      System.out.println(Arrays.toString(ray[row]));

    for(int row=0; row<ray.length; row++)
      for(int col=0; col<ray[row].length; col++)
        ray[row][col] = (int)(Math.random()*11);
  
        //ray.length represents the # of rows
    for(int row=0; row<ray.length; row++)
      System.out.println(Arrays.toString(ray[row]));

    System.out.println();



    int count =0;
    for(int row=0; row<ray.length; row++)
    {
      for(int col=0; col<ray[row].length; col++)
        count += ray[row][col];
      System.out.println("The sum of row " + row + " is: " + count);
        count=0;
    }



    System.out.println("\n\n\nHomework Assignment");
    
    int[] colSums = new int[ray[0].length];
    int colNum;
    for(int[] row: ray)
     { 
      colNum = 0;

      for(int num: row)
      {
        colSums[colNum]+=num;
        colNum++;
      }
     }
    System.out.println(Arrays.toString(colSums));
  }
}
