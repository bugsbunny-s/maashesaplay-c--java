public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours =  workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary < 1000){
            return 0;
        }
        if(this.salary > 1000){
            return this.salary* 0.03; 
        }
        return 0;
    }

    double bonus(){
        if(workHours > 40){
        return (workHours-40)*30;
        }
        return 0;
    } 
    
    double raiseSalary(){
        if(2021 - hireYear < 10){
            return (this.salary*5/100);
        }
        else if(2021 - hireYear > 10 && 2021 - hireYear < 20){
            return (this.salary*10/100);
        }
        else if(2021 - hireYear > 20){
            return (this.salary*15/100);
        }
        return 0;
    }

    void toStringPrint(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " +this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte Maaş : " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (this.salary + this.raiseSalary()));
    }
}
