import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int soPhanTuBanDau = arr.length;

        System.out.println("trước khi xóa");
        for (int i = 0; i < soPhanTuBanDau; i++) {
            System.out.print(arr[i] + "\t");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xóa: ");
        int delete = scanner.nextInt();

        for (int i = 0; i < soPhanTuBanDau; i++) {
            if (arr[i] == delete) {
                System.out.println("Vị trí của phần tử cần xóa " + delete + " trong danh sách Là: " + (i + 1));
                for (int j = i; j < soPhanTuBanDau - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                soPhanTuBanDau--;
            }
        }

        System.out.println("Sau khi xóa:");
        for (int i = 0; i < soPhanTuBanDau; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
