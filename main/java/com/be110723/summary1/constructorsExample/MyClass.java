package com.be110723.summary1.constructorsExample;

public class MyClass {
    private int value;
    private String text;

    public MyClass(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public MyClass(MyClass other) {
     this.value = other.value;
     this.text = other.text;
    }

    public MyClass(int value) {
        this(value, "Default text");
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "value=" + value +
                ", text='" + text + '\'' +
                '}';
    }
}
