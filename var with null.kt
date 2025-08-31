fun main() {
    var x:String="Red"
    x=null
    println(x)
  
}
//output:// Error! String cannot be null
fun main() {
    var x:String?="Red"
    x=null
    println(x)
  
}
//output: null
