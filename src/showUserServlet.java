import codegym.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "showUserServlet", urlPatterns = "/show-list")
public class showUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer("Huy", "1-1-1111", "Ha Noi");
        Customer customer2 = new Customer("Duc", "2-2-2222", "Ha Noi");
        Customer customer3 = new Customer("Duong", "3-3-3333", "Ha Noi");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        request.setAttribute("list", customerList);
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
