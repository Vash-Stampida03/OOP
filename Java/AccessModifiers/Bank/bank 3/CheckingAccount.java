package bank;
public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;
  private double cdtInteres;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
    
  }

  public int getBalance(){
    System.out.println("El saldo es de:" + this.balance);
    return this.balance;
  }
  
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }

  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
  public void consignar (int montoDepositado){
      System.out.println("El deposito es de:" + montoDepositado);
      this.balance = this.balance + montoDepositado;
  }
  public void retirar (int montoRetirado){
      System.out.println("El retiro es de:" + montoRetirado);
      this.balance = this.balance - montoRetirado;
  }
}