**证法一**
<font color=brown>先证线性同构把零向量映射成零向量</font>，即$\Phi(\mathbf0_V)=\mathbf0_U$

令$\alpha=\beta=\mathbf0_V\in V$

$\Phi$是线性同构

$\Rightarrow
\Phi(\alpha+\beta)=\Phi(\alpha)+\Phi(\beta)$

$\Rightarrow\Phi(\mathbf0_V)
=\Phi(\mathbf0_V+\mathbf0_V)
=\Phi(\mathbf0_V)+\Phi(\mathbf0_V)$

$\Rightarrow\Phi(\mathbf0_V)
-\Phi(\mathbf0_V)=\Phi(\mathbf0_V)$ (移项/消去律)

$\Rightarrow\mathbf0_U=\Phi(\mathbf0_V)$

**说明**
1 注意此处的$\mathbf0$向量，
左边的说$V_K$中的零向量，右边的是$U_K$中的零向量
括号里的是$V_K$中的零向量，没括号的是$U_K$中的零向量

2 因为$\Phi$是双射，$\Rightarrow\Phi^{-1}(\mathbf0_U)=\mathbf0_V$

**证法二**
$\Phi(\mathbf0_V)$

$=\Phi(0\cdot\mathbf0_V)$

$=0\cdot\Phi(\mathbf0_V)$

$=\mathbf0_U$

$\Rightarrow\Phi(\mathbf0_V)=\mathbf0_U$
