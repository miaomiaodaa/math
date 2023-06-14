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
  
**奇异值分解与极分解**  
推论1: 设 $A\in M_n(\mathbb{R})$ ，则 $A$ 的极分解 $\Leftrightarrow A$ 的奇异值分解  
  
**求奇异值分解**  
