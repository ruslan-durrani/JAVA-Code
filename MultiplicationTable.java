package russi;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.printf("\t\t\t%40s","Multiplication Table");
        System.out.print("\n------------------------------------------------------------------------------\n   ");
        for (int i = 1; i < 11; i++) {
            System.out.printf("\t\t%3d",i);
        }
        for (int k = 1; k < 11; k++) {
            System.out.printf("\n %3d |",k);
            for (int j = 1; j < 11; j++) {
                System.out.printf("\t %3d",(k * j));
            }
        }
    }
}
