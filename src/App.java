import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // int a;
        // a = 5;
        // float b = 4.5F;
        // double c = 4.5;
        // int d = (int) (a + b);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // int e = (int) (a % b);
        // Season season = Season.WINTER;
        // System.out.println(season);
        // System.out.println(e);
        // String h = (a%b ==0) ? "a chia het cho b" : "a khong chia het cho b"; // toán
        // tử ba ngôi;
        // System.out.println(h);
        // int x = 3;
        // int y = 4;
        // double z = (int) Math.sqrt(x*x + y*y);
        // System.out.println(z);
        // double s = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        // System.out.println(s);

        // String name, address;
        // int year;
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Nhập họ tên: ");
        // name = scanner.nextLine();

        // System.out.println("Nhập năm sinh: ");
        // year = Integer.parseInt(scanner.nextLine()); // Inter.ParseInt để khắc phục
        // trôi lệnh
        // System.out.println("Nhập quê quán: ");
        // address = scanner.nextLine();
        // System.out.println("Họ tên : " + name);
        // System.out.println("Quê : " + address);
        // System.out.println("Năm sinh : " + year);
        // scanner.close();

        // double weight, height;
        // // Scanner scanner = new Scanner(System.in);
        // System.out.println("Nhập vào cân nặng: ");
        // weight = scanner.nextDouble();
        // System.out.println("Nhập vào chiều cao");
        // height = scanner.nextDouble();
        // // System.out.println("Chỉ số BMI là:" + Math.round((weight/Math.pow(height,
        // 2))));
        // int bmi = (int) Math.round((weight / Math.pow(height, 2)));
        // if (bmi < 18.5) {
        // System.out.println("Thiếu cân");
        // }
        // if (bmi > 24.9) {
        // System.out.println("Thừa cân");
        // }
        // else {
        // System.out.println("Cân đối");
        // }
        // scanner.close();

        // bai 1
        Scanner scanner = new Scanner(System.in);
        double r;
        System.out.println("Nhập vào bán kính: ");
        r = scanner.nextDouble();
        System.out.println("Bán kính hình tròn là:" + Math.round(2 * r * Math.PI));
        scanner.close();

        // bai2
        double x;
        System.out.println("Nhập vào một số bất kỳ từ bàn phím: ");
        x = scanner.nextDouble();
        if (x % 2 == 0) {
            System.out.println("Số vừa nhập là số chẵn");
        } else {
            System.out.println("Số vừa nhập là số lẻ");
        }
        // bai3
        double y = 100000000;
        System.out.println("Tiền lãi phải trả hàng tháng là:" + Math.round(((y*0.12)/12)));
        System.out.println("Tiền phải trả hàng tháng là:" + Math.round(((y*0.12)/12) + y/12));
    }

}

enum Season {
    SPRING, WINTER, AUTUMN, summer
}
