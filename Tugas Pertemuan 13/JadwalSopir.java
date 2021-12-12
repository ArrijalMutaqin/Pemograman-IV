class Sopir{
    String Nama;
    int Umur;
    Sopir(String name, int age){
        this.Nama=name;
        this.Umur=age;
    }
}
class Mobil{
    String Nopol;
    String Jenis;
    int Kapasitas;

    Mobil(String Id, String name, int kps)
    {
        this.Jenis=name;
        this.Kapasitas=kps;
        this.Nopol=Id;
    }
}
class JadwalSopir{
    public static void main(String args[])
    {
        Mobil mobil1 = new Mobil("BN 9978 CH", "Sedan", 4);
        Mobil mobil2 = new Mobil("BN 1234 HH", "MiniBus", 7);
        Sopir andi = new Sopir("Andy Haja", 45);
        
        System.out.print(andi.Nama+"adalah seorang sopir");
        System.out.print("yang bertugas membawa mobil :\n");
        System.out.print("1. No. Polisi  : "+mobil1.Nopol);
        System.out.print(", Jenis : "+mobil1.Jenis);
        System.out.print(", Kapasitas : "+mobil1.Kapasitas+"\n");
        System.out.print("2. No. Polisi : "+mobil2.Nopol);
        System.out.print(", Jenis : "+mobil2.Jenis);
        System.out.print(", Kapasitas : "+mobil2.Kapasitas+"\n");
    }
}