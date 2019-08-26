package lobaty.pkg20190826.base.de.datos;

import java.sql.*;

public class Lobaty20190826BaseDeDatos {

    public static void main(String[] args) throws SQLException {
        Connection conexion;
        conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/cfl401?user=programador&password=cfl401");
        Statement consultor = conexion.createStatement();
    }
}

