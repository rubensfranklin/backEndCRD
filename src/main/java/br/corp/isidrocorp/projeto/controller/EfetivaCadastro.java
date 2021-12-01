package br.corp.isidrocorp.projeto.controller;

import java.io.IOException;

import javax.activation.DataSource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.corp.isidrocorp.projeto.dao.ContaDao;

/**
 * Servlet implementation class EfetivaCadastro
 */
@WebServlet("/efetivacadastro")
public class EfetivaCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EfetivaCadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("Txtnome");
		String telefone = request.getParameter("Txttelefone");
		String cpf = request.getParameter("Txtcpf");
		String email = request.getParameter("Txemail");
		
		
		
		
		
		
		
	}

}
