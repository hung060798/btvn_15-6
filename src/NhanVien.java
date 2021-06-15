public class NhanVien {
    int id;
    String fullname;
    int age;
    String phonenumber;
    String email;

    public NhanVien() {
    }

    public NhanVien(int id, String fullname, int age, String phonenumber, String email) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.phonenumber = phonenumber;
        this.email = email;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
