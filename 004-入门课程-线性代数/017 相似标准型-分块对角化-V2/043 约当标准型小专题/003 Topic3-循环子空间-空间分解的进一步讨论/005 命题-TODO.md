<font color=brown>命题6</font>  
设全空间 $V$ 是循环子空间，即 $V=\rm{C}(\Phi,\alpha)$ ， $\Psi\in\mathbb{L}(V)$ ， $\Phi\circ\Psi  
=\Psi\circ\Phi$ ，则  
1 $\Psi$ 由 $\Psi(\alpha)$ 唯一决定  
2 $\exists\ g(\lambda)\in K[\lambda]$ ，使得 $\Psi=g(\Phi)$  
  
证明:  
$(1)$  
$V=\rm{C}(\Phi,\alpha)$ 的基为 $(\alpha,\Phi(\alpha),\Phi^2(\alpha),\cdots,\Phi^{n-1}(\alpha))$  
$\Psi$ 由 $\Psi$ 在基上的作用唯一决定  
  
$\Phi\circ\Psi=\Psi\circ\Phi$  
$\Rightarrow\Psi(\Phi^i(\alpha))  
=\Phi^i(\Psi(\alpha))$  
$\Rightarrow\Psi$ 由 $\Psi(\alpha)$ 唯一决定  
  
$(2)$  
$\Psi(\alpha)=a_0\cdot\alpha+a_1\cdot\Phi(\alpha)+a_2\cdot\Phi^2(\alpha)+\cdots+  
a_{n-1}\cdot\Phi^{n-1}(\alpha)$  
令 $g(x)=a_0+a_1\cdot x+a_2\cdot x^2+\cdots+  
a_{n-1}\cdot x^{n-1}$  
$\Rightarrow\Psi(\alpha)=g(\Phi)(\alpha)$  
由结论 $(1)$ 得  
$\Rightarrow\Psi=g(\Phi)$  
  
推论:  
若 $A=F(f(\lambda))$ ， $AB=BA$ ，则 $B=g(A)$  
若 $A=J_n(\lambda_0)$ ， $AB=BA$ ，则 $B=g(A)$  
  
推论:  
设 $\Phi^m(\alpha)=-a_0\alpha-a_1\Phi(\alpha)-\cdots-a_{m-1}\Phi^{m-1}(\alpha)$  
令 $g(x)=x^m+a_{m-1}x^{m-1}+\cdots+a_1x+a_0\in K[x]$  
$\Phi\mid_{C(\Phi,\alpha)}$ 在基 $(\alpha,\Phi(\alpha),\Phi^2(\alpha),\cdots,\Phi^{m-1}(\alpha))$ 下的表示矩阵为 $g(x)$ 的友阵  
