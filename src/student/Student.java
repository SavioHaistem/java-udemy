package student;

public class Student {
    public String name;
    public Double firstQuarter;
    public Double secondQuarter;
    public Double thirdQuarter;

    public double sumGrade() {
        return firstQuarter + secondQuarter + thirdQuarter;
    };

    public String checkGrade() {
        if (this.sumGrade() < 60) {
            return " FAILED "
                    + "MISSING "
                    + (60 - sumGrade())
                    + " POINTS";
        } else {
            return " PASSED";
        }
    }

    public String toString() {
        return "FINAL GRADE = "
                + sumGrade()
                + checkGrade();
    }
}
