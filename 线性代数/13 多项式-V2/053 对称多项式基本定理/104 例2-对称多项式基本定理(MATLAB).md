**例2**    
 $f=(x_1^2+x_2^2)(x_1^2+x_3^2)(x_2^2+x_3^2)$     
    
**解法二: 老师的**    
若不是齐次的对称多项式，先进行齐次分解    
使用与齐次多项式，待定系数法    
    
**解法一: 套算法**    
 $\rm{clc};$     
 $\rm{syms}\ x_1 x_2 x_3;$     
    
 $f_0 = \rm{\rm{expand}}((x_1^2+x_2^2)*(x_1^2+x_3^2)*(x_2^2+x_3^2));$     
 $\rm{disp}('f_0=');$     
 $\rm{disp}(f_0);$     
取 $f_0$ 的首项，构造 $g_1$     
 $g_1 = \sigma_1^2*\sigma_2^2;$     
 $g_1 = \rm{expand}((x_1+x_2+x_3)^2*(x_1*x_2+x_2*x_3+x_3*x_1)^2);$     
    
    
 $f_1 = f_0-g_1;$     
 $\rm{disp}('f_1=');$     
 $\rm{disp}(f_1);$     
取 $f_1$ 的首项，构造 $g_2$     
 $g_2 = -2\sigma_1^3*\sigma_3;$     
 $g_2 = \rm{expand}(-2*(x_1+x_2+x_3)^3*(x_1*x_2+x_2*x_3+x_3*x_1)^0*(x_1*x_2*x_3));$     
    
 $f_2 = f_1-g_2;$     
 $\rm{disp}('f_2=');$     
 $\rm{disp}(f_2);$     
取 $f_2$ 的首项，构造 $g_3$     
 $g_3 = -2\sigma_2^3;$     
 $g_3 = \rm{expand}(-2*(x_1+x_2+x_3)^0*(x_1*x_2+x_2*x_3+x_3*x_1)^3);$     
    
 $f_3 = f_2-g_3;$     
 $\rm{disp}('f_3=');$     
 $\rm{disp}(f_3);$     
取 $f_3$ 的首项，构造 $g_4$     
 $g_4 = 4\sigma_1*\sigma_2*\sigma_3;$     
 $g_4 = \rm{expand}(4*(x_1+x_2+x_3)^1*(x_1*x_2+x_2*x_3+x_3*x_1)^1*(x_1*x_2*x_3));$     
    
 $f_4 = f_3-g_4;$     
 $\rm{disp}('f_4=');$     
 $\rm{disp}(f_4);$     
取 $f_4$ 的首项，构造 $g_5$     
 $g_5 = -\sigma_3^2;$     
 $g_5 = \rm{expand}(-1*(x_1+x_2+x_3)^0*(x_1*x_2+x_2*x_3+x_3*x_1)^0*(x_1*x_2*x_3)^2);$     
    
 $f_5 = f_4-g_5;$     
 $\rm{disp}('f_5=');$     
 $\rm{disp}(f_5);$     
    
 $\rm{result} = g_1+g_2+g_3+g_4+g_5+f_5;$     
 $\rm{disp}('result=');$     
 $\rm{disp}(result);$     
    
校验    
 $\rm{disp}(f_0-result);$     
    
 $f=\sigma_1^2*\sigma_2^2-2\sigma_1^3*\sigma_3-2\sigma_2^3+4\sigma_1*\sigma_2*\sigma_3-\sigma_3^2$     
    
 $\Rightarrow g(y_1,y_2,y_3)=y_1^2*y_2^2-2y_1^3y_3-2y_2^3+4y_1*y_2*y_3-y_3^2$     
