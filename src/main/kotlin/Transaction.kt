fun withdraw (amount:Int):Int{
    accountBalance -= amount
    println("Successfully withdrew $money dollars")
    println("The current balance is $accountBalance dollars")
    return amount
}

fun debitWithdraw(amount: Int):Int{
    if (accountBalance == 0){
        println("Can't withdraw, no money on this account!")
        return accountBalance
    }else if(amount>accountBalance){
        println(" Not enough money on this account! The checking balance is $accountBalance dollars. ")
        return 0
    }else{
        return withdraw(amount)
    }
}
