package K_IMPLICITCONVERT

import java.io.File

import scala.io.Source

/*
自动隐式转换
 */
object impc_02_autoImplicitConvert {
  //1.定义一个RichFile类，定义一个read()方法
  class RichFile(file:File){
    def read()=Source.fromFile(file).mkString
  }
  def main(args: Array[String]): Unit = {
    //2.定义一个隐式转换方法，用来将普通的File对象 -> RichFile对象
    implicit def file2RichFile(file:File) =new RichFile(file)
    //3.创建File对象，尝试用read()方法
    val file=new File("src/K_IMPLICITCONVERT/impc_01_implicitConvert.txt")
    println(file.read())
  }
}
