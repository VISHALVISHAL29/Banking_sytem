fun transfer(mode:String){
    val transferAmount:Int
    when(mode){
       "withdraw" ->{
           transferAmount = if (accountType==" Debit Account"){
               debitWithdraw(money)
           }else{
               withdraw(money)
           }
           println("The amount you withdrew is $transferAmount dollars. ")
       }
        "deposit"->{
            transferAmount = if (accountType==" Credit Account"){
                creditDeposit(money)
            }else{
                deposit(money)
            }
            println("The amount you deposited is $transferAmount dollars. ")

        }
        else->{
            return
        }
    }
}