package App;

import java.util.Scanner;
import Seleksi.*;

public class App {

    public static void main(String[] args) {
        //deklarasi variabel
        Scanner inputKeyboard = new Scanner(System.in);
        int pilihBeasiswa, menu;
        double usia, essai, visualisasi, design, jurnal, relevansi, problemSolving;
        String nama = null;
        
        
        System.out.println("+----------------------------------------+");
        System.out.println("|     Pendaftaran Beasiswa PT. Benang    |");
        System.out.println("+----------------------------------------+");
        System.out.println("");
        System.out.println("Terdapat 2 program beasiswa yang dibuka : ");
        System.out.println("\t1.Beasiswa Pelajar");
        System.out.println("\t2.Beasiswa Mahasiswa");
        System.out.print("Pilih : ");
        pilihBeasiswa = inputKeyboard.nextInt();
        System.out.println("");
        
        switch(pilihBeasiswa){
            case 1:
                System.out.println("=== Form Pendaftaran ===");
                System.out.print("Nama Lengkap\t: ");
                nama = inputKeyboard.next();
                do{
                    System.out.print("Usia\t\t: ");
                    usia = inputKeyboard.nextDouble();
                }while(usia < 16 || usia > 24);
                                                        
                do{
                    System.out.println("");
                    System.out.println("--- Form Penilaian ---");
                    System.out.println("Nilai yang valid berada diantara 0-100");
                    System.out.print("Nilai struktur dan konten essai\t: ");
                    essai = inputKeyboard.nextDouble();
                    System.out.print("Nilai teknik visualisasi\t: ");
                    visualisasi = inputKeyboard.nextDouble();
                    System.out.print("Nilai kemampuan design thinking\t: ");
                    design = inputKeyboard.nextDouble();
                    
                }while(essai <= 0 || essai >=100 || visualisasi <= 0 || visualisasi >=100 || design <=0 || design >=100);
                
                do{
                    System.out.println("");
                    System.out.println("+++ Menu +++");
                    System.out.println("\t1.Tampilkan Hasil");
                    System.out.println("\t2.Ubah Nilai");
                    System.out.println("\t3.Keluar");
                    System.out.print("Pilih : ");
                    menu = inputKeyboard.nextInt();
                    
                    if(menu == 1){
                        double hasil;
                        SeleksiPelajar cek = new SeleksiPelajar(essai,visualisasi,design);
                        hasil = cek.hasil();
                        System.out.println("");
                        System.out.println("Nilai akhir : "+hasil);
                        if(hasil >= 87.5){
                            System.out.println("Keterangan : Diterima");
                            System.out.println("Selamat " + nama +" (" + usia + " tahun) dinyatakan diterirma pada program BEASISWA PELAJAR");
                        }else{
                            System.out.println("Keterangan : Tidak Diterima");
                            System.out.println("Mohon maaf, " + nama +" (" + usia + " tahun) dinyatakan tidak diterirma pada program BEASISWA PELAJAR");
                        }
                    }else if(menu == 2){
                        do{
                            System.out.println("");
                            System.out.println("--- Form Penilaian ---");
                            System.out.println("Nilai yang valid berada diantara 0-100");
                            System.out.print("Nilai struktur dan konten essai\t: ");
                            essai = inputKeyboard.nextDouble();
                            System.out.print("Nilai teknik visualisasi\t: ");
                            visualisasi = inputKeyboard.nextDouble();
                            System.out.print("Nilai kemampuan design thinking\t: ");
                            design = inputKeyboard.nextDouble();

                        }while(essai <= 0 || essai >=100 || visualisasi <= 0 || visualisasi >=100 || design <=0 || design >=100);
                    }else{
                        System.out.println("Pilih menu 1-3");
                    }
                }while(menu != 3);
                
                break;
            case 2: 
                System.out.println("=== Form Pendaftaran ===");
                System.out.print("Nama Lengkap\t: ");
                nama = inputKeyboard.next();
                do{
                    System.out.print("Usia\t\t: ");
                    usia = inputKeyboard.nextDouble();
                }while(usia < 16 || usia > 24);
                
                do{
                    System.out.println("");
                    System.out.println("--- Form Penilaian ---");
                    System.out.println("Nilai yang valid berada diantara 0-100");
                    System.out.print("Nilai struktur dan konten jurnal\t: ");
                    jurnal = inputKeyboard.nextDouble();
                    System.out.print("Nilai relevansi data\t\t\t: ");
                    relevansi = inputKeyboard.nextDouble();
                    System.out.print("Nilai kemampuan problem solving\t\t: ");
                    problemSolving = inputKeyboard.nextDouble();
                    
                }while(jurnal <= 0 || jurnal >=100 || relevansi <= 0 || relevansi >=100 || problemSolving <=0 || problemSolving >=100);
                
                do{
                    System.out.println("");
                    System.out.println("+++ Menu +++");
                    System.out.println("\t1.Tampilkan Hasil");
                    System.out.println("\t2.Ubah Nilai");
                    System.out.println("\t3.Keluar");
                    System.out.print("Pilih : ");
                    menu = inputKeyboard.nextInt();
                    
                    if(menu == 1){
                        double hasil;
                        SeleksiMahasiswa cek = new SeleksiMahasiswa(jurnal, relevansi, problemSolving);
                        hasil = cek.hasil();
                        
                        System.out.println("");
                        System.out.println("Nilai akhir : "+hasil);
                        
                        
                        if(hasil >= 87.5){
                            System.out.println("Keterangan : Diterima");
                            System.out.println("Selamat " + nama +" (" + usia + " tahun) dinyatakan diterirma pada program BEASISWA MAHASISWA");
                        }else{
                            System.out.println("Keterangan : Tidak Diterima");
                            System.out.println("Mohon maaf, " + nama +" (" + usia + " tahun) dinyatakan tidak diterirma pada program BEASISWA MAHASISWA");
                        }
                    }else if(menu == 2){
                        do{
                            System.out.println("");
                            System.out.println("--- Form Penilaian ---");
                            System.out.println("Nilai yang valid berada diantara 0-100");
                            System.out.print("Nilai struktur dan konten jurnal\t: ");
                            jurnal = inputKeyboard.nextDouble();
                            System.out.print("Nilai relevansi data\t\t\t: ");
                            relevansi = inputKeyboard.nextDouble();
                            System.out.print("Nilai kemampuan problem solving\t\t: ");
                            problemSolving = inputKeyboard.nextDouble();

                        }while(jurnal <= 0 || jurnal >=100 || relevansi <= 0 || relevansi >=100 || problemSolving <=0 || problemSolving >=100);
                    }else{
                        System.out.println("Pilih menu 1-3");
                    }
                }while(menu != 3);
                
                break;
            default:
                break;
        }
                
    }
    
}
