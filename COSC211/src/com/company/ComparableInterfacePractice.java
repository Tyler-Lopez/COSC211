package com.company;

public class ComparableInterfacePractice {
    public class Student implements Comparable {
        public int grade;
        public int getGrade() {
            return grade;
        }
        @Override
        public int compareTo(Object tmp) {
            Student student = (Student) tmp;

            if(getGrade() > student.getGrade()) {
                return 1;
            } else if(getGrade() < student.getGrade()) {
                return -1;
            } else return 0;
        }

    }
}
