**引言**  
1 给线性空间增加度量(问题来了，如何给[度量]下定义)，此处的[度量]是指能够定义向量的长度，向量之间的距离  
2 本章只研究有限维实、复内积空间  
3 对后续课程的指导: 泛函分析、微分几何、计算数学、数字线性代数  
  
**引例**  
三维欧几里得空间的点积: $\vec\alpha\cdot\vec\beta=x_1y_1+x_2y_2+x_3y_3$  
定义长度: $\Vert\vec\alpha\Vert=\sqrt{\vec\alpha\cdot\vec\alpha}=\sqrt{x_1^2+x_2^2+x_3^2}$  
定义距离: $d(\vec\alpha,\vec\beta)=\Vert\vec\alpha-\vec\beta\Vert=\sqrt{(x_1-y_1)^2+(x_2-y_2)^2+(x_3-y_3)^2}$  
  
点积的性质  
设 $\vec\alpha,\vec\beta,\vec\gamma\in\mathbb{R}^3,c\in\mathbb{R}$  
1 对称性: $\vec\alpha\cdot\vec\beta=\vec\beta\cdot\vec\alpha$  
2 第一变元线性-加法: $(\vec\alpha+\vec\beta)\cdot\vec\gamma=\vec\alpha\cdot\vec\gamma+\vec\beta\cdot\vec\gamma$  
3 第一变元线性-数乘: $(c\vec\alpha)\cdot\vec\beta=c(\vec\alpha\cdot\vec\beta)$  
4 正定性: $\vec\alpha\cdot\vec\alpha\geq0$ ，等号成立，当且仅当 $\vec\alpha=\mathbf{\vec0}$  
  
---  
  
**实内积与实内积空间**  
定义1: 二元运算  
 $V\times V\to\mathbb{R},\ \alpha\times\beta\mapsto(\alpha,\beta)$  
  
定义2: 实内积运算  
实线性空间上，满足对称性、第一变元线性、正定性的二元运算  
 $1^\circ\ $ 对称性: $\enspace$ $(\alpha,\beta)=(\beta,\alpha)$  
 $2^\circ\ $ 第一变元线性-加法: $\enspace$ $(\alpha+\beta,\gamma)=(\alpha,\gamma)+(\beta,\gamma)$  
 $3^\circ\ $ 第一变元线性-数乘: $\enspace$ $(c\alpha,\beta)=c(\alpha,\beta),\ c\in\mathbb{R}$  
 $4^\circ\ $ 正定性: $\enspace$ $(\alpha,\alpha)\geq0$ ，且等号成立 $\Leftrightarrow\alpha=\mathbf{0}$  
(特别注意: 等号成立条件)  
  
定义3: 实内积空间  
定义了实内积运算的实线性空间  
  
定义4: 欧几里得空间  
有限维实内积空间  
  
**复内积与复内积空间**  
定义1: 二元运算  
 $V\times V\to\mathbb{C},\ \alpha\times\beta\mapsto(\alpha,\beta)$  
  
定义2: 复内积运算  
实线性空间上，满足对称性、第一变元线性、正定性的二元运算  
 $1^\circ\ $ 共轭对称性: $\enspace$ $(\alpha,\beta)=\overline{(\beta,\alpha)}$  
 $2^\circ\ $ 第一变元线性-加法: $\enspace$ $(\alpha+\beta,\gamma)=(\alpha,\gamma)+(\beta,\gamma)$  
 $3^\circ\ $ 第一变元线性-数乘: $\enspace$ $(c\alpha,\beta)=c(\alpha,\beta),\ c\in\mathbb{C}$  
 $4^\circ\ $ 正定性: $\enspace$ $(\alpha,\alpha)\geq0$ ，且等号成立 $\Leftrightarrow\alpha=\mathbf{0}$  
(特别注意: 等号成立条件)  
  
定义3: 复内积空间  
定义了复内积运算的复线性空间  
  
定义4: 酉空间  
有限维复内积空间  
  
**内积运算的基础推论**  
(谢版以备注的形式给出)  
断言1: 复内积运算的正定性是良定义的  
由[共轭对称性]即可得  
  
命题1: 实内积运算第二变元也具有线性  
 $(\alpha,k\cdot\beta+l\cdot\gamma)=k\cdot(\alpha,\beta)+l\cdot(\alpha,\gamma)$  
  
命题2: 复内积运算第二变元具有共轭线性  
 $(\alpha,k\cdot\beta+l\cdot\gamma)=\bar k\cdot(\alpha,\beta)+\bar l\cdot(\alpha,\gamma)$  
  
命题3: 实内积运算以及实内积空间的定义相容于复内积运算以及复内积空间的定义  
  
(补充内积的基本运算性质)  
(数乘结合律，源自内积定义第一变元线性)  
(加法对内积分配律，也是源自内积定义第一变元线性)  
  
**内积空间举例**  
<font color=blue>例1: $n$ 维实列向量空间 $\mathbb{R}^n$ 的标准内积</font>  
设 $V=\mathbb{R}^n$ ， $\alpha=\begin{bmatrix}x_1\\\ x_2\\\ \vdots\\\ x_n\end{bmatrix},\ \beta=\begin{bmatrix}y_1\\\ y_2\\\ \vdots\\\ y_n\end{bmatrix}$  
定义 $(\alpha,\beta)=\alpha^T\cdot\beta=x_1\cdot y_1+x_2\cdot y_2+\cdots+x_n\cdot y_n$ (矩阵乘法)  
  
<font color=blue>例2: $n$ 维实行向量空间 $\mathbb{R}_n$ 的标准内积</font>  
设 $V=\mathbb{R}_n$ ， $\alpha=\begin{bmatrix}x_1&x_2&\cdots&x_n\end{bmatrix},\ \beta=\begin{bmatrix}y_1&y_2&\cdots& y_n\end{bmatrix}$  
定义 $(\alpha,\beta)=\alpha\cdot\beta^T=x_1\cdot y_1+x_2\cdot y_2+\cdots+x_n\cdot y_n$ (矩阵乘法)  
  
<font color=blue>例3: $n$ 维实列向量空间 $\mathbb{C}^n$ 的标准内积</font>  
设 $V=\mathbb{C}^n$ ， $\alpha=\begin{bmatrix}x_1\\\ x_2\\\ \vdots\\\ x_n\end{bmatrix},\ \beta=\begin{bmatrix}y_1\\\ y_2\\\ \vdots\\\ y_n\end{bmatrix}$  
定义 $(\alpha,\beta)=\alpha^T\cdot\overline\beta=x_1\cdot\overline{y_1}+x_2\cdot\overline{y_2}+\cdots+x_n\cdot\overline{y_n}$ (矩阵乘法)  
  
<font color=blue>例4: $n$ 维实行向量空间 $\mathbb{C}_n$ 的标准内积</font>  
设 $V=\mathbb{C}_n$ ， $\alpha=\begin{bmatrix}x_1&x_2&\cdots&x_n\end{bmatrix},\ \beta=\begin{bmatrix}y_1&y_2&\cdots& y_n\end{bmatrix}$  
定义 $(\alpha,\beta)=\alpha\cdot(\overline\beta)^T=x_1\cdot\overline{y_1}+x_2\cdot\overline{y_2}+\cdots+x_n\cdot\overline{y_n}$ (矩阵乘法)  
  
<font color=blue>例5: 非标准内积-基于正定实对称阵的内积</font>  
设 $V=\mathbb{C}^2$ ， $\alpha=\begin{bmatrix}x_1\\\ x_2\end{bmatrix},\ \beta=\begin{bmatrix}y_1\\\ y_2\end{bmatrix}$  
定义 $(\alpha,\beta)=x_1y_1-x_2y_1-x_1y_2+4x_1y_1$  
 $=(x_1-x_2)(y_1-y_2)+3x_2y_2$  
 $=\alpha^T\cdot\begin{bmatrix}1&-1\\\ -1&4\end{bmatrix}\cdot\beta$  
(其实例1-4就是取 $I_n$ )  
  
<font color=blue>例6: 非标准内积-基于正定实对称阵的内积</font>  
设 $V=\mathbb{R}^n$ ， $G$ 是 $n$ 阶正定实对称阵， $\alpha,\beta\in\mathbb{R}^n$  
定义 $(\alpha,\beta)=\alpha^T\cdot G\cdot\beta$  
(这不是Gram矩阵嘛)  
(为啥必须是正定阵呢，因为要满足内积的正定性)  
  
<font color=blue>例7: 非标准内积-基于正定Hermite阵的内积</font>  
设 $V=\mathbb{C}^n$ ， $H$ 是 $n$ 阶正定 $\rm{Hermite}$ 阵， $\alpha,\beta\in\mathbb{C}^n$  
定义 $(\alpha,\beta)=\alpha^T\cdot H\cdot\overline{\beta}$  
(其实1-7都是一类)  
  
<font color=blue>例8: 无限维空间-积分内积</font>  
设 $V=\rm{C}[a,b]$ ， $(f(x),g(x))=\int_a^bf(x)\cdot g(x)\ dx$  
  
<font color=blue>例9: 无限维空间-多项式内积</font>  
设 $V=\mathbb{R}[x]$ ， $f(x)=a_0+a_1x+\cdots+a_nx^n$ ， $g(x)=b_0+b_1x+\cdots+b_mx^m$ ，其中 $m\geq n$  
定义 $(f(x),g(x))=a_0b_0+a_1b_1+\cdots+a_nb_n$  
  
<font color=blue>例10:  $\rm{Frobenius}$ 内积</font>  
设 $V=M_n(\mathbb{R})$ ， $A,B\in V$  
定义 $(A,B)=\rm{tr}(A\cdot B^T)$  
( $n^2$ 维矩阵空间的内积)  
(联动Cauchy-Benet公式)  
(分析特征多项式的结构-迹的性质)  
  
**向量的长度(范数)**  
定义1: 向量的长度(范数)  
设 $V_K^n$ 是内积空间， $\alpha$ 的长度(范数)定义为 $\Vert\alpha\Vert=\sqrt{(\alpha,\alpha)}$  
(绝对值、模长、范数)  
  
<font color=blue>命题1: 非负性</font>  
设 $V$ 是复内积空间， $\alpha,\beta\in V$ ， $c\in\mathbb{C}$ 是常数  
则 $\Vert\alpha\Vert\geq0$ ，等于零当且仅当 $\alpha=$ 零向量  
  
<font color=blue>命题2: 齐次性</font>  
设 $V$ 是复内积空间， $\alpha,\beta\in V$ ， $c\in\mathbb{C}$ 是常数  
则 $\Vert c\cdot\alpha\Vert=|c|\cdot\Vert\alpha\Vert$  
  
引理1: 零向量与任意向量的内积都是零向量  
  
<font color=blue>命题3: Cauchy-Schwarz不等式</font>  
设 $V$ 是复内积空间， $\alpha,\beta\in V$ ， $c\in\mathbb{C}$ 是常数  
则 $\vert(\alpha,\beta)\vert\leq\Vert\alpha\Vert\cdot\Vert\beta\Vert$ ，等号成立，当且仅当 $\alpha,\beta$ 线性相关  
 $\quad\vert(\alpha,\beta)\vert^2\leq(\alpha,\alpha)\cdot(\beta,\beta)$  
(三种表现形式: 实数域、积分形式、欧几里得空间)  
  
<font color=blue>命题4: 三角不等式</font>  
设 $V$ 是复内积空间， $\alpha,\beta\in V$ ， $c\in\mathbb{C}$ 是常数  
则 $\Vert\alpha+\beta\Vert\leq\Vert\alpha\Vert+\Vert\beta\Vert$ （数分中大量的出镜率）  
  
**向量的距离**  
定义1: 向量的距离  
设 $V_K^n$ 是内积空间， $\alpha$ 与 $\beta$ 的距离定义为 $\rm{d}(\alpha,\beta)=\Vert\alpha-\beta\Vert$  
  
命题1: 距离的对称性， $d(\alpha,\beta)=d(\beta,\alpha)$  
  
**向量夹角**  
定义1: 实内积空间夹角  
设 $V$ 是实内积空间， $\mathbf0\neq\alpha,\mathbf0\neq\beta\in V$ ，则向量 $\alpha,\beta$ 的夹角定义为  
实内积: $\cos\theta=\dfrac{(\alpha,\beta)}{\Vert\alpha\Vert\cdot\Vert\beta\Vert},\theta\in[0,\pi]$  
  
定义2: 复内积空间夹角  
设 $V$ 是复内积空间， $\mathbf0\neq\alpha,\mathbf0\neq\beta\in V$ ，则向量 $\alpha,\beta$ 的夹角定义为  
复内积: $\cos\theta=\dfrac{|(\alpha,\beta)|}{\Vert\alpha\Vert\cdot\Vert\beta\Vert},\theta\in\left[0,\dfrac\pi2\right]$  
  
**向量正交**  
定义1: 向量正交  
设 $V$ 是内积空间， $\alpha,\beta\in V$ ，  
若 $(\alpha,\beta)=\mathbf0$ ，则称 $\alpha$ 与 $\beta$ 正交(垂直)，记作 $\alpha\perp\beta$  
  
命题1: 零向量与任意向量正交  
  
命题2: 正交与90度  
若 $\mathbf0\neq\alpha,\mathbf0\neq\beta\in V$ ， $\alpha\perp\beta\iff\theta=\dfrac\pi2$  
  
定理: 广义勾股定理  
若 $\alpha\perp\beta$ ，则 $\Vert\alpha+\beta\Vert^2=\Vert\alpha\Vert^2+\Vert\beta\Vert^2$  
  
推广: 广义勾股定理  
 $\Vert\alpha+\beta+\gamma\Vert^2=\Vert\alpha\Vert^2+\Vert\beta\Vert^2+\Vert\gamma\Vert^2$  
  
---  
  
**实内积的度量矩阵(Gram矩阵)**  
引问: 给定一个内积空间，给定了一个基，如何用矩阵的方法把任何两个向量的内积表示出来  
  
定理1: 设 $V_{\mathbb{R}}$ 是内积空间， $(e_1,e_2,\cdots,e_n)$ 为 $V$ 的一个基，任取 $\alpha,\beta\in V_{\mathbb{R}}$ ，  
则 $(\alpha,\beta)=\mathbf{X}^T\cdot G\cdot\mathbf{Y}$ ，其中 $G=\lgroup(e_i,e_j)\rgroup_n$  
  
推论: $(\alpha,\beta)$ 与基的选取无关  
  
定义: 上述定理中的 $G$ 称为度量矩阵，或者Gram矩阵  
  
命题1: 度量矩阵 $G$ 是实对称阵  
设实内积空间 $V$ 关于基 $(e_1,e_2,\cdots,e_n)$ 的度量矩阵为 $G$ ，则 $G$ 是实对称阵  
  
命题2: 度量矩阵 $G$ 是正定阵  
设实内积空间 $V$ 关于基 $(e_1,e_2,\cdots,e_n)$ 的度量矩阵为 $G$ ，则 $G$ 是正定阵  
  
命题3: 任意正定实对称矩阵都是度量矩阵  
设 $V$ 是实内积空间， $(e_1,e_2,\cdots,e_n)$ 是 $V$ 的一个基， $G$ 是 $n$ 阶正定实对称矩阵，则 $G$ 是度量矩阵  
  
定理2: 正定实对称阵与实内积度量阵是一一对应的  
设 $V$ 是实线性空间， $(e_1,e_2,\cdots,e_n)$ 是给定的基  
 $\{V上的所有内积结构\}\xrightarrow{1:1}\{n阶正定实对称阵\}$  
 $\Phi:(-,-)\longmapsto\rm{G}=\lgroup(e_i,e_j)\rgroup_n$  
 $\Psi:(\alpha,\beta)=\mathbf{X}^T\cdot G\cdot\mathbf{Y}\longleftarrow G$  
则 $\Phi$ 与 $\Psi$ 互为逆映射  
  
**复内积的度量矩阵(Gram矩阵)**  
定理1: 设 $V_{\mathbb{C}}$ 是内积空间， $(e_1,e_2,\cdots,e_n)$ 为 $V$ 的一个基，任取 $\alpha,\beta\in V_{\mathbb{C}}$ ，  
则 $(\alpha,\beta)=\mathbf{X}^T\cdot G\cdot\mathbf{\overline Y}$ ，其中 $G=\lgroup(e_i,e_j)\rgroup_n$  
  
推论: $(\alpha,\beta)$ 与基的选取无关  
  
定义: 上述定理中的 $G$ 称为度量矩阵，或者Gram矩阵  
  
命题1: 度量矩阵 $G$ 是Hermite阵  
设复内积空间 $V$ 关于基 $(e_1,e_2,\cdots,e_n)$ 的度量矩阵为 $H$ ，则 $H$ 是共轭复对称阵  
  
命题2: 度量矩阵 $H$ 是正定阵  
设复内积空间 $V$ 关于基 $(e_1,e_2,\cdots,e_n)$ 的度量矩阵为 $H$ ，则 $H$ 是正定阵  
  
命题3: 任意正定Hermite阵都是度量矩阵  
设 $V$ 是复内积空间， $(e_1,e_2,\cdots,e_n)$ 是 $V$ 的一个基， $H$ 是 $n$ 阶正定共轭对称矩阵，则 $H$ 是度量矩阵  
  
定理2: 正定Hermite阵与复内积度量阵是一一对应的  
设 $V$ 是复线性空间， $(e_1,e_2,\cdots,e_n)$ 是给定的基  
 $\{V上的所有内积结构\}\xrightarrow{1:1}\{n阶正定\rm{Hermite}阵\}$  
 $\Phi:(-,-)\longmapsto\rm{G}=\lgroup(e_i,e_j)\rgroup_n$  
 $\Psi:(\alpha,\beta)=\mathbf{X}^T\cdot G\cdot\mathbf{\overline Y}\longleftarrow G$  
则 $\Phi$ 与 $\Psi$ 互为逆映射  
  
(实对称阵表示二次型)  
(正定实对称阵表示二次型、某种实内积结构)  
(Hermite阵表示Hermite型)  
(正定Hermite阵表示Hermite型、某种复内积结构)  
  
**标准正交基与正交化方法**  
引问: 是否存在一个基，使得度量矩阵为单位阵（与内积的具体定义形式无关）  
(是否存在一个基，使得表示矩阵相对比较简单)  
(是否能合同于对角阵)  
  
定义1: 正交基  
设 $V$ 是 $n$ 维内积空间， $(e_1,e_2,\cdots,e_n)$ 是一个基，  
若 $\forall\ i\neq j,\ (e_i,e_j)=0$ ，则称该基为正交基，  
  
定义2: 标准正交基(单位正交基)  
设 $V$ 是 $n$ 维内积空间， $(e_1,e_2,\cdots,e_n)$ 是一个正交基，  
若 $\forall\ 1\le i\le n,\ \Vert e_i\Vert=1$ ，则称该基为标准正交基  
  
举例: 标准正交基  
  
引理1: 两两正交的非零向量线性无关  
设 $V$ 是内积空间， $v_1,v_2,\cdots,v_k\in V$ 是两两正交的非零向量(即 $(v_i,v_j)=0,1\le i<j\le k$ )，  
则 $v_1,v_2,\cdots,v_k$ 线性无关  
  
引理2: $n$ 维内积空间中，任意正交非零向量组中向量的个数至多有 $n$ 个  
  
引理3: 设 $V$ 是内积空间，若向量 $\alpha\in V$ 与向量组 $(\beta_1,\beta_2,\cdots,\beta_k)\subseteq V$ 中任意向量正交  
则 $\alpha$ 与 $\rm{L}(\beta_1,\beta_2,\cdots,\beta_k)$ 中任意向量正交  
  
定理1: 格列姆-施密特正交化方法  
设 $V$ 是内积空间， $a_1,a_2,\cdots,a_m\in V$ 线性无关，  
则存在两两正交非零向量 $b_1,b_2,\cdots,b_m\in V$ ，  
使得 $U=\rm{L}(a_1,a_2,\cdots,a_m)=\rm{L}(b_1,b_2,\cdots,b_m)$  
  
命题1: 正交化递推公式  
<font color=red> $b_{k+1}=a_{k+1}-\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot b_i$ </font>  
  
命题2: 正交基到普通基的过渡矩阵的结构  
 $(a_1,a_2,\cdots,a_m)=(b_1,b_2,\cdots,b_m)P$  
过渡矩阵 $P$ 主对角线元素为1的上三角阵  
  
命题3: 标准化公式， $\left\Vert\dfrac{\alpha}{\Vert\alpha\Vert}\right\Vert=1$  
  
命题4: 标准正交基到到普通基的过渡矩阵的结构  
  
主定理: 任意有限维内积空间都存在标准正交基  
  
定理2: 合同变换法求标准正交基  
  
(定理3: 标准正交基判定定理)  
( $(e_1,e_2,\cdots,e_n)$ 是标准正交基 $\Leftrightarrow(e_i,e_j)=\delta_{ij}$ )  
(应该是遗漏了)  
  
标准正交基的应用  
1 将抽象向量的内积转化成对应的坐标向量的标准内积  
2 建立抽象内积空间与 $\mathbb{R}^n$ 或者 $\mathbb{C}^n$ 之间保持内积的线性同构  
  
---  
  
**补空间**  
定义1: 补空间  
设 $V_1,\ V_2$ 是数域 $K$ 上的线性空间 $V$ 的子空间，若 $V=V_1\oplus V_2$ ，则称 $V_2$ 是 $V_1$ 的一个补空间  
或者称 $V_1$ 是 $V_2$ 的一个补空间  
  
命题1: 设 $V$ 是数域 $K$ 上的 $n$ 维线性空间，则 $V$ 的每一个子空间 $U$ 都存在补空间  
(取 $U$ 中的一个基 $(a_1,a_2,\cdots,a_m)$ 扩张成 $V$ 的一个基 $(a_1,a_2,\cdots,a_m,b_1,b_2,\cdots,b_{n-m})$ )  
( $\Rightarrow V=\rm{Hom}(a_1,a_2,\cdots,a_m,b_1,b_2,\cdots,b_{n-m})$ )  
( $\Rightarrow V=\rm{Hom}(a_1,a_2,\cdots,a_m)+\rm{Hom}(b_1,b_2,\cdots,b_{n-m})$ )  
( $\Rightarrow V=U+W$ )  
(又因为 $U$ 与 $W$ 的基拼成全空间 $V$ 的基)  
( $\Rightarrow V=U\oplus W$ )  
( $\Rightarrow W$ 是 $U$ 的一个补空间)  
  
命题2: $U$ 的补空间不唯一  
(由基扩张的不唯一性，得补空间不唯一)  
  
**正交补空间**  
定义1: 集合 $\rm{U}^{\perp}=\{v\in V\mid(v,\rm{U})=0\}$  
  
引理1: $\rm{U}^{\perp}$ 是 $V$ 的子空间  
  
引理2: $\rm{U}^{\perp}$ 是 $U$ 的补空间  
  
定义2: 正交补空间，称 $\rm{U}^{\perp}$ 是 $U$ 的正交补空间  
  
定理1: 正交基扩张定理  
  
**投影变换**  
定义1: 投影映射  
  
引理1: 投影映射是线性变换  
  
定义2: 投影变换  
  
定义3: 幂等变换  
  
定理1: 幂等变换是一种投影变换  
  
定理2: 幂等变换的表示矩阵  
  
命题1: 投影变换是幂等变换  
推论1: $\Phi$ 是幂等变换 $\Leftrightarrow\Phi$ 是投影变换  
  
命题2: 不同投影变换的复合是零线性变换  
  
命题3: 所有投影变换的和是恒等映射  
  
**正交投影变换**  
定义3: 正交子空间  
  
定义4: 正交和  
  
定理3: 正交和是直和  
  
定义1: 正交投影变换  
  
命题4: 正交投影变换是子伴随算子  
  
**贝塞尔不等式**  
