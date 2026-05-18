package Entities;

public class Employed {
    private Integer id;
    private String name;
    private Double Salary;


    public Employed(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
    public Double increaseSalary(Double increase){
        Double t = Salary * increase/100;
        return this.Salary += t;
    }

    public String toString(){
        return id
                +": "
                + name
                +", "
                + Salary;
    }

}
