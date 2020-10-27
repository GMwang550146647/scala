
/*
包的作用域
  1.下层可以直接访问上层内容
  2.上层和下层有相同的类，就近原则使用
    如果明确使用上层的类，通过包名+类名实现
  3.上层使用下层的包需要导包
 */

package D_PACKAGE.pkg_upstream{
  class Person //D_PACKAGE.pkg_test.Person
  class Teacher //D_PACKAGE.pkg_test.Teacher
  object Demo2{
    def main(args: Array[String]): Unit = {
      //上层使用下层的内容时，需要导包
      //相对路径导包
      import pkg_downstream.Student
      //绝对路径导包（相对于项目)
      //import D_PACKAGE.pkg_upstream.pkg_downstream.Student
      val s=new Student
      println(s)
    }
  }
  package pkg_downstream{
    class Person  //D_PACKAGE.pkg_test.scala.Person
    class Student //D_PACKAGE.pkg_test.scala.Student
    object Demo1{
      def main(args: Array[String]): Unit = {
        //1.测试下层可以直接访问上层内容
        val t =new Teacher
        println(t)

        //2.测试上下层有相同类，会用就近原则
        val p1=new Person
        println(p1)

        //3.明确需要上层的包
        val p2=new D_PACKAGE.pkg_upstream.Person
        println(p2)
      }
    }
  }
}
