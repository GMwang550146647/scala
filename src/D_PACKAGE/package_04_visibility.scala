
/*
private protected 默认 限定一些成员的访问权限
格式
  访问权限修饰符[包名] //例如： private[com] var name = ""
 */

package D_PACKAGE.visibility{
  class Employee{
    var name="gmwang"
    //private 限制在某些包里面使用
    private[D_PACKAGE] var age= 23
    private[visibility] def sayHello()=println("hello,scala")
  }
  package scala{
    object package_04_visibility {
      def main(args: Array[String]): Unit = {
        val e= new Employee
        e.sayHello()
        println(e.name)
        println(e.age)

      }
    }
  }
}

