import java.util.Scanner;
class Parent {

	Scanner input = new Scanner(System.in);
	int pilihan1, pilihan2, pilihan3;
	int jumlahunit;
	String nama;
	int total, bayar, kembalian;
	boolean loop = true;
	
	void tampil() {
	System.out.print("Masukkan Nama = ");
	nama = input.nextLine();
	System.out.println("MEREK");
	System.out.println("1. Merek G");
	System.out.println("2. Merek O");
	}
}