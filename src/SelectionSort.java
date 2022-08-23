public class SelectionSort {
    static double[] list = {1, 3, 4.5, 6.6, 5.7, -4};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Tìm số có giá trị nhỏ nhất trong mảng */
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            /* Hoán đổi vị trí list[i] với vị trí của giá trị nhỏ nhất */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        System.out.println("Mang sau khi sap xep:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}