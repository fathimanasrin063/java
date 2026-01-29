import java.util.*;

class Sort {
    public static void main(String args[]) {
        int n, i, j;
        String temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Strings:");
        n = sc.nextInt();
        sc.nextLine(); 

        String[] Str = new String[n];

        System.out.println("Enter the strings:");
        for (i = 0; i < n; i++) {
            Str[i] = sc.nextLine();
        }

       
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (Str[i].compareTo(Str[j]) > 0) {
                    temp = Str[i];
                    Str[i] = Str[j];
                    Str[j] = temp;
                }
            }
        }

        System.out.println("Sorted strings:");
        for (i = 0; i < n; i++) {
            System.out.println(Str[i]);
        }
    }
}

