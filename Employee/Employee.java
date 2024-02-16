
public class Employee {
   String firstName;
   String lastName;
   String socialSecurityNumber;

   public void setFirstName(String firstName)
   {
        this.firstName = firstName;
   }

   public void setLastName(String lastName)
   {
        this.lastName = lastName;
   }

   public void setSocialSecurityNumber(String socialSecurityNumber)
   {
        this.socialSecurityNumber = socialSecurityNumber;
   }

   public String getFirstName()
   {
        return this.firstName;
   }

   public String getLastName()
   {
        return this.lastName;
   }

   public String getSocialSecurityNumber()
   {
        return this.socialSecurityNumber;
   }
}

class SalariedEmployee extends Employee {
    int weeklySalary;

    public void setWeeklySalary(int weeklySalary)
    {
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary()
    {
        return this.weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    int wage;
    int noOfHoursWorked;

    public void setWage(int wage)
    {
        this.wage = wage;
    }
    public void setNoOfHoursWorked(int noOfHoursWorked)
    {
        this.noOfHoursWorked = noOfHoursWorked;
    }

    public int getWage()
    {
        return this.wage;
    }

    public int getNoOfHoursWorked()
    {
        return this.noOfHoursWorked;
    }
}

class CommissionEmployee extends Employee {
    String commissionRate;
    String grossSales;

    public void setCommissionRate(String commissionRate)
    {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(String grossSales)
    {
        this.grossSales = grossSales;
    }

    public String getCommissionRate()
    {
        return this.commissionRate;
    }

    public String getGrossSales()
    {
        return this.grossSales;
    }

}

class BaseEmployee extends Employee {
    int baseSalary;

    public void setBaseSalary(int baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary()
    {
        return this.baseSalary;
    }
}