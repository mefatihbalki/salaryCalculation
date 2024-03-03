import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Kullanıcı Girişleri
        Scanner input = new Scanner(System.in);
        System.out.print("İsim?\t: ");
        String name = input.nextLine();
        System.out.print("Maaş?\t: ");
        int salary = input.nextInt();
        System.out.print("Çalışma Süresi?\t: ");
        int workHours = input.nextInt();
        System.out.print("İşe Başlangıç Zamanı?: ");
        int hireYear = input.nextInt();

        //Çalışan durum sonucu
        Employee worker1 = new Employee(name, salary, workHours, hireYear);
        worker1.writeInfo();
    }
}