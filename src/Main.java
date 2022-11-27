import java.util.*;

public class Main {
    static List<Student> sinhviens = new ArrayList<Student>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("Chuong trinh quan ly sinh vien");
            System.out.println("1. Them sinh vien vao danh sach");
            System.out.println("2. In danh sach sinh vien ra ngoai man hinh");
            System.out.println("3. Kiem tra danh sach co rong khong");
            System.out.println("4. Lay so luong sinh vien trong danh sach");
            System.out.println("5. Lam rong danh sach sinh vien");
            System.out.println("6. Kiem tra sinh vien co ton tai trong danh sach hay ko, dua vao ma sv");
            System.out.println("7. Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien");
            System.out.println("8. Tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim");
            System.out.println("9. Xuat danh sach sinh vien co diem tu cao den thap");
            System.out.println("Mời ban chọn 1 trong các chuong trinh sau de thuc hien: ");
            int so = Integer.parseInt(sc.nextLine());
            switch (so){
                case 1:
                    themSinhVien();
                    break;
                case 2:
                    inDanhSachSV();
                    break;
                case 3:
                    kiemTraEmpty();
                    break;
                case 4:
                    getLengthSV();
                    break;
                case 5:
                    cleanSV();
                    break;
                case 6:
                    checkIsEmptyMSV();
                    break;
                case 7:
                    removeSV();
                    break;
                case 8:
                    searchSVByName();
                    break;
                case 9:
                    sapXepSV();
                    break;
                default:
                    System.out.println("Moi chon lai tu 1 => 9");
            }
        }

    }

    private static void themSinhVien(){
        System.out.println("Moi ban nhap so luong sinh vien can them: ");
        int so = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < so; i++) {
            System.out.println("Moi ban nhap thong tin cua sinh vien thu" + (i + 1));
            System.out.println("Moi ban nhap ten sinh vien: " + (i + 1));
            String hoTen = sc.nextLine();
            System.out.println("Moi ban nhap nam sinh cua sinh vien " + (i + 1));
            int namSinh = Integer.parseInt(sc.nextLine());
            System.out.println("Moi ban nhap diem trung binh cua sinh vien: " + (i + 1));
            float diemTB = Float.parseFloat(sc.nextLine());
            String maSV = "MSV" + (i + 1 + sinhviens.size());
            Student sv = new Student(maSV, hoTen, namSinh,diemTB);
            sinhviens.add(sv);
        }
    }

    private static void inDanhSachSV(){
        System.out.println("Danh sach sinh vien la: ");
        for (Student sinhvien: sinhviens
             ) {
            sinhvien.inThongTinSinhVien();
        }
    }

    private static void kiemTraEmpty(){
        if (sinhviens.isEmpty()){
            System.out.println("Danh sac rong");
        }else{
            System.out.println("Danh sach co sinh vien");
        }
    }

    private static void getLengthSV(){
        System.out.println("So luong sinh vien la: " + sinhviens.size());
    }

    private static void cleanSV(){
        System.out.println("Ban co chac chan xoa het sinh vien khoi danh sach khong? Neu muon nhap OK");
        String check = sc.nextLine();
        if (check.equals("OK")){
            sinhviens.clear();
        }
    }

    private static void checkIsEmptyMSV(){
        System.out.println("Moi ban nhap vao ma sinh vien de kiem tra ton tai: ");
        String maSV = sc.nextLine();
        Boolean check = true;
        for (Student sinhvien: sinhviens
        ) {
            if (sinhvien.getMaSV().equals(maSV)){
                check = false;
                System.out.println("Sinh vien da co trong he thong");
            }
        }

        if (check){
            System.out.println("Sinh vien ko co trong he thong");
        }
    }

    private static void removeSV(){
        System.out.println("Moi ban nhap vao ma sinh vien can xoa: ");
        String maSV = sc.nextLine();
        sinhviens.removeIf(sv -> sv.getMaSV().equals(maSV));
    }

    private static void searchSVByName(){
        System.out.println("Moi ban nhap vao ma sinh vien de kiem tra ton tai: ");
        String maSV = sc.nextLine();
        for (Student sinhvien: sinhviens
        ) {
            if (sinhvien.getMaSV().equals(maSV)){
                sinhvien.inThongTinSinhVien();
            }
        }
    }

    private static void sapXepSV(){
//        List<Student> sortSV = sinhviens.sort((o1, o2) -> Float.compare(o1.getDiemTB(), o2.getDiemTB()));
        Collections.sort(sinhviens, ((o1, o2) -> Float.compare(o2.getDiemTB(), o1.getDiemTB())));
        inDanhSachSV();
    }
}