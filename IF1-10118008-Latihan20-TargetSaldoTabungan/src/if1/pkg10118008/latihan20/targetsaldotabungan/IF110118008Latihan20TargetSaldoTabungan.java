/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan20.targetsaldotabungan;

/**

* @author
 * NAMA			: Michael Nagaku Milenn Salim
 * KELAS		: IF-1
 * NIM			: 10118008
 * Deskripsi Program	: perkiraan mencapai saldo target 
 */
public class IF110118008Latihan20TargetSaldoTabungan {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		double saldoAwal = 3500000, saldoTarget = 6000000, saldoSekarang = saldoAwal,  bunga = 0.08;
		int bulanKe = 1;
		do {
			saldoSekarang += saldoSekarang * bunga; 
			System.out.println("Saldo di bulan ke-" + bulanKe + " Rp. " + saldoSekarang);
			bulanKe++;
		} while (saldoSekarang < saldoTarget);

	}
	
}
