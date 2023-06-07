1 复合映射结合律    
2 逆映射存在定理    
    
 $\rm{begin}--$ 画交换图上面的横线    
3 线性映射将零向量映射成零向量    
4 线性映射保持线性组合    
5 线性映射的复合仍然是线性映射    
6 线性同构具有所有线性映射的性质    
7 线性同构存在性定理    
8 线性同构逆映射仍然是线性同构    
9 线性同构是等价关系    
10 线性同构保持线性关系    
 $\rm{end}--$ 画交换图上面的横线    
    
 $\rm{begin}--$ 画交换图左右两边的竖线    
11 坐标向量的唯一性: 任意向量在固定基下的坐标向量都是唯一的    
12 坐标向量映射是线性同构    
13 基变换与过渡矩阵:  $(f_1, f_2, \cdots, f_n)=(e_1, e_2, \cdots, e_n)A$     
14 坐标变换与过渡矩阵:  $Y=A^{-1}X$     
15 过渡矩阵的可逆性    
16 复合映射的过渡矩阵    
    $(f_1, f_2, \cdots, f_n)=(e_1, e_2, \cdots, e_n)A$     
    $(g_1, g2, \cdots, g_n)=(f_1, f_2, \cdots, f_n)B$     
    $\Rightarrow(g_1, g2, \cdots, g_n)=(e_1, e_2, \cdots, e_n)AB$     
 $\rm{end}--$ 画交换图左右两边的竖线    
    
 $\rm{begin}--$ 画交换图中间的竖线    
17  $\mathbb{L}(V,U)$ 是线性空间    
18  $\mathbb{L}(V,K)$ 是 $V_K$ 的对偶空间    
19  $\mathbb{L}(V_K)$ 是数域K上的代数    
20 线性扩张定理    
    $\forall\ \alpha\in V_K, \alpha=\lambda_1e_1+\lambda_2e_2+\cdots+\lambda_ne_n$     
    $\Rightarrow\Phi(\alpha)=\lambda_1\beta_1+\lambda_2\beta_2+\cdots+\lambda_n\beta_n$     
    $\Rightarrow\Phi(e_i)=\beta_i$     
    $\Phi$ 提取组合系数，对应系数与 $\beta_i$ 作线性组合    
21  $T:\mathbb{L}(V,U)\to M_{m\times n}(K)$ 是线性同构    
    $\forall A\in M_{m\times n}(K)$ ，由线性扩张定理知， $\exists\Phi\in\mathbb{L}(V,U)$ ，使得 $T(\Phi)=A$     
    $\Rightarrow T$ 是满射    
    
   设 $T(\Phi)=T(\Psi)=A$     
    $\Rightarrow T(\Phi(e_i))=a_{1i}f_1+a_{2i}f_2+\cdots+a_{mi}f_m$     
    $\Rightarrow T(\Psi(e_i))=a_{1i}f_1+a_{2i}f_2+\cdots+a_{mi}f_m$     
   由线性扩张定理知， $\Phi=\Psi$     
    $\Rightarrow T$ 是单射    
    
   线性映射的加法定义    
    $(\Phi+\Psi)(e_i)=\Phi(e_i)+\Psi(e_i)$     
    $=(a_{1i}f_1+a_{2i}f_2+\cdots+a_{mi}f_m)+(b_{1i}f_1+b_{2i}f_2+\cdots+b_{mi}f_m)$     
    $=(a_{1i}+b_{1i})f_1+(a_{2i}+b_{2i})f_2+\cdots+(a_{mi}+b_{mi})f_m$     
   线性映射的表示矩阵定义    
    $\Rightarrow T((\Phi+\Psi)(e_i))=(a_{1i}+b_{1i}, a_{2i}+b_{2i}, \cdots, a_{mi}+b_{mi})$     
    $\Rightarrow T(\Phi(e_i))=(a_{1i}, a_{2i}, \cdots, a_{mi})$     
    $\Rightarrow T(\Psi(e_i))=(b_{1i}, b_{2i}, \cdots, b_{mi})$     
   综上两点得    
    $\Rightarrow T(\Phi+\Psi)=T(\Phi)+T(\Psi)$     
    
   线性映射的加法定义    
    $(k\cdot\Phi)(e_i)=k\cdot\Phi(e_i)$     
    $k\cdot(a_{1i}f_1+a_{2i}f_2+\cdots+a_{mi}f_m)$     
    $=k\cdot a_{1i}f_1+k\cdot a_{2i}f_2+\cdots+k\cdot a_{mi}f_m$     
   线性映射的表示矩阵定义    
    $\Rightarrow T((k\cdot\Phi)(e_i))=(k\cdot a_{1i}, k\cdot a_{2i}, \cdots, k\cdot a_{mi})$     
    $\Rightarrow T((\Phi)(e_i))=(a_{1i}, a_{2i}, \cdots, a_{mi})$     
    $\Rightarrow T(k\cdot\Phi)=k\cdot T(\Phi)$     
    
   综上4点得， $T:\mathbb{L}(V,U)\to M_{m\times n}(K)$ 是线性同构    
    
22  $T:\mathbb{L}(V_K^n)\to M_n(K)$ 是数域K上的代数同构    
 $\rm{begin}--$ 画交换图中间的竖线    
    
23 线性映射的表示矩阵    
线性变换的表示方阵    
数学记号： $T(\Phi)=A$     
    
24 表示矩阵与坐标向量（交换图下面的横线）    
    $x\to Ax$ 与 $\beta=Ax$ 非齐次线性方程组    
    
25 复合映射的表示矩阵    
    $T(\Phi\circ\Psi)=T(\Phi)\circ T(\Psi)$     
    
26 同一线性变换，在不同基下的表示矩阵是相似的    
    $B=P^{-1}\cdot A\cdot P$     
    
27 交换图就画完了：用交换图串接所有知识点    
    
28 设 $\Phi\in\mathbb{L}(V)$ ， $\Phi$ 是自同构当且仅当 $T(\Phi)$ 可逆    
