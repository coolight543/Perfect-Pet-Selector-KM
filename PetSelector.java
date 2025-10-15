//Kuang Miao 10/15/2025
//This program will choose the best pet for the user based on their input for thier favorite color and season
import java.util.*;
public class PetSelector{

    public static void main(String [] args){
        //get user input
        //Valid inputs: Name must be English letters; color must be one and only one of the options (red. blue, green); season must be one and only one of the options (fall, winter, spring, summer). Color and season options have no space included. 
        //If you don't obey the valid inputs, you will have to press run again and put in a valid input
        //Based on the name, color, and season, the system will print out one and only one of the following: alligator, ostrich, giraffe, dog, panda, porcupine, ponies, axolotl, rock
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Choose your favorite color from the options: red, blue, or green ");
        String color = scanner.nextLine();
        //make sure it's valid
        if (color.indexOf("red") == 0 || color.indexOf("blue") == 0 || color.indexOf("green") == 0)
        {

            System.out.print("Choose your favorite season: fall, spring, winter, summer ");
            String season = scanner.nextLine();
            //make sure it's valid
            if (season.indexOf("fall")==0 || season.indexOf("spring")==0 || season.indexOf("winter") == 0|| season.indexOf("summer")==0)
            {
                //calculate the user's perfect PetSelector
                if (color.indexOf("blue")==0 && season.indexOf("fall")  == 0)
                {
                    System.out.print("alligator \n");
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
                    System.out.print("axolotl\n");
                }
                else{
                    System.out.print("rock\n");
                }
            }
            else
            {
                System.out.print("Not a valid input, try again");
            }
        }
        else
        {
            System.out.print("Not a valid input, try again");
        }
    }
}
        //output the decision