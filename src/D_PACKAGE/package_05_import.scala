package D_PACKAGE

import java.util

import scala.collection.mutable

/*
import 特点：
  可以在任何用到的地方导入，缩小import作用范围，提高效率

使用方法：
1.import 某包(scala)下所有内容：  import scala._
2.只import某包的某几个类或特质： import scala.{class1, trait2}
3.如果有相同的类，可以重命名或隐藏
  3.1.重命名
    import pkg1.pkg2.{原始类名1=>新类名1，原始类名2=>新类名2}
  3.2.隐藏
    import pkg1.pkg2.{原始类名1=>_,_} //表示引入除了原始类名类之外的所有类


 */
object package_05_import {
  def main(args: Array[String]): Unit = {
    //1.导入java.util.HashSet
    //  import java.util.HashSet
    //  val hs1=new java.util.HashSet()
    //  println(hs.getClass)

    //2.导入java.util包下的所有内容
    //  import java.util._
    //  val list1=new ArrayList()
    //  val hs2=new HashSet()
    //  println(list1.getClass(),hs2.getClass())

    //3.只导入java.util下的ArryaList和HashSet类
    /*  import java.util.{ArrayList,HashSet}
      val list2= new ArrayList()
      val hs3=new HashSet()
      println(list2.getClass(),hs3.getClass)*/

    //4.重命名解决包名重复的问题
//    import java.util.{HashSet=> JavaHashSet}
//    import scala.collection.mutable.HashSet
//    val hs4=new HashSet()
//    print(hs4.getClass())
//    val hs5=new JavaHashSet()
//    print(hs5.getClass)

    //5.隐藏
    import java.util.{HashSet=>_,_}
    import scala.collection.mutable.HashSet
    val hs4=new HashSet()
    print(hs4.getClass())
  }

}
