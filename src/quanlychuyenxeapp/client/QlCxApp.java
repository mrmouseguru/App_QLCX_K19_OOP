package quanlychuyenxeapp.client;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import quanlychuyenxeapp.provider.ChuyenXeNgoaiThanh;
import quanlychuyenxeapp.provider.ChuyenXeNoiThanh;

/**
 *
 * @author phuoc
 */
public class QlCxApp {
    //khai báo 2 biến mảng để lưu danh sách xe
    //2 biến này là toàn cục - có tác dụng toàn hệ thống
    static ArrayList<ChuyenXeNoiThanh> dsCxNoiThanh = new ArrayList();
    static ArrayList<ChuyenXeNgoaiThanh> dsCxNgoaiThanh = new ArrayList();
    static Scanner keyboard = new Scanner(System.in);
   
    public static void main(String[] args) {
        int choice;
        initData();

        while(true){
            printMenu();
            System.out.print("->");
            choice = keyboard.nextInt();
            
            if(choice == 1)
            {
                nhapChuyenXe();
                continue;

            }
            
            if(choice == 2){
                printListChuyenXe();
                continue;
            }
            
            if(choice == 3){
                printChitietCx();
                continue;
            }
            
            
            
            if(choice == 4)
            {
                tinhTongTienTungLoaiCX();
                continue;
            }
            
            if(choice == 5)
            {
                break;
            }

            
        }
        //in danh sách
       
    }
    
    static void printMenu(){
        System.out.println("~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~");
        System.out.println("1. NHAP THONG TIN CHUYEN XE");
        System.out.println("2. IN DANH SACH CHUYEN XE");
        System.out.println("3. XEM CHI TIET THONG TIN MOT CX");
        System.out.println("4. TINH TONG TIEN TUNG LOAI");
        System.out.println("5. THOAT CHUONG TRINH");
        System.out.println("~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~~");
    }
    
    static void nhapChuyenXe()
    {
        System.out.print("[MA CHUYEN XE]:");
            int maCx = keyboard.nextInt();//5Enter='\n'
            keyboard.nextLine();//nhận ký tự xuống dòng '\n'

            System.out.print("[HO TEN TAI XE]:");
            String hoTenTx = keyboard.nextLine();
            System.out.print("[SO XE]:");
            String soXe = keyboard.nextLine();
            System.out.print("[LOAI XE (1-NOI THANH / 2-NGOAI THANH)]:");
            int type = keyboard.nextInt();
            System.out.print("[DON GIA]:");
            double donGia = keyboard.nextDouble();
            keyboard.nextLine();
            //ngay Di
            System.out.print("[NGAY DI (dd/mm/yyyy)]:");
            String strNgayDi = keyboard.nextLine();
            SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyyy");
            Date ngayDi = null;
            try {
                ngayDi = sDF.parse(strNgayDi);
            } catch (ParseException ex) {
                System.out.println("" + ex.getMessage());
            }
            //keyboard.nextLine();//nhận ký tự xuống dòng '\n'
            if(type == 1){
                
                System.out.print("[SO TUYEN]:");
                int soTuyen = keyboard.nextInt();
                System.out.print("[SO KM DI DUOC]:");
                float soKmDiDuoc = keyboard.nextFloat();
                ChuyenXeNoiThanh cxNoi = new ChuyenXeNoiThanh(maCx, hoTenTx,
                        soXe, donGia, soTuyen, soKmDiDuoc, ngayDi);
                dsCxNoiThanh.add(cxNoi);
                
            }
            
            if(type == 2){
                System.out.print("[NOI DEN]:");
                String noiDen = keyboard.nextLine();
                System.out.print("[SO NGAY DI DUOC]:");
                float soNgayDiDuoc = keyboard.nextFloat();
                ChuyenXeNgoaiThanh cxNgoai = new ChuyenXeNgoaiThanh(maCx, 
                        hoTenTx, soXe, donGia, 
                        noiDen, soNgayDiDuoc,ngayDi);
                dsCxNgoaiThanh.add(cxNgoai);


            }
    }
    
    static void printListChuyenXe()
    {
        SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyy");
        System.out.printf("%-15s%-20s%-15s%-20s%10s%10s\n", "Ma Chuyen Xe", 
                "Ho Ten Tai Xe","So xe", "Don gia",
                "Ngay Di",
                "Thanh tien");
        for(int i =0; i < dsCxNoiThanh.size(); i++)
        {
           ChuyenXeNoiThanh cxNoi = dsCxNoiThanh.get(i);
            System.out.printf("%-15d%-20s%-15s%-20.0f%10s%10.0f\n", 
                    cxNoi.getMaCx(),
                    cxNoi.getTenTx(),
                    cxNoi.getSoXe(),
                    cxNoi.getDonGia(),
                    sDF.format(cxNoi.getNgayDi()),
                    cxNoi.tinhTien()
                    
            );
        }
        
        for(int i =0; i < dsCxNgoaiThanh.size(); i++)
        {
            ChuyenXeNgoaiThanh cxNgoai = dsCxNgoaiThanh.get(i);
            System.out.printf("%-15d%-20s%-15s%-20.0f%10s%10.0f\n", 
                    cxNgoai.getMaCx(),
                    cxNgoai.getTenTx(),
                    cxNgoai.getSoXe(),
                    cxNgoai.getDonGia(),
                    sDF.format(cxNgoai.getNgayDi()),
                    cxNgoai.tinhTien()
                    
            );
        }
        
        
    }
    
    static void initData()
    {
        int day = 20;
        int month = 10;
        int year = 2025;
        
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.MONTH, month -1);
        cal.set(Calendar.YEAR, year);
                
        Date ngayDi = cal.getTime();
        
        ChuyenXeNoiThanh cxNoi1 = new ChuyenXeNoiThanh(1, 
                "L Van Teo",
                "Teo 111", 7_000, 
                24, 10.5f, ngayDi);
        ChuyenXeNoiThanh cxNoi2 = new ChuyenXeNoiThanh(2, 
                "L Van Ty",
                "Ty 222", 8_000, 
                54, 9.5f, ngayDi);
        
        ChuyenXeNgoaiThanh cxNgoai1 = new ChuyenXeNgoaiThanh(3, 
                "Nguyen V Tung", "tung 333", 
                700_000, 
                "Can Tho", 3.5f, ngayDi);
         ChuyenXeNgoaiThanh cxNgoai2 = new ChuyenXeNgoaiThanh(4, 
                "Trinh Van Beo", "beo 4444", 
                900_000, 
                "Ca Mau", 5.0f, ngayDi);
         
        dsCxNoiThanh.add(cxNoi1);
        dsCxNoiThanh.add(cxNoi2);
        dsCxNgoaiThanh.add(cxNgoai1);
        dsCxNgoaiThanh.add(cxNgoai2);
        

         
    }
    
    static void tinhTongTienTungLoaiCX(){
        double tongTienNoiThanh = 0;
        double tongTienNgoaiThanh = 0;
        for(int i = 0; i < dsCxNoiThanh.size(); i++)
        {
            tongTienNoiThanh += dsCxNoiThanh.get(i).tinhTien();
        }
        for(int i = 0; i < dsCxNgoaiThanh.size(); i++)
        {
            tongTienNgoaiThanh += dsCxNgoaiThanh.get(i).tinhTien();
        }
        
        System.out.println("Tong tienn CX Noi Thanh: " + tongTienNoiThanh);
        System.out.println("Tong tienn CX Noi Thanh: " + tongTienNgoaiThanh);

        
    }
    
  
    static void printChitietCx()
    {
        SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyyy");
        ChuyenXeNoiThanh cxNoi = null;
        ChuyenXeNgoaiThanh cxNgoai = null;
        System.out.print("[NHAP MA CX]:");
        int maCx = keyboard.nextInt();
        keyboard.nextLine();
        
        //tìm chuyến xe theo mã
        for(int i = 0; i < dsCxNoiThanh.size(); i++)
        {
            if(dsCxNoiThanh.get(i).getMaCx() == maCx)
            {
                cxNoi = dsCxNoiThanh.get(i);
                break;
            }
        }
        
        for(int i = 0; i < dsCxNgoaiThanh.size(); i++)
        {
            if(dsCxNgoaiThanh.get(i).getMaCx() == maCx)
            {
                cxNgoai = dsCxNgoaiThanh.get(i);
                break;
            }
        }
        
        if(cxNoi != null)
        {
            System.out.printf("%-15s%-20s%-15s%-15s%-10s%-20s%10s%-10s\n", "Ma Chuyen Xe", 
                "Ho Ten Tai Xe","So xe", "Don Gia",
                 "So Tuyen","So KM Di Duoc", "Ngay Di",
                "Thanh tien");
            System.out.printf("%-15d%-20s%-15s%-15.0f%-10d%-20.1f%-10s%10.0f\n", 
                    cxNoi.getMaCx(),
                    cxNoi.getTenTx(),
                    cxNoi.getSoXe(),
                    cxNoi.getDonGia(),
                    cxNoi.getSoTuyen(),
                    cxNoi.getKmDiDuoc(),
                    sDF.format(cxNoi.getNgayDi()),
                    cxNoi.tinhTien()
                    
            );
            
        }
        
        if(cxNgoai != null)
        {
            System.out.printf("%-15s%-20s%-15s%-15s%-15s%-20s%-10s%10s\n", "Ma Chuyen Xe", 
                "Ho Ten Tai Xe","So xe","Don gia",
                "Noi Den",
                "So Ngay Di Duoc", 
                "Ngay Di",
                "Thanh tien");
            System.out.printf("%-15d%-20s%-15s%-15.0f%-15s%-20.0f%-10s%10.0f\n", 
                    cxNgoai.getMaCx(),
                    cxNgoai.getTenTx(),
                    cxNgoai.getSoXe(),
                    cxNgoai.getDonGia(),
                    cxNgoai.getNoiDen(),
                    cxNgoai.getSoNgayDiDuoc(),
                    sDF.format(cxNgoai.getNgayDi()),
                    cxNgoai.tinhTien()
                    
            );
            
        }
        
        if(cxNoi == null && cxNgoai == null){
            System.out.println("Khong tim thay chuyen xe co ma: " + maCx);
        }
    }
    
}
