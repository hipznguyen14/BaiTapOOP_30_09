public class SinhVien  extends Person {
    private String id_student;

    public SinhVien(String fullName, String id_student) {
        super(fullName,id_student);
    }
    public String getId_student() {
        return id_student;
    }
    public void setId_student(String id_student) {
        this.id_student = id_student;
    }
    public static void main (String [] args) {
        System.out.println("SinhVien la");
    }
}

