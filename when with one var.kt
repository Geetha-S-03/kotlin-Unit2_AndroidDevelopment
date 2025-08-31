
fun main() {
    val x="blue"
    val message=when(x){
        "Red"->"Stop"
        "yellow","blue"->"Ready"
        "Green"->"Go"
        else->"Invalid input"

    }
    println(message)
  
}
