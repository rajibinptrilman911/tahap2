class Programmer extends Karyawan {
    private double bonus;

    public Programmer(String nama, double gajiPokok, Perusahaan perusahaan, double bonus) {
        super(nama, gajiPokok, perusahaan);
        setBonus(bonus);
    }

    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            throw new IllegalArgumentException("Bonus tidak boleh negatif!");
        }
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + bonus;
    }
}
