import java.util.Scanner;
class calculator{
    public static void main (String[]args){
        char operator;
        double num1 , num2 ,result;
        System.out.println("welcome to my calculator");//message the user
        Scanner myObj = new
        Scanner(System.in);//created a sccanner object to accept the input of the user
        System.out.println("Enter a first number: ");
        num1 =myObj. nextDouble();
        System.out.println("Enter an operator between -, +, /, *, % :");
        operator=myObj.next().charAt(0); //the char.At(0) watches for the operator input the user wants to use 
        System.out.println("Enter a second number:");
        num2=myObj.nextDouble();
        result=0;
        
  switch (operator) {
      
      case'+':
      result=num1+num2 ;
      break;
      
      case'-':
      result = num1-num2 ;
      break;
      
      case'%':
      result =num1%num2 ;
      break;
      
      case'*':
      result = num1*num2;
      break;
      
      case'/':
      if(num2!= 0){
          result= num1/num2;
      }
      else{
          System.out.println("undefined");
   return;
      }
      break;
    default:
System.out.println("Enter a valid number") ;
return;      
  } 
       System.out.println("your value is "+ result) ;
        
    }
}
