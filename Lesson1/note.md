1. Quy tắc khai báo
<type> <variable_name> = <initial_value>
<kiểu_dữ_liệu> <tên_biến> = <giá_trị_khởi_tạo>

Ví dụ:
int a = 6;
<type>: int -> kiểu dữ liệu số nguyên
<variable_name> : a -> đặt tên biến là "a"
<initial_value>: 6 -> giá trị khởi tạo của biến a là 6

Lưu ý: có thể khai báo biến mà không cần khởi tạo giá trị ban đầu.
Ví dụ:
int a;
a = 10;



2. Quy tắc đặt tên biến
- Sử dụng ký tự alphabet (a-zA-Z), dấu $ hoặc dấu gạch dưới(_)
- Tên biến có phân biệt HOA/thường
- không đặt tên bắt đầu bởi số, và không dùng các từ khóa được sử dụng để xây dựng
ngôn ngữ java, ví dụ:
new, class, const...
ví dụ:
Tên biến nào sau đây không hợp lệ:
abc
1abc
ab_c
_abc
$abc
ab-c
_123
$123
if
$if



3. Các toán tử thường gặp (phép toán số học)
+ -> phép cộng. ví dụ: int a = 6 + 9
- -> phép trừ. ví dụ: int b = 6 - 9;
* -> phép nhân . ví dụ: double c = 6 * 9
/ -> phép chia. ví dụ: double d = 6/9;
Toán tử dùng để thực hiện phép tính số học, thực hiện theo quy tắc ưu tiên sau:
- 1. Nhân và chia
- 2. Cộng và trừ
- 3. Trái sang phải
Ví dụ: 5 + 9*3 - 10/2 = ?



2. Nhập từ bàn phím
java.util.Scanner là công cụ được java hỗ trợ sẵn, dùng để nhập dữ liệu từ bàn phím
Bước 1: Tạo đối tượng Scanner
Scanner scanner = new Scanner(System.in);
Bước 2: sử dụng các phương thức được cung cấp sẵn
scanner.nextLine() => nhận 1 dòng nhập từ bàn phím => trả ra dữ liệu string
scanner.nextInt() => nhận 1 số nguyên từ bàn phím => trả ra dữ liệu số nguyên

15
scanner.nextDouble() => nhận 1 số thực từ bàn phím => trả ra dữ liệu số thực
Ví dụ:
Khai báo 2 biến name và age.
Nhập name và age từ bàn phím
Sử dụng 3 hàm trên để in ra màn hình:
My name is <name>, age = <age>
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Your name is: ");
String name = scanner.nextLine();
System.out.println("Your age is: ");
int age = scanner.nextInt();
System.out.println("My name is " + name + ", age = " + age);
scanner.close();
}
https://stackoverflow.com/questions/12519335/resource-leak-in-is-never-closed


6. Các hàm xuất ra màn hình
1. In ra màn hình console
//in ra kết quả nhưng "không xuống dòng": print
System.out.print( );
//in ra kết quả rồi xuống dòng: print line
System.out.println( );

//in ra kết quả có định dạng: print format
System.out.printf( );
%d: số nguyên
%f: số thực
- mặc định là 6 số lẻ
%.3f định dạng 3 số lẻ
%s: chuỗi
Ví dụ:
System.out.print("Xoan Dev");
System.out.println("Channel");
System.out.printf("có %d người đăng ký", 100000);



#7. Các hàm toán học
Các hàm toán học có thể kể tới như:
- Tính Căn bậc 2
- Tính lũy thừa
- Làm tròn số...
https://www.w3schools.com/java/java_math.asp
https://www.w3schools.com/java/java_ref_math.asp