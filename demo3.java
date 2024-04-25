import java.sql.*;
class demo{
int empid;
String name;

public static void main(String rag[]){

Connection con=null;
try{
class.forName("com:msql.cj.jdbcDriver");

con=DriverManager.getConnection(jdbc:mysql://localhost:3306/mydb,"avinashmysql","root");

Statement stmt;
stmt = con.createStatement();

ResultSet rs;
rs=stmt.executeQuery("select * from emp");


while(rs.next()){
empid=rs.getInt("empid");
name = rs.getString("name");
System.out.println("empid"+empid+"name"+name);
}

rs.close();
stmt.close();
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}