package M_Generic

object generic_01_function {
  //1.普通方法
  def getMiddleElement1(arr:Array[Int])=arr(arr.length/2)
  //2.类型转换方法
  def getMiddleElement2(arr:Array[Any])=arr(arr.length/2)
  //3.泛型方法：不用写重载函数
  def getMiddleElement3[T](arr:Array[T])=arr(arr.length/2)

  def main(args: Array[String]): Unit = {
    println(getMiddleElement1(Array(1,2,3,4,5)))
    println(getMiddleElement2(Array("a","b","c","d","e")))
    println(getMiddleElement3(Array("a","b","c","d","e")))

  }
}
