package modul2;

import java.util.Scanner;

public class Mainstudent {
    private static int jumlahObjek = 0; // Variabel statis untuk menghitung jumlah objek
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan data untuk siswa ke-" + (i + 1) + ":");

            System.out.print("Nama: ");
            String name = scanner.nextLine();

            System.out.print("Alamat: ");
            String address = scanner.nextLine();

            System.out.print("Umur: ");
            int age = scanner.nextInt();

            System.out.print("Nilai Matematika: ");
            double mathGrade = scanner.nextDouble();

            System.out.print("Nilai Bahasa Inggris: ");
            double englishGrade = scanner.nextDouble();

            System.out.print("Nilai Sains: ");
            double scienceGrade = scanner.nextDouble();
            scanner.nextLine();

            // Membuat objek Student dan menyimpannya dalam array
            students[i] = new Student(name, address, age, mathGrade, englishGrade, scienceGrade);
            jumlahObjek++; // Menambah jumlah objek setiap kali objek baru dibuat
        }
        
        System.out.println("\nDaftar Siswa:");
        for (Student student : students) {
            student.displayMessage();
            System.out.println("===================");
        }
        jumlahObjek();

        scanner.close();
    }

    public static void jumlahObjek() {
        System.out.println("Jumlah objek Student yang telah dibuat: " + jumlahObjek);
    }
}