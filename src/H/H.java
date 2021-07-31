package H;
//Ternary operator
public class H {
    public static void main(String[] args) {
        int x=0;   //ตรวจสอบเช็คค่าของ isEven
        boolean isEven = false;
        System.out.println("x=" +x);
        x = isEven? 4: 7;     // : True : false  ถ้าเป็นจริงให้ค่าแรกไปท้าไม่ใช้จะให้ค่าผิดไป
        System.out.println("X=" +x);
    }
}
