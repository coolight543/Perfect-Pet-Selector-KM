import java.util.*
public class PetSelector{

    public static void main(String [] args){
        //get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your favorite color from the options: red, blue, or green");
        String color = scanner.nextLine();
        if (color.indexOf("red") == 0 || color.indexOf("blue") == 0 || color.indexOf("green") == 0)
        {
            System.out.print("Not a valid input, try again!");
        }
        else
        {
            System.out.print("Choose your favorite season: fall, spring, winter, summer");
            String season = scanner.nextLine();
            if (season.indexOf("fall")==0 || season.indexOf("spring") ==0 || season.indexOf("winter") ==0 || season.indexOf("summer") ==0)
            {
                System.out.print("Not a valid input, try again");
            }
            else 
            {
                
            }
       }
        


        //make sure it's valid
        //calculate the user's perfect PetSelector
        //output the decision
    }
}
