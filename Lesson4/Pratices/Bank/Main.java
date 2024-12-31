package Lesson4.Pratices.Bank;

import java.util.ArrayList;

import Lesson4.Lab4.Product;

public class Main {
    public static void main(String[] args) {

        // ====================== Tạo đối tượng BankAccount =====================
        // Tạo đối tượng BankAccount
        BankAccount bankAccount = new BankAccount("100224124", "Xoan Dev",
                900.000000);

        // Hiển thị thông tin tài khoản
        bankAccount.displayAccountInfo();

        // Nạp tiền
        bankAccount.deposit(10.000);

        // Rút tiền
        bankAccount.withdraw(10.000);

        // Thử rút số tiền vượt quá số dư
        bankAccount.withdraw(900.0000001);

    }

}
