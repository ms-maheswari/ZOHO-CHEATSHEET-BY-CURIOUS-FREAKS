// Diamond Star Pattern
public class Diamond_Pattern {
    static void printpattern(int n){
        for(int i = 1;i<=n;i++){
            for(int j=i;j<=n;j++){       //Decreasing space
System.out.print("  ");
            }
            for(int j=1;j<i;j++){
                System.out.print("* "); //Increasing star
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");//Increasing star
            }
            System.out.println();  
        }



        for(int i = 2;i<=n;i++){
            for(int j=1;j<=i;j++){       //Increasing space
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* "); //Decreasing  star
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");//Decreasing  star
            }
            System.out.println();  
        }
    }
    public static void main(String[] args){
         int n = 7;
         printpattern(n);

    }
}



//               * 
//             * * *
//           * * * * *
//         * * * * * * *
//       * * * * * * * * *
//     * * * * * * * * * * *
//   * * * * * * * * * * * * *
//     * * * * * * * * * * *
//       * * * * * * * * *
//         * * * * * * *
//           * * * * *
//             * * *
//               *

