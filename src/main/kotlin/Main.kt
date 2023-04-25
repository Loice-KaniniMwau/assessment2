import org.w3c.dom.ranges.Range
import kotlin.reflect.typeOf

fun main() {
    println( myname("mary"))
    multiples(1..1000)
    println( mypassword("120jaksbeui"))
var client1=CurrentAccount(1247953,"loice Kanini",2000)
    client1.deposit(3000.0)
    client1.withdraw(200.0)
    client1.details()
    var savings=SavingsAccount(3759502,"mary chebet",4500,1)
    savings.withdraw(300.5)
    println( savings.withdrawals)

}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
data class myvowels(var first:Char,var last:Char,var thelength:Int,var type: Boolean)

fun myname(random:String):String{
    var first=random.get(0)
    var last=random.get(random.length-1)
    var thelength=random.length
    var state= Boolean
    var myletter= arrayOf("a","e","o","u")
  for (letter in myletter){
      if (random.startsWith(letter)){

      }
  }
   return ("$first , $last,$thelength, $state")
}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun mypassword(password:String):Any {
    var values = password.equals(Int)
//return when (password.length) {
//   in 8..16 -> if(password !="password" && password.equals(values)){
//  println(true)
//   }
//    else false
//
//   }
//
//}
    if (password.length in 8..16 && password !="password" && password.equals(values)) {
    }

    return  true

}

//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples(numbers:IntRange){
    for (num in numbers){
        if(num % 6==0 && num % 8==0){
            println("${num}:Bingo")
        }
    }
}

//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

open class CurrentAccount(var accountNumber:Int,var accountname:String,var balance:Int){
    fun deposit(amount:Double){
       balance=balance.toInt() + amount.toInt()
        println(balance)
    }
    open fun withdraw(amount: Double){
        balance=balance.toInt() -amount.toInt()
        println(balance)
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountname")
    }
}

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingsAccount( accountNumber:Int, accountname:String, balance:Int,var withdrawals:Int):CurrentAccount(accountNumber, accountname, balance){
    override fun withdraw(amount: Double) {
        if(withdrawals < 4){
            withdrawals++

        }
    }
}
