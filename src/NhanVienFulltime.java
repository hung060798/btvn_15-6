public class NhanVienFulltime extends  NhanVien{
    double tienThuong;
    double tienPhat;
    double luongCung;

    public double LuongThuc(){
        return luongCung+tienThuong-tienPhat;
    }

}
