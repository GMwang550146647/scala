package B_OOP
//isinstanceof ->该类或者子类对象 -> true
// classOf     ->只能是该类      -> true
object oop_04_isinstanceof {
  def main(args: Array[String]): Unit = {
    //1.方式1:重载
    val p:Person=new Student
    p.sayHello

    //2.方式2:多态->isinstanceof
    val p1:Person1=new Student1 //父类对象变量装子类对象的值,但是不能直接调用->多态
    if (p1.isInstanceOf[Student1]) {
      val s=p1.asInstanceOf[Student1]
      s.sayHello
    }

    //3.getClass & classOf
    println(s"Student -> Student : isinstanceof  -> ${p1.isInstanceOf[Student1]}")
    println(s"Person -> Person : isinstanceof  -> ${p1.isInstanceOf[Person1]}")
    println(s"p.getClass -> classOf[Student] -> ${p1.getClass==classOf[Student1]}")
    println(s"p.getClass -> classOf[Person] -> ${p1.getClass==classOf[Person1]}")
  }
  class Person{
    def sayHello=println("hello, 我是人")
  }
  class Student extends Person{
    override def sayHello: Unit = print("hello,我是学生")
  }

  class Person1
  class Student1 extends Person1{
    def sayHello: Unit = println("hello,我是学生")
  }
}
