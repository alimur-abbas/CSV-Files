public class Student {
    private String name;
    private String rollNo;
    private String department;
    private String result;
    private String cgpa;

    public String getName(String datum) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo(String datum) {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment(String datum) {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getResult(String datum) {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCgpa(String datum) {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", department='" + department + '\'' +
                ", result='" + result + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
