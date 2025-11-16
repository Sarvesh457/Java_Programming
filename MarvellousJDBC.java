import java.sql.*;

class MarvellousJDBC
{
    public static void main(String a[])
    {
        try 
        {
            //load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //connect the driver with database
            Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA53","root","");

            // create statement class object
            Statement sobj = cobj.createStatement();

            // execute the query
            ResultSet robj = sobj.executeQuery("SELECT * FROM Students");

            // display the result
            while(robj.next())
            {
                System.out.println("Roll no:"+robj.getInt("rno"));
                System.out.println("Name: "+robj.getString("name"));
                System.out.println("City : "+robj.getString("city"));
                System.out.println("Marks"+robj.getInt("marks"));
            }

            robj.close();
            sobj.close();
            cobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured :"+eobj);
        }
    }
}