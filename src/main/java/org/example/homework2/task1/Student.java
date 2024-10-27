package org.example.homework2.task1;

public class Student {
    private String name;
    private String id;

    public Student(String name1, String id1) {
        // * если не присвоить никакие значения, то система присвоит сама какие-то рандомные значения.
        this.name = name1;
        this.id = id1;
    }

    public Student() {
        this.name = "unknown";
        this.id = "unknown";
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
