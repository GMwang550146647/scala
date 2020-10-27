package D_PACKAGE
/*
1.如果包名和目录不一样(在src文件中)，会在创建程序的时候自动创建同步(在out文件中)
2.格式：
  格式1：文件顶部标记法 合并版
        package pk1.pk2.pk3
  格式2：文件顶部标记法 分解版
        package pk1.pk2
        package pk3
  格式3：串联式包语句，不超过三层
        package pk1.pk2{
          //pk1的内容在此不可见
          package pk3{
            //class & trait
          }
        }
 */
object package_01_fundamental {

}
