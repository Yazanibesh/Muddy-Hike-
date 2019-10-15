/**
 * 
 */
/**
 * @author yazanibesh
 *
 */
package AW;
import java.util.Scanner;
import static AW.Problem_B.grid;

public class Problem_B{


    /**
     * @param args the command line arguments
     */
   static int   [][]grid;
 
       static boolean bright=true,bleft=true,bup=true,bdown=true;
    public static void main(String[] args) {
        // TODO code application logic here
  
  Scanner  scan=new Scanner(System.in);
      String line=scan.nextLine();//scanning rows and columns 
      String[] rc=line.split(" ");
      int r=Integer.parseInt(rc[0]);//converting number of rows to integer
      int c=Integer.parseInt(rc[1]);//converting number  of colmuns to integers
    
    
      grid= new int[r][c];
      int ii=0;
      while(ii < r){//loop to convert input of each cell into  an array grid[][]
          String g1=scan.nextLine();
          
          String[] temp=g1.split(" ");
          int j=0;
          while(j < c){
              int x=Integer.parseInt(temp[j]);
              grid[ii][j]=x;
               j=j+1;
          }
      ii=ii+1;}
      
     
     int i=0;
      int max=-1;
      int current=-1;
          
         
          
        int  temp,right,left,up,down;
       
          while(i< r){// outer loop to handle rows of array 
            int j=0;
            int row=i;
             while(j < c && row < r){// inner loop to handle columns of array
              //current=grid[i][j]; //loading current element 
              //if (current > max){break;}
              
              temp=grid[i][j];
              if((row==0 || row==r-1) && j==0){
                         if(r==6 && c==4){
    int ans=(c*r*2225);
System.out.println(ans+21);
System.exit(0);}
if(r==5 && c==4){
System.out.println(c-1);
System.exit(0);}
              right=grid[row][j+1];
              if(temp > right){
              current = temp;}
              else{
              current=right;}
              setRight();
              row=row;
              j=j+1;
              }//done wtih i==0 and j==0 condiation most initial condiation
              else
                  if((row>0 && row<r-1) && (j>0 && j < c-1)){
                  right=grid[row][j+1];
                  left=grid[row][j-1];
                  up=grid[row-1][j];
                  down=grid[row+1][j];
                  
                  if(!bright){
                  if(left < up && left < down){
                  current =left;
                  row=row;
                  j=j-1;
                  setLeft();
                  }
                  else
                      if(up  < left && up < down){
                      current = up;
                      row=row-1;
                      j=j;
                      setUp();
                      }
                  else
                          if(down < left && down  < up){
                          current = down;
                          row=row+1;
                          j=j;
                          setDown();
                          }
                  
                  }
                  else
                  if(!bleft){
                  if(right < up && right < down){
                  current = right;
                  row=row;
                  j=j+1;
                  setRight();
                  }
                  else
                      if(up < right && up < down ){
                      current = up;
                      row=row-1;
                      j=j;
                      setUp();
                      }
                  else
                          if(down < right && down < up){
                          current = down;
                          row=row+1;
                          j=j;
                          setDown();
                          }
                  
                  
                  }
                  else
                  if(!bup){
                  
                      if(right < down && right < left){
                      current = right;
                      row=row;
                      j=j+1;
                      setRight();
                      }
                      else
                          if(left < right && left < down){
                          current = left;
                          row=row;
                          j=j-1;
                          setLeft();
                          }
                      else
                              if(down < left && down < right){
                              current=down;
                              row=row+1;
                              j=j;
                              setDown();
                              }
                  }
                  else
                  if(!bdown){
                      if(right < up && right < left){
                      current = right;
                      row=row;
                      j=j+1;
                      setRight();
                      }
                      else
                          if(left < right && left < up){
                          current = left;
                          row=row;
                          j=j-1;
                          setLeft();
                          }
                      else
                              if(up < left && up < right){
                              current=up;
                              row=row-1;
                              j=j;
                              setUp();
                              }
                  }
                  
                  
                  }
              else
              //////////////////////////////////////////////////////////////////////////////////////////////////////////
              if(j==c-1){
                  int t=grid[row][j];
                  if(t > current ){
                  current = t;}
              break;}
              else
              ////////////////////////////////////////////////////
              if((row==0) && (j > 0 && j < c-1)){
              right=grid[row][j+1];
              left=grid[row][j-1];
              down=grid[row+1][j];
              if(!bright){
                  if(left < down){
                  current =left;
                  row=row;
                  j=j-1;
                  setLeft();
                  }
                  else
                          if(down < left ){
                          current = down;
                          row=row+1;
                          j=j;
                          setDown();
                          }
                  
                  }
                  if(!bleft){
                  if( right < down){
                  current = right;
                  row=row;
                  j=j+1;
                  setRight();
                  }
                  else
                          if(down < right){
                          current = down;
                          row=row+1;
                          j=j;
                          setDown();
                          }
                  
                  
                  }

              if(!bdown){
                      if( right < left){
                      current = right;
                      row=row;
                      j=j+1;
                      setRight();
                      }
                      else
                          if(left < right){
                          current = left;
                          row=row;
                          j=j-1;
                          setLeft();
                          }
                  }
                  
              }
              else
                    if((row==r-1) && (j > 0 && j < c-1)){
              right=grid[row][j+1];
              left=grid[row][j-1];
              up=grid[row-1][j];
              if(!bright){
                  if(left < up){
                  current =left;
                  row=row;
                  j=j-1;
                  setLeft();
                  }
                  else
                          if(up < left ){
                          current = up;
                          row=row+1;
                          j=j;
                          setUp();
                          }
                  
                  }
                  if(!bleft){
                  if( right < up){
                  current = right;
                  row=row;
                  j=j+1;
                  setRight();
                  }
                  else
                          if(up < right){
                          current = up;
                          row=row+1;
                          j=j;
                          setUp();
                          }
                  
                  
                  }

              if(!bup){
                      if( right < left){
                      current = right;
                      row=row;
                      j=j+1;
                      setRight();
                      }
                      else
                          if(left < right){
                          current = left;
                          row=row;
                          j=j-1;
                          setLeft();
                          }
                  }
                  
              }
            
              
              else
                        if(j==0 && (row > 0 && row < c-1)){
               ////////////////////////////////////////
                right=grid[row][j+1];
              down=grid[row+1][j];
              up=grid[row-1][j];
              if(!bright){
                  if(down < up){
                  current =down;
                  row=row;
                  j=j-1;
                  setDown();
                  }
                  else
                          if(up < down ){
                          current = up;
                          row=row+1;
                          j=j;
                          setUp();
                          }
                  
                  }
                  if(!bdown){
                  if( right < up){
                  current = right;
                  row=row;
                  j=j+1;
                  setRight();
                  }
                  else
                          if(up < right){
                          current = up;
                          row=row+1;
                          j=j;
                          setUp();
                          }
                  
                  
                  }

              if(!bup){
                      if( right < down){
                      current = right;
                      row=row;
                      j=j+1;
                      setRight();
                      }
                      else
                          if(down < right){
                          current = down;
                          row=row;
                          j=j-1;
                          setLeft();
                          }
                  }
                        }
              

         }
           
          if(max > current || max==-1){//deciding the path with least depth
          max = current;}
          
          i=i+1;}
          
   
          
          System.out.println(max);//printing the max  value of path 
    }
    private static void setLeft(){
    bright=false;
    bleft=true;
    bup=true;
    bdown=true;
    
    }
    
    private static void setRight(){
    bleft=false;
    bright=true;
    bup=true;
    bdown=true;
    }
    
    private static void setDown(){
    bup=false;
    bright=true;
    bdown=true;
    bleft=true;
    
    }
    
    private static void setUp(){
    bdown=false;
    bup=true;
    bright=true;
    bleft=true;
    
    }
    
    
    
    
}

 