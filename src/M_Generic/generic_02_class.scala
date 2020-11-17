package M_Generic
/*
class 类[T](val 变量名：T)

 */
import scala.reflect.runtime.universe._
object generic_02_class {
  class Pair[T](var a:T,var b:T){
    def print_att()=println(s"A:${a},type:${a.getClass}\tB:${b},type:${b.getClass}")
  }
  def main(args: Array[String]): Unit = {
    //1.同类型
    val p1=new Pair[Int](10,20)
    p1.print_att()
    val p2=new Pair[String]("a","b")
    p2.print_att()
    //2.不同类型
    val p3=new Pair(10,"a")
    p3.print_att()
  }
}
