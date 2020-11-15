package J_HighLevelFunction
/*
1.高阶函数：
  将函数作为参数传入
2.匿名函数
  没有赋值给变量的函数
 */
object hlf_01_hlf {
  def main(args: Array[String]): Unit = {
    //1.高阶函数，把函数作为参数传入
    val int_list=(1 to 10 ).toList
    val func=(x:Int)=> "*"*x
    val str_list=int_list.map(func)
    println(str_list)

    //2.匿名函数
    val str_list2=int_list.map((x:Int) => "*"*x)
//    val str_list21=int_list.map("*"*_)
    println(str_list2)

  }
}
