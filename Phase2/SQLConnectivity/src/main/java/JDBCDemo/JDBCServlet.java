package JDBCDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("connect")
public class JDBCServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		Properties props=new Properties();
		InputStream in=getServletContext().getResourceAsStream("/WEB-INF/Application.properties");
		props.load(in);
		Connection conn=DBconfig.getConnection(props);
		if(conn!=null)
			out.print("Connection established...");
		else
			out.print("connection not established...");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req,resp);
	}
	

}
