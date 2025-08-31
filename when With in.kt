fun main() {
    val x=4
   
    when(x){
       2,3,5,7,9->println("$x is a prime number")
       in 1..10->println("$x is a number between 1 and 10, but not a prime number.")
       else->println("$x is not a prime number")
    }
}
