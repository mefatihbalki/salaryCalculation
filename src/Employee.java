public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    //Çlaışan oluşturma
    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Bonus Hesaplama Kısmı
    public double bonus() {
        if (workHours>40){
            int perHours = 30;
            double bonusSalary = (workHours - 40)*perHours;
            return bonusSalary;
        }
        return 0;
    }
    //Vergi Hesaplama Kısmı
    public double tax() {
        if (this.salary>1000){
            double tax;
            return tax = this.salary * 0.03;
        } else {
            return 0;
        }
    }

    // Maaş Artış durumu
    public double raiseSalary() {
        int nowYear = 2021;
        double experience = nowYear - hireYear;
        if(experience<10){
            return this.salary*0.05;
        }
        if (experience>9 && experience<20){
            return this.salary*0.1;
        }
        else {
            return this.salary*0.15;
        }
    }

    // Çalışan bilgi çıktı kısmı
    public void writeInfo() {
        System.out.println("İsim\t\t\t: " + this.name);
        System.out.println("Maaş\t\t\t: " + this.salary);
        System.out.println("Çalışma Saati\t: " + this.workHours);
        System.out.println("Başlangıç Yılı\t: " + this.hireYear);
        System.out.println("Vergi\t\t\t: " + tax());
        System.out.println("Bonus\t\t\t: " + bonus());
        System.out.println("Maaş Artışı\t\t: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş\t\t: " + (this.salary + bonus() - tax() + raiseSalary()));

    }
}
