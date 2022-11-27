public class Student {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private float diemTB;

    public Student(String maSV, String hoTen, int namSinh, float diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public void inThongTinSinhVien(){
        System.out.println("Thông tin sinh viên là: ");
        System.out.println("Mã SV: " + this.maSV);
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Năm sinh: " + this.namSinh);
        System.out.println("Điểm trung bình: " + this.diemTB);

    }
}
