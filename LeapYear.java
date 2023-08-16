public class LeapYear 
{
    public static void main(String[] args) 
    {
        

        // WAP to check for leap year.

    int year = 2024;
        if(year%4==0)
        {
            if(year%100==0) 
            {
                if(year%400==0) 
                {
                    System.out.println("LEAP Year");
                } 
                    else {
                        System.out.println("NON LEAP Year");
                    }
            } 
                else {
                    System.out.println("LEAP Year");
                } 
                
                        
                    
        } 
            else {
                 System.out.println("NOT LEAP Year");
        }   
    }
}
