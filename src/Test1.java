

public class Test1 {
    
    // Method that prints out elements of the array
    public void yogesh() {
        int[] a = {10, 20, 30, 50};
        
        // Loop through the array and print each element
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of Test1
        Test1 test = new Test1();
        
        // Call the yogesh method to run the code
        test.yogesh();
    }
}

