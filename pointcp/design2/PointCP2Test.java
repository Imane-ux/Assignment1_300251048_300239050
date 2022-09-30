public class PointCP2Test {
  public static void main(String[] args)
  {
    
    //System.out.println("Cartesian-Polar Coordinates Conversion Program");

    
    for (int j=0; j<10; j++){
        System.out.print("Test number: "+(j+1)+"\n");
        long startTime = System.currentTimeMillis();
        for (int i=0; i<=2000000; i++){
            
            PointCP2 point;
            
            
            double x = (Math.random()*10.0);
            double y = (Math.random()*10.0);

            //long startTime0 = System.currentTimeMillis();
            point = new PointCP2(x,y);
            //long stoTime0 = System.currentTimeMillis();
            //long elapsedTime0 = stoTime0-startTime0;
            //System.out.println("Constructor Elapsed Time="+ elapsedTime0);
            

            //long stTime1 = System.currentTimeMillis();
            point.convertStorageToCartesian();
            //long stoTime1 = System.currentTimeMillis();
            //long elapsedTime1 = stoTime1-stTime1;
            //System.out.println("Conversion to cartesian Elapsed Time="+ elapsedTime1);
            
            //long stTime2 = System.currentTimeMillis();
            point.getDistance(new PointCP2(0.0,0.0));
            //long stoTime2 = System.currentTimeMillis();
            //long elapsedTime2 = stoTime2-stTime2;
            //System.out.println("Cet distance Elapsed Time="+ elapsedTime2);

            double r = (Math.random()*360.0);

            //long stTime3 = System.currentTimeMillis();
            point.rotatePoint(r);
            //long stotTime3 = System.currentTimeMillis();
            //long elapsedTime3 = stotTime3-stTime3;
            //System.out.println("Rotating Elapsed Time="+ elapsedTime3);
            
        }
        
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime-startTime;
        System.out.println("Elapsed time of Design 2: "+ elapsedTime + " milliseconds");
      }
        
        
}
}