 var accountBalance: Int= (0..1000).random()
 val money:Int = (1..1000).random()
 var accountType = ""
var isSystemOpen = true

 fun main() {
    println("Welcome to Local Banking System.")
    println("What kind of account would you like to create?")
    println("1. Debit Account")
    println("2. Credit Account")
    println("3. Checking Account")
    var userChoice: Int
    while (accountType == "") {
        println("Choose an option : 1,2 and 3")
        userChoice = (1..5).random()
        println("Selected option is : $userChoice")
        accountType = when (userChoice) {
            1 -> "Debit Account"
            2 -> "Credit Account"
            3 -> "Checking Account"
            else -> continue
        }
        println("You have created a $accountType")
    }
    println("The current balance is $accountBalance dollars")
    println("The amount to be transferred is $money dollars")
    if (accountType == "Debit Account"){
        debitWithdraw(money)
    }else{
        withdraw(money)
    }
    println("Do you want to deposit money : Yes/No")

    when(readLine()){
        "Yes"->{
            print("Entre the Amount to be deposited : ")
            val depositMoney:Int? = readLine()?.toInt()
            if (accountType=="Credit  Account"){
                creditDeposit(depositMoney)
            }else{
                deposit(depositMoney)
            }
        }
        "No"->{
            println("Exit")
        }
        else->{
            println("Enter a valid response ")
            println("Exit")
        }
    }

     while (isSystemOpen){
        println("What would you like to do?")
        println("1. Check bank account balance")
        println("2. Withdraw money")
        println("3. Deposit money")
        println("4. Close the app")
        println("Which option do you choose? (1, 2, 3 or 4)")
         val option: Int? = readLine()?.toInt()
         println("The Selected option is $option")
         when(option){
             1-> println("The current account balance is $accountBalance")
             2->transfer("withdraw")
             3->transfer("deposit")
             4-> {
                 isSystemOpen = false
                 println("The system is closed")
             }
             else->continue

         }
     }

}









// Solution for the problem faced while taking user input

//    var userChoice: Int?
//    val input= readLine()
//        userChoice = input?.toIntOrNull()