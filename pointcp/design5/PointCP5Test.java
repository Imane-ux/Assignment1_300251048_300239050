public class PointCP5Test {
    public static void main(String[] args)
    {
      
      for (int j=0; j<5; j++){
          System.out.print("Test number: "+(j+1)+"\n");
          long startTime = System.currentTimeMillis();
          for (int i=0; i<=2000000; i++){
              
              PointCP2 pointa;
              
              double x = (Math.random()*10.0);
              double y = (Math.random()*10.0);
              
              pointa = new PointCP2(x,y);
              pointa.convertStorageToCartesian();
              
              
              
              pointa.getDistance(new PointCP2(0.0,0.0));
              pointa.getDistance(new PointCP2(0.0,0.0));
              
              double r = (Math.random()*360.0);
              pointa.rotatePoint(r);
              
          }
          
          long stopTime = System.currentTimeMillis();
          long elapsedTime = stopTime-startTime;
          System.out.println("Elapsed time of Design 2: "+ elapsedTime + " milliseconds");
        //}
          
          long startTime1 = System.currentTimeMillis();
          for (int i=0; i<=2000000; i++){
              
              PointCP3 pointb;
              
              double x = (Math.random()*10.0);
              double y = (Math.random()*10.0);
              
              pointb = new PointCP3(x,y);
              
              pointb.convertStorageToPolar();
              
              //pointb.convertStorageToCartesian();
  
              pointb.getDistance(new PointCP3(0.0,0.0));
              pointb.getDistance(new PointCP3(0.0,0.0));
              
              double r = (Math.random()*360.0);
              pointb.rotatePoint(r);
              
          }
          
          long stopTime1 = System.currentTimeMillis();
          long elapsedTime1 = stopTime1-startTime1;
          System.out.println("Elapsed time of Design 3: "+ elapsedTime1 + " milliseconds");
          
          long startTime2 = System.currentTimeMillis();
          for (int i=0; i<=20000000; i++){
              PointCP2 point6;
              //PointCP3 pointc;
              
              double x = (Math.random()*10.0);
              double y = (Math.random()*10.0);
              point6 = new PointCP2(x,y);
              point6.convertStorageToCartesian();
              //pointc = new PointCP3(x,y);
              //pointc.convertStorageToPolar();
              
              point6.getDistance(new PointCP2(0.0,0.0));
              //pointc.getDistance(new PointCP3(0.0,0.0));
              
              double r = (Math.random()*360.0);
              point6.rotatePoint(r);
          }
          
          long stopTime2 = System.currentTimeMillis();
          long elapsedTime2 = stopTime2-startTime2;
          System.out.println("Elapsed time of Design 5: "+ elapsedTime2 + " milliseconds");
          }
      }
  
    } 
