package A_Projects

object C_TRAIT_programmer {
  def main(args: Array[String]): Unit = {
    //普通java程序员
    val jp=new JavaProgrammer
    jp.skill()
    //大数据java程序员
    var bjp=new BigDataJavaProgrammer
    bjp.skill()
    //python程序员
    val pp=new PythonProgrammer
    pp.skill()
    //大数据python程序员
    val bpp=new BigDataPythonProgrammer
    bpp.skill()
  }

  abstract class Programmer{
    var name:String
    var age:Int
    def skill() =println("普通程序员,只会编程")
  }
  class JavaProgrammer extends Programmer{
    override var name: String = "java程序员"
    override var age: Int = 50

    override def skill(): Unit = println(s"我是${name},${age}岁，精通java")
  }
  class PythonProgrammer extends Programmer{
    override var name: String = "python程序员"
    override var age: Int = 12
    override def skill(): Unit = println(s"我是${name},${age}岁，精通python")
  }
  trait BigData{
    def learningBigData(): Unit =println("学会了大数据，厉害得很")
  }
  class BigDataJavaProgrammer extends JavaProgrammer with BigData {
    override def skill(): Unit = {
      super.skill()
      super.learningBigData()
    }
  }
  class BigDataPythonProgrammer extends PythonProgrammer with BigData {
    override def skill(): Unit = {
      super.skill()
      super.learningBigData()
    }
  }

}
