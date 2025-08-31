fun main() {
    var x:String="Hello"
    println(x.length)
}
//output:5

fun main() {
    var x:String=null
    println(x.length)
  
}
//output:Null cannot be a value of a non-null type 'String'.

fun main() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor?.length)  // 9

    favoriteActor = null
    println(favoriteActor?.length)  // null


}
