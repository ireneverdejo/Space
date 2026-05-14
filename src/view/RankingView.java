package view;

import control.UsuariDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class RankingView extends JFrame {

    private JTable table;
    private DefaultTableModel model;

    public RankingView() {

        setTitle("Ranking Global");
        setSize(500, 400);
        setLocationRelativeTo(null);

        model = new DefaultTableModel();
        model.addColumn("Nom");
        model.addColumn("Puntuació");
        model.addColumn("Temps");

        table = new JTable(model);

        JScrollPane scroll = new JScrollPane(table);

        add(scroll, BorderLayout.CENTER);

        carregarDades();

        setVisible(true);
    }

    private void carregarDades() {

        UsuariDAO dao = new UsuariDAO();
        List<String[]> dades = dao.obtenirRanking();

        for (String[] fila : dades) {
            model.addRow(fila);
        }
    }
}