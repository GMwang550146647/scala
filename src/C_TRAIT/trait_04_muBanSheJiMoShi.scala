package C_TRAIT
object trait_04_muBanSheJiMoShi {
  def main(args: Array[String]): Unit = {
    val fd=new ForDemo
    println(s"total runtime: ${fd.getRunTime()}")

  }
  abstract class Template{
    //只有code是不知道的，所以其他步骤都是固定的，成为模板
    def code()
    def getRunTime(): Long ={
      val start =System.currentTimeMillis()
      code()
      val end=System.currentTimeMillis()
      end-start
    }
  }
  class ForDemo extends Template{
    override def code(): Unit = for(i<- 1 to 10000) println(s"第${i}个: Hello World!")
  }
}
