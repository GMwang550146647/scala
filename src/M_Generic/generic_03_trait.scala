package M_Generic

object generic_03_trait {
  trait Logger[T]{
    val a:T
    def show(b:T)
  }
  object ConsoleLogger extends Logger[String]{
    override val a: String = "gmwang"

    override def show(b: String): Unit = println(s"A:${a},type:${a.getClass}\tB:${b},type:${b.getClass}")
  }
  def main(args: Array[String]): Unit = {
    val cl=ConsoleLogger
    ConsoleLogger.show("feifei")
  }
}
