/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-05-02 07:51:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexGoods_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <link href=\"/css/index.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/css/indexGoods.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/axios/0.18.0/axios.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"big-box\">\r\n");
      out.write("<div class=\"left-box\">\r\n");
      out.write("    <div class=\"customer-box\">\r\n");
      out.write("        <p class=\"identity\">(管理员)</p>\r\n");
      out.write("        <a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",欢迎你</a><br>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"list-box\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li class=\"li\"><a href=\"#\">首页</a></li>\r\n");
      out.write("            <li class=\"li\"><a href=\"#\">个人信息</a></li>\r\n");
      out.write("            <li class=\"li\"><a href=\"#\">顾客信息</a></li>\r\n");
      out.write("            <li class=\"li\"><a href=\"#\">预定信息</a></li>\r\n");
      out.write("            <li class=\"li\"><a href=\"/indexProperty.jsp\">财务统计</a></li>\r\n");
      out.write("            <li class=\"li\"><a href=\"/indexGoods.jsp\">商品采购</a></li>\r\n");
      out.write("            <li class=\"li\"><a href=\"#\">退出登录</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"width: 87.5%; height: 751px;\" class=\"border\">\r\n");
      out.write("    <table border=\"1px\" cellspacing=\"0\" width=\"90%\" id=\"ListAll\" style=\"position: relative\">\r\n");
      out.write("        <h2 id=\"text1\" style=\"width: 90.4%; height: 50px; background-color: #233645; margin: 5px auto; line-height: 50px; margin-top: 70px; color: aliceblue;\">&nbsp;&nbsp;&nbsp; 日&nbsp;用&nbsp;品&nbsp;采&nbsp;购</h2>\r\n");
      out.write("        <div id=\"text2\" style=\"width: 90%; height: 430px; border: 2px solid #ccc; margin: auto; margin-bottom: 50px;\">\r\n");
      out.write("            <div style=\"font-weight: 800; color: black;  font-size: 22px; margin-left: 135px; padding-top: 100px; float: left; \">\r\n");
      out.write("                商&nbsp;品&nbsp;名&nbsp;称&nbsp;: &nbsp;&nbsp;\r\n");
      out.write("                <input class=\"input1\" type=\"text\" style=\"width: 150px; height: 20px;\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"font-weight: 800; color: black; font-size: 22px; margin-left: 780px; padding-top: 100px;  \">\r\n");
      out.write("                商&nbsp;品&nbsp;数&nbsp;量&nbsp;: &nbsp;&nbsp;\r\n");
      out.write("                <input class=\"input2\" type=\"number\" style=\"width: 150px; height: 20px;\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"font-weight: 800; color: black; font-size: 22px; margin-left: 135px; padding-top: 100px; float: left;\">\r\n");
      out.write("                商&nbsp;品&nbsp;价&nbsp;格&nbsp;: &nbsp;&nbsp;\r\n");
      out.write("                <input class=\"input3\" type=\"number\" style=\"width: 150px; height: 20px;\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"font-weight: 800; color: black; font-size: 22px; margin-left: 780px; padding-top: 100px; \">\r\n");
      out.write("                商&nbsp;品&nbsp;图&nbsp;片&nbsp;: &nbsp;&nbsp;\r\n");
      out.write("                <input class=\"input4\" type=\"file\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <button class=\"btn1\" style=\"width: 100px; border: none; margin-left: 45px; margin-top: 60px; background-color: #ea5e5e; color: aliceblue; font-size: 18px;\">取消</button>\r\n");
      out.write("            <button class=\"btn2\" style=\"width: 100px; border: none; margin-left: 50px; margin-top: 60px; background-color: #ea5e5e; color: aliceblue; font-size: 18px;\" class=\"yes\">确定</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <a id=\"text3\" href=\"/goods.jsp\"><button class=\"revise\" style=\"width: 200px; height:50px; background-color: #233645; color: #ffffff; font-size: 21px; font-weight: 800; margin-left: 1065px; margin-top: 48px\">采&nbsp;购&nbsp;记&nbsp;录&nbsp;></button></a>\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("    let text1 = document.getElementById(\"text1\");\r\n");
      out.write("    let text2 = document.getElementById(\"text2\");\r\n");
      out.write("    let text3 = document.getElementById(\"text3\");\r\n");
      out.write("    let input1 = document.querySelector(\".input1\");\r\n");
      out.write("    let input2 = document.querySelector(\".input2\");\r\n");
      out.write("    let input3 = document.querySelector(\".input3\");\r\n");
      out.write("    let input4 = document.querySelector(\".input4\");\r\n");
      out.write("    let btn1 = document.querySelector(\".btn1\");\r\n");
      out.write("    let btn2 = document.querySelector(\".btn2\");\r\n");
      out.write("    // let goods = document.querySelector(\".list-box\").children[0].children[5];\r\n");
      out.write("    let exit = document.querySelector(\".list-box\").children[0].children[6];\r\n");
      out.write("    let index = document.querySelector(\".list-box\").children[0].children[0];\r\n");
      out.write("    let person = document.querySelector(\".list-box\").children[0].children[1];\r\n");
      out.write("    let customerInformation = document.querySelector(\".list-box\").children[0].children[2];\r\n");
      out.write("    let reserve = document.querySelector(\".list-box\").children[0].children[3];\r\n");
      out.write("    // 首页小li\r\n");
      out.write("    index.onclick = function () {\r\n");
      out.write("        window.location.href = \"http://localhost:8080/room/adminRoomOperate\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 个人信息小li\r\n");
      out.write("    person.onclick = function () {\r\n");
      out.write("        text1.style.display = \"none\";\r\n");
      out.write("        text2.style.display = \"none\";\r\n");
      out.write("        text3.style.display = \"none\";\r\n");
      out.write("        ListAll.style.border = \"none\";\r\n");
      out.write("        axios({\r\n");
      out.write("            method: \"get\",\r\n");
      out.write("            url: \"http://localhost:8080/login/adminInformation?id=\" +");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("        }).then(function (resp) {\r\n");
      out.write("            let adm = resp.data\r\n");
      out.write("            console.log(adm);\r\n");
      out.write("            ListAll.innerHTML =\r\n");
      out.write("                `\r\n");
      out.write("                <h1>个人信息</h1>\r\n");
      out.write("                <a href=\"/adminInformation.jsp\"><button class=\"revise\">修改</button></a>\r\n");
      out.write("                <p>用&nbsp;&nbsp;户&nbsp;&nbsp;名 : ` + adm.username + `</p>\r\n");
      out.write("                <p>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码 : ` + adm.password + `</p>\r\n");
      out.write("                `\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 顾客信息小li\r\n");
      out.write("    customerInformation.onclick = function(){\r\n");
      out.write("        text1.style.display = \"none\";\r\n");
      out.write("        text2.style.display = \"none\";\r\n");
      out.write("        text3.style.display = \"none\";\r\n");
      out.write("        ListAll.style.border = \"2px solid black\";\r\n");
      out.write("        axios({\r\n");
      out.write("            method:\"get\",\r\n");
      out.write("            url:\"http://localhost:8080/login/selectAllCustomer\"\r\n");
      out.write("        }).then(function(resp){\r\n");
      out.write("            let customers = resp.data;\r\n");
      out.write("            console.log(customers);\r\n");
      out.write("            ListAll.innerHTML =\r\n");
      out.write("                `\r\n");
      out.write("                <tr class=\"tr1\" style=\"background-color: #2f4050\">\r\n");
      out.write("                    <th>姓名</th>\r\n");
      out.write("                    <th>密码</th>\r\n");
      out.write("                    <th>性别</th>\r\n");
      out.write("                    <th>电话号</th>\r\n");
      out.write("                    <th>身份证号</th>\r\n");
      out.write("                    <th>删除</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                `\r\n");
      out.write("            for (let i = 0; i < customers.length; i++) {\r\n");
      out.write("                ListAll.innerHTML +=\r\n");
      out.write("                    `\r\n");
      out.write("                    <tr align=\"center\" class=\"tr2\" style=\"color: black\">\r\n");
      out.write("                        <td>` + customers[i].username+ `</td>\r\n");
      out.write("                        <td>` + customers[i].password + `</td>\r\n");
      out.write("                        <td>` + customers[i].gender + `</td>\r\n");
      out.write("                        <td>` + customers[i].telephone + `</td>\r\n");
      out.write("                        <td>` + customers[i].identity + `</td>\r\n");
      out.write("                        <td><button class=\"btn\" style=\"width: 70px;height: 30px\" onclick=\"deleteCustomerInformation(` + customers[i].id + `)\">删除</button></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    `\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 删除顾客信息小li\r\n");
      out.write("    function deleteCustomerInformation(customerId){\r\n");
      out.write("        axios({\r\n");
      out.write("            method:\"get\",\r\n");
      out.write("            url:\"http://localhost:8080/login/deleteCustomerInformation?id=\"+customerId\r\n");
      out.write("        }).then(function(resp){\r\n");
      out.write("            redraw_information();\r\n");
      out.write("            alert(resp.data);\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 删除之后对顾客信息页面进行重绘\r\n");
      out.write("    function redraw_information(){\r\n");
      out.write("        text1.style.display = \"none\";\r\n");
      out.write("        text2.style.display = \"none\";\r\n");
      out.write("        text3.style.display = \"none\";\r\n");
      out.write("        axios({\r\n");
      out.write("            method:\"get\",\r\n");
      out.write("            url:\"http://localhost:8080/login/selectAllCustomer\"\r\n");
      out.write("        }).then(function(resp){\r\n");
      out.write("            let customers = resp.data;\r\n");
      out.write("            console.log(customers);\r\n");
      out.write("            ListAll.innerHTML =\r\n");
      out.write("                `\r\n");
      out.write("                <tr class=\"border-tr1\">\r\n");
      out.write("                    <th>姓名</th>\r\n");
      out.write("                    <th>密码</th>\r\n");
      out.write("                    <th>性别</th>\r\n");
      out.write("                    <th>电话号</th>\r\n");
      out.write("                    <th>身份证号</th>\r\n");
      out.write("                    <th>删除</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                `\r\n");
      out.write("            for (let i = 0; i < customers.length; i++) {\r\n");
      out.write("                ListAll.innerHTML +=\r\n");
      out.write("                    `\r\n");
      out.write("                    <tr align=\"center\" class=\"border-tr2\">\r\n");
      out.write("                        <td>` + customers[i].username+ `</td>\r\n");
      out.write("                        <td>` + customers[i].password + `</td>\r\n");
      out.write("                        <td>` + customers[i].gender + `</td>\r\n");
      out.write("                        <td>` + customers[i].telephone + `</td>\r\n");
      out.write("                        <td>` + customers[i].identity + `</td>\r\n");
      out.write("                        <td><button class=\"btn\" style=\"width: 70px;height: 30px\" onclick=\"deleteCustomerInformation(` + customers[i].id + `)\">删除</button></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    `\r\n");
      out.write("            }\r\n");
      out.write("            ListAll.innerHTML += `<hr/>`\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    // 预定信息小li\r\n");
      out.write("    reserve.onclick = function(){\r\n");
      out.write("        text1.style.display = \"none\";\r\n");
      out.write("        text2.style.display = \"none\";\r\n");
      out.write("        text3.style.display = \"none\";\r\n");
      out.write("        ListAll.style.border = \"1px solid black\";\r\n");
      out.write("        axios({\r\n");
      out.write("            method:\"get\",\r\n");
      out.write("            url:\"http://localhost:8080/bookingList/selectAllReserve\"\r\n");
      out.write("        }).then(function(resp){\r\n");
      out.write("            let bookingLists = resp.data;\r\n");
      out.write("            ListAll.innerHTML =\r\n");
      out.write("                `\r\n");
      out.write("                <tr class=\"border-tr1\">\r\n");
      out.write("                    <th>用户名</th>\r\n");
      out.write("                    <th>预定时间</th>\r\n");
      out.write("                    <th>离店时间</th>\r\n");
      out.write("                    <th>顾客名</th>\r\n");
      out.write("                    <th>电话号</th>\r\n");
      out.write("                    <th>身份证号</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                `\r\n");
      out.write("            for (let i = 0; i < bookingLists.length; i++) {\r\n");
      out.write("                ListAll.innerHTML +=\r\n");
      out.write("                    `\r\n");
      out.write("                    <tr align=\"center\" class=\"border-tr2\">\r\n");
      out.write("                        <td>` + bookingLists[i].username + `</td>\r\n");
      out.write("                        <td>` + bookingLists[i].bookingTime + `</td>\r\n");
      out.write("                        <td>` + bookingLists[i].leaveTime + `</td>\r\n");
      out.write("                        <td>` + bookingLists[i].customerName + `</td>\r\n");
      out.write("                        <td>` + bookingLists[i].telephone + `</td>\r\n");
      out.write("                        <td>` + bookingLists[i].identity + `</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    `\r\n");
      out.write("            }\r\n");
      out.write("            ListAll.innerHTML += `<hr/>`\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 退出登录小li\r\n");
      out.write("    exit.onclick = function(){\r\n");
      out.write("        var result = confirm(\"确定要退出吗\")\r\n");
      out.write("        if(result){\r\n");
      out.write("            window.location.href = \"http://localhost:8080/login/adminLogOut\"\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 商品采购小li\r\n");
      out.write("    // goods.onclick = function(){\r\n");
      out.write("    //     window.location.href = \"http://localhost:8080/indexGoods.jsp\"\r\n");
      out.write("    // }\r\n");
      out.write("\r\n");
      out.write("    // 确认日用品采购\r\n");
      out.write("    btn2.onclick = function () {\r\n");
      out.write("        let username = input1.value;\r\n");
      out.write("        let number = input2.value;\r\n");
      out.write("        let price = input3.value;\r\n");
      out.write("        let image = input4.value.split('\\\\');\r\n");
      out.write("        let valueLength = image.length;\r\n");
      out.write("        let finalValue = image[valueLength - 1];\r\n");
      out.write("\r\n");
      out.write("        console.log(finalValue)\r\n");
      out.write("        if(username != \"\" && number != \"\" && price != \"\" && image != \"\"){\r\n");
      out.write("            axios({\r\n");
      out.write("                method:\"get\",\r\n");
      out.write("                url:\"http://localhost:8080/goods/addGoods?username=\" + username + \"&number=\" + number + \"&image=\" + finalValue + \"&price=\" + price\r\n");
      out.write("            }).then(function(resp){\r\n");
      out.write("                alert(\"购买商品成功\");\r\n");
      out.write("                input1.value = '';\r\n");
      out.write("                input2.value = '';\r\n");
      out.write("                input3.value = '';\r\n");
      out.write("                input4.value = '';\r\n");
      out.write("            })\r\n");
      out.write("        }else{\r\n");
      out.write("            alert(\"请将信息填写完整\")\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 取消日用品采购\r\n");
      out.write("    btn1.onclick = function () {\r\n");
      out.write("        input1.value = '';\r\n");
      out.write("        input2.value = '';\r\n");
      out.write("        input3.value = '';\r\n");
      out.write("        input4.value = '';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
