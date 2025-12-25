package quanlychuyenxeapp.BCE.themCx;

/**
 *
 * @author phuoc
 */
public class ResultAddCxUI {
    //state
    //constructor
    //behavior
    public void display(ResponseDTO resDTO){
        
        System.out.print(resDTO.message);
        System.out.print(" [MA CX]: " + resDTO.maCx);
        System.out.print(" [TEN TX]: " + resDTO.tenTx);
        System.out.print(" [SO XE]: " + resDTO.soXe);
        System.out.println(" [LOAI XE]: " + resDTO.loai);

        
    }
    
}
