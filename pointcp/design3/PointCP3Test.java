public class PointCP3Test {
    public static void main(String[] args)
    {
      
      System.out.println("Cartesian-Polar Coordinates Conversion Program");
  
      
      for (int j=0; j<10; j++){
          System.out.print("Test number: "+(j+1) + "\n");
          long startTime = System.currentTimeMillis();
          for (int i=0; i<=2000000; i++){
              
              PointCP3 pointa;
              
              double x = (Math.random()*10.0);
              double y = (Math.random()*10.0);
              
              pointa = new PointCP3(x,y);
              pointa.convertStorageToPolar();
              
              
              
              pointa.getDistance(new PointCP3(0.0,0.0));
              
              double r = (Math.random()*360.0);
              pointa.rotatePoint(r);
              
          }
          
          long stopTime = System.currentTimeMillis();
          long elapsedTime = stopTime-startTime;
          System.out.println("Elapsed time of Design 3: "+ elapsedTime + " milliseconds");
        }
          
          
  }
}