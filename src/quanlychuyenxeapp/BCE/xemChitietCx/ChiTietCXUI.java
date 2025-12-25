package quanlychuyenxeapp.BCE.xemChitietCx;

import java.util.Scanner;

/**
 *
 * @author phuoc
 */
public class ChiTietCXUI {
    //state
    //constructor
    //behavior
    public void getMaCX(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[XEM THÔNG TIN CHI TIET CX CO MA]: ");
        int maCx = keyboard.nextInt();
        RequestDTO reqDTO = new RequestDTO();
        reqDTO.maCx = maCx;
        //gủi thông điệp
        ChiTietCxControl chiTietCxControl = new ChiTietCxControl();
        chiTietCxControl.control(reqDTO);
        
    }
    
}
