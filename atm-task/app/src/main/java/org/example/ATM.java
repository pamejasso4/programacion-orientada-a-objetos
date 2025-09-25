package org.example;

public class ATM {
    public void deposit(Account cuenta, double value) {
        cuenta.deposit(value);
    }

    public boolean withdraw(Account cuenta, double value) {
        return cuenta.withdraw(value);
    }

    public boolean transfer(Account origen, Account destino, double value){
        boolean isWithdrawSuccesful = origen.withdraw(value);
        
        if(isWithdrawSuccesful) { 
            destino.deposit(value);
            return true;
        }

        return false;
    }

    public String verCantidad(Account cuenta){
        return cuenta.toString();
    }
}
