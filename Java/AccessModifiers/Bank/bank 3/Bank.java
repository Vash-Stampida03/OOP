package bank;
public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;
  private CdtInteres accountThree;
  
  public Bank(){
    accountOne = new CheckingAccount("Zeus", 0 , "1");
    accountTwo = new CheckingAccount("Hades", 0 , "2");
    accountThree = new CdtInteres(0,0,0); 
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    //System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    bankOfGods.accountOne.consignar(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(1000);
    System.out.println(bankOfGods.accountOne.getBalance());
        
    bankOfGods.accountOne.retirar(200);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(500);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(600);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountThree.getvalorCdt(3000);
    System.out.println(bankOfGods.accountThree.getvalorCdt());
   
  }
}