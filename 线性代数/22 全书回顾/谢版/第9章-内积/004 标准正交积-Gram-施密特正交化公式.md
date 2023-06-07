是否存在一个基，使得Gram矩阵是单位阵    
Gram矩阵 $\to$ 标准正交基    
 $i\neq j,\ (e_i,e_j)=0$ 正交基， $\Vert e_i\Vert=1$ 标准正交基    
    
上次提及基础矩阵是极小多项式    
    
引理1 两两正交的非零向量组线性无关    
两两正交的向量组，里面可能存在零向量，但是仍然满足两两正交    
推论1 两两正交的非零向量组中向量个数最多是 $n$ 个， $n$ 是线性空间的维数，超过之后可能扔保持两两正交，但是已经不满足线性无关了    
    
引理2 若 $\beta$ 与 $\alpha_1,\alpha_2,\cdots,\alpha_m$ 正交，则 $\beta$ 与 $\mathbf L(\alpha_1,\alpha_2,\cdots,\alpha_m)$ 正交    
    
引理3 Gram-施密特正交化方法(正交化公式)    
 $\underset{线性无关}{\underline{u_1,u_2,\cdots,u_m}}\to\underset{两两正交}{\underline{v_1,v_2,\cdots,v_m}}$ ，且 $U=\mathbf L(u_1,u_2,\cdots,u_m)=\mathbf L(v_1,v_2,\cdots,v_m)$ ， $(u_1,u_2,\cdots,u_m)$ 是 $U$ 的普通基， $(v_1,v_2,\cdots,v_m)$ 是 $U$ 的正交基    
对向量个数 $m$ 进行归纳    
证明思路: 三维欧几里得空间， $(u_1,u_2)\to(v_1,v_2)$     
 $v_3+v_{12}=u_3$ ， $v_{12}=a\cdot v_1+b\cdot v_2$     
 $\Rightarrow v_3=u_3-a\cdot v_1-b\cdot v_2$     
 $\Rightarrow(v_3,v_1)=(u_3-a\cdot v_1-b\cdot v_2,v_1)$     
 $=(u_3,v_1)-a(v_1,v_1)-b(v_2,v_1)$     
 $=(u_3,v_1)-a\cdot\Vert v_1\Vert^2=0$     
 $\Rightarrow a=\dfrac{(u_3,v_1)}{\Vert v_1\Vert^2}$     
同理 $b=\dfrac{(u_3,v_2)}{\Vert v_2\Vert^2}$     
 $\Rightarrow v_3=u_3-\dfrac{(u_3,v_1)}{\Vert v_1\Vert^2}\cdot v_1-\dfrac{(u_3,v_2)}{\Vert v_2\Vert^2}\cdot v_2$     
几何意义: 减去在 $x$ 轴分量，减去在 $y$ 轴分量    
于是猜想 $\mathbf{v_{k+1}=u_{k+1}-\sum\limits_{i=1}^k\dfrac{(u_{k+1},v_i)}{\Vert v_i\Vert^2}\cdot v_i}$     
证明 $v_{k+1}$ 非零，证明两两正交，证明生成子空间相等    
过渡矩阵的结构 $(u_1,u_2,\cdots,u_m)=(v_1,v_2,\cdots,v_m)\cdot B$     
 $u_{k+1}=v_{k+1}+\sum\limits_{i=1}^k\dfrac{(u_{k+1},v_i)}{\Vert v_i\Vert^2}\cdot v_i$     
 $u_1=v_1$     
 $B$ 是主对角线元素为1的上三角阵    
标准化 $=$ 单位化:  $v\to\dfrac{v}{\Vert v\Vert}$     
 $(v_1,v_2,\cdots,v_m)=(w_1,w_2,\cdots,w_m)\cdot\begin{bmatrix}\Vert v_1\Vert\\\ &\Vert v_2\Vert\\\ &&\ddots\\\ &&&\Vert v_m\Vert\end{bmatrix}$     
一般基与标准正交基之间的过渡矩阵 $\Lambda\cdot B$     
    
**推广的Gram-施密特正交化公式**: 原向量组是线性相关或者线性无关，新向量都是两两正交的，若原向量组线性相关，则新向量组存在零向量    
    
主定理: 任意有限维内积空间都存在标准正交基    
