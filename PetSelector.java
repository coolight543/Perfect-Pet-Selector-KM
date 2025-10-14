import java.util.*;
public class PetSelector{

    public static void main(String [] args){
        //get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Choose your favorite color from the options: red, blue, or green ");
        String color = scanner.nextLine();
        if (color.indexOf("red") == 0 || color.indexOf("blue") == 0 || color.indexOf("green") == 0)
        {

            System.out.print("Choose your favorite season: fall, spring, winter, summer ");
            String season = scanner.nextLine();
            if (season.indexOf("fall")==0 || season.indexOf("spring")==0 || season.indexOf("winter") == 0|| season.indexOf("summer")==0)
            {
                if (color.indexOf("blue")==0 && season.indexOf("fall")  == 0)
                {
                    System.out.print("Alligator \n");
                }
                else if(color.indexOf("blue") == 0 && season.indexOf("spring") == 0)
                {
                    System.out.print("ostrich \n");
                }
                else if(color.indexOf("green") == 0 && season.indexOf("winter") == 0 && name.indexOf("[AEIOUaeiou]")!=0)
                {
                    System.out.print("giraffe \n");
                }
                else if(color.indexOf("green") == 0 && season.indexOf("fall") != 0 && season.indexOf("winter")!=0)
                {
                    System.out.print("dog\n");
                }
                else if(color.indexOf("red") == 0)
                {
                    if(name.indexOf("[AEIOUaeiou]")==0)
                    {
                        System.out.print("porcupine\n");
                    }
                    else
                    {
                    System.out.print("panda\n");
                    }
                }
                else if (season.indexOf("summer")==0 && color.indexOf("green") !=0 && color.indexOf("red") !=0)
                {
                    System.out.print("ponies\n");
                }
                else if (name.indexOf("[AEIOUaeiou]") !=0 && color.indexOf("blue") ==0 && season.indexOf("winter") == 0)
                {
                    System.out.print("axolotl");
                }
                else{
                    System.out.print("rock\n");
                }
            }
        else
        {
            System.out.print("Not a valid input, try again");

        }
   
      


        //make sure it's valid
        //calculate the user's perfect PetSelector
        //output the decision
    }
}

}
