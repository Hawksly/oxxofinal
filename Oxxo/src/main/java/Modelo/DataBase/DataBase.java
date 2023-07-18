package Modelo.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
    private Connection conn = null;
    private Statement st = null;
    private ResultSet rt = null;
    private String url = "";
    private String username = "";
    private String password = "";

    public DataBase() {
    }

    public Connection getConn(String url, String username, String password) throws SQLException {
        conn=DriverManager.getConnection(getUrl(), getUsername(), getPassword());
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }

    public ResultSet getRt() {
        return rt;
    }

    public void setRt(ResultSet rt) {
        this.rt = rt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
}
