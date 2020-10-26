package C_TRAIT
/*
定义一个中间抽象类，就不用重写所有的方法了
 */
object trait_03_shiPeiQiMoShi {
  def main(args: Array[String]): Unit = {
    val gh=new GreenHand
    gh.schoolchild()
    gh.support()
  }


  trait PlayLOL{
    def top()
    def mid()
    def abc()
    def support()
    def jungle()
    def schoolchild()
  }
  abstract class Player extends PlayLOL{
    override def top(): Unit = ???

    override def mid(): Unit = ???

    override def abc(): Unit = ???

    override def support(): Unit = ???

    override def jungle(): Unit = ???

    override def schoolchild(): Unit = ???
  }
  class GreenHand extends Player {
    override def support(): Unit = println("回城，回城")
    override def schoolchild(): Unit = println("我是小学生，我要打人")
  }
}
