**内容**    
设 $A$ 是 $n$ 阶 $\rm{Hermite}$ 阵，则存在非异复矩阵 $C$ ，使得 $(\overline{C})^T\cdot A\cdot C$ 为实对角阵    
    
任意 $f(x_1,x_2,\cdots,x_n)=\sum\limits_{j=1}^n\sum\limits_{i=1}^na_{ij}\cdot\overline{x_i}\cdot x_j$     
都可以化简成 $g(y_1,y_2,\cdots,y_n)=d_1\cdot\overline{y_1}\cdot y_1+d_2\cdot\overline{y_2}\cdot y_2+\cdots+d_r\cdot\overline{y_r}\cdot y_r$     
    
**说明**    
二次型 $\xrightarrow{对称初等变换}$ 标准型 $\xrightarrow{称初等变换}$ 规范标准型    
 $\rm{Hermite}$ 型 $\xrightarrow{共轭对称初等变换}$ 标准型 $\xrightarrow{也是共轭对称初等变换}$ 规范标准型    
二次型、 $\rm{Hermite}$ 型: 标准型，规范标准型    
实对称阵、 $\rm{Hermite}$ 阵: 合同标准型、复相合标准型    
    
**证明**    
Case1 若 $a_{11}\neq0$ ，结论自然成立    
    
Case2 若 $a_{11}=0$ ，但是 $a_{ii}\neq0,2\le i\le n$     
则 $P_{1i}\cdot A\cdot P_{1i}$ ，从而 $a_{11}\neq0$ ，结论得证    
    
Case3 若 $a_{ii}\neq0,1\le i\le n$     
任取 $a_{ij}\neq0(i<j)$     
    
 $\begin{bmatrix}    
0&a_{ij}\\\ \overline{a_{ij}}&0    
\end{bmatrix}    
\xrightarrow[第j列乘\overline{a_{ij}}，加到第i列]{第j行乘a_{ij}，加到第i行}    
\begin{bmatrix}    
2|a_{ij}|^2&a_{ij}\\\ \overline{a_{ij}}&0    
\end{bmatrix}$     
转换成Case2的情况    
    
接下来是数学归纳法    
 $A=\begin{bmatrix}a_{11}&a_{12}&\cdots&a_{1n}\\\ a_{21}&\\\ a_{31}&\\\ \vdots&\\\ a_{n1}\end{bmatrix}    
\xrightarrow[第1列乘-\tfrac{\overline{a_{i1}}}{a_{11}}，加到第i列]{第1行乘-\tfrac{a_{i1}}{a_{11}}，加到第i行}    
\begin{bmatrix}a_{11}&a_{12}&\cdots&a_{1n}\\\ a_{21}&\\\ a_{31}&\\\ \vdots&\\\ a_{n1}\end{bmatrix}$     
 $A_{n-1}$ 为 $n-1$ 阶 $\rm{Hermite}$ 型    
    
**证明说明**    
引理-任意对称阵都可以合同于首元非零阵    
定理-任意对称阵都可以合同于对角阵    
证明过程与上述两个定理的证明过程一致    
