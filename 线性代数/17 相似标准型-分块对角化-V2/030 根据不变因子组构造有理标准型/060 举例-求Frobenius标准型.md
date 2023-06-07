**例1**  
设方阵 $A$ 的不变因子为 $1,1,1,\lambda-1,(\lambda-1)^2,(\lambda-1)^2(\lambda+1)$  
求 $A$ 的有理标准型  
  
**说明**  
已知全部非常数不变因子，或行列式因子，可以反推出 $A$ 的阶数，以及1的个数  
  
注意观察，确实是前驱整除后继  
  
相抵矩阵具有相同的行列式因子 $+$ 行列式定义  
 $\Rightarrow A$ 的特征多项式 $=(\lambda-1)\cdot(\lambda-1)^2\cdot(\lambda-1)^2(\lambda+1)=\lambda^6-4\lambda^5+5\lambda^4-5\lambda^2+4\lambda-1$  
  
解  
写成所有 $\rm{Frobenius}$ 块  
  
 $\lambda-1\xrightarrow{友阵}[1]$  
  
 $(\lambda-1)^2=\lambda^2-2\lambda+1\xrightarrow{友阵}\begin{bmatrix}0&1\\\ -1&2\end{bmatrix}$  
  
 $(\lambda-1)^2(\lambda+1)=\lambda^3-\lambda^2-\lambda+1\xrightarrow{友阵}  
\begin{bmatrix}0&1&0\\\ 0&0&1\\\ -1&1&1\end{bmatrix}$  
  
 $\Rightarrow A$ 的有理标准型 $=  
\left[\begin{array}{c:cc:ccc}  
1&0&0&0&0&0\\\hdashline  
0&0&1&0&0&0\\\  
0&-1&2&0&0&0\\\hdashline  
0&0&0&0&1&0\\\  
0&0&0&0&0&1\\\  
0&0&0&-1&1&1  
\end{array}\right]$  
