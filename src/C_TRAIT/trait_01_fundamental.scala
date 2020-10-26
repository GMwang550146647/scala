package C_TRAIT
/*
类只可以单继承，这个可以多继承
多继承的时候用with隔开就行了

 */
object trait_01_fundamental {
  def main(args: Array[String]): Unit = {
    //1.单继承(class 继承 trait)
    val c1=new ConsoleLogger
    c1.log("This is a log")

    //2.多继承(class 继承 trait)
    val m1=new MessageWorker
    m1.send("hello world")
    m1.reveive()

    //3.多继承(object 继承 trait)
    CL.log("log:object 继承 trait")
    CL.warn("warning:object 继承 trait")
  }



  //单继承(class 继承 trait)
  trait Logger{
    def log(msg:String)
  }
  class ConsoleLogger extends Logger{
    override def log(msg: String): Unit = println(msg)
  }

  //多继承(class 继承 trait)
  trait MessageSender{
    def send(msg:String)
  }
  trait MessageReveiver{
    def reveive()
  }
  class MessageWorker extends MessageSender with MessageReveiver {
    override def send(msg: String): Unit = println(s"发送消息，${msg}")
    override def reveive(): Unit = println("信息已收到")
  }

  //多继承(object 继承 trait)
  trait Warning{
    def warn(msg:String)
  }
  object CL extends Logger with Warning{
    override def log(msg: String): Unit = println(s"控制台信息:$msg")

    override def warn(msg: String): Unit = println(s"控制台警告:$msg")
  }
}
