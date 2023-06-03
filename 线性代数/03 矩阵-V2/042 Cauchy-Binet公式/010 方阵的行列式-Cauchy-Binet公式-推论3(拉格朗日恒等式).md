**拉格朗日恒等式**  
 $\left(\sum\limits_{i=1}^na_i^2\right)  
\cdot\left(\sum\limits_{i=1}^nb_i^2\right)  
-\left(\sum\limits_{i=1}^na_ib_i\right)^2  
=\sum\limits_{1\leq i<j\leq n}(a_ib_j-a_jb_i)^2$   
  
**说明**  
当 $i=1$ 时， $j$ 从 $2$ 到 $n$ ， $n-1$ 项  
当 $i=2$ 时， $j$ 从 $3$ 到 $n$ ， $n-2$ 项  
当 $i=3$ 时， $j$ 从 $4$ 到 $n$ ， $n-3$ 项  
 $\cdots$   
当 $i=n-1$ 时， $j$ 从 $n$ 到 $n$ ， $1$ 项  
一共 $n(n-1)/2$ 项  
  
**证明**  
 $\begin{bmatrix}  
\sum\limits_{i=1}^n a_i^2&  
\sum\limits_{i=1}^n a_ib_i\\\   
\sum\limits_{i=1}^n a_ib_i&  
\sum\limits_{i=1}^n b_i^2  
\end{bmatrix}$   
  
 $=\underset{2\times n}{\underline{\begin{bmatrix}  
a_1&a_2&a_3&\cdots a_n\\\   
b_1&b_2&b_3&\cdots b_n  
\end{bmatrix}}}  
\cdot\underset{n\times2}{\underline{\begin{bmatrix}  
a_1&b_1\\\   
a_2&b_2\\\   
a_3&b_3\\\   
\vdots&\vdots\\\   
a_n&b_n  
\end{bmatrix}}}$   
  
 $=\sum\limits_{1\leq i<j\leq n}  
A\begin{bmatrix}1&2\\\ i&j\end{bmatrix}  
\cdot B\begin{bmatrix}i&j\\\ 1&2\end{bmatrix}$   
  
 $=\sum\limits_{1\leq i<j\leq n}  
\begin{vmatrix}a_i&a_j\\\ b_i&b_j\end{vmatrix}  
\cdot  
\begin{vmatrix}a_i&b_i\\\ a_j&b_j\end{vmatrix}$   
  
 $=\sum\limits_{1\leq i<j\leq n}  
(a_ib_j-a_jb_i)\cdot(a_ib_j-a_jb_i)$   
  
 $=\sum\limits_{1\leq i<j\leq n}(a_ib_j-a_jb_i)^2$   
<br/><br/>  
  
**证明补充**  
 $\begin{bmatrix}  
a_1&a_2&a_3&\cdots a_n\\\   
b_1&b_2&b_3&\cdots b_n  
\end{bmatrix}  
=\begin{bmatrix}  
a_1&b_1\\\   
a_2&b_2\\\   
a_3&b_3\\\   
\vdots&\vdots\\\   
a_n&b_n  
\end{bmatrix}^T$   
  
 $=\sum\limits_{1\leq i<j\leq n}  
A\begin{bmatrix}1&2\\\ i&j\end{bmatrix}  
\cdot B\begin{bmatrix}i&j\\\ 1&2\end{bmatrix}$   
  
 $=\sum\limits_{1\leq i<j\leq n}  
A\begin{bmatrix}1&2\\\ i&j\end{bmatrix}^2$   
  
 $=\sum\limits_{1\leq i<j\leq n}  
\begin{vmatrix}a_i&a_j\\\ b_i&b_j\end{vmatrix}^2$   
  
 $=\sum\limits_{1\leq i<j\leq n}(a_ib_j-a_jb_i)^2$   
