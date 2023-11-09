package entities;
import entities.enums.WorkLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkLevel workerLevel;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();


    public Worker() {}

    public Worker(String name, WorkLevel workerLevel, Double baseSalary, Department department) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Worker{ " +
                "name='" + name + '\'' +
                ", workerLevel=" + workerLevel +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                ", contracts=" + contracts +
                "} ";
    }
}
