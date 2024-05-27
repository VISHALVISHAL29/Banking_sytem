fun deposit(amount: Int?):Int{
    if (amount == null) {
        println("Cannot deposit a null amount.")
        return 0
    }
    accountBalance += amount
    println("The amount to be deposited is $amount.")
    println("Balance after deposition is $accountBalance")
return amount
}

fun creditDeposit(amount: Int?): Int {
    if (amount == null) {
        println("Cannot deposit a null amount.")
        return 0
    }
    else if (accountBalance==0){
        println("You don't need to deposit anything to payoff the account since it has already been paid off ")
        return accountBalance
    }
    else if((amount + accountBalance) > 0 ){
        println("Deposit failed , you tried to pay off an amount greater that the credit balance . The Checking balance is $accountBalance dollars ")
         return 0
    }else if (amount == -accountBalance){
        println("You paid off this account !")
        return amount
    }else{
        return deposit(amount)
    }

}