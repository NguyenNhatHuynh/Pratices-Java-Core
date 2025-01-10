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





Chapter 5: Lab 05
Java ArrayList

#31. Non-primitive(reference) data type
    1. Primitive type (Kiểu dữ liệu nguyên thủy)
    https://www.w3schools.com/java/java_data_types.asp
    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

    Bao gồm: (8 loại)
    byte, short, int, long (số nguyên)
    float, double (số thực/số thập phân)
    char (kí tự)
    boolean

    Thực tế, kiểu dữ liệu String không là kiểu dữ liệu nguyên thủy. cơ mà chúng ta hay dùng nó như là dữ liệu nguyên thủy =))

    String (chuỗi)

    2. Non-Primitive type (reference data type)
    https://stackoverflow.com/questions/29284402/why-do-reference-data-types-point

    Kiểu dữ liệu "không nguyên thủy" (kiểu dữ liệu tham chiếu) là các kiểu dữ liệu do "lập trình viên" định nghĩa ra, bao gồm:
    Class, Interface, Array (gọi chung là Object)

    => Non-Primitive type "viết hoa chữ cái đầu tiên"





#32. Java Autoboxing/Unboxing (Object wrapper class)
Java là OOP (lập trình hướng đối tượng), và đa phần các công cụ hỗ trợ "Object" và không hỗ trợ primitive type
    
    ví dụ: Generic (từ java v5) không hỗ trợ "kiểu dữ liệu nguyên thủy" (hiểu đơn giản là đảm
    bảo hiệu năng cao)

    https://stackoverflow.com/questions/2721546/why-dont-java-generics-support-
    primitive-types

    => cần có 1 giải pháp để convert "primitive type" => "non-primitive-type"

    => object wrapper class ra đời.
    boolean, byte, short, char, int, long, float, double

    => được convert thành:
    Boolean, Byte, Short, Character, Integer, Long, Float, Double

    Tạo wrapper class:
    Integer object = new Integer(1); //lưu ý là có keyword new (sẽ học trong chapter sau)

    => convert ngược lại: int val = object.intValue();

1. Auto boxing và unboxing
    "Boxing": convert từ primitive value (giá trị nguyên thủy) => chuyển thành object(wrapper class)

    "unboxing": là quá trình ngược lại, từ object => giá trị nguyên thủy

    => Công việc Boxing/Unboxing do compiler "tự động làm"
    (nên gọi là autoboxing/unboxing :v)

    Ví dụ:
    https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html




#33. ArrayList là gì ?
Tài liệu: https://www.w3schools.com/java/java_arraylist.asp
Bên cạnh kiểu dữ liệu String, Array là một trong các kiểu dữ liệu được sử dụng nhiều nhất trong lập trình.

Ví dụ về array:
    int [ ] myArray = { 1, 2, 9, 6, 10};

Tuy nhiên, nếu sử dụng Array thuần túy, đang tồn tại các nhược điểm sau:

    - Số lượng phần tử của Array là cố định (không thể thêm/xóa bớt phần tử)
    ở ví dụ trên, myArray có length = 5
    - Nếu khai báo Array có nhiều phần tử, mà không dùng hết slot => lãng phí bộ nhớ
    => ArrayList ra đời để khắc phục nhược điểm trên (flexible: thêm/xóa phần tử...)

1. Định nghĩa
- Không khai báo type (hạn chế sử dụng):
    ArrayList a = new ArrayList();
    a.add("Hỏi Dân IT") ; //String
    a.add(26); //int => autoboxing, compiler tự động convert từ int sang Integer

    Integer x = (Integer) a.get(1); //cần ép kiểu


- Khai báo type cụ thể:
    ArrayList<String> b = new ArrayList<String>();
    b.add("Xoan Dev")
    b.add("Youtube")
    String name = b.get(1); //không cần ép kiểu

2. Các method hay dùng
    add : thêm phần tử vào cuối
    remove: xóa
    clear: xóa tất cả
    get: truy xuất phần tử tại vị trí




====================================================    
Chapter 5: 

#33. ArrayList là gì ?
Tài liệu: https://www.w3schools.com/java/java_arraylist.asp
Bên cạnh kiểu dữ liệu String, Array là một trong các kiểu dữ liệu được sử dụng nhiều
nhất trong lập trình.

Ví dụ về array:
    int [ ] myArray = { 1, 2, 9, 6, 10};

Tuy nhiên, nếu sử dụng Array thuần túy, đang tồn tại các nhược điểm sau:

    - Số lượng phần tử của Array là cố định (không thể thêm/xóa bớt phần tử)
    ở ví dụ trên, myArray có length = 5
    - Nếu khai báo Array có nhiều phần tử, mà không dùng hết slot => lãng phí bộ nhớ

    => ArrayList ra đời để khắc phục nhược điểm trên (flexible: thêm/xóa phần tử...)

1. Định nghĩa
- Không khai báo type (hạn chế sử dụng):
    ArrayList a = new ArrayList();
    a.add("Xoan Dev") ; //String
    a.add(26); //int => autoboxing, compiler tự động convert từ int sang Integer
    Integer x = (Integer) a.get(1); //cần ép kiểu

- Khai báo type cụ thể:
    ArrayList<String> b = new ArrayList<String>();
    b.add("Xoan Dev")
    b.add("Youtube")
    String name = b.get(1); //không cần ép kiểu


2. Các method hay dùng
    add : thêm phần tử vào cuối
    remove: xóa
    clear: xóa tất cả
    get: truy xuất phần tử tại vị trí

-------------------------
Generic 

Trong Java, Generic là một tính năng cho phép bạn viết mã mà có thể làm việc với nhiều kiểu dữ liệu khác nhau mà không cần phải xác định kiểu dữ liệu cụ thể khi viết mã.

Đơn giản nhất, Generic giống như một "hộp chứa" mà bạn có thể bỏ vào bất kỳ loại dữ liệu nào bạn muốn, và Java sẽ giúp bạn kiểm soát kiểu dữ liệu bên trong hộp đó để tránh lỗi.



Lý do sử dụng Generic:

- Tính linh hoạt: Bạn có thể tái sử dụng mã mà không phải viết lại cho từng kiểu dữ liệu.

- Kiểm tra kiểu dữ liệu tại biên dịch: Java sẽ kiểm tra kiểu dữ liệu khi biên dịch thay vì khi chạy chương trình, giúp phát hiện lỗi sớm.

- Giảm thiểu ép kiểu (casting): Bạn không cần phải ép kiểu khi lấy giá trị từ Generic, điều này giúp mã dễ đọc và tránh lỗi.


#34. Java Generics (Basic)
Tài liệu:
https://docs.oracle.com/javase/tutorial/java/generics/index.html

Lưu ý: Generic là 1 topic rộng, video này chỉ là cơ bản (type parameters). phần còn lại có thể tham khảo ở link trên, và học thông qua thực hành project.

1. Generic là gì ?

Có bao giờ bạn thắc mắc:
    ArrayList<Integer> a = ... // <Integer> là cú pháp generic
    ArrayList<String> b = ... // <String> là cú pháp generic

Generic là cú pháp được giới thiệu vào v5 của Java, giúp "cải thiện chất lượng" của code.

The following code snippet without generics requires casting:

    List list = new ArrayList();
    list.add("hello");
    String s = (String) list.get(0);

When re-written to use generics, the code does not require casting:
    List<String> list = new ArrayList<String>();
    list.add("hello");
    String s = list.get(0); // no cast

2. Tại sao cần Generic
    - Generic giúp "báo lỗi" khi "dịch code " (code gồm 2 giai đoạn: compile then run)
    - Generic giúp tái sử dụng code (ví dụ như viết các hàm, class tổng quát)

https://docs.oracle.com/javase/tutorial/java/generics/types.html

3. Java Diamond
được giới thiệu từ Java v7, khi sử dụng constructor với generic, không bắt buộc phải truyền type (vì compiler sẽ tự đống gán/đoán type)

Ví dụ: Box<Integer> box = new Box<>( );

//thay vì: Box<Integer> box = new Box<Integer>( );


-------------
ArrayList trong Java là một danh sách động được sử dụng để lưu trữ các phần tử (giống như một mảng) nhưng có khả năng tự động thay đổi kích thước.

Điểm khác biệt với mảng thông thường:
    - Mảng (Array) có kích thước cố định. Khi bạn tạo một mảng, bạn phải chỉ định số lượng phần tử mà nó có thể chứa, và kích thước này không thể thay đổi.
    - ArrayList thì linh hoạt hơn. Bạn có thể thêm, xóa phần tử và nó sẽ tự động thay đổi kích thước để phù hợp.

Ví dụ dễ hiểu:
Hãy tưởng tượng bạn có một chiếc hộp để đựng bóng.

    - Mảng: Là một chiếc hộp có số ngăn cố định, ví dụ, 5 ngăn. Nếu bạn cần thêm bóng nhưng hộp đầy, bạn phải lấy một chiếc hộp mới và di chuyển tất cả các bóng qua.
    - ArrayList: Là một chiếc hộp co giãn, bạn có thể thêm hoặc bớt bóng mà không cần lo lắng về kích thước. Nếu không đủ chỗ, chiếc hộp sẽ tự mở rộng.

-------------


Chapter 6: Lab 06
Java String
#37. String (Chuỗi)
Why String ?
String là loại dữ liệu được dùng nhiều nhất trong ngôn ngữ lập trình.

1. String data type
    - String được dùng để lưu trữ "chuỗi ký tự".
    Nếu như char là lưu trữ "ký tự đơn lẻ", String dùng để lưu trữ nhiều ký tự (chuỗi)
    Với java, String (chữ S viết hoa) là một "Class" được xây dựng sẵn (non-primitive data
    type)

    Ví dụ: String a = "Hello World";

    Một vài ký tự đặc biệt:
    https://www.w3schools.com/java/java_strings_specchars.asp
    \t : ký tự tab
    \r : Về đầu dòng
    \n : xuống dòng
    \\ : \
    \" : " (in ra dấu nháy đôi)

2. Các method thường dùng
String là Object (Class), nên nó sẽ có các method được xây dựng sẵn:
    length() : lấy độ dài của chuỗi
    trim() : bỏ đi dấu space đầu/cuối của chuỗi
    toLowerCase() : viết thường tất cả ký tự
    toUpperCase(): viết hoa tất cả ký tự
    substring(): cắt chuối thành chuỗi con



============================================
Chapter 7: Lab 07
Java Inheritance (Subclass and Superclass)

#41. Java Inheritance
    Tài liệu: https://www.w3schools.com/java/java_inheritance.asp
    Với Java, chúng ta có thể "kế thừa/thừa hưởng" (inherit) thuộc tính và phương
    thức (attribute & method) từ 1 class khác.

Kế thừa được phân cấp thành:
    - subclass (child) : đứa con, sẽ kế thừa/thừa hưởng lại "thành quả" của class khác
    - superclass (parent): cha mẹ, sẽ cho đi "tài sản" để class khác kế thừa lại.

1. Nguyên tắc kế thừa
    - 1 class chỉ có thể kế thừa "duy nhất" 01 class khác (đơn kế thừa)
    (nếu muốn kế thừa nhiều, sử dụng interface - sẽ học sau)
    - Để kế thừa, sử dụng keyword "extends"

Cú pháp: Subclass extends SuperClass { ... }
Ví dụ:
    class Vehicle {
    protected String brand = "Ford"; // Vehicle attribute
    public void honk() { // Vehicle method
    System.out.println("Tuut, tuut!");
      }
    }

class Car extends Vehicle {
    private String modelName = "Mustang"; // Car attribute
    public static void main(String[] args) {
    // Create a myCar object
    Car myCar = new Car();
    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();
    // Display the value of the brand attribute (from the Vehicle class) and the value of the
    modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
    }
}//Lưu ý về keyword "Protected"




2. Mục đích của kế thừa
Mục đích của thừa kế là "tái sử dụng" code.
(không cần lặp lại code, tăng tính reuse, đồng thời phản ánh "thực tế vào code")

- Lớp con (childClass) có thể sử dụng thuộc tính và phương thức của lớp cha (superClass)

=> lưu ý về access modifier (chỉ kế thừa public/protected, không kế thừa private)

- Lớp con "không kế thừa" hàm tạo của lớp cha



=====
#43. Abstract Class (Basic)
Tài liệu:
https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
Đôi khi, chúng ta muốn có sự ràng buộc chặt chẽ giữa 'cha/con', ví dụ: tất cả con kế
thừa, cần phải có 1 phương thức
ví dụ:
sinhVienIT => method TinhDiem()
sinhVienCoKhi => method TinhDiem()
=> abstract là cách chúng ta định nghĩa lớp trừu tượng



=======================
#49. Java Package
1. Package là gì ?
Hiểu đơn giản, package === folder => nơi chứa code
    - Package được tạo nên bởi tập hợp: class/interface
    - Package có thể chứa sub-package (cha/con)
2. Truy cập package
    - Các class mà dự định sẽ được sử dụng ngoài package => định danh public
    (private/default/protected/public)
    - Các package khác nhau có thể khai báo các class "trùng tên"
3. Sử dụng packages
    Cú pháp:
    import package_name.class_name;
    ví dụ:
    import java.util.Scanner;
    package: java, sub-package: util , class: Scanner
    import java.util.* ;
    => import tất cả class có trong package java/util

