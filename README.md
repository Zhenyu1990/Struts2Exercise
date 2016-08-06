##说明：该仓库用于存储我在学习Struts2框架时所做的练习项目
###1. HelloStruts2
环境: Eclipse-4.4.2，Struts2-2.3.30，java-1.8
简介: 本项目是根据慕课网《Struts2入门》课程所编写的练习项目，练习了基本的Struts2使用方法。

###2. Struts2InterceptorEx
环境: Eclipse-4.4.2，Struts2-2.3.30，java-1.8
简介: 本项目是根据慕课网《Struts2拦截器浅析》课程所编写的练习项目，主要练习了Struts2的Interceptor的使用，其中包含两个小项目:

1. 进入主页index.jsp点击超链接后, 会访问timer.action. 拦截器会在调用TimerAction中的指定方法后计算该方法的执行时间.
2. 直接访问auth.action将会进入login.jsp的页面. 仅当用户名为admin密码为123时, 登录成功才能访问manager.jsp, 否则返回login.jsp并显示错误信息.

