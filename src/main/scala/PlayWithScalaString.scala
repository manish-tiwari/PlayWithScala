import java.util

/**
  * Created by tiwarim on 6/27/2018.
  */
object PlayWithScalaString extends App {
  val nameInLowerCase="manish"
  val nameInUpperCase="Manish"
  println("nameInLowerCase has uppercase?  "+nameInLowerCase.exists(_.isUpper))
  println("nameInUpperCase has uppercase?  "+nameInUpperCase.exists(_.isUpper))
  val map= Map(1->2,2->"sds")
  println("map: "+map)
  println("map.toString() "+map.toString())
  println("map.values: "+map.values)
  map.foreach(kv=>println("kv:",kv._1,kv._2))
  val list=List("a","b","c")
  println("Iterate over list using 'list.foreach'")
  list.foreach(value=>println(value))
  println("Iterate over list using traditional 'for' loop")
  for (value<-list) println(value)

  val jList=new util.ArrayList[String]
  jList.add("ada")
  jList.add("eds")
  jList add "sfddde"
  println("print jList: "+jList.toString)

  println("42==42: ",42==42) //value comparision in scala unlike in java
  //println("42 eq 42: ",42 eq 42) //ref comparison in scala
  println("42.equals(42)",42.equals(42))



  var nameLiteral="Manish"
  var duplicateNameLiteral="Manish"
  println("nameLiteral==duplicateNameLiteral",nameLiteral==duplicateNameLiteral)
  println("nameLiteral.equals(duplicateNameLiteral)",nameLiteral.equals(duplicateNameLiteral))
  println("nameLiteral eq duplicateNameLiteral",nameLiteral eq duplicateNameLiteral)


  var nameObject=new String("Manish")
  var duplicateNameObject=new String("Manish")

  println("nameObject==duplicateNameObject",nameObject==duplicateNameObject)
  println("nameObject.equals(duplicateNameObject)",nameObject.equals(duplicateNameObject))
  println("nameObject eq duplicateNameObject",nameObject eq duplicateNameObject)

  def add(first: Int, second: Int=1)={
    first+second
  }
  println(add(3))
  println(add(3,6)) //

  def subtract(first:Int, second:Int=1)={
    first-second
  }

  println(subtract(3)) // default arg , here second arg defaults to 1
  println(subtract(3,6))
  println(subtract(second = 3,first = 6)) //named arguments

  //var agruments
  def printAll(nums: Int*)={
      nums.foreach(println)
  }

  printAll(1,2,3,4,5)
  printAll()
  printAll(2)


}
