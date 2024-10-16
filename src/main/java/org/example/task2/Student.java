package org.example.task2;

public class Student implements Printable {
    private String name;
    private long recordBookNumber;
    private double avgScore;

    public void setName(String name) {
        this.name = name;
    }

    public void setRecordBookNumber(long recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public String getName () {
        return this.name;
    }

    public long getRecordBookNumber() {
        return this.recordBookNumber;
    }

    public double getAvgScore(){
        return this.avgScore;
    }

    @Override
    public void print() {
        System.out.println("Student's name: " + this.name);
        System.out.println("Student record book number: " + this.recordBookNumber);
        System.out.println("Student's Avarage score: " + this.avgScore);
    }

}
