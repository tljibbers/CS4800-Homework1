public class employeeMain {

    public static void main(String[] args) {

        SalariedEmployee joe = new SalariedEmployee();
        SalariedEmployee renwa = new SalariedEmployee();

        HourlyEmployee stephanie = new HourlyEmployee();
        HourlyEmployee mary = new HourlyEmployee();

        CommissionEmployee nicole = new CommissionEmployee();
        CommissionEmployee mahnaz = new CommissionEmployee();

        BaseEmployee mike = new BaseEmployee();

        joe.setFirstName("Joe");
        joe.setLastName("Jones");
        joe.setSocialSecurityNumber("111-11-1111");
        joe.setWeeklySalary(2500);

        renwa.setFirstName("Renwa");
        renwa.setLastName("Chanel");
        renwa.setSocialSecurityNumber("555-55-5555");
        renwa.setWeeklySalary(1700);

        stephanie.setFirstName("Stephanie");
        stephanie.setLastName("Smith");
        stephanie.setSocialSecurityNumber("222-22-2222");
        stephanie.setWage(25);
        stephanie.setNoOfHoursWorked(32);

        mary.setFirstName("Mary");
        mary.setLastName("Quinn");
        mary.setSocialSecurityNumber("333-33-3333");
        mary.setWage(19);
        mary.setNoOfHoursWorked(47);

        nicole.setFirstName("Nicole");
        nicole.setLastName("Dior");
        nicole.setSocialSecurityNumber("444-44-4444");
        nicole.setCommissionRate("15%");
        nicole.setGrossSales("$50,000");

        mahnaz.setFirstName("Mahnaz");
        mahnaz.setLastName("Vaziri");
        mahnaz.setSocialSecurityNumber("777-77-7777");
        mahnaz.setCommissionRate("22%");
        mahnaz.setGrossSales("$40,000");

        mike.setFirstName("Mike");
        mike.setLastName("Davenport");
        mike.setSocialSecurityNumber("666-66-6666");
        mike.setBaseSalary(95000);

    
        System.out.println("First name" + "\tLast name" + "\tSocial Sec#" + "\tWeekly Salary" + "\tWage" + "\tHours worked" + "\tCom rate" + "\tGross salary" + "\tBase salary");
        System.out.println(joe.getFirstName() + "\t" +  "\t" + joe.getLastName() + "\t" + "\t" + joe.getSocialSecurityNumber() + "\t" + joe.getWeeklySalary());
        System.out.println(stephanie.getFirstName() + "\t" +  stephanie.getLastName() + "\t" + "\t" + stephanie.getSocialSecurityNumber() + "\t" + "\t" + "\t" + stephanie.getWage() + "\t" + stephanie.getNoOfHoursWorked());
        System.out.println(mary.getFirstName() + "\t" +  "\t" + mary.getLastName() + "\t" + "\t" + mary.getSocialSecurityNumber() + "\t" + "\t" + "\t" + mary.getWage() + "\t" + mary.getNoOfHoursWorked());
        System.out.println(nicole.getFirstName() + "\t" + "\t" + nicole.getLastName() + "\t" + "\t" + nicole.getSocialSecurityNumber() + "\t" + "\t" +"\t" + "\t" + "\t" + "\t" + nicole.getCommissionRate() + "\t" + "\t" + nicole.getGrossSales());
        System.out.println(renwa.getFirstName() + "\t" +  "\t" + renwa.getLastName() + "\t" + "\t" + renwa.getSocialSecurityNumber() + "\t" + renwa.getWeeklySalary());
        System.out.println(mike.getFirstName() + "\t" +  "\t" + mike.getLastName() + "\t" + mike.getSocialSecurityNumber() + "\t" + "\t" +"\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + mike.getBaseSalary());
        System.out.println(mahnaz.getFirstName() + "\t" + "\t" + mahnaz.getLastName() + "\t" + "\t" + mahnaz.getSocialSecurityNumber() + "\t" + "\t" +"\t" + "\t" + "\t" + "\t" + mahnaz.getCommissionRate() + "\t" + "\t" + mahnaz.getGrossSales());

    }

    
}
