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


==========================================

Chapter 4: Lab 04
Thực hành sử dụng OOP (lập trình hướng đối tượng)

#21. Lập trình hướng đối tượng (OOP) là gì ?
    - OOP: Object-Oriented Programming
    - At the end of the day: chương trình/phần mềm/app là tập hợp của các khối code (block code) và máy tính thực hiện tuần tự theo yêu cầu của người dùng. Máy tính chỉ có thể "chạy từng dòng lệnh"

Có rất nhiều cách để hoàn thiện 1 chương trình:
    - procedural programming (pascal) /structure programming
    - functional programming (react hook vs react class component)
    - object oriented programming
    ...

=> Cách làm nào không quan trọng, điều quan trọng là nó giải quyết tốt vấn đề bạn gặp phải.

OOP có các lợi thế:
    - Clear Structure : cấu trúc rõ ràng
    - Reuse application code : tính tái sử dụng code cao => dễ dàng maintain (bảo trì), modify (sửa đổi) và debug (fix bug)
    - designing large and complex programs (tương tự angular) : mục tiêu giải quyết các bài toán phức tạp

Vậy OOP là gì ?
    - OOP là cách chúng ta mô phỏng thế giới thực (real world) vào chương trình (program) máy tính.

    - Tất cả các "đối tượng" tham gia vào chương trình chính là những thành phần chủ chốt.


=> OOP Thiên hướng "Mô phỏng" những điều bạn thấy (sử dụng) ở thế giới thực tế vào thế giới programing (Coding).



#22. Khái niệm Class và Object
Để mô phỏng "real world", chúng ta cần các "đối tượng" (target)
Đối với 1 sinh vật/đồ vật trong thế giới thực, điều có điều miêu tả bởi 2 thứ:

    - Đặc điểm (thuộc tính)
    - Hành vi đặc trưng của nó

Ví dụ:
Miêu tả con sư tử: (sinh vật)
    - Đặc điểm (thuộc tính):
        + Có lông
        + thuộc họ mèo
    - Hành vi:
    + đi săn mồi


Miêu tả 1 bạn sinh viên: (sinh vật)
    - Đặc điểm:
        + có mã số sinh viên
        + có địa chỉ sinh sống
        + có tên lớp học
    - Hành vi:
        + ôn tủ cho qua môn
        + ngủ nướng qua ngày
        + xem youtube lấy kiến thức qua môn

Miêu tả 1 cái máy tính (đồ vật)
    - Đặc điểm:
            + có dung lượng ổ cứng (SSD/HDD)
            + có dung lượng bộ nhớ (RAM)
    - Hành vi:
            + có thể on/off/restart

=> Sử dụng "đối tượng" để mô hình hóa.
Tuy nhiên, chúng ta không "miêu tả chi tiết", chỉ miêu tả "đối tượng tổng quát" (đây gọi là tính trừu tượng hóa/abstraction)


Ví dụ, thay vì miêu tả cụ thể sinh viên A, B, C, D ... chúng ta gọi chung là sinh viên:

Đối tượng tổng quát được gọi là Class (Lớp), còn mỗi sinh viên cụ thể gọi là Object (đối tượng).

Ví dụ:
class SinhVien gồm:
    - Thuộc tính (đặc điểm)
        + Tên
        + mã số sinh viên
    - Hành vi:
        + ăn/ngủ/nghỉ/ôn thi

=> Để có tính tái sử dụng code cao, OOP chỉ "định nghĩa" lớp tổng quát. còn muốn có chi tiết => thì chúng ta tự tạo ra

Ví dụ, để tạo ra sinh viên A thì:
    + gán Tên = A
    + gán mã số sinh viên = 1234

Tương tự, tạo ra sinh viên B thì:
    + gán Tên = B
    + gán mã số sinh = 6789




#24. Class Attributes (Thuộc tính của Class)
Attributes/Fields là các biến dùng để thể hiện giá trị cho class

=> thường được khai báo bên trong class (đầu hàm)
    - Không giới hạn số lượng thuộc tính của 1 class
    - Để truy cập/sửa đổi => sử dụng object.attribute
    - Tên thuộc tính là danh từ, và viết camelCase





#25. Class Method (Phương thức của class)
1. Định nghĩa method thông thường
Method là cách tượng trưng cho hành động của object.
Tên method thường viết theo camelCase, và là các động từ (chỉ hành động)

Cú pháp:
    <return_type> <method_name> ([parameters]) { //code}
    <kiểu_trả_về> <tên_method> ([danh_sách_tham_số]) { //code}
    
    ví dụ:
        void getName(){
            //
        }
        int getTuoi(){
            ///
        }

- Với void => return "nothing"



2. Method Overloading (Nạp chồng phương thức)
- Chúng ta có thể định nghĩa các method với tên giống nhau (nhưng khác nhau về tham số)

    void method( ){ }
    void method(int a){ }
    void method(int a, String b){ }




#26. Định nghĩa hàm tạo (constructor)
1. Constructor
Hàm tạo là một "method đặc biệt" dùng để tạo ra object
    - Constructor "phải có tên giống với class", và không thể có "return type"
    - Tất cả các class đều cần có "hàm tạo". Nếu bạn không tạo => java sẽ tự động tạo cho bạn (không có tham số đầu vào)

Ví dụ:
    public Student (String name, int age){
        this.name = name;
        this.age = age;
    }

2. Keyword this
- Dùng để "tham chiếu" tới giá trị của instance/object hiện tại (tương tự con trỏ của C :v)

//tạo mới object với hàm 





#27. Access Modifier (private/public/protected)
Link 1: 
    https://www.w3schools.com/java/java_modifiers.asp

Link 2:
    https://stackoverflow.com/questions/215497/what-is-the-difference-between-public-
    protected-package-private-and-private-in

1. Khái niệm package
package === folder

    => được sử dụng để "gom nhóm" file lại với nhau => cho gọn gàng, dễ tái sử dụng

- Keyword import:
    + được sử dụng để import (tái sử dụng lại) các class đã được định nghĩa trong các package

2. Access Modifier
Access Modifier : quyền truy cập sử dụng/sửa đổi
Trong java, có 4 thuộc tính hay dùng nhất:
- private: chỉ được sử dụng trong nội bộ class
- public : công khai hoàn toàn (100%)
- (default): là public đối với class trong cùng package. là private khi khác package

- protected: được sử dụng với lớp cha/con (tính chất kế thừa : sẽ đề cập sau)

=> public và private là 2 thuộc tính được sử dụng nhiều nhất
Mức độ che dấu tăng dần theo mũi tên:

public -> protected -> {default} -> private














====================================================    