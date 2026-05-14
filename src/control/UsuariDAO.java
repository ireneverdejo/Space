package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuariDAO {

    public void guardarPartida(String nom, int puntuacio, int temps) {

        String sql = "INSERT INTO usuaris (nom, puntuacio, temps_joc) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nom);
            ps.setInt(2, puntuacio);
            ps.setInt(3, temps);

            ps.executeUpdate();

            System.out.println("✔ Partida guardada correctament");

        } catch (SQLException e) {
            System.out.println("❌ Error guardant partida:");
            e.printStackTrace();
        }
    }
}
public List<String[]> obtenirRanking() {

    List<String[]> ranking = new ArrayList<>();

    String sql = "SELECT nom, puntuacio, temps_joc FROM usuaris ORDER BY puntuacio DESC";

    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {

            String nom = rs.getString("nom");
            String punts = String.valueOf(rs.getInt("puntuacio"));
            String temps = String.valueOf(rs.getInt("temps_joc"));

            ranking.add(new String[]{nom, punts, temps});
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return ranking;
}