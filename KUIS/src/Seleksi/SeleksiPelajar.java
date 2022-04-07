package Seleksi;
import Beasiswa.BeasiswaPelajar;

public class SeleksiPelajar implements BeasiswaPelajar{
    
    double e,v,d,h;

    public SeleksiPelajar(double essai, double visualisasi, double design) {
        this.e = essai;
        this.v = visualisasi;
        this.d = design;
    }
        
    @Override
    public double essai() {
        e = e*0.50;
        return e;
    }

    @Override
    public double visualisasi() {
        v = v*0.20;
        return v;
    }

    @Override
    public double design() {
        d = d*0.30;
        return d;
    }

    @Override
    public double hasil() {
        h = essai()+visualisasi()+design();
        return h;
    }
    
}
