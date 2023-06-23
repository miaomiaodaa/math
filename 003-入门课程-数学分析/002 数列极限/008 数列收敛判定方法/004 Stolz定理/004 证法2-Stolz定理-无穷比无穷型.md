**证法2: 分类讨论， $l=0$**  
  
$\lim\limits_{n\to\infty}\dfrac{x_n-x_{n-1}}{y_n-y_{n-1}}=0$  
  
$\Rightarrow\forall\;\epsilon>0,\;\exists\;N_1>0,\;n>N_1,\;\underline{y_n>0},\;\left|\dfrac{x_n-x_{n-1}}{y_n-y_{n-1}}-0\right|<\dfrac\epsilon2$  
  
$\Rightarrow\left|x_n-x_{n-1}\right|<\dfrac\epsilon2\left(y_n-y_{n-1}\right)$  
  
$\Rightarrow$  
  
$\left|x_{N_1+1}-x_{N_1}\right|<\dfrac\epsilon2\left(y_{N_1+1}-y_{N_1}\right)$  
  
$\left|x_{N_1+2}-x_{N_1+1}\right|<\dfrac\epsilon2\left(y_{N_1+2}-y_{N_1+1}\right)$  
  
$\left|x_{N_1+3}-x_{N_1+2}\right|<\dfrac\epsilon2\left(y_{N_1+3}-y_{N_1+2}\right)$  
  
$\cdots$  
  
$\left|x_{n-1}-x_{n-2}\right|<\dfrac\epsilon2\left(y_{n-1}-y_{n-2}\right)$  
  
$\left|x_{n}-x_{n-1}\right|<\dfrac\epsilon2\left(y_{n}-y_{n-1}\right)$  
  
$\Rightarrow$  
  
$\left|(x_{N_1+1}-x_{N_1})+(x_{N_1+2}-x_{N_1+1})+(x_{N_1+3}-x_{N_1+2})+\cdots+(x_{n-1}-x_{n-2})+(x_{n}-x_{n-1})\right|$  
  
$\leq\left|x_{N_1+1}-x_{N_1}\right|+\left|x_{N_1+2}-x_{N_1+1}\right|+\left|x_{N_1+3}-x_{N_1+2}\right|+\cdots\left|x_{n-1}-x_{n-2}\right|+\left|x_{n}-x_{n-1}\right|$  
  
$<\dfrac\epsilon2\left(y_{N_1+1}-y_{N_1}\right)+\dfrac\epsilon2\left(y_{N_1+2}-y_{N_1+1}\right)+\dfrac\epsilon2\left(y_{N_1+3}-y_{N_1+2}\right)+\cdots+\dfrac\epsilon2\left(y_{n-1}-y_{n-2}\right)+\dfrac\epsilon2\left(y_{n}-y_{n-1}\right)$  
  
$\Rightarrow |x_n-x_{N_1}|<\dfrac{\epsilon}2(y_n-y_{N_1})$  
  
$\Rightarrow \dfrac{|x_n-x_{N_1}|}{y_n}<\dfrac{\epsilon(y_n-y_{N_1})}{2y_n}$  
  
$\Rightarrow \left|\dfrac{x_n}{y_n}-\dfrac{x_{N_1}}{y_n}\right|<\dfrac\epsilon2\left(1-\dfrac{y_{N_1}}{y_n}\right)$  
  
$\Rightarrow \left|\dfrac{x_n}{y_n}-\dfrac{x_{N_1}}{y_n}\right|<\dfrac\epsilon2\left(1-\dfrac{y_{N_1}}{y_n}\right)<\dfrac\epsilon2$  
  
$\Rightarrow\left|\;\left|\dfrac{x_n}{y_n}\right|-\left|\dfrac{x_{N_1}}{y_n}\right|\quad\right|\leq\left|\dfrac{x_n}{y_n}-\dfrac{x_{N_1}}{y_n}\right|<\dfrac\epsilon2$  
  
$\Rightarrow\left|\dfrac{x_{N_1}}{y_n}\right|-\dfrac\epsilon2<\left|\dfrac{x_n}{y_n}\right|<\dfrac\epsilon2+\left|\dfrac{x_{N_1}}{y_n}\right|$  
  
$\exists\;N_2,\;n>N_2$  
  
$\Rightarrow \left|\dfrac{x_{N_1}}{y_n}\right|<\dfrac\epsilon2$  
  
$N=\max\{N_1,\;N_2\}$  
  
$\Rightarrow\forall\;\epsilon>0,\;\exists\;N>0,\;n>N,\;\left|\dfrac{x_n}{y_n}\right|<\dfrac\epsilon2+\left|\dfrac{x_{N_1}}{y_n}\right|<\dfrac\epsilon2+\dfrac\epsilon2$  
  
$\forall\;\epsilon>0,\;\exists\;N>0,\;n>N,\;\left|\dfrac{x_n}{y_n}\right|<\epsilon$  
  
---  
  
$\Rightarrow \left|\dfrac{x_n}{y_n}-\dfrac{x_{N_1}}{y_n}\right|<\epsilon\left(1-\dfrac{y_{N_1}}{y_n}\right)$  
  
$\Rightarrow \left|\dfrac{x_n}{y_n}-\dfrac{x_{N_1}}{y_n}\right|<\epsilon\left(1-\dfrac{y_{N_1}}{y_n}\right)<\epsilon\Rightarrow\left|\dfrac{x_n}{y_n}\right|-\left|\dfrac{x_{N_1}}{y_n}\right|\leq\left|\dfrac{x_n}{y_n}-\dfrac{x_{N_1}}{y_n}\right|<\epsilon$  
  
$\Rightarrow\left|\dfrac{x_n}{y_n}\right|-\left|\dfrac{x_{N_1}}{y_n}\right|<\epsilon$  
  
$\Rightarrow\left|\dfrac{x_n}{y_n}\right|<\epsilon+\left|\dfrac{x_{N_1}}{y_n}\right|$  
  
$\exists\;N_2,\;n>N_2,\;\Rightarrow \left|\dfrac{x_{N_1}}{y_n}\right|<\epsilon$  
  
$N=\max\{N_1,\;N_2\}$  
  
$\Rightarrow\forall\;\epsilon>0,\;\exists\;N>0,\;n>N,\;\left|\dfrac{x_n}{y_n}\right|<2\epsilon$  
  
**证法2: 分类讨论， $l\neq0$**  
$\lim\limits_{n\to\infty}\dfrac{x_n-x_{n-1}}{y_n-y_{n-1}}=a,\;$  
  
$\Rightarrow\lim\limits_{n\to\infty}\left[\dfrac{x_n-x_{n-1}}{y_n-y_{n-1}}-a\right]=0$  
  
$\rm{let}\;\widetilde{x_n}=x_n-ay_n$  
  
$\quad\lim\limits_{n\to\infty}\dfrac{\widetilde{x_n}-\widetilde{x_{n-1}}}{y_n-y_{n-1}}$  
  
$=\lim\limits_{n\to\infty}\dfrac{(x_n-ay_n)-(x_{n-1}-ay_{n-1})}{y_n-y_{n-1}}$  
  
$=\lim\limits_{n\to\infty}\dfrac{(x_n-x_{n-1})-(ay_n-ay_{n-1})}{y_n-y_{n-1}}$  
  
$=\lim\limits_{n\to\infty}\dfrac{(x_n-x_{n-1})-a(y_n-y_{n-1})}{y_n-y_{n-1}}$  
  
$=\lim\limits_{n\to\infty}\left[\dfrac{x_n-x_{n-1}}{y_n-y_{n-1}}-a\right]=0$  
  
$\Rightarrow\lim\limits_{n\to\infty}\dfrac{\widetilde{x_n}}{y_n}=\lim\limits_{n\to\infty}\dfrac{\widetilde{x_n}-\widetilde{x_{n-1}}}{y_n-y_{n-1}}=0$  
  
$\Rightarrow\lim\limits_{n\to\infty}\dfrac{\widetilde{x_n}}{y_n}=0=\lim\limits_{n\to\infty}\dfrac{x_n-ay_n}{y_n}=\lim\limits_{n\to\infty}\left[\dfrac{x_n}{y_n}-a\right]$  
  
$\Rightarrow\lim\limits_{n\to\infty}\dfrac{x_n}{y_n}=a$  
  
**证法2: 分类讨论， $l\pm\infty$**  
$\lim\limits_{n\to\infty}\dfrac{x_n-x_{n-1}}{y_n-y_{n-1}}=+\infty$  
  
$\Rightarrow\lim\limits_{n\to\infty}\dfrac{y_n-y_{n-1}}{x_n-x_{n-1}}=0$  
  
$\Rightarrow\rm{let}\;M=1,\;\exists\;N>0,\;n>N,\;x_n-x_{n-1}>y_n-y_{n-1}$  
  
$\Rightarrow$  
  
$\quad x_{N+1}-x_{N}>y_{N+1}-y_{N}$  
  
$\quad x_{N+2}-x_{N+1}>y_{N+2}-y_{N+1}$  
  
$\quad \cdots$  
  
$\quad x_{n-1}-x_{n-2}>y_{n-1}-y_{n-2}$  
  
$\quad x_{n}-x_{n-1}>y_{n}-y_{n-1}$  
  
$\Rightarrow x_n-x_N>y_n-y_N$  
  
$\Rightarrow x_n>y_n-y_N+x_N$  
  
$\Rightarrow x_n>x_{n-1},\;\lim\limits_{n\to\infty}x_n=+\infty$  
  
$\Rightarrow\lim\limits_{n\to\infty}\dfrac{y_n-y_{n-1}}{x_n-x_{n-1}}=\lim\limits_{n\to\infty}\dfrac{y_n}{x_n}=0$  
  
$\Rightarrow\lim\limits_{n\to\infty}\dfrac{x_n}{y_n}=+\infty$  
