import java.util.Scanner;
public class midPoli{
public static void main (String[] args) {
	Parent a = new Parent();
	Tipe1 b = new Tipe1();
	Tipe2 c = new Tipe2();
	Scanner input = new Scanner(System.in);
	int pilihan2;
	boolean loop = true;

	a.tampil();
	System.out.print("Merek yang dipilih = ");
	pilihan2 = input.nextInt();
	while(loop) {
	switch(pilihan2) {
		case 1 : 	b.tampil1();
					System.out.println();
					System.out.println("Nama = " +a.nama); 
					System.out.println("Total harga = " +b.total);
					System.out.println("Bayar = " +b.bayar); 
					System.out.println("Kembalian = " +b.kembalian);
					loop = false; break;
					
					
		case 2 : 	c.tampil2();
					System.out.println();
					System.out.println("Nama = " +a.nama); 
					System.out.println("Total harga = " +c.total);
					System.out.println("Bayar = " +c.bayar); 
					System.out.println("Kembalian = " +c.kembalian);
					loop = false; break;
					
		default :   System.out.println("Merek yang anda masukan salah! Masukkan merek yang benar!");
	}
	break;
	}
	
}
}