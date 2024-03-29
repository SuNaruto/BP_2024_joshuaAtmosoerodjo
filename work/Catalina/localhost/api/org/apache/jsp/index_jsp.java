/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.19
 * Generated at: 2024-03-14 02:23:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("    <img src=\"your_logo.png\" alt=\"Logo\">\n");
      out.write("\n");
      out.write("<nav>\n");
      out.write("        <a href=\"index.jsp\">Books</a>\n");
      out.write("        <a href=\"user.jsp\">Users</a>\n");
      out.write("        <a href=\"about.jsp\">About</a>\n");
      out.write("    </nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Book Overview</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"book.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("        <h1 style=\"color: #fff;\">Books Overview</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-6 text-md-end\">\n");
      out.write("        <button id=\"createBookBtn\" class=\"btn btn-success\" data-bs-toggle=\"modal\" data-bs-target=\"#createBookModal\">Create Book</button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <table class=\"table\">\n");
      out.write("        <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>ID</th>\n");
      out.write("            <th>titel</th>\n");
      out.write("            <th>auteur</th>\n");
      out.write("            <th>aantal</th>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody id=\"booksTableBody\"></tbody>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    <button class=\"btn btn-primary\" onclick=\"goToIndex()\">Back to Index</button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Edit Book Modal -->\n");
      out.write("<div class=\"modal\" id=\"editBookModal\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\">Edit Book</h5>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <!-- Book edit form -->\n");
      out.write("                <form id=\"editBookForm\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"editTitle\">Title:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"editTitle\" name=\"editTitle\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"editAuthor\">Author:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"editAuthor\" name=\"editAuthor\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Added a field for Quantity -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"editAantal\">Quantity:</label>\n");
      out.write("                        <input type=\"number\" class=\"form-control\" id=\"editAantal\" name=\"editAantal\" required>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Add a hidden input field for Book ID -->\n");
      out.write("                    <input type=\"hidden\" id=\"editBookID\">\n");
      out.write("                    <!-- Submit button -->\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" onclick=\"saveBookChanges()\">Update</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Confirmation Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"confirmationModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"confirmationModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"confirmationModalLabel\">Confirm Deletion</h5>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <p>Are you sure you want to delete this Book?</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger\" id=\"confirmDeleteBtn\">Delete</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"alertPlaceholder\"></div>\n");
      out.write("<!-- Create Book Modal -->\n");
      out.write("<div class=\"modal\" id=\"createBookModal\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\">Create Book</h5>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <!-- Book create form -->\n");
      out.write("                <form id=\"createBookForm\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"createTitle\">Title:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"createTitle\" name=\"titel\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"createAuthor\">Author:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"createAuthor\" name=\"auteur\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Removed the Genre input because it is not present in your entity -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"createAantal\">Quantity:</label>\n");
      out.write("                        <input type=\"number\" class=\"form-control\" id=\"createAantal\" name=\"aantal\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Submit button -->\n");
      out.write("                    <button type=\"button\" class=\"btn btn-success\" onclick=\"saveBook()\">Save</button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<script src=\"boek.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/mixpanel-browser@latest/dist/mixpanel.min.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function goToIndex() {\n");
      out.write("        window.location.href = 'http://localhost:8080/prod/';\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
