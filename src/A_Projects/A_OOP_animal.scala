package A_Projects

object A_OOP_animal {
  def main(args: Array[String]): Unit = {
    val c=new Cat
    c.name="伽菲猫"
    c.age=13
    println(c.name,c.age)
    c.run
    c.eat
    if(c.isInstanceOf[Cat]){
      val c2=c.asInstanceOf[Cat]
      c2.catchMouse
    }
    else{
      println("不是猫")
    }
  }
  abstract class Animal{
    var name=""
    var age=0
    def run()=println("动物会跑步")
    def eat()
  }
  class Cat extends Animal{
    //1.重写
    override def eat(): Unit = println("猫会吃鱼")
    //2.定义自己的功能
    def catchMouse=println("猫会捉老鼠")
  }
  class Dog extends Animal{
    override def eat(): Unit = println("狗吃肉")
    def watchHome=println("狗会看家")
  }
}
