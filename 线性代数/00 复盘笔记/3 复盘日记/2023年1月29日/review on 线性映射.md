1 复合映射的结合律： $(\Phi\circ\Psi)\circ\Omega=\Phi\circ(\Psi\circ\Omega)$   
复合映射的定义： $(\Phi\circ\Psi)(\alpha)=\Phi(\Psi(\alpha))$   
运算方向：从右向左  
复合套娃：设 $\Phi:V\to U$ ，则有以下套娃成立  
 $\Phi^2=\Phi\circ\Phi=\Phi(\Phi(\alpha))$   
 $\Phi^3=\Phi\circ\Phi\circ\Phi  
=\Phi(\Phi(\Phi(\alpha)))$   
 $\cdots$   
 $\Phi^n=\Phi\circ\cdots\circ\Phi$   
套娃运算律(也是映射乘法的运算律)  
 $(\Phi^n)^m=\Phi^{n\cdot m}$   
 $\Phi^n\cdot\Phi^m=\Phi^{n+m}$   
 $(\Phi^{-1})^n=(\Phi^n)^{-1}$   
  
2 逆映射存在定理： $\Phi$ 存在逆映射当且仅当 $\Phi$ 是双射  
逆映射定义：设 $\Phi:V\to U$ ，若存在 $\Psi:U\to V$ ，使得 $\Psi\circ\Phi=\mathbb{1}_V,\ \Phi\circ\Psi=\mathbb{1}_U$   
则称 $\Psi$ 是 $\Phi$ 的逆映射，记作 $\Phi^{-1}=\Psi$   
  
3 线性映射将零向量映射成零向量:  $\Phi(mathbf{0}_V)=\mathbf{0}_U$   
  反之不成立，即若 $\Phi(\alpha)=\mathbf{0}_U\not\Rightarrow\alpha=\mathbf{0}_V$   
  
4 线性映射保持线性组合:  $\Phi(k\alpha+l\beta)=k\cdot\Phi(\alpha)+l\Phi(\beta)$   
  不要与线性同构【保持线性关系】混淆了  
  线性映射的第二定义  
  
5 线性映射的复合任然是线性映射:   
若 $\Phi:V_k\to U_K$ ， $\Psi:U_K\to W_K$ 是线性映射，则 $(\Psi\circ\Phi):V_K\to W_K$ 也是线性映射  
证明:  
 $(\Psi\circ\Phi)(k\alpha+l\beta)$   
 $=\Psi(\Phi(k\alpha+l\beta))$   
 $=\Psi(k\Phi(\alpha)+l\Phi(\beta))$   
 $=\Psi(k\Phi(\alpha))+\Psi(l\Phi(\beta))$   
 $=k\Psi(\Phi(\alpha))+l\Psi(\Phi(\beta))$   
 $=k(\Psi\circ\Phi)(\alpha)+l(\Psi\circ\Phi)(\beta)$   
线性表出的传递性:若向量组A可由向量组B线性表出，向量组B可由向量组C线性表出，则向量组A可由向量组C线性表出  
              若向量组B可由向量组A线性表出，向量组C可由向量组A线性表出，则向量组C可由向量组A线性表出  
  
6 所有线性映射成立的命题，对线性同构都成立  
  
7 线性同构存在性定理: 线性空间 $V_K, U_K$ 存在线性同构的充要条件是，它们的维数相同  
  
8 线性同构的逆映射也是线性同构  
  若 $\Phi:V_K\to U_K$ 是线性同构，则 $\Phi^{-1}:U_K\to V_K$ 也是线性同构  
  证明 $\Phi^{-1}:U_K\to V_K$ 也是线性同构  
  即证明 $\Phi^{-1}(k\alpha+l\beta)=k\Phi^{-1}(\alpha)+l\Phi^{-1}(\beta)$   
   $\Phi^{-1}(k\alpha+l\beta)$   
   $=\Phi^{-1}(k\Phi(a)+l\Phi(b))$   
   $=\Phi^{-1}(\Phi(ka+lb))$   
   $=(\Phi^{-1}\circ\Phi)(ka+lb)$   
   $=(ka+lb)$   
   $=k\Phi{-1}(\alpha)+l\Phi^{-1}(\beta)$   
  以上每一步均可逆  
  
9 线性同构的复合也是线性同构  
  
10 线性同构是等价关系  
   传递性: 若 $\Phi:V_K\to U_K$ ， $\Psi:U_K\to W_K$ 是线性同构，则 $(\Psi\circ\Phi):V_K\to W_K$ 也是线性同构  
   对称性: 若 $\Phi:V_K\to U_K$ 是线性同构，则 $\Phi^{-1}:U_K\to V_K$   
   反身性: 线性自同构 $\Phi:V^n_K\to V^n_K$   
   此处的传递性可理解为复合映射，对称性可理解为对称性，那反身性怎么理解呢？  
  
11 线性同构保持线性关系（线性映射也具备这三条性质吧）  
   1 线性同构保持线性组合，且组合系数不变  
   2 线性同构保持线性关系  
     若 $(\alpha_1, \alpha_2, \cdots, \alpha_n)$ 线性无/相关，  
     则 $(\Phi(\alpha_1), \Phi(\alpha_2), \cdots, \Phi(\alpha_n))$ 也线性无/相关  
     设 $\lambda_1\alpha_1+\lambda_2\alpha_2+\cdots+\lambda_n\alpha_n=\mathbb{0}_V$   
     其中 $\lambda_1, \lambda_2, \cdots, \lambda_n\in K$ 当无关是不全为零，当相关时全为零  
      $\Rightarrow\Phi(\lambda_1\alpha_1+\lambda_2\alpha_2+\cdots+\lambda_n\alpha_n)=\Phi(\mathbb{0}_V)$   
      $\Rightarrow\lambda_1\Phi(\alpha_1)+\lambda_2\Phi(\alpha_2)+\cdots+\lambda_n\Phi(\alpha_n)=\mathbb{0}_U$   
      $\Rightarrow(\Phi(\alpha_1), \Phi(\alpha_2), \cdots, \Phi(\alpha_n))$ 也线性无/相关  
   3 线性同构保持极大无关组的下标顺序  
