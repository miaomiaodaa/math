**引子**  
1 内积空间上的相似标准型研究过了(保积算子、自伴随算子、正规算子)，正交相似标准型  
2 内积空间上的合同标准型也研究过了(自伴随算子)，正交合同标准型  
3 该研究下内积空间上的相抵标准型，正交相抵标准型  
相抵标准型 $\enspace\xrightarrow{内积空间，标准正交基}$ <mark>正交相抵标准型</mark>  
  
**引问**  
设 $A_{m\times n}$ 是实矩阵，则存在非异阵 $P,Q$ ，使得 $P^{-1}\cdot A\cdot Q=\begin{bmatrix}I_r&O\\\ O&O\end{bmatrix}$  
$P$ 的几何意义是 $m$ 维列向量间的过渡矩阵， $Q$ 的几何意义是 $n$ 维列向量间的过渡矩阵  
进入到内积空间之后，要求 $P$ 与 $Q$ 都是正交阵(酉阵)，那么 $P^{-1}\cdot A\cdot Q=$ 什么呢？  
  
**奇异值、右奇异向量、左奇异向量(代数版)**  
定义1: 奇异值、右奇异向量、左奇异向量  
设 $A\in M_{m\times n}(\mathbb{R})$ ，若存在**非负数** $\sigma$ ，非零向量 $v\in\mathbb{R}^n,\ u\in\mathbb{R}^m$ ，  
使得 $A\cdot v=\sigma\cdot u$ ，且 $A^T\cdot u=\sigma\cdot v$ ，  
则称 $\sigma$ 为 $A$ 的奇异值， $v$ 称为右奇异向量， $u$ 称为左奇异向量  
(这是特征值、特征向量的推广)  
  
**线性映射的伴随**  
命题1: 设 $V^n,\ U^m$ 是欧几里得空间， $\Phi:V\to U$ 是线性映射，  
则存在唯一的线性变换 $\Psi:U\to V$ ，使得 $\forall\ v\in V$ ， $u\in U$ ， $\lgroup\Phi(v),u\rgroup_U=\lgroup v,\Psi(u)\rgroup_V$ ，  
  
定义1: 线性映射的伴随  
这样的 $\Psi$ 称为 $\Phi$ 的伴随算子，记作 $\Phi^\star=\Psi$  
  
**奇异值、右奇异向量、左奇异向量(几何版)**  
设 $V,U$ 是实内积空间， $\Phi\in\mathbf{L}(V,U)$ ， $\Phi^\star$ 是 $\Phi$ 的伴随，若存在非负数 $\sigma$ ，非零向量 $v\in V,\ u\in U$ ，  
使得 $\Phi(v)=\sigma\cdot u$ ，且 $\Phi^\star(u)=\sigma\cdot v$ ，  
则称 $\sigma$ 为 $\Phi$ 的奇异值， $v$ 称为右奇异向量， $u$ 称为左奇异向量  
  
**线性映射与其伴随算子复合的性质**  
命题1: $\Phi^\star\Phi\in\mathbf{L}(V)$ 是半正定自伴随算子  
命题2: $\Phi^\star\Phi\in\mathbf{L}(V)$ 的特征值是 $\sigma^2$  
命题3: $\Phi\Phi^\star\in\mathbf{L}(U)$ 是半正定自伴随算子  
命题4: $\Phi\Phi^\star\in\mathbf{L}(U)$ 的特征值是 $\sigma^2$  
  
**奇异值分解定理**  
定理1: 奇异值分解定理(几何)  
设 $V,U$ 是实内积空间， $\Phi\in\mathbf{L}(V^n,U^m)$ ，  
则存在 $V$ 的标准正交基 $(e_1,e_2,\cdots,e_n)$ ， $U$ 的标准正交基 $(f_1,f_2,\cdots,f_m)$ ，  
使得 $\Phi$ 的表示阵为 $\begin{bmatrix}S&O\\\ O&O\end{bmatrix}$ ，其中 $S=\rm{diag}\{\sigma_1,\sigma_2,\cdots,\sigma_r\}$  
且 $\sigma_1\geq\sigma_2\geq\cdots\geq\sigma_r>0$ ，是 $\Phi$ 的所有正奇异值  
  
定理2: 奇异值分解定理(代数)  
设 $A$ 是 $m\times n$ 阶实矩阵，则存在 $m$ 阶正交阵 $P$ ， $n$ 阶正交阵 $Q$ ，  
使得 $P^T\cdot A\cdot Q=\begin{bmatrix}S&O\\\ O&O\end{bmatrix}$ ，其中 $S=\rm{diag}\{\sigma_1,\sigma_2,\cdots,\sigma_r\}$ ，  
且 $\sigma_1\geq\sigma_2\geq\cdots\geq\sigma_r>0$ 是 $A$ 的全体正奇异值， $r$ 是矩阵 $A$ 的秩  
  
**正交相抵标准型**  
定理1: 正交相抵标准型  
$\begin{bmatrix}S&O\\\ O&O\end{bmatrix}$ 就是 $A$ 的正交相抵标准型  
(回答了本节课开头的引问)  
  
**矩阵的奇异值分解(SVD分解)**  
定理1: 矩阵的奇异值分解  
设 $A$ 是 $m\times n$ 阶实矩阵，存在 $m$ 阶正交阵 $P$ ， $n$ 阶正交阵 $Q$ ，  
使得 $A=P\cdot\begin{bmatrix}S&O\\\ O&O\end{bmatrix}\cdot Q^T$ ，该分解称为矩阵 $A$ 的奇异值分解  
  
**SVD应用1-奇异值分解与极分解**  
推论1: 设 $A\in M_n(\mathbb{R})$ ，则 $A$ 的极分解 $\Leftrightarrow A$ 的奇异值分解  
  
**SVD应用2-矩阵的广义逆**  
引理1: 广义逆几何版  
设 $\Phi\in\mathbf{L}(V^n,U^m)$ ，其中 $V^n$ ， $U^m$ 都是欧几里得空间  
则存在唯一的线性映射 $\Phi^+:U^m\to V^n$ ，满足以下性质  
$1^\circ\ \Phi\circ\Phi^+\circ\Phi=\Phi$ ，  
$2^\circ\ \Phi^+\circ\Phi\circ\Phi^+=\Phi^+$ ，  
$3^\circ\ \Phi\circ\Phi^+$ 是 $U$ 上的自伴随算子， $\Phi^+\circ\Phi$ 是 $V$ 上的自伴随算子  
(证明过程只理解1/3)  
  
引理2: 广义逆代数版  
设 $A\in M_{m\times n}(\mathbb R)$ ，则存在唯一的 $A^+\in M_{n\times m}(\mathbb R)$ ，满足以下性质  
$1^\circ\ A\cdot A^+\cdot A=A$ ，  
$2^\circ\ A^+\cdot A\cdot A^+=A^+$ ，  
$3^\circ\ A\cdot A^+,A^+\cdot A$ 均为对称阵  
  
定义1: 广义逆  
  
关于广义逆的说明  
1 广义逆的定义有很多版本，这样定义的广义逆称为 $\rm{Moore-Penrose}$ 广义逆  
2 若 $\Phi$ 或 $A$ 可逆，则 $\Phi^+$ 或 $A^+$ 就退化成了 $\Phi^{-1}$ 或 $A^{-1}$  
3 若 $\Phi$ 是零线性映射或 $A$ 是零矩阵，则 $\Phi^+$ 是零线性映射或 $A^+$ 是零矩阵  
  
推论1: 奇异值分解求广义逆  
若 $A=P\cdot\begin{bmatrix}S&O\\\ O&O\end{bmatrix}_{m\times n}\cdot Q^T$ ，则 $A^+=Q\cdot\begin{bmatrix}S^{-1}&O\\\ O&O\end{bmatrix}_{n\times m}\cdot P^T$  
  
  
**广义逆与解线性方程组**  
引理1:  
设 $\Phi\in\mathbf{L}(V^n,U^m)$ ， $\Phi^+$ 是 $\Phi$ 的广义逆，则 $\Phi^+\Phi$ 是 $V$ 到 $(\rm{Ker}(\Phi))^\perp$ 的正交投影算子， $\Phi\Phi^+$ 是 $U$ 到 $(\rm{Im}(\Phi))^\perp$ 的正交投影算子  
(证明过程没看懂)  
  
定理1:  
设 $AX=\beta$ 是线性方程组，若有解，则 $z=A^+\beta$ 是范数最小解；若无解，则 $z=A^+\beta$ 是最佳逼近，即 $\Vert Az-\beta\Vert\le\Vert Ax-\beta\Vert$ ， $\forall\ x\in\mathbb R^n$  
