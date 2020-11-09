package H_PATTERNMATCHING

import A_Projects.G_FP_students

/*
类如果要支持模式匹配功能，必须要定义提取器功能
case -> 自动帮我们实现提取器功能
else -> 自己定义apply 以及unapply
 */
object pm_06_extractor {
  def main(args: Array[String]): Unit = {
    //1.case 默认提取器
    val person: Any = Person("gmwang", 24)
    val order: Any = Order("001")
    //不需要创建这么多个match,通用的要弄一个matcher就好了
    //    order match{
    //      case Person(name,age) => println(s"姓名:${name},年龄:${age}")
    //      case Order(id)=> println(s"id为:${id}")
    //      case _ => println("未匹配")
    //    }
    //    person match{
    //      case Person(name,age) => println(s"姓名:${name},年龄:${age}")
    //      case Order(id)=> println(s"id为:${id}")
    //      case _ => println("未匹配")
    //    }
    val matcher: PartialFunction[Any, Any] = {
      case Person(name, age) => println(s"姓名:${name},年龄:${age}")
      case Order(id) => println(s"id为:${id}")
      case _ => println("未匹配")
    }
    matcher(order)
    matcher(person)

    //2.自定义提取器
    //2.1.创建学生类对象(由于定义了apply所以不用new关键字)
    val s1 = new Student("gmwang", 22)
    val s2 = Student("gmwang", 23)
    //2.2.获取对象属性值
    println(s1.name,s1.age)
    println(Student.unapply(s2))
    s1 match{
      case Student(name,age)=> println(s"${name},${age}")
      case _=> "未匹配"
    }

  }

  case class Person(name: String, age: Int)

  case class Order(id: String)

  class Student(var name: String, var age: Int)

  object Student {
    def apply(name: String, age: Int) = new Student(name, age)

    def unapply(s: Student): Option[(String, Int)] = {
      if (s == null) None
      else Some(s.name, s.age)
    }
  }

}
