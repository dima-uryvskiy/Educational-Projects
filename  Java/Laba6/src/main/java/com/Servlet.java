package com;

import org.apache.commons.io.FileUtils;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ServletContext selvletContext = getServletContext();

        String name = req.getParameter("image");

        if (name != null) {
            String path = "/Users/dima/Desktop/Java LabWorks/LabWork5-6/images";
            File image = new File(path);
            File folder = new File(path);

            for (File file: folder.listFiles()) {
                if (file.getName().equals(name + ".jpeg") || file.getName().equals(name + ".jpg") || file.getName().equals(name + ".png")) {
                    image = new File(path + "/" +  file.getName());
                    break;
                }
                else {
                    image = null;
                }
            }

            if (image != null) {
                byte[]fileContent = FileUtils.readFileToByteArray(image);
                String encodedString = Base64.getEncoder().encodeToString(fileContent);
                selvletContext.setAttribute("byteString", encodedString);
            }
            else {
                selvletContext.setAttribute("error", "Ищображение не найдено");
            }

            getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}
