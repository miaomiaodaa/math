**正规算子-引子**  
引子: 反过来考虑，从表示阵是复对角阵出发，能推出具有怎样的性质的线性变换  
  
设线性变换 $\Phi$ 在标准正交积 $(e_1,e_2,\cdots,e_n)$ 下的表示阵为复对角阵 $\Lambda$  
以及结论成立  
1 对角阵 $\Lambda$ 主对角线上元素是全体特征值  
2 $\Phi^\star$ 在该基下的表示阵为 $(\overline\Lambda)^T$  
3 $\Phi^\star$ 的特征值与 $\Phi$ 的特征值互为共轭  
4 $\Phi\circ\Phi^\star=\Phi^\star\circ\Phi$ ， $AA^T=A^TA$ (**反之是否成立，本节课主问题、主定理**)  
( $\Phi\circ\Phi^\star=\Phi^\star\circ\Phi$ 这里是否能扯到不变子空间的直和)  
  
**正规算子**  
<font color=green>定义1: 正规算子</font>  
设 $V$ 是 $n$ 维内积空间， $\Phi\in\mathbf{L}(V)$ ，  
若 $\Phi^\star\circ\Phi=\Phi\circ\Phi^\star$ ，则称 $\Phi$ 是 $V$ 上的正规算子  
  
<font color=green>定义2: 复正规算子</font>  
若 $V$ 是酉空间，则称 $\Phi$ 是 $V$ 上的复正规算子  
  
<font color=green>定义3: 实正规算子</font>  
若 $V$ 是欧几里得空间，则称 $\Phi$ 是 $V$ 上的实正规算子  
  
举例-正规算子  
1 自伴随算子、 2 正交算子、3 酉算子  
  
**正规阵**  
<font color=green>定义1: 复正规阵</font>  
设 $A\in M_n(\mathbb C)$ ，若 $A\cdot(\overline A)^T=(\overline A)^T\cdot A$ ，则称 $A$ 为复正规阵  
  
<font color=green>定义2: 实正规阵</font>  
设 $A\in M_n(\mathbb R)$ ，若 $A\cdot A^T=A^T\cdot A$ ，则称 $A$ 为实正规阵  
  
<font color=green>定义3: 正规阵</font>  
复正规阵，实正规阵统称为正规阵  
  
举例-复正规阵  
1 Hermite阵、2 酉阵  
  
举例-实正规阵  
1 实对称阵、2 正交阵  
  
**正规算子判定定理**  
定理1: 复正规算子判定定理1  
设 $V_{\mathbb{C}}^n$ 是复内积空间， $\Phi$ 是 $V$ 上的复正规算子 $\Leftrightarrow\Phi$ 在任意(某个)标准正交基下的表示阵具有 $A\cdot(\overline A)^T=(\overline A)^T\cdot A$ 的性质  
  
定理2: 实正规算子判定定理1  
设 $V_{\mathbb{R}}^n$ 是实内积空间， $\Phi$ 是 $V$ 上的实正规算子 $\Leftrightarrow\Phi$ 在任意(某个)标准正交基下的表示阵具有 $A\cdot A^T=A^T\cdot A$ 的性质  
  
定理3: 复正规算子判定定理2  
设 $V$ 是酉空间， $\Phi\in\mathbf{L}(V)$ ，若 $\Phi$ 在某个标准正交基下的表示阵为复对角阵，则 $\Phi$ 是正规算子  
  
**复正规算子的特征值-特征向量**  
<font color=green>引理1: 正规算子的范数</font>  
设 $V$ 是内积空间， $\Phi$ 是 $V$ 上的正规算子，则 $\Vert\Phi(\alpha)\Vert=\Vert\Phi^\star(\alpha)\Vert,\ \forall\ \alpha\in V$  
  
引理2: 设 $V$ 是<u>酉空间</u>，若 $\Phi$ 是 $V$ 上的正规算子，则 $\lambda I_n-\Phi$ 也是正规算子，其中 $\lambda\in\mathbb{C}$  
  
<font color=green>定理1: 复正规算子的特征值</font>  
设 $V$ 是<u>酉空间</u>， $\Phi$ 是 $V$ 上的正规算子  
若 $\alpha$ 是 $\Phi$ 关于特征值 $\lambda$ 的特征值向量，当且仅当 $\alpha$ 是 $\Phi^\star$ 关于特征值 $\overline\lambda$ 的特征值向量  
  
<font color=green>定理2: 复正规算子的特征向量</font>  
设 $V$ 是<u>酉空间</u>， $\Phi$ 是 $V$ 上的正规算子  
则 $\Phi$ 的不同特征值对应的特征向量相互正交  
  
**复正规算子的对角化**  
<font color=green>引理1: 舒尔定理-几何版</font>  
设 $\Phi$ 是<u>酉空间</u> $V$ 上的线性算子，则存在一个标准正交基，使得 $\Phi$ 在该基下的表示阵为上三角阵  
  
<font color=green>引理2: 舒尔定理-代数版</font>  
设 $A\in M_n(\mathbb{C})$ ，则存在<u>酉阵</u> $C\in M_n(\mathbb{C})$ ，使得 $B=(\overline{C})^T\cdot A\cdot C$ 是上三角阵  
  
<font color=green>主定理: 复正规算子的对角化-几何版</font>  
设 $\Phi$ 是<u>酉空间</u> $V$ 上的线性算子，  
则 $\Phi$ 是复正规算子，当且仅当 $\Phi$ 在某个标准正交基下的表示阵为复对角阵  
  
<font color=green>主定理: 复正规算子的对角化-代数版</font>  
设 $A\in M_n(\mathbb{C})$ 是复正规阵，则存在<u>酉阵</u> $P$ ，使得 $\Lambda=(\overline{P})^T\cdot A\cdot P$ 是复对角阵  
  
**复正规阵酉相似的全系不变量**  
定理: 设 $A,B$ 是同阶复正规阵， $A$ 与 $B$ 酉相似 $\Leftrightarrow A$ 与 $B$ 有相同的特征值  
  
**复正规阵的酉相似标准型**  
 $A\sim\rm{diag}\\{\lambda_1,\lambda_2,\cdots,\lambda_n\\}$  
  
**复正规算子对角化应用-酉算子对角化**  
<font color=green>定理1: 酉算子对角化</font>  
设 $A$ 为酉阵，则存在酉阵 $P$ ，使得 $\bar P^T\cdot A\cdot P=\rm{diag}\{c_1,c_2,\cdots,c_n\}$ ，其中 $|c_i|=1$  
(酉算子对角化、酉阵对角化、酉阵的酉相似标准型、酉阵酉相似的全系不变量)  
  
**复正规算子对角化应用-酉空间正交直和分解**  
<font color=green>定理1: 酉空间正交直和分解</font>  
设 $\Phi$ 是酉空间 $V$ 上的线性算子， $\lambda_1,\lambda_2,\cdots,\lambda_k$ 是 $\Phi$ 的全体不同特征值，  
 $V_1,V_2,\cdots,V_k$ 是对应的特征子空间，则 $\Phi$ 是正规算子，当且仅当 $V=V_1\perp V_2\perp\cdots\perp V_k$  
  
<font color=green>推论1: Euclid空间正交直和分解</font>  
设 $\Phi$ 是欧几里得空间 $V$ 上的自伴随算子， $\lambda_1,\lambda_2,\cdots,\lambda_k$ 是 $\Phi$ 的全体不同特征值，  
 $V_1,V_2,\cdots,V_k$ 是对应的特征子空间，则 $V=V_1\perp V_2\perp\cdots\perp V_k$  
  
(注: <font color=red>以上两条是PartThree，谱分解的引理</font>)  
  
**番外篇-窥探计算数学基础**  
