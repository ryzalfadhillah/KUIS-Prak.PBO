package Seleksi;
import Beasiswa.BeasiswaMahasiswa;

public class SeleksiMahasiswa implements BeasiswaMahasiswa{

    double j,r,pS,h;

    public SeleksiMahasiswa(double jurnal, double relevansi, double problemSolving) {
        this.j = jurnal;
        this.r = relevansi;
        this.pS = problemSolving;
    }
    
    
    
    @Override
    public double jurnal() {
        j = j*0.60;
        return j;
    }
    @Override
    public double problemSolving() {
        pS =pS*0.15;
        return pS;
    }

    @Override
    public double hasil() {
        h = jurnal()+relevansi()+problemSolving();
        return h;
    }

    @Override
    public double relevansi() {
        r = r*0.25;
        return r;
    }

    
}
