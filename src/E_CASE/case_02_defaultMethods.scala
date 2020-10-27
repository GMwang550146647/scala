package E_CASE
/*
case:已经重写了以下的方法的类

apply()   ->省去new    -> val p=Person()
toString()->打印所有属性值
equals()  ->所有成员变量值是否相等
hashCode()->同一对象（注意，是对象，不是类）一定相等，不同对象极小概率相等
copy()    ->快速创建属性值相同的对象，还可以赋值
unapply() ->提取器（To be continue)
 */
object case_02_defaultMethods {
  def main(args: Array[String]): Unit = {
    //1.apply()->省去new    -> val p=Person()
    val p1=Person("gmwang",23)
    val p2=Person("gmwang1",24)
    val p1_similar=Person("gmwang",23)
    //2.toString()->打印所有属性值
    println("p1:"+p1)
    //3.equals()  ->所有成员变量值是否相等
    println("p1==p1_similar:"+(p1==p1_similar))
    //4.hashCode()->同一对象[属性相同都可以]（注意，是对象，不是类）一定相等，不同对象极小概率相等
    println("p1.hashCode():"+p1.hashCode())
    println("p1_similar.hashCode():"+p1_similar.hashCode())
    //5.copy()    ->快速创建属性值相同的对象，还可以赋值
    val p1_copy=p1.copy()
    val p1_copy1=p1.copy(age=100)
    println(s"p1_copy==p1:${p1_copy==p1}")
    println(s"p1_copy.hashCode()==p1.hashCode():${p1_copy.hashCode()==p1.hashCode()}")
    println(s"p1_copy1.hashCode()==p1.hashCode():${p1_copy1.hashCode()==p1.hashCode()}")
    //6.unapply() ->提取器（To be continue)
  }

  case class Person(var name:String,var age:Int){}


}
