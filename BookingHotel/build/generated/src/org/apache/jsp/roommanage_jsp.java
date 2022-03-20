package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.Room;
import Dal.roomDBContext;

public final class roommanage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    roomDBContext room = new roomDBContext();
    ArrayList<Room> list = room.loadProduct();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../assets/img/apple-icon.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicon.ico\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <title>Booking Hotel</title>\n");
      out.write("        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("        <!--     Fonts and icons     -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" />\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/light-bootstrap-dashboard.css?v=2.0.0 \" rel=\"stylesheet\" />\n");
      out.write("        <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("        <link href=\"assets/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"sidebar\" data-image=\"assets/img/sidebar-5.jpg\">\n");
      out.write("                <div class=\"sidebar-wrapper\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <a href=\"user.html\" class=\"simple-text\">\n");
      out.write("                            Booking management\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"nav\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"./roommanage.jsp\">\n");
      out.write("                                <i class=\"nc-icon nc-notes\"></i>\n");
      out.write("                                <p>Room</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"nav-link\" href=\"./customermanagement.jsp\">\n");
      out.write("                                <i class=\"nc-icon nc-paper-2\"></i>\n");
      out.write("                                <p>Customer</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"nav-link\" href=\"./ordermanagement.jsp\">\n");
      out.write("                                <i class=\"nc-icon nc-atom\"></i>\n");
      out.write("                                <p>Order</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-panel\">\n");
      out.write("\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"card strpied-tabled-with-hover\">\n");
      out.write("                                    <div class=\"card-header \">\n");
      out.write("                                        <h4 class=\"card-title\">Room</h4>\n");
      out.write("                                        <button class=\"btn btn-info btn-fill pull-right\"><a href=\"addnewroom.jsp\" style=\"color: white\">Add new</a></button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body table-full-width table-responsive\">\n");
      out.write("                                        <table class=\"table table-hover table-striped\">\n");
      out.write("                                            <thead>\n");
      out.write("                                            <th>Room ID</th>\n");
      out.write("                                            <th>Room Name</th>\n");
      out.write("                                            <th>Image</th>\n");
      out.write("                                            <th>Price</th>\n");
      out.write("                                            <th>Status</th>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");

                                                    for (int i = 0; i < list.size(); i++) {
                                                        String status = list.get(i).getStatus() != 0 ? "Active"
                                                                : "Unactive";
                                                
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>");
      out.print(list.get(i).getRoomId());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(list.get(i).getRoomName());
      out.write("</td>\n");
      out.write("                                                    <td><img src=\"image/");
      out.print(room.getImage(list.get(i).getRoomId()));
      out.write(".jpg\" alt=\"\" height=\"100px\" width=\"100px\"></td>\n");
      out.write("                                                    <td>");
      out.print(list.get(i).getPrice());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(status);
      out.write("</td>\n");
      out.write("                                                    ");

                                                        if (list.get(i).getStatus() == 2) {

                                                    
      out.write("\n");
      out.write("                                                    <td><button type=\"submit\" class=\"btn btn-info btn-fill pull-right\"><a href=\"activeRoom.jsp?roomID=");
      out.print(list.get(i).getRoomId());
      out.write("\" style=\"color: white\">Block room</a></button></td>\n");
      out.write("                                                    ");
} else if (list.get(i).getStatus() == 1) {

                                                    
      out.write("\n");
      out.write("                                                    <td><button type=\"submit\" class=\"btn btn-info btn-fill pull-right\"><a href=\"unActiveRoom.jsp?roomID=");
      out.print(list.get(i).getRoomId());
      out.write("\" style=\"color: white\">Block room</a></button></td>\n");
      out.write("                                                    ");
}
      out.write("\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"assets/js/core/jquery.3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/js/core/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/js/core/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!--  Plugin for Switches, full documentation here: http://www.jque.re/plugins/version3/bootstrap.switch/ -->\n");
      out.write("    <script src=\"assets/js/plugins/bootstrap-switch.js\"></script>\n");
      out.write("    <!--  Google Maps Plugin    -->\n");
      out.write("    <script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("    <!--  Chartist Plugin  -->\n");
      out.write("    <script src=\"assets/js/plugins/chartist.min.js\"></script>\n");
      out.write("    <!--  Notifications Plugin    -->\n");
      out.write("    <script src=\"assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("    <!-- Control Center for Light Bootstrap Dashboard: scripts for the example pages etc -->\n");
      out.write("    <script src=\"assets/js/light-bootstrap-dashboard.js?v=2.0.0 \" type=\"text/javascript\"></script>\n");
      out.write("    <!-- Light Bootstrap Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("    <script src=\"assets/js/demo.js\"></script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
