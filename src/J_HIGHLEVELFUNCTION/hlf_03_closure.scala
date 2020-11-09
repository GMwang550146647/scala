package J_HIGHLEVELFUNCTION
/*
闭包
  可以访问不在当前作用域数据的一个函数
 */
object hlf_03_closure {
  def main(args: Array[String]): Unit = {
    val x=10
    val getSum=(y:Int)=> {
      x+y
    }
  }
}
