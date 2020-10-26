package OOP

/*
对象继承
单例对象继承

与函数重载

多态
 */
object oop_03_entend {
  def main(args: Array[String]): Unit = {
    val p1=new Teacher1("gmwang",24)
    p1.canDo()
    val p2=new Student1("gmwang",22)
    p2.canDo()
    val p3=new Person()
    p3.canDo()
    val p4=new Teacher()
    p4.canDo()
    val p5=new Student()
    p5.canDo()

  }
  class Teacher1(var name:String,var age:Int) {
    def canDo() = println(s"我是老师，喜欢教书,名字是${this.name},年龄是${this.age}")
  }

  class Student1(var name:String,var age:Int) {
    def canDo() = println(s"我是学生，喜欢逃课,名字是${this.name},年龄是${this.age}")
  }
  //继承版本
  class Person(){
    var name:String=""
    var age:Int=0
    val id="person"
    def canDo()=println(s"我是人，会吃饭,名字是${this.name},年龄是${this.age}")
  }
  //函数重载
  class Teacher extends Person{
    override val id="teacher" //val变量能重载，但是
    name="gemwang"
    override def canDo() ={
      println(s"我是老师，喜欢教书,名字是${this.name},年龄是${this.age}")
    }
  }
  class Student extends Person{
    override val id="student"
    name="std1"
    override def canDo() =println(s"我是学生，喜欢逃课,名字是${this.name},年龄是${this.age}")
  }


  object angryMan extends Person
}
