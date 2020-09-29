public class EmpWageBuilder{
   public static void main(String[] args){
     System.out.println("Welcome to Employee Wage Computation Program");
      
      int isFullTime = 1;
      double attendence = Math.floor(Math.random()*10) % 2;
         if(attendence == isFullTime)
              System.out.println("Employee Is Present");
         else
              System.out.println("Employee Is Absent");
   }
 }
