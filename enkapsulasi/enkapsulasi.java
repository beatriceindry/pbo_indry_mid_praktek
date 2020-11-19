import java.util.Scanner;
public class enkapsulasi{
	Scanner input = new Scanner(System.in);
	private String nama;
	private int pilihan1, pilihan2, pilihan3, jumlahunit, total, bayar, kembalian;
	private boolean loop = true;

public void merek() {
	System.out.print("Masukkan Nama = ");
	nama = input.nextLine();
	System.out.println("Merek: ");
	System.out.println("1. Merek G");
	System.out.println("2. Merek O");
}

public void tipe1(){
	System.out.println("TIPE");
	System.out.println("1. Meja : Rp.95.000");
	System.out.println("2. Kursi : Rp.125.000");
	System.out.println("3. Lemari : Rp.450.000");
	System.out.print("Tipe yang dipilih = ");
	pilihan1 = input.nextInt();
	switch(pilihan1) {
					case 1 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumlahunit = input.nextInt();
							   total = jumlahunit*95000;
							   System.out.println("Total Harga = "+total);
							   System.out.print("Bayaran Anda = ");
							   bayar = input.nextInt();
							   kembalian = bayar - total;
							   System.out.println();
							   System.out.println("Nama = " +nama); 
							   System.out.println("Total Harga = " +total); 
							   System.out.println("Bayar = " +bayar); 
							   System.out.println("Kembalian = " +kembalian);
							   loop =  false; 
							   break;
					case 2 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumlahunit = input.nextInt();
							   total = jumlahunit*125000;
							   System.out.println("Total Harga = "+total);
							   System.out.print("Bayaran Anda = ");
							   bayar = input.nextInt();
							   kembalian = bayar - total; 
							   System.out.println();
							   System.out.println("Nama = " +nama); 
							   System.out.println("Total Harga = " +total); 
							   System.out.println("Bayar = " +bayar);  
							   System.out.println("Kembalian = " +kembalian);
							   loop =  false; 
							   break; 
					case 3 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumlahunit = input.nextInt();
							   total = jumlahunit*450000;
							   System.out.println("Total Harga = "+total);
							   System.out.print("Bayaran Anda = ");
							   bayar = input.nextInt();
					           kembalian = bayar - total;
					           System.out.println(); 
							   System.out.println("Nama = " +nama); 
							   System.out.println("Total Harga = " +total); 
							   System.out.println("Bayar = " +bayar); 
							   System.out.println("Kembalian = " +kembalian); 
							   loop =  false; 
							   break;
					default : System.out.println("Tipe yang Anda masukkkan Salah!! Silahkan pilih tipe dengan benar");
	}
}

public void tipe2(){
		System.out.println("Tipe: ");
		System.out.println("1. Meja : Rp.115.000");
		System.out.println("2. Kursi : Rp.135.000");
		System.out.println("3. Lemari : Rp.550.000");
		System.out.print("Tipe yang dipilih = ");
		pilihan3 = input.nextInt();
		switch(pilihan3) {
					case 1 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumlahunit = input.nextInt();
							   total = jumlahunit*115000;
							   System.out.println("Total Harga = "+total);
							   System.out.print("Bayaran Anda = ");
							   bayar = input.nextInt();
							   kembalian = bayar - total;
							   System.out.println();
							   System.out.println("Nama = " +nama); 
							   System.out.println("Total Harga = " +total); 
							   System.out.println("Bayar = " +bayar); 
							   System.out.println("Kembalian = " +kembalian);
							   loop =  false; 
							   break;
					case 2 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumlahunit = input.nextInt();
							   total = jumlahunit*135000;
							   System.out.println("Total Harga = "+total);
							   System.out.print("Bayaran Anda = ");
							   bayar = input.nextInt();
							   kembalian = bayar - total; 
							   System.out.println();
							   System.out.println("Nama = " +nama); 
							   System.out.println("Total Harga = " +total); 
							   System.out.println("Bayar = " +bayar);  
							   System.out.println("Kembalian = " +kembalian); 
							   loop =  false; 
							   break;
					case 3 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumlahunit = input.nextInt();
							   total = jumlahunit*550000;
							   System.out.println("Total Harga = "+total);
							   System.out.print("Bayaran Anda = ");
							   bayar = input.nextInt();
					           kembalian = bayar - total;
					           System.out.println(); 
							   System.out.println("Nama = " +nama); 
							   System.out.println("Total Harga = " +total); 
							   System.out.println("Bayar = " +bayar); 
							   System.out.println("Kembalian = " +kembalian); 
							   loop =  false; 
							   break;

					default : System.out.println("Tipe yang Anda masukkkan Salah!! Silahkan pilih tipe dengan benar"); 
					break;
	}
}

public static void main (String[] args) throws Exception {
	enkapsulasi A = new enkapsulasi();
	Scanner input = new Scanner(System.in);
	boolean loop = true;
	A.merek();
	System.out.print("Merek yang dipilih = ");
	int pilihan2 = input.nextInt();
	while(loop) {
	if (pilihan2 == 1) {
		A.tipe1();
		}
	else
	if (pilihan2 == 2) {
		A.tipe2();
		}
	else {
		System.out.println("Merek yang anda masukan salah! Silahkan masukkan merek yang benar!");
	}
	break;	
	}
}	
} 