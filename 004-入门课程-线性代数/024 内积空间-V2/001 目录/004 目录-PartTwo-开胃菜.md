**伴随算子**  
引子: 计算 $(\Phi(\alpha),\beta)$ 的内积  
  
定义1: 伴随算子  
设 $\Phi$ 是线性空间 $V$ 上的一个线性算子，  
若存在线性算子 $\Phi^\star$ ，使得任意 $\alpha,\beta\in V$ ，  
都有 $(\Phi(\alpha),\beta)=(\alpha,\Phi^\star(\beta))$ ，  
则称 $\Phi^\star$ 是 $\Phi$ 的伴随算子  
  
定理1: 若线性变换 $\Phi$ 存在伴随算子，则是唯一的(无论是否有限维)  
  
定理2: 有限维内积空间上的任意线性算子一定存在伴随算子  
(由引子的构造过程可证)  
  
<font color=red>定理3: 伴随算子的表示矩阵: 转置(欧几里得空间)、共轭转置(酉空间)</font>  
设 $V$ 是 $n$ 维内积空间， $(e_1,e_2,\cdots,e_n)$ 是一个标准正交基，线性变换 $\Phi\in\mathbf{L}(V)$ 的表示矩阵为 $A$ ，  
则 $\Phi$ 的伴随算子 $\Phi^\star$ 在该基下的表示矩阵为 $(\overline A)^T$ (酉空间)，或者 $A^T$ (欧几里得空间)  
矩阵转置的几何意义: 伴随算子的表示矩阵  
  
<font color=blue>定理4: 伴随算子的运算性质</font>  
设 $V$ 是内积空间(有限维或无限维，实内积或复内积)， $\Phi,\Psi\in\mathbf{L}(V)$ 是线性变换， $c$ 是常数(实内积空间是实数，复内积空间是复数)，若 $\Phi,\Psi$ 都存在伴随算子 $\Phi^\star,\Psi^\star$ ，则以下运算性质成立  
 $1^\circ\ (\Phi+\Psi)^\star=\Phi^\star+\Psi^\star$  
 $2^\circ\ (c\cdot\Phi)^\star=\overline{c}\cdot\Phi^\star$  
 $3^\circ\ (\Phi\circ\Psi)^\star=\Psi^\star\circ\Phi^\star$  
 $4^\circ\ (\Phi^\star)^\star=\Phi$  
 $5^\circ\ $ 若 $\Phi$ 可逆，则 $\Phi^\star$ 也可逆，且 $(\Phi^\star)^{-1}=(\Phi^{-1})^\star$  
(矩阵与线性变换的一一对应，矩阵运算与线性变换运算的一一对应)  
  
<font color=red>定理5: 正交补空间是 $\Phi^\star$ 不变子空间</font>  
设 $V$ 是有限维内积空间， $\Phi$ 是线性算子， $\Phi^\star$ 是 $\Phi$ 的伴随算子  
若 $U$ 是 $\Phi$ 不变子空间，则 $U^{\perp}$ 是 $\Phi^\star$ 不变子空间  
  
定理6: 伴随算子的特征值  
设 $V$ 是有限维内积空间， $\Phi$ 是线性算子，  
若 $\Phi$ 的全体特征值为 $\lambda_1,\lambda_2,\cdots,\lambda_n$ ，则 $\Phi^\star$ 的特征值为 $\overline{\lambda_1},\overline{\lambda_2},\cdots,\overline{\lambda_n}$  
推论1: 有限维实内积空间， $\Phi$ 与 $\Phi^\star$ 有相同的特征值  
  
举例-例1: 正交投影变换的伴随算子，进一步，还是自伴随算子  
举例-例2: 基于 $\rm{Frobenius}$ 内积的伴随算子  
  
---  
  
**保持内积的线性映射(同构)**  
本节课主题: 内积空间的同构、正交变换、酉变换  
  
引例1: 线性同构 $\varphi:V\to\mathbb{R}^n$  
引例2: 线性同构 $\varphi:V\to\mathbb{C}^n$  
(保持内积的线性同构举例)  
(通过标准正交基，建立保持内积的线性同构)  
  
<font color=green>定义1: 保持内积的线性映射</font>  
设 $V,U$ 同为实内积空间(复内积空间)， $\Phi:V\to U$ 是线性映射，  
若任取 $\alpha,\beta\in V$ ，都有 $\lgroup\alpha,\beta\rgroup_V=\lgroup\Phi(\alpha),\Phi(\beta)\rgroup_U$ ，则称 $\Phi$ 是保持内积的线性映射  
(重点记忆: $(\alpha,\beta)$ 是 $V$ 上的内积， $(\Phi(\alpha),\Phi(\beta))$ 是 $U$ 上的内积)  
  
<font color=green>定义2: 保持内积的线性同构</font>  
进一步，若 $\Phi$ 是线性同构，则称 $\Phi$ 是保持内积的线性同构，简称保积同构  
  
<font color=green>命题1: 保持内积的线性同构具有等价关系</font>  
  
<font color=green>命题2: 保持内积的线性映射是单射</font>  
设 $V,U$ 同为实内积空间(复内积空间)， $\Phi:V\to U$ 是线性映射  
若任取 $\alpha,\beta\in V$ ，都有 $(\alpha,\beta)_V=(\Phi(\alpha),\Phi(\beta))_U$ ，则 $\Phi$ 是单射  
注: 虽然是单射，但未必是满射  
  
<font color=green>定义3: 保持范数， $\Vert\alpha\Vert=\Vert\Phi(\alpha)\Vert$ </font>  
  
<font color=green>命题3: 保持内积的线性映射保持范数</font>  
设 $V,U$ 同为实内积空间(复内积空间)， $\Phi:V\to U$ 是线性映射  
若任取 $\alpha,\beta\in V$ ，都有 $(\alpha,\beta)_V=(\Phi(\alpha),\Phi(\beta))_U$ ，则 $\Vert\alpha\Vert=\Vert\Phi(\alpha)\Vert$  
  
<font color=green>定义4: 保持距离， $\Vert\alpha-\beta\Vert=\Vert\Phi(\alpha)-\Phi(\beta)\Vert$ </font>  
  
<font color=green>命题4: 保持内积的线性映射保持距离</font>  
设 $V,U$ 同为实内积空间(复内积空间)， $\Phi:V\to U$ 是线性映射  
若任取 $\alpha,\beta\in V$ ，都有 $(\alpha,\beta)_V=(\Phi(\alpha),\Phi(\beta))_U$ ，则 $\Vert\alpha-\beta\Vert=\Vert\Phi(\alpha)-\Phi(\beta)\Vert$  
  
<font color=green>命题5: 保持范数的线性映射保持内积</font>  
设 $\Phi:V\to U$ 是实(复)内积空间上的线性映射，若 $\Vert\alpha\Vert=\Vert\Phi(\alpha)\Vert$ ，则 $(\alpha,\beta)=(\Phi(\alpha),\Phi(\beta))$  
设 $\Phi:V\to U$ 是实(复)内积空间上的线性映射，若 $\Phi$ 保持范数，则 $\Phi$ 保持内积  
  
<font color=green>推论1: 线性映射 $\Phi$ 保持内积 $\Leftrightarrow$ 保持范数</font>  
  
<font color=green>命题6: 保持内积的4个充要条件</font>  
设 $U,V$ 是 $n$ 维度实(复)内积空间， $\Phi:V\to U$ 是线性映射，则以下结论等价  
 $1^\circ\ \Phi$ 保持内积  
 $2^\circ\ \Phi$ 是保持内积的线性同构  
<mark> $3^\circ\ \Phi$ 将 $V$ 的任一标准正交基映射成 $U$ 的标准正交基</mark>  
<mark> $4^\circ\ \Phi$ 将 $V$ 的某个标准正交基映射成 $U$ 的标准正交基</mark>  
  
<font color=green>命题7: 保持内积的线性同构存在性-当且仅当维数相等</font>  
设 $V,U$ 是实(复)内积空间，则存在 $\Phi:V\to U$ 是保持内积的线性同构 $\Leftrightarrow\rm{dim}(V)=\rm{dim}(U)$  
  
(上半节课结束: $V$ 与 $U$ 之间保持内积的线性映射、同构)  
(下半节课结束: $V$ 上保持内积的线性变换、自同构---正交算子、酉算子)  
  
**保持内积的线性变换(自同构)---正交算子、酉算子**  
<font color=green>定义1: 正交算子</font>--实内积空间上，保持内积的线性变换  
<font color=green>定义2: 酉算子</font>--复内积空间上，保持内积的线性变换  
  
<font color=green>推论1: 正交算子、酉算子是线性同构</font>  
(由上半节课[命题6: 保持内积的4个充要条件]立即得证)  
  
<font color=green>定理1: 保积变换判定定理1--用伴随算子判定</font>  
设 $\Phi$ 是有限维内积空间 $V$ 上的线性算子，  
则 $\Phi$ 是保积变换(正交算子或酉算子) $\Leftrightarrow\Phi$ 可逆，且 $\Phi^\star=\Phi^{-1}$  
  
<font color=green>定理2: 保积变换判定定理2--保积变换在标准正交基下的表示矩阵</font>  
设 $V_{\mathbb{R}}^n$ 是实内积空间， $\Phi$ 是保积变换(正交算子) $\Leftrightarrow\Phi$ 在任意标准正交基下的表示矩阵 $A$ 具有 $A^T=A^{-1}$  
设 $V_{\mathbb{C}}^n$ 是复内积空间， $\Phi$ 是保积变换(酉算子) $\Leftrightarrow\Phi$ 在任意标准正交基下的表示矩阵 $A$ 具有 $(\overline{A})^T=A^{-1}$  
<font color=green>定义3: 正交阵-- $A\in M_n(\mathbb{R})$ ， $A^T=A^{-1}$ </font>  
<font color=green>定义4: 酉阵-- $A\in M_n(\mathbb{C})$ ， $(\overline{A})^T=A^{-1}$ </font>  
  
<font color=green>定理3: 保积变换判定定理3--正交阵的3个充要条件</font>  
设 $A\in M_n(\mathbb R)$ ，则以下结论等价  
 $1^\circ\ A$ 是正交阵  
 $2^\circ\ A$ 的 $n$ 个行向量是 $\mathbb R_n$ 标准内积下的一个标准正交基  
 $3^\circ\ A$ 的 $n$ 个列向量是 $\mathbb R^n$ 标准内积下的一个标准正交基  
<font color=green>推论1: $A$ 是正交阵 $\Leftrightarrow A\cdot A^T=I_n\Leftrightarrow A^T\cdot A=I_n$ </font>  
  
<font color=green>定理4: 保积变换判定定理4--酉阵的3个充要条件</font>  
设 $A\in M_n(\mathbb C)$ ，则以下结论等价  
 $1^\circ\ A$ 是酉阵  
 $2^\circ\ A$ 的 $n$ 个行向量是 $\mathbb C_n$ 标准内积下的一个标准正交基  
 $3^\circ\ A$ 的 $n$ 个列向量是 $\mathbb C^n$ 标准内积下的一个标准正交基  
<font color=green>推论1: $A$ 是酉阵 $\Leftrightarrow A\cdot(\overline A)^T=I_n\Leftrightarrow (\overline A)^T\cdot A=I_n$ </font>  
  
命题1: 正交阵是一种特殊的酉阵  
命题2: 单位阵是正交阵或酉阵  
命题3: 两个正交阵的乘积仍然是正交阵  
命题4: 正交阵的逆阵仍然是正交阵  
命题5: 两个酉阵的乘积仍然是正交阵  
命题6: 酉阵的逆阵仍然是酉阵  
命题7: 对角阵是正交阵，当且仅当主对角线上元素是 $\pm1$  
命题8: 二阶正交阵分类  
(谢版以例题形式给出)  
  
命题9: 酉阵行列式的模是1  
命题10: 正交阵行列式1或 $-1$  
命题11: 酉阵的特征值模长是1  
命题11: 正交阵的特征值模长是1  
  
**方阵的QR分解**  
设 $A\in M_n(\mathbb{R})$ ，则 $A=QR$ ，其中 $Q$ 是正交矩阵， $R$ 为主对角线元素都大于等于零的上三角阵，进一步，若 $A$ 非异，则分解方式唯一  
设 $A\in M_n(\mathbb{C})$ ，则 $A=QR$ ，其中 $Q$ 是酉阵， $R$ 为主对角线元素都大于等于零的上三角阵，进一步，若 $A$ 非异，则分解方式唯一  
  
(以上是开胃菜结束，下面是正餐)  
