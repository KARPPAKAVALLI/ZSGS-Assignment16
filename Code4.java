package com.assignment16;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(){
        super("Error: Insufficient Balance");
    }
}
class User{
    String name;
    float balance;
    User(String name,float balance){
        this.name=name;
        this.balance=balance;
    }
}

class Transaction {
    public static void withdraw(User u,float amount){
        try {
            if(amount>u.balance)
                throw new InsufficientBalanceException();
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
public class Code4 {
    //4. Create multiple classes to imitate a bank structure with proper Exception Handling.
    // For eg., if the user tries to withdraw more than the balance,
    // throw "InsufficientBalanceException" (created customly)
    public static void main(String[] args) {
        User u=new User("Jake",15600);
        try {
            Transaction.withdraw(u,34500);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
