**二级结论1: 利用约当标准型，求特征值的几何重数、代数重数、特征子空间的基**    
    
设 $\Phi\in\mathbb{L}(V_\mathbb{C}^n)$ ，初等因子组为 $(\lambda-\lambda_1)^{r_1},\ (\lambda-\lambda_2)^{r_2},\ \cdots,\ (\lambda-\lambda_k)^{r_k}$     
    
<font color=brown>Part1: 特征值的代数重数</font>    
虽然用 $\lambda_1,\lambda_2,\cdots,\lambda_k$ 表示特征值，但是没说它们互不相同    
因此任意一个特征值 $\lambda_i$ 的代数重数介于 $r_i$ 与 $r_1+r_2+\cdots+r_k$ 之间    
而巧合等于所有 $\lambda_i$ 对应的 $\rm{Jordan}$ 块阶数之和    
特征值 $\lambda_i$ 的代数重数 $=$ 包含 $\lambda_i$ 的初等因子的所有幂次之和 $=$  $\lambda_i$ 对应的所有 $\rm{Jordan}$ 块的阶数之和    
    
<font color=brown>Part2: 特征值的几何重数(有点绕)</font>    
特征值的几何重数    
 $=\lambda_i$ 对应的特征空间的维数，即 $\rm{dim}(V_{\lambda_i})$     
特征空间 $=$ 特征值对应的齐次线性方程组的解空间 $=K^n$ 的核空间    
 $\Rightarrow \rm{dim}(V_{\lambda_i})=\rm{dim}(\lambda_i I-J)=n-\rm{rank}(\lambda_i I-J)$     
分块对角阵阵的秩 $=$ 每个分块秩的和    
 $\rm{rank}(\lambda_i I-J)=\sum\limits_{j=1}^{k}\rm{rank}(\lambda_i I_{r_j}-J_{r_j}(\lambda_j))$     
    
 $(1)$ 设 $\lambda_i$ 重复了 $s$ 次， $1\le s\le k$     
 $(2)\rm{rank}(\lambda_i I_{r_j}-J_{r_j}(\lambda_j))=\begin{cases}    
r_j-1&i=j\\\    
r_j&i\neq j    
\end{cases}$     
 $(3)n=$ 方阵的阶数 $=$ 全体 $\rm{Jordan}$ 块阶数的和    
    
结合 $(1),(2),(3)$     
 $\Rightarrow\rm{dim}(V_{\lambda_i})=s=$  $\lambda_i$ 对应的 $\rm{Jordan}$ 块的块数    
 $\Rightarrow$ 特征值 $\lambda_i$ 的几何重数 $=$  $\lambda_i$ 对应的 $\rm{Jordan}$ 块的块数    
    
复习: $\enspace$  像空间的维数 $=$ 表示矩阵的秩    
解空间 $=$ 核空间有点陌生，反应不过来    
特征值 $\lambda_1$ 的全体特征向量构成的空间    
 $=\lambda_1$ 对应的齐次线性方程组的解空间    
 $=K^n$ 在线性变换 $J-\lambda_1I$ 下的核空间    
 $=V_n$ 在线性变换 $\Phi-\lambda_1I_V$ 下的核空间    
    
核空间的维数与像空间的维数，有点陌生    
    
Part1+Part2= $\rm{Jordan}$ 标准型的特征值的几何重数与代数重数    
    
<font color=brown>Part3: 特征子空间的基</font>    
由 $\begin{cases}    
\Phi(e_{i1})=\lambda_i\cdot e_{i1}&\\\ \Phi(e_{i2})=e_{i1}+\lambda_i\cdot e_{i2}&\\\ \cdots&\\\ \Phi(e_{ir_i})=e_{ir_{i-1}}+\lambda_i\cdot e_{ir_i}  \end{cases}\ (1)\quad, \forall\ 1\le i\le k$     
可得特征值 $\lambda_i$ 的特征子空间的基为 $(e_{11},e_{21},\cdots,e_{s1})$     
特征值与广义特征值    
