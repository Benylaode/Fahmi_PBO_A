package layout;

import java.util.Scanner;

import controllers.DbController;

public class Insert {
    public static void showInsertData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Silahkan Input Data Produk");
        System.out.println("================================");

        System.out.print("Nama Produk : ");
        String name = sc.nextLine();
        System.out.print("Harga : ");
        long harga = sc.nextLong();
        System.out.print("Jumlah : ");
        int stok = sc.nextInt();
        System.out.println("================================");

        if (DbController.Masukkan(name, harga, stok)) {
            System.out.println("Berhasil Insert Data");
        } else {
            System.out.println("Gagal Insert Data");
        }

        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }
}
