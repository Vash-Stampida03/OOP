/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;
public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;
  
  
  public Bank(){
    accountOne = new CheckingAccount("Zeus", 0 , "1");
    accountTwo = new CheckingAccount("Hades", 0 , "2");
  }

  
  

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println("En la cuenta 1 hay un saldo de " + bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(500);
    System.out.println("---------------");
    System.out.println("En la cuenta 1 hay un saldo de " +bankOfGods.accountOne.getBalance());
    System.out.println("---------------");
  
    //System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    bankOfGods.accountOne.consignar(3000);
    System.out.println("En la cuenta 1 hay un saldo de " + bankOfGods.accountOne.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountOne.consignar(1000);
    System.out.println("En la cuenta 1 hay un saldo de " + bankOfGods.accountOne.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountOne.consignar(1000);
    System.out.println("En la cuenta 1 hay un saldo de " + bankOfGods.accountOne.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountOne.consignar(1000);
    System.out.println("En la cuenta 1 hay un saldo de " + bankOfGods.accountOne.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountOne.consignar(1000);
    System.out.println("En la cuenta 1 hay un saldo de " + bankOfGods.accountOne.getBalance());
    System.out.println("---------------");
   
        
    bankOfGods.accountOne.retirar(200);
    System.out.println("En la cuenta 1 hay un saldo de " + bankOfGods.accountOne.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountOne.retirar(500);
    System.out.println("En la cuenta 1 hay un saldo de " + bankOfGods.accountOne.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountOne.retirar(600);
    System.out.println("En la cuenta 1 hay un saldo de " + bankOfGods.accountOne.getBalance());
   System.out.println("---------------");
   
    bankOfGods.accountOne.retirar(600);
    System.out.println("En la cuenta 1 hay un saldo de " + bankOfGods.accountOne.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountOne.retirar(600);
    System.out.println("En la cuenta 1 hay un saldo de " + bankOfGods.accountOne.getBalance());
    System.out.println("---------------");
    
    System.out.println("---------------");
    System.out.println("---------------");
    System.out.println("---------------");
    
    
  
    System.out.println(bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.setBalance(200);
    System.out.println("En la cuenta 2 hay un saldo de " + bankOfGods.accountTwo.getBalance());
    System.out.println("---------------");
    
        //System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    bankOfGods.accountTwo.consignar(7700);
    System.out.println("En la cuenta 2 hay un saldo de " + bankOfGods.accountTwo.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountTwo.consignar(6000);
    System.out.println("En la cuenta 2 hay un saldo de " +  bankOfGods.accountTwo.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountTwo.consignar(5000);
    System.out.println("En la cuenta 2 hay un saldo de " +  bankOfGods.accountTwo.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountTwo.consignar(4000);
    System.out.println("En la cuenta 2 hay un saldo de " +  bankOfGods.accountTwo.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountTwo.consignar(3000);
    System.out.println("En la cuenta 2 hay un saldo de " +  bankOfGods.accountTwo.getBalance());
    System.out.println("---------------");
        
        
    bankOfGods.accountTwo.retirar(8000);
    System.out.println("En la cuenta 2 hay un saldo de " +  bankOfGods.accountTwo.getBalance());
    System.out.println("---------------"); 
    
    bankOfGods.accountTwo.retirar(10000);
    System.out.println("En la cuenta 2 hay un saldo de " +  bankOfGods.accountTwo.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountTwo.retirar(4000);
    System.out.println("En la cuenta 2 hay un saldo de " +  bankOfGods.accountTwo.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountTwo.retirar(300);
    System.out.println("En la cuenta 2 hay un saldo de " +  bankOfGods.accountTwo.getBalance());
    System.out.println("---------------");
    
    bankOfGods.accountTwo.retirar(100);
    System.out.println("En la cuenta 2 hay un saldo de " +  bankOfGods.accountTwo.getBalance());

  }
}