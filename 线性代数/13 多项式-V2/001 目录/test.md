**引子**  
丘版引子，单位阵  $\to$  纯量阵  $\to$  对角阵  $\to$  分块对角阵  
谢版也是从对角阵  $\to$  具有统一形状的分块对角阵入手的  
关键：**表示矩阵为对角阵的线性变换具有怎样的性质**  
(这是从必要性入手)  
  
若  $\Phi$  的表示矩阵为对角阵，这样的  $\Phi$  具有怎样的性质  
1   $\alpha=\sum\limits_{i=1}^na_i\cdot e_i$    
  $\Rightarrow\Phi(\alpha)=\sum\limits_{i=1}^na_i\cdot\lambda_i\cdot e_i$    
  
2 设  $\lambda_1=\cdots=\lambda_r\neq0$  ，  $\lambda_{r+1}=\cdots=\lambda_n=0$    
  $\Rightarrow\rm{r}(A)=\rm{r}(\Phi)=r$    
  
3 设  $\lambda_1=\cdots=\lambda_r\neq0$  ，  $\lambda_{r+1}=\cdots=\lambda_n=0$    
  $\Rightarrow\rm{Ker}(\Phi)=\rm{L}(e_{r+1},e_{r+2},\cdots,e_n)$    
  $\Rightarrow\rm{Im}(\Phi)=\rm{L}(e_1,e_{2},\cdots,e_r)$    
  
小结:   $\Phi(\alpha),\rm{r}(\Phi),\rm{Ker}(\Phi),\rm{Im}(\Phi)$  ，能把这些信息快速求得，关键点是  $\Phi(e_i)=\lambda_i\cdot e_i,\ 1\le i\le n$    
  
注意到能快速得到上述信息，  $\Phi(e_i)=\lambda_i\cdot e_i$  这组表达式起到了关键作用，可抽象归纳出以下信息  
1   $e_i\neq\mathbf0_V$    
所以抽象出特征值，特征向量的概念，(但是特征向量有无穷个，**所以这无穷个里面是否总包含基向量呢**，若包含，则可以对角化，则可以拼成全空间的基，就可以直和分解了  
特征值与特征向量是1对无穷的关系)  
  
**线性变换的特征值-特征向量**  
定义1：特征值，特征向量-几何版  
  $\Phi(e)=\lambda\cdot e$    
  
定义2：全体特征向量的集合  
  $V_{\lambda}=\\{e\mid\Phi(e)=\lambda\cdot e\\}=\\{\lambda的全体特征向量\\}\cup\\{\mathbf0_V\\}$    
  
命题1：  $V_{\lambda}$  是  $V$  的子空间  
  
命题2：  $V_{\lambda}$  是  $\Phi$  不变子空间  
  
定义3：特征子空间-几何版(一)  
  $V_{\lambda}=\\{e\mid\Phi(e)=\lambda\cdot e\\}$    
  
定义4：特征值，特征向量-代数版，  $A\cdot\alpha=\lambda\cdot\alpha$    
定义延伸过程：固定一个基  $(e_1,e_2,\cdots,e_n)$    
  $\Phi\xrightarrow{表示矩阵}A$  ，  $e\xrightarrow{坐标向量}\alpha$    
  $\Rightarrow\Phi(e)\xrightarrow{坐标向量}A\cdot\alpha$    
  $\Rightarrow\Phi(e)=\lambda\cdot e\longrightarrow A\cdot\alpha=\lambda\cdot\alpha$    
  
定义5：特征子空间-代数版  
线性方程组  $(\lambda I_n-A)x=\mathbf0$  的解空间  
(  $V_\lambda$  中每个向量的坐标向量都是上述线性方程组的一个解)  
  
定义6：特征子空间-几何版(二)  
  $V_{\lambda}=\rm{Ker}(\lambda I_V-\Phi)$    
  
**求特征值-特征向量-Part1**  
  $\lambda_0$  是  $A$  的特征值  
  $\iff\exists\alpha\neq\mathbf0,A\cdot\alpha=\lambda_0\cdot\alpha$    
  $\iff$  齐次线性方程组  $(\lambda_0 I_n-A)x=\mathbf0$  有非零解  
  $\iff\lambda_0 I_n-A$  是奇异阵  
  $\iff$  行列式  $|\lambda_0 I_n-A|=0$    
  $\iff\lambda_0$  是多项式  $|\lambda I_n-A|=0$  的根，方程的解  
  
**特征多项式-代数版**  
定义1：特征多项式-代数版  
  $f(\lambda)=|\lambda I_n-A|$    
(依赖于某个具体的数字矩阵)  
(脱离某个具体数字矩阵谈特征多项式没有意义)  
  $\begin{vmatrix}  
\lambda-a_{11}&-a_{12}&\cdots&-a_{1n}\\\  
-a_{21}&\lambda-a_{22}&\cdots&-a_{2n}\\\  
\vdots&\vdots&\ddots&\vdots\\\  
-a_{n1}&-a_{n2}&\cdots&\lambda-a_{nn}  
\end{vmatrix}$    
  
**分析特征多项式的结构**  
  $\lambda_0$  是一元多项式  $\begin{vmatrix}  
\lambda-a_{11}&-a_{12}&\cdots&-a_{1n}\\\  
-a_{21}&\lambda-a_{22}&\cdots&-a_{2n}\\\  
\vdots&\vdots&\ddots&\vdots\\\  
-a_{n1}&-a_{n2}&\cdots&\lambda-a_{nn}  
\end{vmatrix}$  在域  $F$  上的一个根  
  
丘版：  
用**列**单项可加性，将行列式拆成  $2^n$  个来研究的，没用广义韦达定理，老邱直接给出了证明  
  $\lambda^n+\cdots+(-1)^k\sum\limits_{1\le i_i<\cdots<i_k\le n}A\begin{pmatrix}i_1&i_2&\cdots&i_k\\\ i_1&i_2&\cdots&i_k\end{pmatrix}\lambda^{n-k}$    
这是第二次涉及主子式，第一次是Cauchy-Binet公式，顺序主子式是在二次型部分  
规律是这  $2^n$  个行列式  
含有  $n$  个  $\lambda$  : 最高次项  
含有  $n-1$  个  $\lambda$  : 次高次项  
含有  $n-2$  个  $\lambda$    
  $\cdots$    
含有  $n-k$  个  $\lambda$  : 通项，已截图，另一个手机  
  $\cdots$    
含有  $1$  个  $\lambda$    
含有  $0$  个  $\lambda$  : 常数项  
出现主子式是因为  $\lambda$  分布在主对角线上，划去  $\lambda$  所在行与所在列，始终都是对称的操作  
**注意**: 是<font color=red>列</font>单项可拆，然后再来普拉斯  
  
**相似矩阵有相同的特征多项式**  
命题1：相似矩阵有相同的特征多项式  
推论1：相似矩阵有相同的特征根  
  
**特征多项式-几何版**  
定义1：线性变换  $\Phi$  的特征多项式  
注：<font color=gray>线性变换  $\Phi$  的特征多项式，  $\Phi$  在不同基下有不同的表示矩阵，不同表示矩阵有不同的特征多项式(虽然张的不一样，但是化简完应该是一样的)，这些多项式是否有相同的特征值，引出本节课第一个命题: 相似矩阵具有相同特征多项式，继而有相同特征值，继而引出**线性变换  $\Phi$  的特征多项式**的定义，该引理保证此定义是良定义，良的地方在于不依赖基或表示阵的选取</font>  
  
**分析特征多项式的结构-矩阵的迹**  
定义1：主对角线元素的和  
引理1：  $\lambda_1+\lambda_2+\cdots+\lambda_n=\rm{tr}(A)$    
命题1：相似矩阵具有相同的迹  
  
  
**分析特征多项式的结构-迹的性质**  
  $\rm{Tr}(A+B)=\rm{Tr}(A)+\rm{Tr}(B)$    
  $\rm{Tr}(k\cdot A)=k\cdot\rm{Tr}(A)$    
  $\rm{Tr}(AB)=\rm{Tr}(BA)$    
  $\sum\limits_{i=1}^n\left(\sum\limits_{j=1}^na_{ij}b_{ji}\right)$    
第1行  $\cdot$  第1列  
第2行  $\cdot$  第2列  
  $\cdots$    
第  $n$  行  $\cdot$  第  $n$  列  
  $\rm{Tr}(AA^T)=\rm{Tr}(A^TA)$    
  $\rm{Tr}(B)=\rm{Tr}(P^{-1}AP)=\rm{Tr}(AP\cdot P^{-1})=\rm{Tr}(A)$    
  
**分析特征多项式的结构-矩阵可逆判定**  
引理1：  $\lambda_1\cdot\lambda_2\cdots\lambda_n=|A|$    
定理1：  $|A|$  可逆  $\Leftrightarrow$  特征值都不为零  
  
**分析特征多项式的结构-根与系数的关系**  
命题1：  
  $\sum\limits_{1\le i_i<\cdots<i_r\le n}\lambda_{i_1}\lambda_{i_2}\cdots\lambda_{i_r}  
=\sum\limits_{1\le i_i<\cdots<i_r\le n}A\begin{pmatrix}i_1&i_2&\cdots&i_r\\\ i_1&i_2&\cdots&i_r\end{pmatrix}$    
注：丘版给出了证明，再加上韦达定理即可证  
  
**分析特征多项式的结构-丘版**  
直接引出了多项式矩阵  $\lambda-$  阵，矩阵多项式的概念  
  $\lambda-$  阵其实是环  $F[\lambda]$  上的矩阵，之前都是数域  $K$  上的矩阵  
  $\lambda-$  阵的相等、加法、数乘、乘法、初等变换，初等  $\lambda-$  阵，相抵，行列式，逆阵，行列式因子，不变因子，初等因子，法式，秩，伴随  $\lambda-$  阵  
  
**求特征值-特征向量-Part2**  
定义1：特征矩阵，  $\lambda I_n-A$    
(是一个  $\lambda-$  阵)  
  
步骤：  
1 写出特征矩阵，求解特征多项式的根  
2 求解线性方程组  $(\lambda_iI_n-A)x=\mathbf0_V$    
(暗含  $\lambda_iI_n-A$  一定是奇异的)  
  
本计算都囊括了：  
1 求行列式，2 解一元高次方程，3 解线性方程组  
进一步，若可对角化，则4 求可逆矩阵，5 求对角阵  
  
例题：求一个三阶方阵的特征值  
  
**涉及上(下)三角阵的若干结论**  
命题1：上(下)三角阵的特征值是主对角线上元素  
(不多也不少)  
  
定理1：任意方阵都存在与之相似的复上(下)三角阵  
  
推广1：设  $A\in M_n(K)$  ，有  $n$  个特征值，且均在  $K$  中，则存在可逆阵  $P\in M_n(K)$  ，使得  $\begin{bmatrix}  
\lambda_1&\cdots&\bigstar\\\  
&\ddots&\bigstar\\\  
&&\lambda_n  
\end{bmatrix}=P^{-1}\cdot A\cdot P$    
  
推论1：设  $A_n$  的特征值为  $\lambda_1,\lambda_2,\cdots,\lambda_k$  ，则  $A^m$  的特征值为  $\lambda_1^m,\lambda_2^m,\cdots,\lambda_k^m$    
  
**涉及  $K[A]$  的若干结论**  
(~~标题起的不准，但这块内容不知道叫什么~~)  
(丘版讲了环，子环，交换环，证明了一元多项式环的通用性)  
(谢版直接以定义给出，省略了不少内容)  
(  $\\{$  矩阵  $A$  的全体多项式  $\\}=K[A]\subset M_n(K)$  )  
(辨析：矩阵  $A$  的全体多项式，多项式矩阵，矩阵多项式)  
(一元多项式环的通用性)  
定义1：  $f(A)=a_nA^n+a_{n-1}A^{n-1}+\cdots+a_1A+a_0I_n$    
  
命题1：若  $A\sim B$  ，则  $B^m=P^{-1}\cdot A^m\cdot P$    
  $(P^{-1}AP)^m=P^{-1}\cdot A^m\cdot P$    
  
命题2：若  $A\sim B$  ，则  $f(B)=P^{-1}\cdot f(A)\cdot P$    
  $f(P^{-1}AP)=P^{-1}\cdot f(A)\cdot P$    
  
命题3：设  $A\sim B$  ，若  $A$  可逆，则  $B^{-1}=P^{-1}\cdot A^{-1}\cdot P$    
则  $(P^{-1}AP)^{-1}=P^{-1}\cdot A^{-1}\cdot P$    
  
命题4：  $(P^{-1}AP)^\star=P^\star\cdot A^\star\cdot(P^\star)^{-1}$    
  
引理1: 上三角阵的加、减，数乘、乘以及乘方仍是上三角阵  
且主对角线上元素  $\cdots$    
  
命题5：设  $A\in M_n(K),f(x)\in K[x]$  ，若  $A$  的特征值为  $\lambda$  ，则  $f(A)$  的特征值为  $f(\lambda)$    
  
命题：  $K[A]$  是具有单位元的交换环  
  
定义2：  $A$  的零化多项式，  $f(A)=$  零矩阵  
(  $K[A]$  里面有一类特殊的-零化多项式)  
(零化多项式是交换环  $K[A]$  的加法零元)  
  
命题6：若  $f(x)$  是  $A$  的零化多项式，则  $A$  的特征值是  $f(x)$  的根  
(特征值是零化多项式的根，反之零化多项式的根是特征值未必成立)  
(特征值是零化多项式的根，所有零化多项式都存在部分相同的根)  
(至少有部分根是公共的)  
  
**非异阵的特征值**  
引理：可逆上三角阵逆阵的结构：主对角线元素的倒数  
命题：设非异阵  $A$  的特征值为  $\lambda_1,\lambda_2,\cdots,\lambda_n$  ，  
则  $A^{-1}$  的特征值为  $\lambda_1^{-1},\lambda_2^{-1},\cdots,\lambda_n^{-1}$    
(这节课讲的东西多，但是感觉挺杂的，没有主线)  
  
---  
  
**可对角化**  
定义1-几何版：线性变换在某个基下的表示阵为对角阵  
(若  $V$  中存在一个基，使得  $\Phi$  在该基下的表示阵为对角阵，则称  $\Phi$  可对角化)  
定义2-代数版：矩阵存在相似的对角阵  
(若存在非异阵  $P$  使得  $P^{-1}AP=\Lambda$  ，则称  $A$  可对角化)  
(调整特征值顺序后，**对角阵可写成分块纯量阵**)  
  
**可对角化判定-1**  
定理1：  $\Phi$  可对角化  $\Leftrightarrow\Phi$  存在  $n$  个线性无关的特征向量  
定理2：  $A$  可对角化  $\Leftrightarrow A$  存在  $n$  个线性无关的特征向量  
举例：不可对角化矩阵  
(~~例题暗示二阶可对角化矩阵有且只有  $I_2$  ~~错的离谱)  
  
**可对角化判定-2**  
引理1：特征子空间的和空间是直和空间  
  $V_1+V_2+\cdots+V_k=V_1\oplus V_2\oplus \cdots\oplus V_k$    
推论1：不同特征值的特征向量线性无关  
定理1：若  $\Phi$  有  $n$  个不同特征值，则  $\Phi$  可对角化  
反例：  $\Phi=cI_V$  纯量变换，  $A=cI_n$  纯量阵  
  $(ce_1,ce_2,\cdots,ce_n)=(e_1,e_2,\cdots,e_n)(cI_n)$    
  $(cg_1,cg_2,\cdots,cg_n)=(g_1,g_2,\cdots,g_n)(cI_n)$    
  $(cf_1,cf_2,\cdots,cf_n)=(f_1,f_2,\cdots,f_n)(cI_n)$    
此处提及一句可对角化矩阵远远多于不可对角化矩阵  
(没给代数版本)  
  
**可对角化判定-3**  
定理4：  $\Phi$  可对角化  $\Leftrightarrow V=V_1\oplus V_2\oplus \cdots\oplus V_k$    
(没给代数版本)  
  
**可对角化判定-4**  
定义1：代数重数，特征根的重数  
定义2：几何重数，特征值对应特征子空间的维数  
引理1：  $\lambda_0$  几何重数  $\leq\lambda_0$  代数重数  
定义3：完全特征向量系  
任取特征值  $\lambda_i$  ，  $\lambda_i$  的代数重数  $=$    $\lambda_i$  的几何重数，  $1\le i\le k$    
定理4：  $\Phi$  可对角化  $\Leftrightarrow\Phi$  有完全特征向量系  
(线性空间的维数  $=$  表示矩阵的阶数  $=$  特征多项式的次数)  
(没有代数版)  
  
**求过渡矩阵与对角阵**  
推导过程：  
  $P^{-1}\cdot A\cdot P=\Lambda$    
  $\Rightarrow A\cdot P=P\cdot\Lambda$    
将  $P$  按列分块得  
  $\Rightarrow P=(\alpha_1,\cdots,\alpha_n)$    
  $\Rightarrow A\cdot(\alpha_1,\cdots,\alpha_n)=(\alpha_1,\cdots,\alpha_n)  
\cdot\begin{bmatrix}  
\lambda_1&&\\\  
&\lambda_2&\\\  
&&\ddots&\\\  
&&&\lambda_n  
\end{bmatrix}$    
  
  $\Rightarrow(A\alpha_1,A\alpha_2,\cdots,A\alpha_n)=(\lambda_1\alpha_1,\lambda_2\alpha_2,\cdots,\lambda_n\alpha_n)$    
  
  $\Rightarrow A\alpha_1=\lambda_1\alpha_1,\quad A\alpha_2=\lambda_2\alpha_2,\quad \cdots,\quad A\alpha_n=\lambda_n\alpha_n$    
  
  $\Rightarrow\forall 1\le i\le n,\ \alpha_i$  是  $\lambda_i$  的特征向量，且线性无关（符合可逆的要求）  
  
因此  $\alpha_i$  可以取基础解系，  $\lambda_1,\cdots,\lambda_n$  就是特征值  
  
求解步骤：  
1 求特征值  $A\to\lambda I-A\to f(\lambda)$    
2 解线性方程组，获得基础解系  
3   $P$  就是基础解系组成的，  $P$  的列向量是特征向量  
注：基础解系不唯一，则过渡阵  $P$  不唯一  
  
例题练习  
  
**求可对角化阵的高次幂**  
原理：  $A^m=(P\cdot\Lambda\cdot P^{-1})^m=P\cdot\Lambda^m\cdot P^{-1}$    
(连接到求逆阵的初等变换法)  
例题：  
  
---  
  
**极小多项式-最低次幂零化多项式**  
(丘版是先凯莱哈密顿，再极小多项式)  
引子+证明  
1 分析  $M_n(K)$  的维数  
2 利用  $M_n(K)$  的维数，构造一个  $A\in M_n(K)$  的零化多项式  
3 得到  $A\in M_n(K)$  的全体零化多项式构成的集合  $O(A)$    
(  $O(A)\subset K[A]\subset M_n(K)$  )  
(丘版是通过证明CH，间接证明了  $O(A)$  非空)  
  
定义1：极小多项式-最低次幂零化多项式  
(首一的：最大公因式，最小公倍式，极小多项式)  
(两个特殊的零化多项式：极小多项式，特征多项式)  
  
命题1：极小多项式的存在性  
任意  $A\in M_n(K)$  都存在极小多项式  
  
引理1：极小多项式的整除性  
命题2：极小多项式的唯一性  
  
**纯量阵的极小多项式**  
例1：纯量阵  $cI_n$  的极小多项式  $m(x)=x-c$    
  
**幂零阵的极小多项式**  
例2：幂零阵  $A$  的极小多项式  $m(x)=x^n$    
(  $n$  是幂零指数)  
  
**相似矩阵具有相同极小多项式**  
定理1：相似矩阵具有相同极小多项式  
  
**分块对角阵的极小多项式**  
定理1：分块对角阵的极小多项式等于每个分块的极小多项式的最小公倍式  
(联动『最小公倍式的相伴定理』)  
  
**可对角化矩阵的极小多项式**  
定理1：设  $A\in M_n(K)$  ，  $A$  的全体不同的特征值为  $\lambda_1,\lambda_2,\cdots,\lambda_k$  ，若  $A$  可对角化，则  $A$  的极小多项式为  $m(x)=(x-\lambda_1)(x-\lambda_2)\cdots(x-\lambda_k)$    
关键点：调整特征值顺序后，**对角阵可写成分块纯量阵**  
推论1：若  $A$  可对角化，则  $A$  的特征值是极小多项式  $m(x)$  的根  
  
说明：一般矩阵的极小多项式求法在下一章中介绍  
行列式因子  $\to$  不变因子  $\to$  不变因子中次数最大的就是极小多项式  
  
**可对角化判定-5**  
定理：  $\Phi$  可对角化  $\Leftrightarrow\Phi$  的极小多项式无重根  
  
**极小多项式的根**  
命题1：特征值是极小多项式的根  
(特征值是任意零化多项式的根)  
(反之，极小多项式的根是特征值吗?)  
(答案是肯定的，凯莱哈密顿定理推论2回答了本问题)  
  
**凯莱哈密顿定理-引问-极小多项式的上界**  
可从1次找起  
若可以证明超过某个次数后一定不可能是极小多项式，虽然是零化多项式，那么就可以倒着找起  
确实存在上界：  $\rm{deg}[m(x)]\le n^2$    
  
**凯莱哈密顿定理-丘版顺序**  
寻找零化多项式  $\xrightarrow{CH定理}$  特征多项式  $\xrightarrow[可再降低]{次数是否}$  极小多项式  
暗示特征多项式是极小多项式次数的一个上界  
  
**凯莱哈密顿定理-引理-上三角阵的特征多项式是零化多项式**  
引理：设  $A=\begin{bmatrix}  
\lambda_1&a_{12}&\cdots&a_{1n}\\\  
&\lambda_2&\cdots&a_{2n}\\\  
&&\ddots\\\ &&&\lambda_n\end{bmatrix}$    
则  $(A-\lambda_1I_n)(A-\lambda_2I_n)\cdots  
(A-\lambda_nI_n)=$  零多项式  
即  $A$  适合  $f(x)=(x-\lambda_1)(x-\lambda_2)\cdots  
(x-\lambda_n)$    
  
**凯莱哈密顿定理-主定理-代数版**  
定理1：特征多项式是零化多项式  
(相似的总定理是不变子空间的直和，表示阵是分块对角阵：分块纯量阵，Jordan块，友阵)  
(有了上面的引理，再证明主定理就非常容易了)  
  
推论1：  $m(\lambda)\mid f(\lambda)$    
(回答本节问题：极小多项式次数存在上界，  $\rm{deg}[m(x)]\leq n$  )  
等号成立条件：  $A$  有  $n$  个不同的特征值  
  
推论2：  $m(\lambda)$  与  $f(\lambda)$  有相同的根  
(特征值是零化多项式的根，所有零化多项式都有部分相同的根)  
  
推论3：  $f(\lambda)\mid m(\lambda)^n$    
  $f(\lambda)=m(\lambda)^n$  的情形：  $A=cI_n$  纯量阵  
  
**凯莱哈密顿定理-主定理-几何版**  
(  $S(\Phi)\subset K[\Phi]\subset\mathbf{L}(V^n)$  )  
线性变换的特征多项式  $f(\lambda)=|\lambda I_V-\Phi|$    
主定理：特征多项式是零变换多项式  
  
感觉是[一元多项式的通用性]派生出两套体系  
  $S(A)\subset K[A]\subset M_n(K)$    
  $S(\Phi)\subset K[\Phi]\subset\mathbf{L}(V^n)$    
  $K[A]$  里有一类特殊的是零化多项式，零化多项式里有两个特殊的：特征多项式，极小多项式  
  $K[\Phi]$  里有一类特殊的是零变换多项式，零变换多项式里有两个特殊的：特征多项式，极小多项式  
  
**凯莱哈密顿定理-补充-证法二**  
(可对角化矩阵远远多于不可对角化矩阵)  
(首次提及是在[对角化判定2])  
分成可对角化与不可对角化两类  
不可对角化的用摄动法  
  
**凯莱哈密顿定理-补充-丘版证明**  
补充：丘版证明  
  
---  
  
**戈氏圆盘第一定理**  
名词1：每行除主对角线元素外，每个元素模长的和  
  $R_i=\sum\limits_{j\neq i}|a_{ij}|=|a_{i1}|+\cdots+|a_{i,i-1}|+|a_{i,i+1}|+\cdots+|a_{in}|$    
名词2：复平面上的圆盘  
  $|z-a_{ii}|\le R_i$    
定理1：所有特征值都落在这  $n$  个圆盘里  
(至于一个圆盘里落几个，本定理不care)  
(至于是否有空闲圆盘，本定理同样不care)  
(圆盘间的相互位置，本定理不care)  
(本定理只关心，所有特征值不会超出这些范围)  
举例：估计一个四阶矩阵特征值分布情况  
  
**戈氏圆盘第二定理**  
定义1：连通的圆盘  
(相切算连通在一起吗)  
(大概是一个基础拓扑概念)  
  
引理1：多项式的根是系数的连续函数  
  $\forall\epsilon>0,\exists\delta>0$    
  $|a_n-b_n|<\delta,\cdots,|a_1-b_1|<\delta$    
  $|\lambda_i(a_n,a_{n-1},\cdots,a_1,a_0)  
-\lambda_i^\prime(b_n,b_{n-1},\cdots,b_1,b_0)|<  
\epsilon$    
(虽然没有求根公式，但不妨碍存在函数关系)  
(况且没有求根公式，不表示没有公式)  
(可能是复数域上的连续函数)  
  
定理1：设  $k$  个戈氏圆盘构成一个连续区域，则有且只有  $k$  个特征值落在该连通区域中，当圆盘重合时，要计算重数，特征值为重根时也要计算重数  
(极端情形：纯量阵)  
(咋知道特征根是几重根)  
(前提是有连通区域，没有的话，扯个啥)  
(证明理解：框定了变动的最大值域，特征值是根，根是  $t$  的连续函数)  
(这次对证明稍微有点感觉了)  
说明1：  $k\geq1$    
说明2：定理1+定理2，若任意两个圆盘都没有交集，则可对角化  
  
**本章回顾**  
(课讲完了，剩下一节课用来回顾)  
(不是知识串烧，是上了一节习题课)  
证明若  $A^2-A-3I_n=\mathbf O$  ，则  $A-2I_n$  非异  
  
凑因子法：  $(A-2I_n)(A+I_n)=I_n$    
  
线性方程组求解法：  
要证  $A-2I_n$  非异  
只要证  $(A-2I_n)x=\mathbf0$  只有零解  
设  $x_0$  是  $(A-2I_n)x=\mathbf0$  的一个解  
  $\Rightarrow Ax_0=2x_0$    
又因为  $A^2-A-3I_n=\mathbf O$    
  $\Rightarrow(A^2-A-3I_n)x_0=\mathbf O$    
  $\Rightarrow A^2x_0-Ax_0-3x_0=\mathbf O$    
再因为  $A^2x_0=AAx_0=2Ax_0=4x_0$    
  $\Rightarrow4x_0-2x_0-3x_0=\mathbf O$    
  $\Rightarrow-x_0=\mathbf O$    
  $\Rightarrow$  只有零解  
  
互素多项式  
注意到  $\rm{gcd}(x^2-x-3,x-2)=1$    
  $\Rightarrow\exists\ u(x),v(x),\ (x^2-x-3)u(x)+(x-2)v(x)=1$    
  $\Rightarrow(A^2-A-3I_n)u(A)+(A-2I_n)v(A)=I_n$    
  $\Rightarrow\mathbf O+(A-2I_n)v(A)=I_n$    
  $\Rightarrow(A-2I_n)v(A)=I_n$    
  $\Rightarrow(A-2I_n)$  可逆  
  
特征值法  
反证法，设  $A-2I_n$  奇异  
  $\Rightarrow|A-2I_n|=0$    
  $\Rightarrow2$  是  $A$  的一个特征值  
又因为  $A^2-A-3I_n=\mathbf O$    
  $\Rightarrow f(x)=x^2-x-3$  是  $A$  的一个零化多项式  
  $\Rightarrow2$  是  $f(x)$  的一个根  
但是  $f(2)\neq0$  ，所以矛盾  
(感觉谢喜欢数学竞赛)  
  
注意体会这三个命题  
1 设  $A\in M_n(K),f(x)\in K[x]$  ，若  $A$  的特征值为  $\lambda$  ，则  $f(A)$  的特征值为  $f(\lambda)$    
2 特征值是零化多项式的根  
(结合命题1得零矩阵的特征值是零)  
(但是零化多项式的根可能远远不止这些)  
3 特征多项式是零化多项式(这就是CH定理)  
(只有是特征多项式时，才恰好对应)  
  
若  $A$  的特征值为  $\lambda$  ，则  $A+2I_n$  的特征值为  $\lambda+2$    
  
有唯一解竟然能与线性同构扯上关系，真脑洞  
  
循环矩阵的定义是什么  
每一行的元素比上一行错开一个位置的元素  
(难道上次没看到这部分)  
  
  
Process finished with exit code 0  
