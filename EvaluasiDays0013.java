package Dyas013Evaluasi;

public class Main {
    
    public static void main(String[] args) {
        /* membuat tipe data dengan 3 variable
         * untuk nam dan alamat saya menggunakan string  
         * untuk nama saya menggunakan println dan fungsi dari prinln adalah untuk baris baru
         * untuk alamat saya menggunakan print dan fungsinya itu tercetak dibaris yg sama
         * untuk umur saya menggunakan prinf dan fungsinya tidak ototmatis 
         * fungsi dari printf itu tidak ototmatis baris baru seperti print dan println
         */
        
        String nama ="abdullah syarwan";
        String alamat ="matakali";
        int umur = 18;
        
        System.out.println("nama\t : " + nama);
        System.out.print("alamat\t : " + alamat);
        System.out.printf("\numur\t : " + umur + "tahun\n");
        
        // variable biasa / update
        
         byte jam = 10;
         System.out.println("jam\t : " + jam);
         jam = 12;
         System.out.println("jam\t : " + jam);
        /* pertama saya membuat variable biasa
         * menggunakan tipe data byte dan saya mengupdate nya
         * dari jam 10 ke jam 12.
         */
        
        // variable final (costanta)
         final byte tanggal = 14;
         System.out.println("tanggal\t : " + tanggal + " september");
        /* saya membuat variable costanta menggunakan keyword dengan tipe data byte
         * kenapa tidak bisa di update karna ini adalah tipe data final "PAHAMMM"
         */
    }
    
}
        
        
        
        
        
    

