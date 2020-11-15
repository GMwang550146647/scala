package J_HighLevelFunction
/*
柯里化(Currying)
  将原先接收多个参数的方法转换为多个只有一个参数的参数列表过程
 */
object hlf_02_curring {
  def main(args: Array[String]): Unit = {
    //Currying
    //1.普通版本
    val str1=merge1("abc","123")
    //2.Curring版本
    val str2=merge2("abc","123")((x,y)=>x+y)
    val str3=merge2("abc","123")(_+_)
    val str4=merge2("abc","123")(_.toUpperCase()+_)
  }
  def merge1(s1:String,s2:String)=s1+s2
  def merge2(s1:String,s2:String)(f1:(String,String) =>String)=f1(s1,s2)
}
