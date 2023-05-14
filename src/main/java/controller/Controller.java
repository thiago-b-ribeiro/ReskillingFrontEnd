package controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DAO;
import model.Table01;

@WebServlet(urlPatterns = {"/index", "/inserir", "/main", "/selecionar", "/editar", "/excluir"})
public class Controller extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	Table01 table01 = new Table01();
	
    public Controller() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		
		if(action.equals("/index")) {
			response.sendRedirect("index.html");
		} else if(action.equals("/inserir")) {
			inserir(request, response);
		} else if(action.equals("/main")) {
			listar(request, response);
		} else if(action.equals("/selecionar")) {
			selecionar(request, response);
		} else if(action.equals("/editar")) {
			editar(request, response);
		} else if(action.equals("/excluir")) {
			excluir(request, response);
		}
		
	}
	
	protected void inserir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		table01.setCampo02(request.getParameter("campo02"));
		table01.setCampo03(request.getParameter("campo03"));
		table01.setRadioButton(request.getParameter("opcaoRadioButton"));
		table01.setComboBox(request.getParameter("opcaoComboBox"));
		/* TODO: Pesquisar forma de armazenas valores do checkbox. */
		table01.setTextArea(request.getParameter("textArea"));
		
		dao.inserir(table01);
		
		response.sendRedirect("index");
	}
	
	protected void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Table01> lista = dao.listar();
		request.setAttribute("lista", lista);
		RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
		rd.forward(request, response);
	}
	
	protected void selecionar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int campo01 = Integer.parseInt(request.getParameter("campo01"));
		
		table01.setCampo01(campo01);
		
		dao.selecionar(table01);
		
		request.setAttribute("campo01", table01.getCampo01());
		request.setAttribute("campo02", table01.getCampo02());
		request.setAttribute("campo03", table01.getCampo03());
		/* TODO: Pesquisar como marcar elemento radioButton de acordo com a string recebida */
		/* TODO: Pesquisar como selecionar a opção do elemento comboBox de acordo com a string recebida */
		/* TODO: Pesquisar como marcar elemento checkBox de acordo com a string recebida */
		request.setAttribute("textArea", table01.getTextArea());
		
		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);
	}
	
	protected void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		table01.setCampo02(request.getParameter("campo02"));
		table01.setCampo03(request.getParameter("campo03"));
		table01.setRadioButton(request.getParameter("opcaoRadioButton"));
		table01.setComboBox(request.getParameter("opcaoComboBox"));
		/* TODO: Implementar a gravação de checkBox. */
		table01.setTextArea(request.getParameter("textArea"));
		
		dao.editar(table01);
		
		response.sendRedirect("main");
	}
	
	protected void excluir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		table01.setCampo01(Integer.parseInt(request.getParameter("campo01")));
		
		dao.excluir(table01);
		
		response.sendRedirect("main");
	}

}









