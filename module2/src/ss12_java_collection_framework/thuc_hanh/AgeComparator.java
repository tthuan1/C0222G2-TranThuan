package ss12_java_collection_framework.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class AgeComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }


    @Override
    public Comparator<Student1> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Student1> thenComparing(Comparator<? super Student1> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Student1> thenComparing(Function<? super Student1, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Student1> thenComparing(Function<? super Student1, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Student1> thenComparingInt(ToIntFunction<? super Student1> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Student1> thenComparingLong(ToLongFunction<? super Student1> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Student1> thenComparingDouble(ToDoubleFunction<? super Student1> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }

    public static void main(String[] args) {
        Student1 student = new Student1("Kien", 30, "HT");
        Student1 student1 = new Student1("Nam", 26, "HN");
        Student1 student2 = new Student1("Anh", 38, "HT" );
        Student1 student3 = new Student1("Tung", 38, "HT" );

        List<Student1> lists = new ArrayList<Student1>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student1 st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student1 st : lists){
            System.out.println(st.toString());
        }
    }
}