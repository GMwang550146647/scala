package K_ImplicitConversion

import java.io.File

import scala.io.Source

/*
隐式转换
  以implicit关键字声明的带有单个参数的方法，自动调用，实现自动将某种类型数据转换为另一种类型数据
执行流程
  1.先查找File类有没有read()功能
  2.如果没有，就去查看有没有该类型的隐式转换，把该对象转化成其他类型的对象
  3.如果没有隐式转换，直接报错
  4.如果可以把该类型对象转换成其他类型对象，则查看升级后的对象有没有该方法，有则调用，没有则报错
 */
object impc_01_functionManualImplicitConvert {
  //1.定义RichFile类以丰富File类功能
  class RichFile(file:File){
    def read()=Source.fromFile(file).mkString
  }
  //2.定义单例对象ImplicitDemo,该单例对象将File对象转换成RichFile对象
  object ImplicitDemo{
    //隐式转换方法file2RichFile，用来将File对象转化成RichFile对象
    implicit def file2RichFile(file:File) =new RichFile(file)
  }
  def main(args: Array[String]): Unit = {
    //3.核心细节:手动导入隐式转换
    import ImplicitDemo.file2RichFile
    //4.创建普通File 对象，尝试调用Read()功能
    val file=new File("src/K_IMPLICITCONVERT/impc_01_implicitConvert.txt")
    println(file.read())
  }

}
