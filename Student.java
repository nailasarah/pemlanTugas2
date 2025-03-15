package modul2;

public class Student {
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 

    public Student(String name, String address, int age, double mathGrade, double englishGrade, double scienceGrade) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
    }
private double getAverage(){  
    return (mathGrade+scienceGrade+englishGrade) / 3; 
} 
public boolean statusAkhir() {
    return getAverage() >= 61; // Mengembalikan true jika lolos, false jika remidi
}
public void displayMessage(){ 
    System.out.println("Siswa dengan nama " + name); 
    System.out.println("beramalat di " + address); 
    System.out.println("berumur " + age); 
    System.out.println("mempunyai nilai rata rata " + getAverage()); 
    System.out.println("Status Akhir: " + (statusAkhir() ? "Lolos" : "Remidi"));
} 
}