/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class WordData extends Factory implements IConnect {

    private String content;

    public WordData(String type, String dataSource) {
        super(type, dataSource);
        this.content = "this is a string";
    }
    
    
    @Override
    public void readData() {
        String type = super.getType();
        if (type.substring(type.length() - 4).equals(".doc")) {
            this.content = "humpty dumpty sat on the wall";
        }
    }

    @Override
    public String writeData() {
        String res = "";
        String[] words = content.split("\\s+");
        for (String word : words) {
            res += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        return res.trim();
    }

    @Override
    public boolean makeConnection() {
        return super.getDataSource().contains("localhost:8080");
    }
    
}
