**内容**  
$f(x_1,x_2,\cdots,x_n)  
=\sum\limits_{j=1}^n\sum\limits_{i=1}^na_{ij}\cdot\overline{x_i}\cdot x_j  
=(\overline{X})^T\cdot A\cdot X$  
  
$\begin{array}{c}  
\Phi:&\{n阶\rm{Hermite}阵\}&\longrightarrow&\{n元\rm{Hermite}型\}\\\  
&A&\longmapsto&(\overline{X})^T\cdot A\cdot X  
\end{array}$  
  
**断言**  
$\Phi$ 是双射  
  
**推导**  
映射关方向是由阵到型，之前方向记反了  
  
<font color=blue>Step1 证明是映射</font>  
设 $A$ 是 $\rm{Hermite}$ 阵  
  
$=(\overline{x_1},\overline{x_2},\cdots,\overline{x_n})\cdot A\cdot\begin{bmatrix}x_1\\\ x_2\\\ \vdots\\\ x_n\end{bmatrix}$  
  
$=\left(\sum\limits_{i=1}^n\overline{x_i}\cdot a_{i1},\sum\limits_{i=1}^n\overline{x_i}\cdot a_{i2},\cdots,\sum\limits_{i=1}^n\overline{x_i}\cdot a_{in}\right)\cdot\begin{bmatrix}x_1\\\ x_2\\\ \vdots\\\ x_n\end{bmatrix}$  
  
$=\sum\limits_{i=1}^n\overline{x_i}\cdot a_{i1}\cdot x_1+\sum\limits_{i=1}^n\overline{x_i}\cdot a_{i2}\cdot x_2+\cdots+\sum\limits_{i=1}^n\overline{x_i}\cdot a_{in}\cdot x_n$  
  
$=\sum\limits_{j=1}^n\sum\limits_{i=1}^n\overline{x_i}\cdot a_{ij}\cdot x_j$  
  
$=\sum\limits_{j=1}^n\sum\limits_{i=1}^na_{ij}\cdot\overline{x_i}\cdot x_j$  
  
$\Rightarrow f(x_1,x_2,\cdots,x_n)  
=\sum\limits_{j=1}^n\sum\limits_{i=1}^na_{ij}\cdot\overline{x_i}\cdot x_j  
=(\overline{X})^T\cdot A\cdot X$  
  
由计算过程得，任意给定一个 $\rm{Hermite}$ 阵，有且只有唯一的 $\rm{Hermite}$ 型与之对应，所以是映射  
  
<font color=blue>Step2 证明是满射</font>  
任给一个 $\rm{Hermite}$ 型，都能找到对应的 $\rm{Hermite}$ 阵  
任取 $\rm{Hermite}$ 型，提取系数，可以构造一个 $\rm{Hermite}$ 阵；或者Step1中的每一步均可逆  
  
<font color=blue>Step3 证明是单射</font>  
二次型是作为多项式相等， $\rm{Hermite}$ 型是作为函数，是零函数，对于一切自变量，函数都是零  
设 $A-B=C=\lgroup c_{ij}\rgroup_{n}$  
1 取 $X=(0,\cdots,\underset{i}1,\cdots,0)^T\Rightarrow c_{ii}=0$  
  
2 取 $X=(0,\cdots,\underset{i}1,\cdots,\underset{j}1,\cdots,0)^T\Rightarrow c_{ij}+c_{ji}=0$  
$(c_{i1}+c_{j1},c_{i2}+c_{j2},\cdots,c_{in}+c_{jn})$  
$\Rightarrow(c_{ii}+c_{ji})+(c_{ij}+c_{jj})$  
$\Rightarrow c_{ij}+c_{ji}$  
  
3 取 $X=(0,\cdots,\underset{i}1,\cdots,\underset{j}i,\cdots,0)^T\Rightarrow c_{ij}-c_{ji}=0$  
$(c_{i1}+c_{j1}\cdot i,c_{i2}+c_{j2}\cdot i,\cdots,c_{in}+c_{jn}\cdot i)$  
$\Rightarrow(c_{ii}-c_{ji})+(c_{ij}-c_{jj})$  
$\Rightarrow c_{ij}-c_{ji}$  
