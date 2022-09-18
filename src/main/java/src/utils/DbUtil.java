package src.utils;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class DbUtil {
    private static Properties proFile = new Properties();

    static {
        try {
            proFile.load(new FileInputStream("/Users/nonoro/project/apitest/src/main/resources/dbInfo.properties"));

            Class.forName(proFile.getProperty("driverName"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Properties getProFile() {
        return proFile;
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                proFile.getProperty("url"),
                proFile.getProperty("userName"),
                proFile.getProperty("userPass")
        );
    }

    public static void close(Connection con, Statement st, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection con, PreparedStatement ps) {
        try {
            if (con != null) {
                con.close();
            }

            if (ps != null) {
                ps.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}