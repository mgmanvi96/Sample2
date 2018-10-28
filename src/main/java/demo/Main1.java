package demo;
import java.io.IOException;



import javax.servlet.ServletException;

import javax.servlet.ServletOutputStream;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

 

/**

* Servlet implementation class Main1

*/

@WebServlet("/main2")

public class Main1 extends HttpServlet {

                private static final long serialVersionUID = 1L;

 

  //Comment

               

                protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

                                ServletOutputStream sos=response.getOutputStream();

                                double radius= Double.parseDouble(request.getParameter("rad"));

                               

                                String s1=request.getParameter("p1"); //Perimeter

                                String s2=request.getParameter("a1"); //Area

                                String s3=request.getParameter("e1"); //Exit

                               

                                if(s1!=null)

                                {

                                                sos.println("You clicked perimeter button");

                                                sos.println("<h2>Perimeter is:" + 2*Math.PI*radius+"</h2>");

                                }

                                else if(s2!=null)

                                {

                                                sos.println("You clicked area button");

                                                sos.println("<h2>Area is:" + Math.PI*radius*radius +"</h2>");

                                }

                                else if(s3!=null)

                                {

                                                sos.println("You clicked diameter button");

                                                sos.println("<h2>Diameter is:" +2*radius +"</h2>");

                                }

                               

                }

 

}
