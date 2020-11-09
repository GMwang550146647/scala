package J_HIGHLEVELFUNCTION
/*
控制抽象函数
  函数的参数列表接收了一个无参无返回值的函数
 */
object hlf_04_controlAbstract {
  def main(args: Array[String]): Unit = {
    val myShop=(f1:()=>Unit) => {
      println("Welcome~")
      f1()
      println("Thanks for comming!")
    }
    myShop(()=> println("Gmwang shops~"))
  }

}
