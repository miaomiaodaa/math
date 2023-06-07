**内容**    
设 $A=\lgroup a_{ij}\rgroup_{m\times n}，    
B=\lgroup b_{ij}\rgroup_{n\times m}$ 为矩阵，可以得出以下断言    
    
 $1^\circ 若 m>n，则 |AB|=0$     
    
 $2^\circ 若 m\leq n，则 |AB|$     
 $=\sum\limits_{1\le j_1<\cdots<j_m\le n}    
A\begin{bmatrix}1,2,\cdots,m\\\ j_1,j_2,\cdots,j_m\end{bmatrix}    
\cdot B\begin{bmatrix}j_1,j_2,\cdots,j_m\\\ 1,2,\cdots,m\end{bmatrix}$     
    
**说明**    
1  $A\begin{bmatrix}1,2,\cdots,m\\\ j_1,j_2,\cdots,j_m\end{bmatrix}    
和 B\begin{bmatrix}j_1,j_2,\cdots,j_m\\\ 1,2,\cdots,m\end{bmatrix}$ 是 $m$ 阶<font color=red>子式</font>，    
    
 $\enspace$ <font color=blue>不是余子式，也不是代数余子式</font>    
    
2 求和项一共 $C_n^m$ 项    
    
3 当 $m=n$ 时退化成了 $|AB|=|A|\cdot|B|$     
 $A$ 的 $m$ 阶子式就是 $A$ 本身，且只有一个    
 $B$ 的 $m$ 阶子式就是 $B$ 本身，且只有一个    
    
4  $A\begin{bmatrix}1,2,\cdots,m\\\ j_1,j_2,\cdots,j_m\end{bmatrix}$ 是 $A$ 的全部最高阶子式    
    
 $\enspace B\begin{bmatrix}j_1,j_2,\cdots,j_m\\\ 1,2,\cdots,m\end{bmatrix}$ 是 $B$ 的全部最高阶子式    
    
5 这个公式还能有转置的形式    
    
6 方阵分解：分解成若干同阶矩阵乘积；    
 $\enspace$ 分解成 $(m\times n)与(n\times m)$ 阶矩阵乘积    
    
    
**辨析**    
 $(j_1,j_2,j_3,\cdots,j_m)\neq(A_n^m)$     
 $(j_1,j_2,j_3,\cdots,j_m)\subset(A_n^m)$     
 $(j_1,j_2,j_3,\cdots,j_m)是(A_n^m)$ 中逆序数为零的那些元素的集合    
 $\rm{count}(j_1,j_2,j_3,\cdots,j_m)=C_n^m$     
每组里面只有一个逆序数为零的    
