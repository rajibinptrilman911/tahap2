class Manager extends Karyawan {
    private double insentif;
    private String divisi;

    public Manager(String nama, double gajiPokok, Perusahaan perusahaan, double insentif, String divisi) {
        super(nama, gajiPokok, perusahaan);
        setInsentif(insentif);
        this.divisi = divisi;
    }

    public void setInsentif(double insentif) {
        if (insentif >= 0) {
            this.insentif = insentif;
        } else {
            throw new IllegalArgumentException("Insentif tidak boleh negatif!");
        }
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + insentif;
    }
}
