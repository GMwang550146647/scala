package C_TRAIT
/*
每一个trait只有一个无参数构造器（不能有有参数的构造器）
类继承的时候：
1.执行父类构造器
2.从左到右执行trait的构造器
3.如果trait有父trait，则先执行父trait构造器
4.多个trait有同样的父trait，父trait只初始化一次
5.执行子类构造器
 */
object trait_06_construction {
  def main(args: Array[String]): Unit = {
    val st=new Student
  }
  trait Logger{
    println("执行Logger构造器 2")
  }
  trait MyLogger extends Logger{
    println("执行MyLogger构造器 3")
  }
  trait TimeLogger extends Logger{
    println("执行TimeLogger构造器 4")
  }
  trait Person{
    println("执行Person的构造器 1")
  }
  class Student extends Person with MyLogger with TimeLogger{
    println("执行Student类的构造器 5")
  }
}
