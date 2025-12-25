package quanlychuyenxeapp.BCE.xemChitietCx;

/**
 *
 * @author phuoc
 */
public class ResultChiTietUI {
    //state
    //constructor
    //behavior
    public void display(ResponseDTO resDTO){
        if(resDTO.found == false){
            System.out.println(resDTO.message);
            return;
        }
        System.out.println("THONG TIN CHI TIET CHUYEN XE:");
        System.out.println("[MA CX]: " + resDTO.maCx);
        System.out.println("[TEN TX]: " + resDTO.tenTx);
        System.out.println("[SO XE]: " + resDTO.soXe);
        System.out.println("[DON GIA]: " + resDTO.donGia);
        if(resDTO.xeNoiThanh){
            System.out.println("[LOAI]: " + "CHUYEN XE NGOAI THANH");
            System.out.println("[SO TUYEN]: " + resDTO.donGia);
            System.out.println("[SO KM DI DUOC]: " + resDTO.kmDiDuoc);
        }
        
        if(resDTO.xeNgoaiThanh){
            System.out.println("[LOAI]: " + "CHUYEN XE NGOAI THANH");
            System.out.println("[NOI DEN]: " + resDTO.noiDen);
            System.out.println("[SO NGAY DI DUOC]: " + resDTO.soNgayDiDuoc);
        }
        
        System.out.println("[TIEN]: " + resDTO.tien);       
        
        

        

    }
    
}
