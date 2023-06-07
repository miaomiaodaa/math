**内容**    
设具有如下结构的矩阵称为 $\rm{Jordan}$ 块    
 $J_r(\lambda_0)=\begin{bmatrix}    
\lambda_0&1&0&0&0&0\\\    
0&\lambda_0&1&0&0&0\\\    
0&0&\lambda_0&1&0&0\\\    
\vdots&\vdots&\vdots&\cdots&\vdots&\vdots\\\    
0&0&0&\cdots&\lambda_0&1\\\    
0&0&0&\cdots&0&\lambda_0    
\end{bmatrix}_{r\times r}$     
则有以下结论成立    
 $1^\circ\ J_r(\lambda_0)$ 的初等因子为 $(\lambda-\lambda_0)^r$     
    
 $2^\circ\ J_r(\lambda_0)$ 的行列式因子为 $(\underbrace{1,\cdots,1}_{r-1},(\lambda-\lambda_0)^r)$     
    
 $3^\circ\ J_r(\lambda_0)$ 的不变因子为 $(\underbrace{1,\cdots,1}_{r-1},(\lambda-\lambda_0)^r)$     
    
 $4^\circ\ J_r(\lambda_0)$ 的特征多项式为 $f(\lambda)=(\lambda-\lambda_0)^r$     
    
 $5^\circ\ $ 主对角线上的元素就是特征值    
    
**说明**    
 $J_r(\lambda_0)$ 称为 $\rm{Jordan}$ 块， $J_r(\lambda_0)$ 有特殊含义，属于保留字    
    
**证明**    
证明思路: 全程按定义证明，特征矩阵 $\to$ 行列式因子 $\to$ 不变因子 $\to$ 初等因子，一步步计算    
    
 $\lambda I_r-J_r=$     
    
 $\begin{bmatrix}    
\lambda-\lambda_0&-1&0&0&0&0\\\    
0&\lambda-\lambda_0&-1&0&0&0\\\    
0&0&\lambda-\lambda_0&-1&0&0\\\    
\vdots&\vdots&\vdots&\cdots&\vdots&\vdots\\\    
0&0&0&\cdots&\lambda-\lambda_0&-1\\\    
0&0&0&\cdots&0&\lambda-\lambda_0    
\end{bmatrix}_{r\times r}$     
    
 $\Rightarrow D_r(\lambda)=|\lambda I_r-J_r|=    
(\lambda-\lambda_0)^r$     
    
观察 $\lambda I_r-J_r$ 的结构    
 $\forall\ 1\le k\le r-1$ ，存在 $k$ 阶子式 $(-1)^k$     
 $\Rightarrow D_k(\lambda)=1$     
    
 $\Rightarrow J$ 的行列式因子为 $(\underbrace{1,\cdots,1}_{r-1},(\lambda-\lambda_0)^r)$     
    
 $\Rightarrow J$ 的不变因子为 $(\underbrace{1,\cdots,1}_{r-1},(\lambda-\lambda_0)^r)$     
    
 $\Rightarrow J$ 的初等因子为 $(\lambda-\lambda_0)^r$     
