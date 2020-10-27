package Uge44;
/*  Lav en array med X  tilfældige farvenavne (X skal være konstant)
    Lav en array med Y tilfældige farver (Y skal være konstant)
    Se om farven Z kan findes i Y (Z skal også være konstant)
    Ekstra: løs opgaven på 3 forskellige måder: først skal farvene repræsenteres af Strings,
    herefter skal de repræsenteres med klassen Colors,
    til sidst skal de repræsenteres af en enum med navnet Colortypes.
    (Hint: se på enums .values() metode, som returnerer en array)
    Ekstra: omskriv opgaven, så farvearray med Y elementer bliver til en ArrayList i stedet for en array.*/

import java.util.ArrayList;

public class ColourInArray {

    public static void main(String[] args) {


        final String[] X = new String[7];
        X[0] = "Red";
        X[1] = "Blue";
        X[2] = "White";
        X[3] = "Black";
        X[4] = "Green";
        X[5] = "Yellow";
        X[6] = "Brown";

        //final String[] Y = {X[0], X[3], X[5]};
        ArrayList Y = new ArrayList();
        Y.add(0, X[0]);
        Y.add(1, X[3]);
        Y.add(2, X[5]);

        final String Z = "Black";


        for (Object c : Y) {   //Y: Stringtype Array : for(String c : Y)
            if (c.equals(Z))
                System.out.println(Z);

        }
        new ColourInArray().callColourMethod();
        EnumColour.callenum();

    }

    public class Colour {
        String[] colours = {"Red", "Blue", "White", "Black", "Green", "Yellow", "Brown"};

    }
    public void callColourMethod() {
        Colour colour = new Colour();
        String R = colour.colours[0];
        System.out.println(R);
    }

    public enum EnumColour {
       Red, Blue, White, Black, Green, Yellow, Brown ;

        static void callenum() {
            System.out.println("One colour in a enumclass : " + EnumColour.valueOf("White"));

        }

    }



}




