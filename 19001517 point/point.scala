object CaseClassAss {

  case class Point(x:Int,y:Int)
  {
    def a:Int=x
    def b:Int=y

//Addition of two points
    def +(that:Point)=Point(this.x+that.x,that.y+this.y)

    //moving pointers
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)

    //distance between two points
    def distance(a:Point)=Point(this.x-a.x,this.y-a.y)
    
    //inverse of point
    def invert()=Point(this.y,this.x)
  }



def main(args: Array[String]): Unit = {
  val p1=new Point(3,7)
  val p2=new Point(2,5)
  val p3=new Point(4,9)
  println(p1+p2)
  println(p1.move(2,1))
  println(p3.distance(p2))
  println(p1.invert())
}
}