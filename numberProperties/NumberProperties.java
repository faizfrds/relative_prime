public class NumberProperties {
  private int number;
 
// Complete this constructor so it takes an integer as input,
// which gets stored in the number attribute.
  public NumberProperties(int n) {
    number = n;
    }

// Complete this method so it returns true when the number attribute is prime,
// or false otherwise. You do not need to worry about efficiency issues.    
  public boolean isPrime() {
     
     int primeFactors = 0;
 
     for (int i = 1; i <= number; i++){
         
         if (number % i == 0){
             primeFactors++;
         }
         
     }
     
     if (primeFactors == 2){
         return (true);
     }
     else{
         return (false);
     }
  }
  
  public void method1(){
      
      int [] x = {1,2,3};
      int [] y = {4,5,6};
      
      System.out.println(method2(x, y));
      
  }
  
  public void method2(int [] a, int [] b){
      x = y;
  }

// Complete this method so that it returns true
// when the number attribute and the input parameter
// are relatively prime.   
  public boolean relativelyPrime(int anotherNumber) { 
      
     for (int i = 1; i <= anotherNumber; i++){
         
         if (anotherNumber % i == 0){
             
             if (number % i == 0 && i != 1){
                  
                  return(false);
             }   
         } 
     }
     return (true);
  }

// Compete this get method for the number attribute.
  public int getNumber(){
    return(number);
    }
 
 // Complete this set method for the nuber attribute.   
  public void setNumber(int n){    
    number = n;
  }
}
