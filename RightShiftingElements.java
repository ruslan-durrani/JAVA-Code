package Russi7kd;
public class RightShiftingElements {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        int temp = list[list.length-1];
        for (int i = list.length-1; i > 0 ; i--) {
            list[i] = list[i-1];
        }
        list[0] = temp;
        for (int j: list) {
            System.out.print(j+" ");
        }

    }
}
