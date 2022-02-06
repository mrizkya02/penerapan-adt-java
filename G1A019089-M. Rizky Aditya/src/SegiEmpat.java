class SegiEmpat {
    // Deklarasi atribut
    private float panjang, lebar;
    // Definisi konstruktor
    public SegiEmpat() {
        panjang = 0;
        lebar = 0;
    }
    public SegiEmpat(float p, float l) {
        panjang = p;
        lebar = l;
    }
    // Definisi layanan
    public float GetPanjang() {
        return (panjang);
    }
    public float GetLebar() {
        return (lebar);
    }
    public float Luas() {
        return (panjang*lebar);
    }
}