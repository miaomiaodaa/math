**定义部分**
<font color=blue>特征值，特征向量</font>
设$\Phi\in\mathbb{L}(V_K^n)$，$\lambda\in K$，若$\exists\mathbb{0}_V\neq\alpha\in V_K^n$，
使得$\Phi(\alpha)=\lambda\alpha$，则称$\lambda$是线性变换$\Phi$的特征值
$\alpha$是线性变换$\Phi$关于特征值$\lambda$的特征向量

设$A\in M_n(K)$，$\lambda\in K$，若$\exists\mathbb{0}_K\neq\alpha\in K^n$，
使得$A\alpha=\lambda\alpha$，则称$\lambda$是方阵$A$的特征值，
$\alpha$是方阵$A$的关于特征值$\lambda$的特征向量

$\Phi(\alpha)=\lambda\alpha$: 表示伸缩变换

<font color=blue>特征子空间</font>
设$V_K^n$是线性空间，$\Phi\in\mathbb{L}(V_K^n)$，$\lambda\in K$
则所有满足等式$\Phi(\alpha)=\lambda\alpha$的向量以及零向量构成的集合
是$V_K^n$的关于特征值$\lambda$的特征子空间
记作$V_\lambda=[\alpha|\Phi(\alpha)=\lambda\alpha]\cup$零子空间

设$A\in M_n(K)$，$\lambda\in K$
则所有满足等式$A\alpha=\lambda\alpha$的向量以及零向量构成的集合
即齐次线性方程组$(\lambda E_n-A_n)x=\mathbb{0}_K$的解集
是$K^n$的关于特征值$\lambda$的特征子空间

特征值，特征向量，特征子空间
特征方程，特征矩阵，特征行列式，特征多项式，特征根
矩阵多项式，适合多项式，极小(适合)多项式，相似矩阵，对角化
几何重数，代数重数，完全特征向量系

**命题部分**
<font color=brown>Part1</font>
1 求解特征值，特征向量
$\lambda_0$是$\Phi$的特征值
$\Leftrightarrow\exists\mathbb{0}_V\neq\alpha$，使得$\Phi(\alpha)=\lambda_0\alpha$
$\Leftrightarrow\exists\mathbb{0}_K\neq\alpha$，使得$A\alpha=\lambda_0\alpha$
$\Leftrightarrow$齐次线性方程组$(\lambda_0E_n-A_n)x=\mathbb{0}_K$有非零解$\textendash$<font color=blue>特征方程</font>
$\Leftrightarrow$方阵$[\lambda_0E_n-A_n]$不满秩，不可逆，奇异$\textendash$<font color=blue>特征矩阵</font>
$\Leftrightarrow$行列式$|\lambda_0E_n-A_n|=0,\ \textendash$<font color=blue>特征行列式</font>
$\Leftrightarrow$多项式$f(\lambda)=|\lambda_0E_n-A_n|$有根(有解)$\textendash$<font color=blue>特征多项式，特征根</font>
解出特征根，带入特征矩阵，求解特征方程，得到解空间，解空间就是特征值对应的全体特征向量

2 三角阵的特征值是主对角线元素
  推论: 对角阵的特征值是主对角线元素

3 全体特征值的和为方阵$A$的主对角线元素之和，即方阵$A$的迹

4 全体特征值之积为方阵$A$的行列式
  推论: 非异阵的第六充要条件: 方阵$A$非异，当且仅当特征值都不为零
  推广: $f(\lambda)的\sigma_r=$方阵$A$的$r$阶主子式之和

<font color=brown>Part2</font>
1 相似矩阵具有相同的秩: 矩阵乘以非异阵不改变矩阵的秩

2 相似矩阵具有相同的特征多项式
  推论: 相同的特征值，
       相同的行列式，
       相同的奇异性，
       相同的迹

3 $(P^{-1}\cdot A\cdot P)^m=P^{-1}\cdot A^m\cdot P$
  推论1: $f(P^{-1}\cdot A\cdot P)=P^{-1}\cdot f(A)\cdot P$
  推论2: 若$\Lambda=P^{-1}\cdot A\cdot P$，则$A^m=P\cdot\Lambda^m\cdot P^{-1}$，求高次幂的一种方式

4 任意方阵$A$在复数域上都存在与之相似的上(下)三角阵
  推广: 设$A\in M_n(K)$，若$A$在数域$K$上存在$n$个特征值，则$A$在$K$上存在与之相似的上(下)三角阵
  推论1: 矩阵转置，特征值不变
        三角阵的转置仍是三角阵，三角阵的特征值就是主对角线元素
        $(P^{-1}\cdot A\cdot P)^T=P^T\cdot A^T\cdot(P^{-1})^T=P^T\cdot A^T\cdot(P^T)^{-1}$
  推论2: 设$A$是可逆阵，$\lambda$是$A$的特征值，则$A^{-1}$的特征值为$\lambda^{-1}$（三角阵的逆阵？）

<font color=brown>Part3</font>
1 若$\Phi(\alpha)=\lambda\alpha$，则$\Phi(c\cdot\alpha)=\lambda(c\cdot\alpha)$

2 若$\Phi(\alpha_1+\alpha_2)=\lambda(\alpha_1+\alpha_2)$，则$\Phi(c_1\alpha_1+c_2\alpha_2)=\lambda(c_1\alpha_1+c_2\alpha_2)$

3 任意特征值对应的全体特征向量以及零向量构成$V_K^n$的一个子空间，称为关于特征值$\lambda$的特征子空间

4 特征子空间是$\Phi$不变子空间

5 特征子空间的和空间是直和空间
  $V_{\lambda_1}+V_{\lambda_1}+\cdots+V_{\lambda_k}=V_{\lambda_1}\oplus V_{\lambda_1}\oplus \cdots\oplus V_{\lambda_k}$
  推论: 不同特征值对应的特征向量线性无关

<font color=brown>Part4</font>
可对角化判定1: 
$\Phi$可对角化，当且仅当$\Phi$有$n$个线性无关的特征向量
$\Phi$可对角化，当且仅当$\Phi$的特征向量可构成全空间的一个基
$A$可对角化，当且仅当$A$有$n$个线性无关的特征向量

可对角化判定2:
若方阵$A$的特征方程没有重根，则$A$可对角化

可对角化判定3:
$\Phi$可对角化，当且仅当$V=V_{\lambda_1}\oplus V_{\lambda_1}\oplus \cdots\oplus V_{\lambda_k}$
全体特征子空间的和空间是全空间

可对角化判定4:
定义: 特征值$\lambda_0$对应的特征子空间的维数$\rm{dim}_K(V_{\lambda_0})$称为$\lambda_0$的几何维数
     $\lambda_0$所在方程的特征根$\lambda_0$的重数称为$\lambda_0$的代数维数
引理: $\lambda_0$的几何维数$\le\lambda_0$的代数维数，即特征子空间的维数$\le$特征根的重数
定义: 若$\Phi$的特征子空间的维数$=$特征根的重数，则称$\Phi$有完全特征向量系
$\Phi$可对角化，当且仅当$\Phi$有完全特征向量系

<font color=brown>Part5</font>
1 矩阵多项式的特征值
设$A\in M_n(K)$，$A$的特征值为$\lambda$，则$f(A)$的特征值为$f(\lambda)$
貌似2的证明方法可以用来证明1

2 特征值是适合多项式的根
设$A\in M_n(K)$，$A$的特征值为$\lambda$，若$f(A)=$零矩阵，则$f(\lambda)=0$

3 极小多项式存在性

4 极小多项式整除性: 极小适合多项式整除任意适合多项式

5 极小多项式唯一性

6 相似矩阵有相同的极小多项式（有相同的特征多项式）

7 分块对角阵的极小多项式: $m(x)=\rm{lcm}(m_1(x),m_2(x),\cdots,m_k(x))$

8 可对角化阵的极小多项式: $m(x)=(x-\lambda_1)(x-\lambda_2)\cdots(x-\lambda_k)$

9 特征值是极小多项式的根: 其实就是2的特殊情况

10 三角阵的特征多项式是它本身的适合多项式

11 任意方阵的特征多项式是它本身的适合多项式（凯莱-哈密顿定理）