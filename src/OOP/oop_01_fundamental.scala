package OOP
/*
类基础知识
 */
object oop_01_fundamental {
  def main(args: Array[String]): Unit = {
    //1.类私有和公有成员（属性以及方法）
    val p=new Person
    println(s"origin:${p.getNmme},${p.getAge}")
    p setName ("gmwang")
    p setAge(25)
    println(s"modified:${p.getNmme},${p.getAge}")
    p sayHello

    //2.类构造函数
    val p1=new newPerson()
    val p2=new newPerson(name="little gmwang",age=12)
    val p3=new newPerson(age=111)
    val p4=new newPerson("傻老")

    //3.类辅助构造函数
    val nnp1=new newnewPerson(Array("a","b"))
    val nnp2=new newnewPerson("a","b")
    println(newnewPerson.len_legs)

    //4.类
    println(newnewPerson.printFenGe(nnp2))

    //5.
    val pk=newPerson("gmwang",37)
  }

  def printMT(n: Int) = {
    for (i <- 1 to n; j <- 1 to i) {
      print(s"${i} * ${j} = ${i * j}\t")
      if (i == j) println()
    }
  }

  def printMT1(n: Int) = for (i <- 1 to n; j <- 1 to i) print(s"${i} * ${j} = ${i * j}"+(if (i==j) "\n" else '\t'))

  //类1
  class Person {
    //方式1
    //  var name=""
    //  var age=0
    //方式二
    private var name: String = _
    private var age: Int = _

    def setAge(age: Int) = this.age = age

    def getAge = this.age

    def setName(name: String) = this.name = name

    def getNmme = this.name

    def sayHello(): Unit = {
      println(s"Hello,${this.name}!")
    }
  }

  //类2
  class newPerson(name: String = "GMwang", age: Int = 99) {
    println(s"newPerson Created: name->${this.name}   age->${this.age}")
  }
  object newPerson{
    def apply(name: String, age: Int) =new newPerson( name ,age)
  }

  //类3
  class newnewPerson(var name: String, var sex: String) {

    def this(arr: Array[String]) {
      this(arr(0), arr(1))
    }

    println(s"newPerson Created: name->${this.name}   age->${this.sex}")
  }

  object newnewPerson {
    val len_legs = 2

    def printFenGe(p: newnewPerson): Unit = {
      println(s"________${p.name}")
    }
  }
}
