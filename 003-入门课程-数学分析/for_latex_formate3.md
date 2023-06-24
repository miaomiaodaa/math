<font color=blue>Step1: 点法式</font>  
公式  
$A\cdot(x-x_0)+B\cdot(y-y_0)+C\cdot(z-z_0)=0$  
  
  
推导  
$(x_0,y_0,z_0)\in\Sigma,\;\vec n=\left\{A,B,C\right\},\;\forall\;(x,y,z)\in\Sigma$  
  
$\Rightarrow \vec u=\left\{x-x_0,\;y-y_0,\;z-z_0\right\}$  
  
$\Rightarrow\vec u\cdot\vec n=0$  
  
$\Rightarrow\left\{x-x_0,\;y-y_0,\;z-z_0\right\}\cdot\left\{A,B,C\right\}=0$  
  
$\RightarrowA\cdot(x-x_0)+B\cdot(y-y_0)+C\cdot(z-z_0)=0$  
  
  
<font color=blue>Step2: 一般式</font>  
公式  
$A\cdot x+B\cdot y+C\cdot z+D=0$  
  
  
推导  
空间平面和三元一次方程对应 A\cdot(x-x_0)+B\cdot(y-y_0)+C\cdot(z-z_0)=0\\  
$\RightarrowA\cdot x-A\cdot x_0+B\cdot y-B\cdot y_0+C\cdot z-C\cdot z_0=0$  
  
$\RightarrowA\cdot x+B\cdot y+C\cdot z-(A\cdot x_0+B\cdot y_0+C\cdot z_0)=0$  
  
$\rm{let}\;D=-(A\cdot x_0+B\cdot y_0+C\cdot z_0)$  
  
$\RightarrowA\cdot x+B\cdot y+C\cdot z+D=0$  
  
  
推论  
$\vec n=\left\{A,\;B,\;C\right\}$  
  
  
<font color=blue>Step3: 截距式</font>  
公式  
$\dfrac{x}{a}+\dfrac{y}{b}+\dfrac{z}{c}=1$  
  
$a=-\dfrac{D}{A},\;b=-\dfrac{D}{B},\;c=-\dfrac {D}{C}$  
  
  
推导  
$A\cdot x+B\cdot y+C\cdot z+D=0$  
  
$\RightarrowA\cdot x+B\cdot y+C\cdot z=-D$  
  
$\Rightarrow\dfrac{x}{-\dfrac AD}+\dfrac{y}{-\dfrac BD}+\dfrac{z}{-\dfrac CD}=1$  
  
$\rm{let}\;a=-\dfrac{D}{A},\;b=-\dfrac{D}{B},\;c=-\dfrac {D}{C}$  
  
$\Rightarrow\dfrac{x}{a}+\dfrac{y}{b}+\dfrac{z}{c}=1$  
  
$$  
  
  
推论  
四面体体积  
坐标轴围成四面体体积 V=\dfrac{1}{6}\cdot \left|a\cdot b\cdot c\right|  
名字来源  
$(a,0, 0),\;(0,b,0),\;(0,0,c)$  
  
  
<font color=blue>Step4: 三点式</font>  
公式  
用混合积求 \begin{vmatrix}  
$x- x_1,y - y_1,z - z_1 $  
  
$x_2 - x_1,y_2 - y_1,z_2 - z_1 $  
  
$x_3 - x_1,y_3 - y_1,z_3 - z_1\end{vmatrix} = 0$  
  
  
推导  
直接法  
$(x_0,y_0,z_0),\;(x_1,y_1,z_1),\;(x_2,y_2,z_2)\in\Sigma$  
  
$\forall\;(x,y,z)\in\Sigma$  
  
$\Rightarrow\vec u=\{x_2-x_0,y_2-y_0,z_2-z_0\}$  
  
$\quad\vec v=\{x_1-x_0,y_1-y_0,z_1-z_0\}$  
  
$\quad\vec w=\{x-x_0,y-y_0,z-z_0\}$  
  
$\Rightarrow(\vec u\times\vec v)\cdot\vec w=0$  
  
$\Rightarrow\left(\{x_2-x_0,y_2-y_0,z_2-z_0\}\times\{x_1-x_0,y_1-y_0,z_1-z_0\}\right)\cdot\{x-x_0,y-y_0,z-z_0\}$  
  
$\Rightarrow\begin{vmatrix}\,x-x_0&y-y_0&z - z_0\;$  
  
$\,x_1-x_0&y_1-y_0&z_1-z_0\;$  
  
$\,x_2-x_0&y_2-y_0&z_2-z_0\;\end{vmatrix}=0$  
  
  
间接法  
混合积  
点法式  
<font color=blue>Step5: 平面束</font>  
$\begin{cases}A_1x + B_1y + C_1z = 0 & $  
  
$A_2x + B_2y + C_2z = 0\end{cases}$  
  
$(A_1,B_1,C_1) \neq \lambda(A_2,B_2,C_2)$  
  
  
过定直线的所有平面 \lambda(A_1x + B_1y + C_1z)  +  
$\mu(A_2x + B_2y + C_2z) = 0$  
  
  
