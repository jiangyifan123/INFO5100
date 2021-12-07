import java.util.*;
class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class GpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGpa() < o2.getGpa())
            return 1;
        else if(o1.getGpa() == o2.getGpa())
            return 0;
        else
            return -1;
    }
}
class DateOfBirthComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}
public class StudentCompareTest {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Steven", 36, new Date(2021, 12, 7)));
        list.add(new Student(1, "Andy", 37, new Date(2021, 12, 8)));
        list.add(new Student(2, "Amy", 33, new Date(2021, 12, 9)));
        list.sort(new NameComparator());
        for(Student s: list){
            System.out.print(s.getName() + ",");
        }
        System.out.println();
        list.sort(new GpaComparator());
        for(Student s: list){
            System.out.print(s.getGpa() + ",");
        }
        System.out.println();
        list.sort(new DateOfBirthComparator());
        for(Student s: list){
            System.out.print(s.getDateOfBirth() + ",");
        }
        System.out.println();
    }
}
