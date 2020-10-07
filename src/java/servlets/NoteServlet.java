/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import domain.Note;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author 672387
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getAttribute("title")==null&&req.getAttribute("content")==null){
        
        String path= getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        int c;
        String text="";
        String text2[];
        String title;
        String content;
        while((c=br.read())!=-1){
            text=text+(char)c;
        }
        
        text2=text.split("\n");
        title=text2[0];
        content=text2[1];
        
        Note note=new Note(title,content);
        req.setAttribute("note", note);
        }
        
        String pageType= req.getQueryString();
        
        if(pageType==null||pageType.equals("")){
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(req, resp);
        }
        else if(pageType.equals("edit")){
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(req, resp); 
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        Note note= new Note(title, content);
        request.setAttribute("note", note);

        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);   
    }
   
}
