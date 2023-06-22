**准备工作: 约定符号**  
  
$  
\begin{bmatrix}\Phi(e_{11})\\\ \vdots\\\ \Phi(e_{1r_1})\\\ \\\ \Phi(e_{21})\\\ \vdots\\\ \Phi(e_{2r_2})\\\ \\\ \vdots\\\ \\\ \Phi(e_{k1})\\\ \vdots\\\ \Phi(e_{kr_k})\end{bmatrix}  
=\left[\begin{array}{ccc:cccc:c:ccc}  
\lambda_1&1\\\ &\ddots&1\\\ &&\lambda_1\\\hdashline &&&\lambda_2&1\\\ &&&&&\ddots&1\\\ &&&&&&\lambda_2\\\hdashline  &&&&&&&\ddots\\\hdashline  &&&&&&&&\lambda_k&1\\\ &&&&&&&&&\ddots&1\\\ &&&&&&&&&&\lambda_k\end{array}\right]  
\cdot\begin{bmatrix}  
e_{11}\\\ \vdots\\\ e_{1r_1}\\\ \\\ e_{21}\\\ \vdots\\\ e_{2r_2}\\\ \\\ \vdots\\\ \\\ e_{k1}\\\ \vdots\\\ e_{kr_k}\end{bmatrix}$  
  
取其中任意块  
$(\Phi(e_{i1}),\ \Phi(e_{i1}),\ \cdots, \Phi(e_{ir_i}))=(e_{i1},\ e_{i2},\ \cdots,\ e_{ir_i})  
\cdot\begin{bmatrix}\lambda_i&1\\\ &\ddots&1\\\ &&\lambda_i\end{bmatrix}$  
  
$\Leftrightarrow\begin{cases}  
\Phi(e_{i1})=\lambda_i\cdot e_{i1}&\\\ \Phi(e_{i2})=e_{i1}+\lambda_i\cdot e_{i2}&\\\ \cdots&\\\ \Phi(e_{ir_i})=e_{ir_{i-1}}+\lambda_i\cdot e_{ir_i}  \end{cases}\ (1)\quad, \forall\ 1\le i\le k$  
