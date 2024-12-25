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





Chapter 2: Lab 02
Thực hành câu điều kiện với Java
#10. Java Data Types (Kiểu dữ liệu)
https://www.w3schools.com/java/java_data_types.asp
int myNum = 5; // Integer (whole number)
float myFloatNum = 5.99f; // Floating point number
char myLetter = 'D'; // Character
boolean myBool = true; // Boolean
String myText = "Hello"; // String
Kiểu dữ liệu được chia thành 2 nhóm:
Primitive data types (dữ liệu nguyên thủy), bao gồm: byte, short, int, long, float, double,
boolean, char
Non-primitive data types : String, Arrays and Classes (sẽ học sau)
1. Kiểu dữ liệu nguyên thủy
Data Type Size Description
byte 1 byte Stores whole numbers from -128 to 127
short 2 bytes Stores whole numbers from -32,768 to 32,767
int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to
9,223,372,036,854,775,807
float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal
digits
double 8 bytesStores fractional numbers. Sufficient for storing 15 decimal digits
boolean 1 bit Stores true or false values
char 2 bytes Stores a single character/letter or ASCII values
2. Java Numbers
https://www.w3schools.com/java/java_data_types_numbers.asp
Được chia thành 2 nhóm:
- Integer Types: lưu trữ số nguyên, bao gồm: byte, short, int và long
- Float point types: lưu trữ số thực, bao gồm: float, double
2.1 Byte
ví dụ:

Khóa Học Java Core - Youtube Channel ‘Hỏi Dân IT’

21

byte myNum = 100;
System.out.println(myNum);
=> lưu trữ dữ liệu từ -128 tới 127 (dùng để save memory, vì byte chiếm 1 byte)






#12. Java If...Else
https://www.w3schools.com/java/java_conditions.asp
1. If
Cú pháp:
if(<điều kiện>) {
<công_việc>
}
=> Nếu <điều_kiện> == true => <công_việc> được thực hiện
ví dụ:
int score = 3;
if (score < 4) {
System.out.println("Tạch rồi, học lại đêeeeeeee");
}
int score = 5;
if (score < 4) {
System.out.println("Tạch rồi, học lại đêeeeeeee");
}
2. If...else
if(<điều_kiện>) {
<công_việc_1>
}
else {
<công_việc_2>
}
=> nếu <điều_kiện> == true => <công_việc_1> được thực hiện. ngược lại, <công_việc_2>
được thực hiện
int score = 3;
if (score < 4) {
System.out.println("Tạch rồi, học lại đêeeeeeee");
}else {
System.out.println("Qua môn rồi mày ơiiiiii");
}











#18. Luyện tập Array và Loop
1. Các method của Array
- array.length
Array.sort
Arrays.toString(a)