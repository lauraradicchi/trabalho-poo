package cadastroresponsavel.bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory{
  private Connection con;
  public ConnectionFactory(){
    con =null;
  }
  public Connection obterConexao(){
    if(con==null){
      try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/registroresponsavel?user=root");
      }catch(ClassNotFoundException cnfe){
        System.out.println("Erro: classe não encontrada");
      }catch(SQLException sqle){
        System.out.println("Erro na conexão do banco");
      }

    }
    return con;
  }
}
