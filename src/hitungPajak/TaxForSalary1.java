
/**
 * Pegawai menerima gaji diwajibkan membayar pajak penghasilan.
 * Gaji kotor (gross)
 * pajak penghasilan sebesar taxRate * gross
 * gaji bersih adalah gaji kotor
 * **/

package hitungPajak;

public class TaxForSalary1 {

    private double gross = 0.0;
    private double taxRate = 0.0;
    private double net = 0.0;
    private double tax = 0.0;

    public TaxForSalary1(double gross, double taxRate) {
        this.gross = gross;
        this.taxRate = taxRate;
        calc();
    }

    private void calc() {
        tax = taxRate * gross;
        net = gross - tax;
    }

    public double getGross() {
        return gross;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getNet() {
        return net;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public String toString() {
        String str =
                "Penghasilan Kotor = "+gross+"\n"+ "Rate pajak = " + taxRate + "\n" + "Pajak Penghasilan = " + tax + "\n" + "Penghasilan Bersih = " + net;
        return str;
    }

    static void tes() {
        TaxForSalary1 t = new TaxForSalary1(23400, .1);
        System.out.println(t);
    }

    public static void main(String[] args) {
        tes();
    }
}