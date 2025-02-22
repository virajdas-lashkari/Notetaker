package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public SaveNoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// Fetch Title And Content...
			
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			Note note = new Note(title, content.getBytes(), new Date());
//			System.out.println(note.getId() + " : " + note.getTitle());
			
			// Hibernate : Save()
			
			Session session = FactoryProvider.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			
			session.save(note);
			
			transaction.commit();			
			session.close();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<H1 style='text-align:center;'> ! Note is Added Successfully...</H1> ");
			out.println(" <div style='text-align:center;'> <button><a href='all_notes.jsp'>View All Notes.</a></button> <button><a href='/NoteTaker/add_notes.jsp'>Back</a></button> </div>");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
