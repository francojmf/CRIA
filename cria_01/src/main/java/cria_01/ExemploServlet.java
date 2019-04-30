package cria_01;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet(urlPatterns={"/projeto_cria"})
public class ExemploServlet extends HttpServlet{
	@Override
	public void doGet(	HttpServletRequest req,
						HttpServletResponse res){
		try{
			PrintWriter pw = res.getWriter();
			pw.write("Build CRIA com Gradle Funcionando !!");
			pw.close();
		} catch(Exception e){
			System.out.println("Erro em IO ou Servlet !");
		}
	}	
}
