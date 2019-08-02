package com.itdr.cookie1;

/*
@WebServlet(name = "Cookiedemo2",value = "/qwe1")
public class Cookiedemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取cookie对象
         Cookie[] cookies = request.getCookies();
        //遍历数组中的所有Cookie对象
        for (Cookie b:cookies) {
            //输入他们的内容
            System.out.println(b.getName()+"=="+b.getValue());
            //找到一个名字叫u的cookie
            if (b.getName().equals("u")){
            String s = b.getValue();
            //吧获取的值，以逗号分割成一个字符数组
            String[] split = s.split(",");
            //遍历数组，拿出数组中的每一个值
            for (int i = 0; i <split.length ; i++) {
                //输出数组中的值，就是用户对象中的用户名和密码
                System.out.println("qwe"+split[i]);
              }
            }
        }
    }
}
*/
