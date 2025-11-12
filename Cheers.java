//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) 
        {
                String name = args[0];
                name = name.toUpperCase();
                int times = Integer.parseInt(args[1]);
                String anLettrs = "AEFHILMNORSX";
                String aOrAn;
                char letter;
                for (int j=0; j<name.length(); j++)
                {
                        letter = (char)name.charAt(j);
                        if (anLettrs.indexOf(letter)!=-1)
                        {
                                aOrAn = "an";
                                
                        }
                        else 
                        {
                                aOrAn = "a ";
                        }
                        System.out.println("Give me " + aOrAn + " " + letter + ": " + letter + "!");
                }
                System.out.println("What does that spell?");
                for (int i=0; i<times; i++)
                {
                        System.out.println(name + "!!!");
                }
        }
}
