**大前提**
1、 $C_{m\times m}
=A_{m\times n}\cdot B_{n\times m}$

2、 $1\leq r\leq m$

3、 $C_{m\times m}$的$r$阶子式

**断言**
(1) 若$n<r\le m$，则$C$的任意$r$阶子式都为零

(2) 若$1\leq r\le n$，$\underset{C的某个r阶子式}{
C\begin{bmatrix}i_1,i_2,\cdots,i_r\\\ 
j_1,j_2,\cdots,j_r\end{bmatrix}}=$

$\sum\limits_{1\le k_1<k_2<\cdots<k_r\le n}
\overset{A的包含(i_1,i_2,\cdots,i_r)行的全部r阶子式}
{A\begin{bmatrix}i_1,i_2,\cdots,i_r\\\ k_1,k_2,\cdots,k_r\end{bmatrix}}\cdot
\underset{B的包含(j_1,j_2,\cdots,j_r)列的全部r阶子式}
{B\begin{bmatrix}k_1,k_2,\cdots,k_r\\\ j_1,j_2,\cdots,j_r\end{bmatrix}}$

**说明**
1 $r$是一级变量

2 $i_1,i_2,\cdots,i_r$，$j_1,j_2,\cdots,j_r$是二级变量

3 $1\le k_1<k_2<\cdots<k_r\le n$代表的$r$元全排列

4 当$r=m$时，$r$阶子式就是$C$本身，于是变成了柯-比公式

5 当$r=1$时，$r$阶子式就是1阶子式，变成了矩阵乘法的法则定义，例如$c_{11}$，$A$的包含第1行的全部1阶子式，
$B$的包含第1列的全部1阶子式，

**证明**
$C\begin{bmatrix}i_1,i_2,\cdots,i_r\\\ j_1,j_2,\cdots,j_r\end{bmatrix}$

$=\underset{r\times r}{
\begin{bmatrix}
c_{i_1j_1}&c_{i_1j_2}&c_{i_1j_3}&\cdots&c_{i_1j_r}
\\\ 
c_{i_2j_1}&c_{i_2j_2}&c_{i_2j_3}&\cdots
&c_{i_2j_r}\\\ 
c_{i_3j_1}&c_{i_3j_2}&c_{i_3j_3}&\cdots
&c_{i_3j_r}\\\ 
\vdots&\vdots&\vdots&\ddots&\vdots\\\ 
c_{i_rj_1}&c_{i_rj_2}&c_{i_rj_3}&\cdots&c_{i_3r_r}
\end{bmatrix}}$

$=\underset{r\times n}{\begin{bmatrix}
a_{i_11}&a_{i_12}&\cdots&a_{i_1n}\\\ 
a_{i_21}&a_{i_22}&\cdots&a_{i_2n}\\\ 
a_{i_31}&a_{i_32}&\cdots&a_{i_3n}\\\ 
\vdots&\vdots&\ddots&\vdots\\\ 
a_{i_r1}&a_{i_r2}&\cdots&a_{i_rn}
\end{bmatrix}}\cdot
\underset{n\times r}{\begin{bmatrix}
b_{1j_1}&b_{1j_2}&\cdots&b_{1j_r}\\\ 
b_{2j_1}&b_{2j_2}&\cdots&b_{2j_r}\\\ 
b_{3j_1}&b_{3j_2}&\cdots&b_{3j_r}\\\ 
\vdots&\vdots&\ddots&\vdots\\\ 
b_{nj_1}&b_{nj_2}&\cdots&b_{nj_r}
\end{bmatrix}}$

$=A^\prime_{r\times n}\cdot B^\prime_{n\times r}$

由Cauchy-Binet公式知
当$r>n$时，$r$阶子式值为零
当$r\le n$时，符合Cauchy-Binet公式的第二条

**备注**
不等式关系(PS：理解证明过程之后，就不会在纠结这个不等关系了)
$1\le n\le m$
$\Rightarrow1\le r\le n\le m$ (公式)
$\Rightarrow1\le n\le r\le m$ (零)

$1\le m\le n$
$\Rightarrow1\le r\le m\le n$ (公式)
$\Rightarrow1\le m\le r\le n$ (不存在)

$\Rightarrow r\le n$ 公式
