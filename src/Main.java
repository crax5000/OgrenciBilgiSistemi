public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK202", "FZK");
        Course kimya = new Course("Kimya", "KMY303", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "1111", "MAT");
        Teacher t2 = new Teacher("Graham Bell", "2222", "FZK");
        Teacher t3 = new Teacher("Steve Jobs", "3333", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "1234", mat, fizik, kimya);
        s1.addBulkExamNote(60, 80, 40, 50, 48, 90);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "5678", mat, fizik, kimya);
        s2.addBulkExamNote(100, 30, 70, 33, 88, 46);
        s2.isPass();

        Student s3 = new Student("George Washington", 4, "3252", mat, fizik, kimya);
        s3.addBulkExamNote(55, 25, 90, 85, 80, 60);
        s3.isPass();

    }
}