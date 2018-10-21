package hitungPajak;

/**
 * Pada pembelian barang atau jasa, dapat dikenakan 
 * pajak pertambahan nilai (PPN atau VAT-Value Added Tax) sebesar 10%
 **/

public class TaxForSalary2 {

    private double amount = 0.0;
    private double VATRate = 0.0;
    private double finalAmount = 0.0;
    private double vat = 0.0;

    public TaxForSalary2(double amount, double VATRate) {
        this.amount = amount;
        this.VATRate = VATRate;

        calc();
    }

    public void calc(){
        vat = VATRate * amount;
        finalAmount = amount + vat;
    }

    public double getAmount() {
        return amount;
    }

    public double getVATRate() {
        return VATRate;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public double getVat() {
        return vat;
    }

    @Override
    public String toString() {
        String str =
                "Jumlah = " + amount + "\n" + "Rate PPN = " + VATRate + "\n" + "PPN = " + vat + "\n" + "Total Bayar = " + finalAmount;
        return str;
    }

    static void tes() {
        TaxForSalary2 t = new TaxForSalary2(12000, .10);
        System.out.println(t);
    }

    public static void main(String[] args) {
        tes();
    }
}