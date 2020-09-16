public class Demo1 {

    public static void main(String[] args) {

        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                if( i < j) {
                    System.out.println();
                    break;
                }
                System.out.print(j + "×" + i +"=" + i * j + " ");
            }
        }
    }
}
