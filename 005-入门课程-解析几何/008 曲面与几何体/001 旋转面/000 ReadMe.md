旋转面  
**基本概念**  
基本概念  
轴线 $l$: 固定不动的直线  
母线 $\Gamma$: 旋转的曲线  
纬圆: 每个点旋转生成的轨迹，垂直于轴线的平面与旋转面相交出的图形  
  
**举例**  
例1: 球面  
轴线: 任意一条过球心的直线  
母线: 任意过轴线的平面与球面的交线，或任意过轴线的半平面与球面的交线  
注: 轴线，母线不唯一  
  
例2: 圆锥面、圆柱面  
圆柱面的母线是一条与轴线平行的直线  
注: 都不包含上下底面，不然就成体了  
  
例3: **平面**  
轴线: 法线  
母线: 任意一条与法线垂直且相交的直线  
注: 高度对称的旋转面，例如球面，平面存在不止一条轴线；但轴线都有无穷个  
获取母线: 过轴线的平面与旋转面的交线都是母线  
获取纬圆: 垂直于轴线的平面与旋转面相交出的图形  
  
例4: **母线是封闭曲线**  
一条封闭曲线，绕固定直线旋转一周  
注: 可以绕不同的轴旋转  
  
---  
  
**旋转面的方程-点在旋转面的充要条件**  
空间中一点 $M\in$ 旋转面 $S$  
  
$\Leftrightarrow$ 点 $M$ 绕轴线 $l$ 旋转一周得到的圆与母线 $\Gamma$ 相交  
  
$\Leftrightarrow\exists M^\prime\in\Gamma$ ， $M^\prime$ 所在纬圆进过点 $M$  
  
$\Leftrightarrow\exists M^\prime\in\Gamma$ ， $\overrightarrow{MM^\prime}\perp l$ ，且 $d(M,l)=d(M^\prime,l)$  
注: 此处即涉及垂直又涉及距离，所有考虑使用直角坐标系  
  
**旋转面的方程-构造方程的要素**  
1 轴线的方程: 一般方程或者点向式方程  
轴线上一点坐标 $M_0(x_0,y_0,z_0)$ ，以及方向向量 $\vec l=(A,B,C)$  
  
2 母线 $\Gamma$  
两个曲面方程的联立方程组 $\begin{cases}F(x,y,z)=0\\\ G(x,y,z)=0\end{cases}$  
参数方程 $\begin{cases}x=x(t)\\\ y=y(t)\\\ z=z(t)\end{cases}$  
  
**旋转面的方程-推导思路-场景2**  
(先讲场景2，再讲场景1)  
设待求旋转曲面为 $S$ ，任取点 $M(x_m,y_m,z_m)\in S$ ， $M^\prime$ 的坐标为 $(x,y,z)$  
  
因为 $\overrightarrow{MM^\prime}\perp l$  
  
$\Rightarrow\overrightarrow{MM^\prime}\cdot\vec l=0$  
  
$\Rightarrow A(x-x_m)+B(y-y_m)+C(z-z_m)=0$ (过点 $M$ 且与轴线垂直的平面)  
  
再与母线 $\Gamma$ 的方程联立，可解得 $M^\prime$ 的坐标，可用 $x_m,y_m,z_m$ 表示  
  
又因为 $d(M,l)=d(M^\prime,l)$  
  
$\Rightarrow d(M,M_0)=d(M^\prime,M_0)$ (点 $M$ 在纬圆上)  
  
利用两点间的距离公式可以建立一个关于点 $M(x_M,y_M,z_M)\in S$ 的方程，该方程即为旋转曲面 $S$ 的方程  
  
**注**: 当旋转轴为 $z$ 轴(进一步，坐标轴)时，点 $M$ 与点 $M^\prime$ 有相同的 $z$ 轴分量，即 $z_m=z$  
  
此时 $d(M,M_0)=d(M^\prime,M_0)$ 只需要看 $x,\ y$ 到原点距离即可  
  
**旋转面的方程-例1-普通直线为旋转轴**  
轴线 $l$ 过点 $M_0(1,3,-1)$ ，且平行于向量 $\vec l_1=(1,1,1)$  
  
母线 $\Gamma$ 过点 $M_1(0,-2,1)$ ，且平行于 $\vec l_1=(1,-1,1)$  
  
**解**: 设点 $M$ 的坐标为 $(x_m,y_m,z_m)$ ， $M^\prime$ 的坐标为 $(x,y,z)$  
  
母线 $\Gamma$ 过点 $M_1(0,-2,1)$ ，且平行于 $\vec l_1=(1,-1,1)$  
  
$\Rightarrow$ 母线 $\Gamma$ 的点向式方程为 $\dfrac{x-0}{1}=\dfrac{y+2}{-1}=\dfrac{z-1}{1}$  
  
$\Rightarrow$ 母线 $\Gamma$ 的参数方程为 $\begin{cases}x=t\\\ y=-t-2\\\ z=t+1\end{cases}$  
  
${MM^\prime}\perp l_1$  
  
$\Rightarrow1(x-x_m)+1(y-y_m)+1(z-z_m)=0$  
  
与母线 $\Gamma$ 的方程联立，即可解得点 $M^\prime$  
  
$\begin{cases}1(x-x_m)+1(y-y_m)+1(z-z_m)=0\\\ \begin{cases}x=t\\\ y=-t-2\\\ z=t+1\end{cases}\end{cases}$  
  
$\Rightarrow t=x_m+y_m+z_m+1$  
  
$\Rightarrow M^\prime$ 的坐标为 $M^\prime(x_m+y_m+z_m+1,\ -x_m-y_m-z_m-3,\ x_m+y_m+z_m+2)$  
  
$\Rightarrow\overrightarrow{MM_0}=(x_m-1,y_m-3,z_m+1)$ ， $\overrightarrow{M^\prime M_0}=(x_m+y_m+z_m,\ -x_m-y_m-z_m-6,\ x_m+y_m+z_m+3)$  
  
$\Rightarrow(x_m-1)^2+(y_m-3)^2+(z_m+1)^2=(x_m+y_m+z_m)^2+(-x_m-y_m-z_m-6)^2+(x_m+y_m+z_m+3)^2$  
  
$\Rightarrow 2\cdot x_m^2 + 2\cdot x_m\cdot y_m + 2\cdot x_m\cdot z_m + 16\cdot x_m + 2\cdot y_m^2 + 2\cdot y_m\cdot z_m + 12\cdot y_m + 2\cdot z_m^2 + 20\cdot z_m + 56=0$  
  
**旋转面的方程-例2-以z轴为旋转轴**  
旋转轴 $l$ 为 $z$ 轴，母线 $\Gamma$ 为 $\begin{cases}x+2y-1=0\\\ y+z-2=0\end{cases}$  
  
**解**: 设点 $M^\prime\in\Gamma$ ，且 $\overrightarrow{MM^\prime}\perp z$ 轴  
  
$\Rightarrow0(x^\prime-x_m)+0(y^\prime-y_m)+1(z^\prime-z_m)=0$  
  
$\Rightarrow z^\prime=z_m$  
  
$\Rightarrow\begin{cases}x^\prime+2y^\prime-1=0\\\ y^\prime+z_m-2=0\end{cases}$  
  
$\Rightarrow x^\prime=2z_m-3,\ y^\prime=2-z_m,\ z^\prime=z_m$  
  
此时取 $M_0$ 为坐标原点  
  
$\Rightarrow\overrightarrow{MM_0}=(x_m,y_m,z_m)$ ， $\overrightarrow{M^\prime M_0}=(2z_m-3,2-z_m,z_m)$  
  
$\Rightarrow x_m^2+y_m^2=(2z_m-3)^2+(2-z_m)^2$  
  
$\Rightarrow x_m^2+y_m^2-5\cdot z_m^2+16\cdot z_m-13=0$  
  
**旋转面的方程-推导思路-场景1-(z轴为旋转轴，母线在yoz平面内)**  
任取点 $M(x_m,y_m,z_m)$ ，点 $M$ 绕坐标轴旋转，会击穿两次 $YoZ$ 平面  
  
则两次的坐标点为 $M_1=(0,\sqrt{x_m^2+y_m^2},z_m),\ M_2=(0,-\sqrt{x_m^2+y_m^2},z_m)$  
  
设母线 $\Gamma$ 的方程为 $\begin{cases}f(y,z)=0\\\ x=0\end{cases}$  
  
所以 $M\in S$  
  
$\Leftrightarrow M_1\in\Gamma$ 或 $M_2\in\Gamma$  
  
$\Leftrightarrow f(\sqrt{x_m^2+y_m^2},z_m)=0$ 或 $f(-\sqrt{x_m^2+y_m^2},z_m)=0$  
  
$\Leftrightarrow f(\sqrt{x_m^2+y_m^2},z_m)\cdot f(-\sqrt{x_m^2+y_m^2},z_m)=0$  
  
<font color=red>注: 无论 $f$ 的形式如何，最终的表达式中， $x_m,\ y_m$ 总是成对出现的</font>  
  
<font color=red>反之，若一个方程中， $x_m,\ y_m$ 总是成对出现的，则它的图形一定是绕 $z$ 旋转而成的</font>  
  
**旋转面的方程-例1-旋转椭球面**  
设旋转轴为 $z$ 轴，母线 $\Gamma$ 为 $\begin{cases}x=0\\\ \dfrac{y^2}{a^2}+\dfrac{z^2}{b^2}=1\end{cases}$  
  
**解**: 带入公式得: $\left(\dfrac{x_m^2+y_m^2}{a^2}+\dfrac{z_m^2}{b^2}-1\right)^2=0$  
  
化简得: $\dfrac{x_m^2+y_m^2}{a^2}+\dfrac{z_m^2}{b^2}=1$  
  
这是一个旋转椭球面，<font color=red>能根据方程进行换元</font>  
  
**旋转面的方程-例2-旋转单页双曲面**  
设旋转轴为 $z$ 轴，母线 $\Gamma$ 为 $\begin{cases}x=0\\\ \dfrac{y^2}{a^2}-\dfrac{z^2}{b^2}=1\end{cases}$  
  
**解**: 带入公式得: $\left(\dfrac{x_m^2+y_m^2}{a^2}-\dfrac{z_m^2}{b^2}-1\right)^2=0$  
  
化简得: $\dfrac{x_m^2+y_m^2}{a^2}-\dfrac{z_m^2}{b^2}=1$  
  
注1: 绕 $z$ 轴旋转，旋转之后连在一起了，所有称为单页  
  
注2: 绕 $y$ 轴旋转，旋转双页双曲面，旋转之后仍是两块，所有称为双页  
  
**旋转面的方程-例3-旋转抛物面**  
设旋转轴为 $z$ 轴，母线 $\Gamma$ 为 $\begin{cases}x=0\\\ y^2=2pz\end{cases}$  
  
**解**: 带入公式得: $((\sqrt{x_m^2+y_m^2})^2-2pz_m)((-\sqrt{x_m^2+y_m^2})^2-2pz_m))=0$  
  
化简得: $x_m^2+y_m^2=2pz_m$  
