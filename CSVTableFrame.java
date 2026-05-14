import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVToJTable extends JFrame {

    private JTable table;
    private DefaultTableModel model;

    public CSVToJTable() {
        setTitle("CSV Data in JTable");
        setSize(700, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Column names
        String[] columns = {"FIRST_NAME", "LAST_NAME", "ADDRESS", "CONTACT_NUMBER", "SEMESTER"};

        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        loadCSV("data.csv"); // <-- your CSV file name
    }

    private void loadCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header line
            br.readLine();

            while ((line = br.readLine()) != null) {

                // Split only first 4 commas safely
                String[] parts = line.split(",", 5);

                if (parts.length == 5) {
                    model.addRow(new Object[]{
                            parts[0].trim(),
                            parts[1].trim(),
                            parts[2].trim(),
                            parts[3].trim(),
                            parts[4].trim()
                    });
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CSVToJTable().setVisible(true);
        });
    }
}