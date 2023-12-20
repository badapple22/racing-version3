package Racing3.DBModel;

import java.sql.*;

import java.util.*;

public class ScoreDao {
    List<ScoreModel> scores = new ArrayList<ScoreModel>();
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://mysqldb.cfndvi40fq6b.ap-northeast-2.rds.amazonaws.com/game";
    private String id = "junyeong";
    private String passwd = "deargod205";

    private Connection conn;
    private Statement stmt;

    void setConnecction(){
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, id, passwd);
            stmt = conn.createStatement();

            //table 생성
        } 
        catch( ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }

        
    }

    void getScores(){
        try{
            String getData = "select * from score";
            ResultSet result = stmt.executeQuery(getData);

            while(result.next()){
                String name = result.getString("name");
                int score = result.getInt("score");
                ScoreModel dto = new ScoreModel(score, name);
                scores.add(dto);
            }
            result.close();
        } catch( SQLException e){
            e.printStackTrace();
        }
    }

    void stopConnection(){
        try{
            stmt.close();
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    void insertScore(int score, String name){
        String insert = " insert into score (score, name) values (%d, \'%s\')".formatted(score, name);
        try {
            stmt.execute(insert);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    ScoreDao(){
        setConnecction();
    }
}
