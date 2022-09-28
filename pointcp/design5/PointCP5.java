/**
 * PointCP5 is our abstract class.
 */
public abstract class PointCP5 {

    protected double xOrRho;
    protected double yOrTheta;
  
  
    //Instance methods ***
    //i'll leave the constructor here,
  public PointCP5(double xOrRho, double yOrTheta)
    {
  
      this.xOrRho = xOrRho;
      this.yOrTheta= yOrTheta;
     
    }

  //Instance methods ***
  //i'll leave the constructor here,

 
  public abstract double getX();
  
  
  public abstract double getY();
  
  
  public abstract double getRho();
  
  
  public abstract double getTheta();
 

  public abstract String toString();




 
}