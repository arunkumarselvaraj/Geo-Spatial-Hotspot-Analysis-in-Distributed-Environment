package cse512

object HotzoneUtils {

   def ST_Contains(queryRectangle: String, pointString: String ): Boolean = {
    // YOU NEED TO CHANGE THIS PART
    val rectangleBoundaryStrArr:Array[String] = queryRectangle.split(",")
    val rectangleBoundaryArr = rectangleBoundaryStrArr.map(x => x.toDouble)
    val rectangleX1 = rectangleBoundaryArr(0)
    val rectangleY1 = rectangleBoundaryArr(1)
    val rectangleX2 = rectangleBoundaryArr(2)
    val rectangleY2 = rectangleBoundaryArr(3)
    
    val pointStrValues:Array[String] = pointString.split(",")
    val pointValues = pointStrValues.map(x => x.toDouble)
    val pointX = pointValues(0)
    val pointY = pointValues(1)

    if((rectangleX1 < rectangleX2) && (rectangleY1 < rectangleY2)) {
      if((rectangleX2 >= pointX) && (pointX >= rectangleX1) && (rectangleY2 >= pointY) && (pointY >= rectangleY1)) {
        return true
      }
    } else if((rectangleX1 > rectangleX2) && (rectangleY1 > rectangleY2)) {
      if((rectangleX2 <= pointX) && (pointX <= rectangleX1) && (rectangleY2 <= pointY) && (pointY <= rectangleY1)) {
        return true
      }
    } else if((rectangleX1 < rectangleX2) && (rectangleY1 > rectangleY2)) {
      if((rectangleX2 >= pointX) && (pointX >= rectangleX1) && (rectangleY2 <= pointY) && (pointY <= rectangleY1)) {
        return true
      }
    } else if((rectangleX1 > rectangleX2) && (rectangleY1 < rectangleY2)) {
      if((rectangleX2 <= pointX) && (pointX <= rectangleX1) && (rectangleY2 >= pointY) && (pointY >= rectangleY1)) {
        return true
      }
    }
    return false
	// YOU NEED TO CHANGE THIS PART
  }

  // YOU NEED TO CHANGE THIS PART

}
