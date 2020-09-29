public class EmpWageBuilder{
   public static void main(String[] args){
     System.out.println("Welcome to Employee Wage Computation Program");
      
      int isFullTime = 1;
      int isPartTime = 2; 
      int empRatePerHour = 20;
      int empHours = 0;
      int empWage = 0;
      double attendence = Math.floor(Math.random()*10) % 3;
         if(attendence == isFullTime)
              empHours = 8;
         else if(attendence == isPartTime)
              empHours = 4;
         
         empWage = empHours*empRatePerHour;
         System.out.println("Daily Wage Of Employee Is : " + empWage);
   }
 }
