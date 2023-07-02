matlab多元多项式乘法  
syms x_1 x_2 x_3;  
disp(expand((x_1+x_2+x_3)^2))  
  
matlab多元多项式带余除法  
syms x y;  
p = x^3-x*y^2+1;  
d = x+y;  
[r,q]=polynomial(p,d);  
  
matlab一元多项式乘法  
f=[3,-5,0,-7,5,6];  
g=[3,5,-3]  
conv(f,g)  
  
matlab多元多项式加减法  
syms x_1 x_2 x_3;  
f_0 = expand((x_1^2+x_2^2)*(x_1^2+x_3^2)*(x_2^2+x_3^2));  
g_1 = expand((x_1+x_2+x_3)^2*(x_1*x_2+x_2*x_3+x_3*x_2)^2);  
disp(f_0-g_1);  
  
matlab一元多项式带余除法  
clc;  
f_1 = [];  
f_2 = [2,1];  
[q,r]=deconv(f_1,f_2);  
q=poly2str(q,'x');  
r=poly2str(r,'x');  
disp(q);  
disp(r);  
