package B_OOP
/*
匿名内部类：就是基于抽象类，创建没有名字的类（只能使用一次）
使用场景：
  只调用一次
  作为方法的参数传递
 */
object oop_07_anonymousClasses {
  def main(args: Array[String]): Unit = {
    //构造一个匿名内部类并调用其方法
    new Person(){
      override def sayHello: Unit = println("hello,  scala")
    }.sayHello

    //构造匿名内部类并辅给p
    val p:Person =new Person(){
      override def sayHello: Unit = println("hello, gmwang")
    }
    show(p)

  }
  abstract class Person{
    def sayHello
  }
  def show(p:Person)= p.sayHello
}
