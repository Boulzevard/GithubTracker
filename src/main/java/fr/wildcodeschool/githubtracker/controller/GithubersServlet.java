package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GithubersServlet", urlPatterns = "/githubers")
public class GithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Githuber> list = new ArrayList<Githuber>();
        list.add(new Githuber("Bobby", "bobby@gmail.com", "bob", "4", "github/bobby"));
        list.add(new Githuber("Mike", "mike@gmail.com", "miky", "4", "github/mike"));
        list.add(new Githuber("Johny", "johny@gmail.com", "john", "4", "github/johny"));
        list.add(new Githuber("Phillipe", "Phillipe@gmail.com", "phillou", "4", "github/Phillipe"));
        list.add(new Githuber("toto", "toto@gmail.com", "thomas", "4", "github/toto"));

        request.setAttribute("maListe", list);
        this.getServletContext().getRequestDispatcher("/githubers.jsp").forward(request, response);
    }
}
