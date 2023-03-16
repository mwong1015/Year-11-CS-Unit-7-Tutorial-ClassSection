public class Student {
    int id;
    String firstName;
    String lastName;
    int age;
    int yearLevel;
    static int studentCount=1;


    public Student(String firstName, String lastName, int age, int yearLevel) {
        id = studentCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        studentCount++;
    }
    public boolean equals(Student other){
        if((firstName.equals(other.getFirstName()))&&(lastName.equals(other.getLastName()))&&(age == other.getAge())&&(yearLevel == other.getYearLevel())) {
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
