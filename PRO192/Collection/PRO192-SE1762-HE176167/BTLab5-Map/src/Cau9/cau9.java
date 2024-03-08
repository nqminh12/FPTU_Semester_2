
package Cau9;
/**
 *
 * @author Fpt
 */
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class cau9 extends JFrame {

    private Map<String, String> hashMap;
    private JTable table;

    public cau9(Map<String, String> hashMap) {
        super("HashMap Viewer");
        this.hashMap = hashMap;
        // Create table model
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Key");
        model.addColumn("Value");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            model.addRow(new Object[] { entry.getKey(), entry.getValue() });
        }

        // Create table with model
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Add table to frame
        JPanel panel = new JPanel();
        panel.add(scrollPane);
        add(panel);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("England", "London");
        hashMap.put("Germany", "Berlin");
        hashMap.put("Norway", "Oslo");
        hashMap.put("USA", "Washington DC");

        // Create the viewer
        new cau9(hashMap);
    }
}