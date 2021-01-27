
package belajaroopjava;

/**
 *
 * @author indi
 */
public class BelajarOOPJava {

    
    public static void main(String[] args) {
        //membuat objek
        BelajarOOPJava buku = new BelajarOOPJava();
        
        //memnaggil method void
        buku.majalah();
        buku.novel();
        
    }
    
    // variable method
    String nama,pengarang;
    
    //method 1
    void majalah(){
        System.out.println("****MAJALAH*****");
        nama = "Majalah Anak-Anak";
        pengarang = "Jackson";
        System.out.println("Nama Buku: "+nama);
        System.out.println("Pengarangnya adalah: "+pengarang);
    }
    
    //method 2
    void novel(){
        System.out.println("*****NOVEL******");
        nama = "Manusia tak Terlihat";
        pengarang = "Brewah Masani";
        System.out.println("Nama Buku: "+nama);
        System.out.println("Pengarangnya adalah: "+pengarang);
    }
}
