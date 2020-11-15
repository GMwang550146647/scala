package L_Recursive
import scala.collection.mutable.{Map => mMap}
object Recursive_02_fabonacci {
  def fab1(n:Long):Long={
    if (n<=1) 1
    else fab1(n-1)+fab1(n-2)
  }
  def fab2(n:Long,record:mMap[Long,Long]=mMap()): Long ={
    if(n<=1) 1
    else {
      val tempt1=record.getOrElse(n,fab2(n-1,record))
      record(n-1)=tempt1
      val tempt2=record.getOrElse(n-2,fab2(n-2,record))
      record(n-2)=tempt2
      tempt1+tempt2
    }
  }
  //super simplified版本
  def fab3(n:Long,record:mMap[Long,Long]=mMap()): Long ={
    if(n<=1) 1
    else record.getOrElseUpdate(n-2,fab3(n-2,record))+record.getOrElseUpdate(n-1,fab3(n-1,record))
  }
  def main(args: Array[String]): Unit = {
    println(fab3(90))
    println(fab2(46))
    println(fab1(46))
  }
}
