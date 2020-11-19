class Tipe2 extends Parent {
	void tampil2() {
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
							   loop =  false; break;
					case 2 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumlahunit = input.nextInt();
							   total = jumlahunit*135000;
							   System.out.println("Total Harga = "+total);
							   System.out.print("Bayaran Anda = ");
							   bayar = input.nextInt();
							   kembalian = bayar - total;  
							   loop =  false; break;
					case 3 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumlahunit = input.nextInt();
							   total = jumlahunit*550000;
							   System.out.println("Total Harga = "+total);
							   System.out.print("Bayaran Anda = ");
							   bayar = input.nextInt();
					           kembalian = bayar - total; 
							   loop =  false; break;
							   
					default : System.out.println("Tipe yang Anda masukkkan Salah!! Silahkan pilih tipe dengan"); break;
					}
}
}
