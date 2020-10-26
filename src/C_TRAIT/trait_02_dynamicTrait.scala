package C_TRAIT
//动态混入特质

object trait_02_dynamicTrait {
  def main(args: Array[String]): Unit = {
    val u1=new User with Logger
    u1.log("临时使用一下logger")
  }
  trait Logger{
    def log(msg:String)=println(msg)
  }
  class User
}
