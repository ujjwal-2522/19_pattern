public class Main {
    public static void main(String[] args) {

//        pattern3(4);
//        pattern1(4);
//        pattern2(4);
        //pattern4(4);
        //pattern5(4);
        //pattern28(8);
       // pattern30(5);
        pattern17(4);
    }
    //IMPORTANT
    static void pattern5(int n){
        for (int row = 0; row <=2*n ; row++) {
            //for every row ,run the col
            int totalcolinrow=row>n ? 2*n-row:row;
            for (int col = 0; col <totalcolinrow ; col++) {
                System.out.print("* ");
            }
            //when one row is printed go to new line
            System.out.println();
        }
    }
    static void pattern30(int n){

        for (int row = 1; row <= n; row++) {
            for (int space = 0; space <n-row ; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+ " ");

            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col+ " ");

            }
            System.out.println();
        }
    }
    static void pattern17(int n){

        for (int row = 1; row <= 2*n; row++) {
            int c=row>n ? 2*n-row:row;
            for (int space = 0; space <n-c ; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >=1 ; col--) {
                System.out.print(col+ " ");

            }
            for (int col = 2; col <=c ; col++) {
                System.out.print(col+ " ");

            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int row = 0; row <=2*n ; row++) {
            //for every row ,run the col
            int totalcolinrow=row>n ? 2*n-row:row;
            int noofspace=n-totalcolinrow;
            for (int s = 0; s < noofspace; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <totalcolinrow ; col++) {
                System.out.print("* ");
            }
            //when one row is printed go to new line
            System.out.println();
        }
    }


    static void pattern4(int n){
        for (int row = 1; row <=n ; row++) {
            //for every row ,run the col
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            //when one row is printed go to new line
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            //for every row ,run the col
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("* ");
            }
            //when one row is printed go to new line
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <=n ; row++) {
            //for every row ,run the col
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            //when one row is printed go to new line
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            //for every row ,run the col
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            //when one row is printed go to new line
            System.out.println();
        }
    }
}