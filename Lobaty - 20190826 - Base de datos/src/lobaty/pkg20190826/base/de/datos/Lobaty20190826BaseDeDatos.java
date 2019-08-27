package lobaty.pkg20190826.base.de.datos;

import java.sql.*;

public class Lobaty20190826BaseDeDatos {

    public static void main(String[] args) throws SQLException {
        Connection conexion;
        conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/cfl401?user=programador&password=cfl401");
        Statement consultor = conexion.createStatement();
        ResultSet resultado = consultor.executeQuery("SELECT * FROM datosPersonales WHERE edad<50 ORDER BY edad DESC;");
        while (resultado.next()) {
            System.out.println(resultado.getInt("id"));
            System.out.println(resultado.getString("apellido"));
            System.out.println(resultado.getString("nombre"));
            System.out.println(resultado.getString("fechaNac"));
            System.out.println(resultado.getString("fechaFall"));
        }
        conexion.close();
    }
}




