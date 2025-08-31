fun main() {
    val x=19
   
    when(x){
       2,3,5,7,9->println("$x is a prime number")
       in 1..10->println("$x is a number between 1 and 10, but not a prime number.")
       is Int->println("x is an integer number, but not between 1 and 10.")
       else->println("$x is not a prime number")
    }
}
