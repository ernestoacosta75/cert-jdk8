package chapter4;

public class ExercisesChapter4Class {

    public static void exercise6Secc44() {
        String[][] names = new String[2][3]; // Array of length 2. Each element refers to an array of ints of length 3.

        // Filling the array of String arrays
        names[0][0] = "Item0ForArrayInIndex0";  
        names[0][1] = "Item1ForArrayInIndex0"; 
        names[0][2] = "Item2ForArrayInIndex0"; 

        names[1][0] = "Item0ForArrayInIndex1";  
        names[1][1] = "Item1ForArrayInIndex1"; 
        names[1][2] = "Item2ForArrayInIndex1"; 

        String [] arrStr1 = names[0].clone();
        String [] arrStr2 = names[1].clone();

        System.out.println("Displaying the values of arrStr1:");
        for (int i = 0; i < arrStr1.length; i++) {
            System.out.println(arrStr1[i]);
        }

        System.out.println("Displaying the values of arrStr2:");
        for (int i = 0; i < arrStr2.length; i++) {
            System.out.println(arrStr2[i]);
        }        
    }


    public static void main(String[] args) {
        exercise6Secc44();
    }
}