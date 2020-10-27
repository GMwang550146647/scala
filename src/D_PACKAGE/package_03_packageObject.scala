package D_PACKAGE.pck_object{//父包
  //子包
  package scala{
    class A
    trait B
  }
  //包对象，与包同级，可以定义变量和方法
  package object scala{
    var name="gmwang"
    def sayHello()=println("Hello, scala")
  }
  object package_03_packageObject{
    def main(args: Array[String]): Unit = {
      //能够访问该包对象的成员
      println(scala.name)
      scala.sayHello()
    }
  }
}

