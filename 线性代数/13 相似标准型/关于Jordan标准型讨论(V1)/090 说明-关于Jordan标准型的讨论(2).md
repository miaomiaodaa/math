**第二类问题**
原理:
矩阵问题条件和结论在相似关系不改变，
则可将此问题化到$\rm{Jordan}$标准型，
进一步化到$\rm{Jordan}$块进行证明

三段论证
证明结论对$\rm{Jordan}$块成立$\to$对$\rm{Jordan}$标准型成立$\to$对一般矩阵成立

**例1(复矩分解)**
任意$n$阶复矩阵都能分解成两个对称矩阵的乘积
设$A\in M_n(\mathbf{C})$，则存在$B,C$是对称矩阵，使得$A=B\cdot C$

证:
根据$\rm{Jordan}$标准型理论: $A$与$A$的$\rm{Jordan}$标准型相似
$\Rightarrow\exists$可逆阵$P$，使得$P^{-1}\cdot A\cdot P=\rm{diag}\{J_{r_1}(\lambda_1),\ J_{r_2}(\lambda_2),\ \cdots,\ J_{r_k}(\lambda_k)\}$

先证明任意$\rm{Jordan}$块都能分解成对称阵的乘积
$J_{r_i}(\lambda_i)=\begin{bmatrix}\lambda_i&1\\\ &\lambda_i&1\\\ &&\ddots&1\\\ &&&\lambda_i \end{bmatrix}
=\underset{S_i}{\underline{\begin{bmatrix}&&1&\lambda_i\\\ &1&\lambda_i&\\\ 1&/&\\\ \lambda_i\end{bmatrix}}}
\cdot\underset{T_i}{\underline{\begin{bmatrix}&&&1\\\ &&1&\\\ &/&\\\ 1\end{bmatrix}}}$
$\Rightarrow J_{r_i}(\lambda_i)=S_i\cdot T_i$

推广到$\rm{Jordan}$标准型
令$S=\rm{diag}\{S_1, S_2, \cdots, S_k\},\quad T=\rm{diag}\{T_1, T_2, \cdots, T_k\}$
又因为分块对角阵的乘积$=$每个分块的乘积
$\Rightarrow J=S\cdot T$，其中$S,T$是对称的矩阵

最后推广到一般矩阵
$P^{-1}\cdot A\cdot P=J$
$\Rightarrow A=P\cdot J\cdot P^{-1}$
$\Rightarrow A=P\cdot S\cdot T\cdot P^{-1}$
$\Rightarrow A=P\cdot S\cdot P^T\cdot (P^T)^{-1}\cdot T\cdot P^{-1}$
$\Rightarrow A=(P\cdot S\cdot P^T)\cdot (P^{-1})^T\cdot T\cdot P^{-1}$
$\Rightarrow A=(P\cdot S\cdot P^T)\cdot [(P^{-1})^T\cdot T\cdot P^{-1}]$

又因为若$A^T=A$，则$B^TAB$是对称矩阵
$\Rightarrow (P\cdot S\cdot P^T)$是对称阵，$[(P^{-1})^T\cdot T\cdot P^{-1}]$是对称阵

**例2(计算幂次)**
设$A\in M_n(\mathbb{C})$，求$A^m$
解
$P^{-1}\cdot A\cdot P=J=\rm{diag}\{J_{r_1}(\lambda_1),\cdots,J_{r_k}(\lambda_k)\}$

$\Rightarrow A=P\cdot J\cdot P^{-1}=P\cdot \rm{diag}\{J_{r_1}(\lambda_1),\cdots,J_{r_k}(\lambda_k)\}\cdot P^{-1}$

$\Rightarrow A^m=(P\cdot J\cdot P^{-1})^m=(P\cdot \rm{diag}\{J_{r_1}(\lambda_1),\cdots,J_{r_k}(\lambda_k)\}\cdot P^{-1})^m$
$=P\cdot \rm{diag}\{J_{r_1}(\lambda_1)^m,\cdots,J_{r_k}(\lambda_k)^m\}\cdot P^{-1}$

$\rm{J}_{r_i}(\lambda_i)=cI_n+N$，其中$N$表示幂零阵

$\Rightarrow\rm{J}_{r_i}(\lambda_i)^m=(cI_n+N)^m$

注意到$cI_n$可逆，因此满足交换律，所以可以用二项式定理展开

$=\lambda_i^kI_n+C_m^1\lambda_i^{m-1}N+C_m^2\lambda_i^{m-2}N^2+\cdots+C_m^{m-1}\lambda_i^{m-n+1}N^{n-1}+\mathbf{O}+\cdots+\mathbf{O}$

$=\begin{bmatrix}
\lambda_0^m&C_m^1\lambda_0^{m-1}&\cdots&C_m^{n-1}\lambda_0^{k-n+1}\\\ 
&\lambda_0^m&C_m^1\lambda_0^{m-1}&\vdots\\\ 
&&\ddots&C_m^1\lambda_0^{m-1}\\\ 
&&&\lambda_0^m
\end{bmatrix}$

再把所有的$\rm{Jordan}$块拼起来，就能算出一般矩阵的幂次，

**备注**
1 特殊情况是可对角化时
2 宋浩再矩阵部分讲过算高次幂
