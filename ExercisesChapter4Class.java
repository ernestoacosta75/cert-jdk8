package chapter4;

public class ExercisesChapter4Class {

    public static void exercise5Secc44() {
        String[][] names = new String[2][3]; // Array of length 2. Each element refers to an array of ints of length 3.

        // Filling the array of String arrays
        names[0][0] = "Item0ForArrayInIndex0";  
        names[0][1] = "Item1ForArrayInIndex0"; 
        names[0][2] = "Item2ForArrayInIndex0"; 
        System.out.println("Array content in the index 0: ");
        System.out.println(names[0][0]);
        System.out.println(names[0][1]);
        System.out.println(names[0][2]);
        System.out.println();

        names[1][0] = "Item0ForArrayInIndex1";  
        names[1][1] = "Item1ForArrayInIndex1"; 
        names[1][2] = "Item2ForArrayInIndex1"; 
        System.out.println("Array content in the index 1: ");
        System.out.println(names[1][0]);
        System.out.println(names[1][1]);
        System.out.println(names[1][2]);
        System.out.println();        


        System.out.println("Displaying the values using for loop:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Element [" + i + "] contains an array of length " + names[i].length);
            for (int j = 0; j < names[i].length; j++) {
                System.out.println("Item at the index [" + i + "][" + j + "]: " + names[i][j]);
            }
        }
    }



    public static void main(String[] args) {
        // exercise3Secc44();
        exercise5Secc44();
    }
}