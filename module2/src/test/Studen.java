package test;

public class Studen {
    private String name;
    private Integer age;
    private String className;

    public Studen() {
    }

    public Studen(String name, Integer age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Học sinh: " +
                "\t Tên: " + name +
                "\t Tuổi: " + age +
                "\t Lớp: " + className;
    }
}
