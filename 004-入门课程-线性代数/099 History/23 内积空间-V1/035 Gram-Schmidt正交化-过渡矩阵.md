**过渡矩阵**  
$(a_1,a_2,\cdots,a_m)=(b_1,b_2,\cdots,b_m)P$  
  
<font color=red> $b_{k+1}=a_{k+1}-\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot b_i$ </font>  
$\Rightarrow a_{k+1}=b_{k+1}+\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot b_i$  
  
$a_1=b_1$  
  
$a_1=(b_1,b_2,\cdots,b_m)\cdot\begin{bmatrix}p_{11}\\\ p_{21}\\\ \vdots\\\ p_{m1}\end{bmatrix}$  
  
$a_2=(b_1,b_2,\cdots,b_m)\cdot\begin{bmatrix}p_{12}\\\ p_{22}\\\ \vdots\\\ p_{m2}\end{bmatrix}$  
  
$\cdots$  
  
$a_m=(b_1,b_2,\cdots,b_m)\cdot\begin{bmatrix}p_{1m}\\\ p_{2m}\\\ \vdots\\\ p_{mm}\end{bmatrix}$  
  
$\Rightarrow P$ 的结构是主对角线元素为1的上三角阵 $\begin{bmatrix}  
1&\star&\star&\star\\\ &1&\star&\star\\\ &&\ddots&\star\\\ &&&1\end{bmatrix}$  
