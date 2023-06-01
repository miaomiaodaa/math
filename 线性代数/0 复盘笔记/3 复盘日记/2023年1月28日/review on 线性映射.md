1 概念辨析
$$\begin{array}{c|c}
集合上的映射&线性空间上的映射\\\
映射&线性映射\\\
单射&单线性映射\\\
满射&满线性映射\\\
双射&线性同构\\\
变换&线性变换\\\
双射+变换&自同构\\\
恒等变换&线性恒等变换
\end{array}$$

2 复合映射的结合律
$(\Psi\circ\Phi)\circ\Omega=\Psi\circ(\Phi\circ\Omega)$

3 逆映射存在定理
$\Phi$存在逆映射，当且仅当$\Phi$是双射
逆映射的定义: $\Phi\circ\Psi=\Psi\circ\Phi=\mathbb{1}_V$
复合映射的定义: $\Phi\circ\Psi$

4 线性映射将零向量映射成零向量
反之不成立，否则核空间就变成了零子空间
双射时，反之成立，即线性同构时成立

5 线性映射保持线性组合
$\Phi(\lambda_1\alpha_1+\lambda_2\alpha_2+\cdots+\lambda_r\alpha_r)$
$=\lambda_1\Phi(\alpha_1)+\lambda_2\Phi(\alpha_2)+\cdots+\lambda_r\Phi(\alpha_r)$

6 线性映射的复合仍旧是线性映射
$\Phi:V\to U,\ \Psi:U\to W$，则$\Psi\circ\Phi:V\to W$

7 线性同构具有线性映射的所有性质

8 线性同构保持线性关系
将线性无关向量映射成线性无关向量
将线性相关向量映射成线性相关向量，且保持组合系数

9 线性同构的逆映射也是线性同构

10 线性同构是等价关系

11 两个线性空间存在线性同构的充要条件是，它们的维数相同

12 定义映射的加法，数乘，乘法，以及乘法的若干性质
$\Phi\cdot\Psi=\Phi\circ\Psi=\Phi(\Psi(\alpha))$
$\Phi\cdots\Phi=\Phi^n=\Phi(\Phi(\cdots\Phi(\alpha)\cdots))$

A 坐标向量映射是线性同构

B 坐标向量的唯一性

13 线性扩张定理
   $\alpha=\lambda_1\cdot e_1+\lambda_1\cdot e_1+\cdots+\lambda_n\cdot e_n$
   $\Phi(\alpha)=\lambda_1\cdot\beta_1+\lambda_1\cdot\beta_1+\cdots+\lambda_n\cdot\beta_n$
   1 提取组合系数；2 组合系数与$\beta_i$做线性组合

14 表示矩阵&表示方阵
$\begin{cases}
\Phi(e_1)=\beta_1=a_{11}\cdot f_1+a_{21}\cdot f_2
+\cdots+a_{m1}\cdot f_m\\\
\Phi(e_2)=\beta_2=a_{12}\cdot f_1+a_{22}\cdot f_2
+\cdots+a_{m2}\cdot f_m\\\
\Phi(e_3)=\beta_3=a_{13}\cdot f_1+a_{23}\cdot f_2
+\cdots+a_{m3}\cdot f_m\\\
\cdots\\\
\Phi(e_n)=\beta_n=a_{1n}\cdot f_1+a_{2n}\cdot f_2
+\cdots+a_{mn}\cdot f_m
\end{cases}$
$\begin{bmatrix}
\Phi(e_1)&\Phi(e_2)&\cdots&\Phi(e_n)
\end{bmatrix}=\begin{bmatrix}
f_1&f_2&\cdots&f_m
\end{bmatrix}\cdot A$

15 表示矩阵与坐标向量(交换图的下半部分)

16 表示矩阵映射是线性同构
   $T:\mathbb{L}(V,U)\to M_{m\times n}(K)$是线性同构
   交换图竖着的都是线性同构

17 交换图
$\begin{array}{ccc}
几何&V_K^n&\xrightarrow{\Phi}&U_K^m\\\
\updownarrow&\eta_v\downarrow&&\downarrow\eta_u\\\
代数&K^n&\xrightarrow{\Phi_A}&K^m\\\
&x&\longmapsto&Ax
\end{array}$

18 复合映射的表示矩阵
   矩阵乘法的代数意义
   $\underset{p\times n}{T(\Psi\circ\Phi)}
=\underset{p\times m}{T(\Psi)}
\cdot\underset{m\times n}{T(\Phi)}$

19 $T:L(V_K^n)\to M_n(K)$是$K$代数同构

20 同一线性空间，不同基下的表示矩阵是相似的

21 自同构存在的充要条件

22 矩阵的相似关系是一种等价关系

23 线性映射的限制

24 $\Phi:V\to U$是满射
  当且仅当$\rm{Im}(\Phi)=U$
  当且仅当$\rm{dim}_K(\rm{Im}\Phi)=\rm{dim}_K(U)$
  当且仅当$\Phi$的表示矩阵$A$的行秩$=\rm{dim}_K(U)=m$
  当且仅当$\Phi$的表示矩阵$A$行满秩

25 $\Phi:V\to U$是单射
  当且仅当$\rm{Ker}(\Phi)=$零子空间
  当且仅当$\rm{r}(\rm{Ker}(\Phi))=0$
  当且仅当$\Phi$的表示矩阵$A$的行秩$=\rm{dim}_K(V)=n$
  当且仅当$\Phi$的表示矩阵$A$行列秩


   



