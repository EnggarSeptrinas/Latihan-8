package Interface;
public class Cek implements D1,I1 {
    double nilai;
     public Cek(double nilai){
        if(nilai%1==0){
            methodI1();
        }
        else{
            methodD1();
        }
     }
    @Override
    public void methodD1() {
        System.out.println("Tipe Data Dari Nilai Adalah     \t:Double");
        
          }

    @Override
    public void methodI1() {
        System.out.println("Tipe Data Dari Nilai Adalah     \t:Integer");
        }
    }
    

