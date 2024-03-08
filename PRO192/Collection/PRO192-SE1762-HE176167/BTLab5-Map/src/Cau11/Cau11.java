/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau11;

/**
 *
 * @author Fpt
 */
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Set;
import javax.swing.*;

public class Cau11 {

    public static void main(String[] args) {

        // Khởi tạo HashMap với các khóa và giá trị tương ứng
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Lấy tập hợp các khóa trong HashMap
        Set<String> keySet = capitalCities.keySet();

        // Tạo một chuỗi kết quả
        String result = "";

        // Duyệt qua các khóa và thêm chúng vào chuỗi kết quả
        for (String key : keySet) {
            result += key + "\n";
        }

        // Tạo khung nhìn và hiển thị chuỗi kết quả
        JTextArea textArea = new JTextArea(result);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(250, 250));
        JOptionPane.showMessageDialog(null, scrollPane, "HashMap Keys", JOptionPane.PLAIN_MESSAGE);

    }
}