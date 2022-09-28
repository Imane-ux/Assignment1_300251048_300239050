public class PointCP2 extends PointCP5 {
    
  
  //Constructors ****************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP2(double xOrRho, double yOrTheta)
  {
    super(xOrRho, yOrTheta);
  }
	
  
  //Instance methods ****************
 
 
  public double getX()
  {
    return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho); 
  }
  
  public double getY()
  {
    return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho); 
  }
  
  public double getRho()
  {
    return xOrRho;
  }
  
  public double getTheta()
  {
    return yOrTheta;
  }
  

  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  public void convertStorageToCartesian()
  {
    
      //Calculate X and Y
      double temp = getX();
      yOrTheta = getY();
      xOrRho = temp;
   
  }
   /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance( PointCP5 pointB) //test this out if not --> extended classes.
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }



 /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP2 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP2 ( // can't be instantited here cuz i dont have a constructor
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as Polar [" + getRho() + "," + getTheta() + "]";
       
  }
}
