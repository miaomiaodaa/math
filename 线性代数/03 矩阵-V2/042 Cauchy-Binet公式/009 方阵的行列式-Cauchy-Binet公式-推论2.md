**内容：**
设$A$是$m\times n$的实矩阵，则$AA^T$的任意阶**主**子式都大于等于零，即$A\begin{bmatrix}i_1,i_2,\cdots,i_r\\\ j_1,j_2,\cdots,j_r\end{bmatrix}\geq0，1\leq r\leq m$

**证明：**
Case1 
若$n<r\leq m$，由Cauchy-Binet公式知$AA^T$任意$r$阶子式等于0，所以主子式等于0

Case2 
若 $1\leq r\leq n$

$AA^T\begin{bmatrix}i_1,i_2,\cdots,i_r\\\ i_1,i_2,\cdots,i_r\end{bmatrix}$

$=\sum\limits_{1\le k_1<k_2<\cdots<k_r\le n}
A\begin{bmatrix}i_1,i_2,\cdots,i_r\\\ k_1,k_2,\cdots,k_r\end{bmatrix}\cdot A^T\begin{bmatrix}k_1,k_2,\cdots,k_r\\\ i_1,i_2,\cdots,i_r\end{bmatrix}$

注意到上面两个$r$阶子式互为转置
由行列式转置，行列式值不变知
$A\begin{bmatrix}i_1,i_2,\cdots,i_r\\\ k_1,k_2,\cdots,k_r\end{bmatrix} =A^T\begin{bmatrix}k_1,k_2,\cdots,k_r\\\ i_1,i_2,\cdots,i_r\end{bmatrix}$

$=\sum\limits_{1\le k_1<k_2<\cdots<k_r\le n}
A\begin{bmatrix}i_1,i_2,\cdots,i_r\\\ k_1,k_2,\cdots,k_r\end{bmatrix}^2\geq0$

**证明补充**
$\underset{r\times r}{\begin{vmatrix}
a_{i_1k_1}&a_{i_1k_2}&\cdots&a_{i_1k_r}\\\ 
a_{i_2k_1}&a_{i_2k_2}&\cdots&a_{i_2k_r}\\\ 
a_{i_3k_1}&a_{i_3k_2}&\cdots&a_{i_3k_r}\\\ 
\vdots&\vdots&\ddots&\vdots\\\ 
a_{i_rk_1}&a_{i_rk_2}&\cdots&a_{i_3k_r}
\end{vmatrix}}\cdot
\underset{r\times r}{\begin{vmatrix}
a_{k_1i_1}&a_{k_1i_2}&\cdots&a_{k_1i_r}\\\ 
a_{k_2i_1}&a_{k_2i_2}&\cdots&a_{k_2i_r}\\\ 
a_{k_3i_1}&a_{k_3i_2}&\cdots&a_{k_3i_r}\\\ 
\vdots&\vdots&\ddots&\vdots\\\ 
a_{k_ri_1}&a_{k_ri_2}&\cdots&a_{k_3i_r}
\end{vmatrix}^T}$

