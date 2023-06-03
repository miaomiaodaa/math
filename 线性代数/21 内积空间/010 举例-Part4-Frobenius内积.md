**例10:  $\rm{Frobenius}$ 内积**  
设 $V=M_n(\mathbb{R})$ ， $A,B\in V$   
定义 $(A,B)=\rm{tr}(A\cdot B^T)$   
  
**说明**  
基础矩阵是标准正交基  
  
**证明**  
证明对称性  
 $(B,A)$   
 $=\rm{tr}(BA^T)$   
 $=\rm{tr}((BA^T)^T)$   
 $=\rm{tr}(AB^T)$   
 $=(A,B)$   
  
第一变量线性  
引证:  $\rm{tr}(k\cdot A+l\cdot B)=k\cdot\rm{tr}(A)+l\cdot\rm{tr}(B)$   
  
 $(k\cdot A+l\cdot B,C)$   
 $=\rm{tr}((k\cdot A+l\cdot B)\cdot C^T)$   
 $=\rm{tr}(k\cdot A\cdot C^T+l\cdot B\cdot C^T)$   
 $=\rm{tr}(k\cdot A\cdot C^T)+\rm{tr}(l\cdot B\cdot C^T)$   
 $=k\cdot\rm{tr}(A\cdot C^T)+l\cdot\rm{tr}(B\cdot C^T)$   
 $=k\cdot(A,C)+l\cdot(B,C)$   
  
正定性  
预备:  
 $\begin{bmatrix}a_{11}&a_{12}\\\ a_{21}&a_{22}\end{bmatrix}  
\cdot\begin{bmatrix}a_{11}&a_{21}\\\ a_{12}&a_{22}\end{bmatrix}$ 主对角线元素等于平方和  
 $a_{11}^2+a_{12}^2,a_{21}^2+a_{22}^2$   
  
 $(A,A)=\rm{tr}(A\cdot A^T)=\sum\limits_{i=j=1}^na_{ij}^2\geq0$   
 $(A,A)=0$ 当且仅当 $A=$ 零矩阵  
  
