**内容**
设$A$是$n$阶实对称阵($\rm{Hermite}$阵)，则存正交阵(酉阵)$P$，
使得$P^\cdot A\cdot P$($\bar P^T\cdot A\cdot P$)是实对角阵

**证明**
构造线性算子$\Phi:\begin{array}{l}\mathbb{C}^n\longrightarrow\mathbb{C}^n(标准内积)\\\ \alpha\longmapsto A\alpha\end{array}$

$\Phi$在标准单位列向量$(e_1,e_2,\cdots,e_n)$下的表示矩阵为$A$

$A$是$n$阶实对称阵($\rm{Hermite}$阵)

$\Rightarrow\Phi$是自伴随算子

$\Rightarrow\exists\mathbb{C}^n$的另一个标准正交基$(\alpha_1,\alpha_2,\cdots,\alpha_n)$，
使得$\Phi$在该基下的表示矩阵为实对角阵$\Lambda$

即$(\Phi(\alpha_1),\Phi(\alpha_2),\cdots,\Phi(\alpha_n))=(\alpha_1,\alpha_2,\cdots,\alpha_n)\cdot\Lambda$

$\Leftrightarrow A\cdot(\alpha_1,\alpha_2,\cdots,\alpha_n)=(\alpha_1,\alpha_2,\cdots,\alpha_n)\cdot\Lambda$

$\left(\begin{array}{c}
A\cdot\alpha_1=\alpha_1\lambda_1\\\ 
A\cdot\alpha_2=\alpha_2\lambda_2\\\ 
\cdots\\\
A\cdot\alpha_n=\alpha_n\lambda_n
\end{array}\right)$ 这不就是特征值与特征向量吗！

令$P=(\alpha_1,\alpha_2,\cdots,\alpha_n)$

$\Rightarrow P$是酉阵

$\Rightarrow A\cdot P=P\cdot\Lambda$

$\Rightarrow P^{-1}\cdot A\cdot P=\Lambda$

$\Rightarrow (\overline{P})^T\cdot A\cdot P=\Lambda$
