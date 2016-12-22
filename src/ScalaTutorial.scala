/**
  * Created by Danila on 12/19/2016.
  */


object ScalaTutorial{
  def main(args: Array[String]): Unit ={
    var i = 0

  val randLetters = "ABCDEFGHIJLMNOPQRSTUVWXYZ"
/*

    for(i <- 0 until randLetters.length)
      println(randLetters(i))

    for(i <- 2 to 10)
      println(i)
*/
/*

    val aList = List(1,2,3,4,5)
    for(i <- aList){
      println(i)
    }
*/

 /*   var evenList = for {i <- 1 to 20
      if (i%2) == 0
    } yield i

   evenList.foreach {println}*/
    var list1 = List("hi", "me", "hi")
    println(list1.map(mapFunc))


    println(list1.filter(filterFunc))
    /*var text = f("hello")
    println(text)*/
    //list1.filter(filterFunc compose f )
  }

  def mapFunc(x:String):String = { x + "a"; }
  def filterFunc(y:String):Boolean = {y.equals("hia")}
}