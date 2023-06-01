**内容**
实对称阵($\rm{Hermite}$阵)的特征值是实对称阵($\rm{Hermite}$阵)正交相似的全系不变量

**证明**
<font color=blue>必要性</font>
相似矩阵具有相同的特征值，且正交相似是一种特殊的相似

$\Rightarrow$特征值是相似关系下的不变量

<font color=blue>充分性</font>
设实对称阵$A,B$的特征值为$\lambda_1,\lambda_2,\cdots,\lambda_n$

任意实对称阵($\rm{Hermite}$阵)均可对角化（<font color=red>这是与一般相似最大的区别</font>）

$\Rightarrow$正交阵$P,Q$，使得$P^T\cdot A\cdot P=\rm{diag}\{\lambda_1,\lambda_2,\cdots,\lambda_n\}$，

$Q^T\cdot B\cdot Q=\rm{diag}\{\lambda_{i_1},\lambda_{i_2},\cdots,\lambda_{i_n}\}$

其中$i_1,i_2,\cdots,i_n$是1到$n$的全排列

又因为$P_{ij}\cdot\rm{diag}\{\lambda_1,\cdots,\lambda_i,\cdots,\lambda_j,\cdots,\lambda_n\}\cdot P_{ij}
=\rm{diag}\{\lambda_1,\cdots,\lambda_j,\cdots,\lambda_i,\cdots,\lambda_n\}$

注意到$P_{ij}^T=P_{ij},\ P_{ij}^{-1}=P_{ij}$

$\Rightarrow P_{ij}$是正交阵

再因为正交证的乘积仍是正交阵

$\Rightarrow$存在正交阵$Q$，使得$\rm{diag}\{\lambda_1,\lambda_2,\cdots,\lambda_n\}=
Q^T\cdot\rm{diag}\{\lambda_{i_1},\lambda_{i_2},\cdots,\lambda_{i_n}\}\cdot Q$

再根据正交相似关系是等价关系
$A$与$\rm{diag}\{\lambda_1,\lambda_2,\cdots,\lambda_n\}$正交相似
$B$与$\rm{diag}\{\lambda_{i_1},\lambda_{i_2},\cdots,\lambda_{i_n}\}$正交相似
$\rm{diag}\{\lambda_1,\lambda_2,\cdots,\lambda_n\}$与$\rm{diag}\{\lambda_{i_1},\lambda_{i_2},\cdots,\lambda_{i_n}\}$正交相似

$\Rightarrow A$与$B$正交相似
