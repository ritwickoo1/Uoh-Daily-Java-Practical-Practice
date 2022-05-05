
package labprogram;

class Student {
    private String first;
    private String last;
    private double gpa;

    public Student(String first, String last, double gpa) {
        this.first = first;
        this.last = last;
        this.gpa = gpa;
    }

    public String getLast() {
        return last;
    }

    public double getGpa() {
        return gpa;
    }
    
}
