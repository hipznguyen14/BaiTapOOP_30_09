public class Person {
    private String fullName;
    private String namsinh;
    //
    public Person(String fullName, String namsinh) {
        this.fullName = fullName;
        this.namsinh = namsinh;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getNamsinh() {
        return namsinh;
    }
    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public static void print() {
        System.out.println("Nghe Nghiep: !");
    }
}