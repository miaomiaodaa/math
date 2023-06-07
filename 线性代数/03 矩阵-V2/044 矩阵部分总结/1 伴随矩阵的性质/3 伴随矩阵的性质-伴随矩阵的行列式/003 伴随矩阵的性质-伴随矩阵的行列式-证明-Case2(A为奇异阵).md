**证法一：反证法**    
方阵 $A$ 为奇异阵    
 $\Rightarrow|A|=0$ ，只要证 $|A^\star|=0$ 即可    
    
反证法    
设 $|A^\star|\neq0\Rightarrow A^\star$ 可逆    
    
由伴随矩阵乘法关系知， $A\cdot A^\star    
=A^\star\cdot A=|A|E_n=\mathbf O$     
    
 $A^\star$ 可逆，所以满足消去律    
 $\Rightarrow A=\mathbf O$     
 $\Rightarrow\underset{若A是零矩阵，由伴随阵定义得A^\star也是零矩阵}{A^\star=\bf O}$     
继而与 $A^\star$ 可逆矛盾，所以 $A^\star$ 不可逆    
 $\Rightarrow|A^\star|=0$     
    
**证法二：相抵标准型**    
    
引理1：设 $A$ 是 $m\times n$ 矩阵，则存在可逆阵 $P_m，Q_n$ ，使得 $P_m\cdot A_{m\times n}\cdot Q_n=\begin{bmatrix}    
E_r&\bf O\\\ \bf O&\bf O\end{bmatrix}_{m\times n}$     
    
 $\Rightarrow P_n\cdot A_n\cdot Q_n=\begin{bmatrix}    
E_r&\bf O\\\ \bf O&\bf O\end{bmatrix}_n$     
    
 $\Rightarrow A_n=P_n\cdot \begin{bmatrix}    
E_r&\bf O\\\ \bf O&\bf O\end{bmatrix}_n\cdot Q_n$     
    
讨论标准型的伴随矩阵    
    
 $\begin{bmatrix}    
E_r&\bf O\\\ \bf O&\bf O\end{bmatrix}_n^\star=\begin{cases}\bf O_n&r\leq n-2\\\ \begin{bmatrix}    
\bf O&\bf O\\\ \bf O&1\end{bmatrix}_n&r=n-1\\\ E_n&r=n\end{cases}$     
    
 $\Rightarrow\ r<n$ ， $\left|\begin{bmatrix}    
E_r&\bf O\\\ \bf O&\bf O\end{bmatrix}_n^\star\right|=0$     
    
又因为 $(AB)^\star=B^\star\cdot A^\star$     
    
 $\Rightarrow A^\star=\left(P_n\cdot \begin{bmatrix}    
E_r&\bf O\\\ \bf O&\bf O\end{bmatrix}_n\cdot Q_n\right)^\star$     
    
 $=Q_n^\star\cdot\begin{bmatrix}    
E_r&\bf O\\\ \bf O&\bf O\end{bmatrix}_n^\star\cdot P_n^\star$     
    
又因为 $|AB|=|A|\cdot|B|$     
    
 $\Rightarrow|A^\star|=\left|Q_n^\star\cdot\begin{bmatrix}    
E_r&\bf O\\\ \bf O&\bf O\end{bmatrix}_n^\star\cdot P_n^\star\right|$     
    
 $=|Q_n^\star|\cdot\left|\begin{bmatrix}    
E_r&\bf O\\\ \bf O&\bf O\end{bmatrix}_n^\star\right|\cdot |P_n^\star|$     
    
 $\Rightarrow|A^\star|=0$     
