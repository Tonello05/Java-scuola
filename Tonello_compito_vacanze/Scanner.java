/*******************************
 * Scanner
 * simple input from keyboard
 ******************************/

 import java.io.InputStreamReader;
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.lang.NumberFormatException;

 public class Scanner {

    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(reader);

    public String nextString() {    //input of a string
        
        String temp=null;
        
        try{
        temp = input.readLine();
        }catch(IOException e){
            System.out.println("An error occured whit the input");
        }

        return temp;

    }

    public int nextInt(){   //input of an int

        boolean error=true;
        int x = 0;


        while (error) {
            try {
                x = Integer.parseInt(nextString());
                error=false;
            } catch (NumberFormatException e) {
                System.out.println("The inserted value is not numeric");
                System.out.println("insert a new number: ");
                error=true;
            }
        }
        
        return x;

    }

    public Double nextDouble(){     //input of a double

        boolean error = true;
        Double x=0.0;

        while (error) {
            try {
                x = Double.parseDouble(nextString());
                error=false;
            } catch (NumberFormatException e) {
                System.out.println("the inserted value is not a numeric");
                System.out.println("insert a new number: ");
                error = true;
            }
        }

        return x;
    }

    public float nextFloat() {      //input of a float
        
        float x=0;
        boolean error=true;

        while (error) {
            try {
                x = Float.parseFloat(nextString());
                error=false;
            } catch (NumberFormatException e) {
                System.out.println("the inserted value is not numeric");
                System.out.println("insert a new number: ");
                error=true;
            }
        }

        return x;
    }

 }