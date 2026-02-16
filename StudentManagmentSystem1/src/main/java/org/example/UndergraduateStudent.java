package org.example;

public class UndergraduateStudent extends Student {

    private double creditHours;
    private double scholarshipAmount;

    private UndergraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        double tuition = creditHours * 500;
        return tuition - scholarshipAmount;
    }

    @Override
    public String getStudentType() {
        if (creditHours >= 12) {
            return "Full-Time";
        } else {
            return "Part-Time";
        }
    }


    @Override
    public void displayStudentDetails() {

        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Type: " + getStudentType());
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship: " + scholarshipAmount);
        System.out.println("Tuition: " + calculateTuition());
    }

    public static class Builder {

        private String studentId;
        private String name;
        private String email;
        private String department;
        private double creditHours;
        private double scholarshipAmount;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setCreditHours(double creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder setScholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }
}
