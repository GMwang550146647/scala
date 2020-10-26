package OOP
/*
抽象类 ：包含抽象方法的类
抽象方法 ： 没有结构体的方法
注意：
  子类：
    1.如果子类也是抽象方法(字段)，那么不用重写父类抽象方法
    2.如果子类不是抽象方法(字段)，则必须重写所有抽象方法(字段)
 */

object oop_06_abstractObject {
  def main(args: Array[String]): Unit = {
    val s1=new Square(5)
    val s2=new Rectangle(5,6)
    val s3=new Circle(4)
    println(s1.area(),s2.area(),s3.area())
    s3.printArea()
  }
  abstract class Shape{
    //以下字段和方法需要重写
    val scale:Double
    def area():Double

    //该方法不用重写，因为有结构体
    def printArea(): Unit ={
      println(s"Area is ${this.area()}")
    }
  }
  class Square(var edge:Double) extends Shape{
    override val scale: Double = 10
    override def area(): Double = edge*edge
  }
  class Rectangle(var length:Double,var width:Double)extends Shape {
    override val scale: Double = 10
    override def area(): Double = length*width
  }
  class Circle(var radius:Double) extends Shape{
    override val scale: Double = 10
    override def area(): Double = Math.PI*radius*radius
  }
}
