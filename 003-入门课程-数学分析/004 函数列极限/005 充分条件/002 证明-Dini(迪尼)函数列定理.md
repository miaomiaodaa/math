**假设不一致收敛**
$\exists\;\epsilon_0>0,\;\forall\;N>0,\;\exists\;n>N,\;\exists\;x_0\in[a,b],\;|\,f_n(x_0)-f(x_0)|\geq\epsilon_0$

**构造数列**
$N=1,\;\exists\;n_1>1,\;\exists\;x_{n_1}\in[a,b],\;\left|\,f_{n_1}(x_{n_1})-f(x_{n_1})\right|\geq\epsilon_0$

$N=n_1,\;\exists\;n_2>n_1,\;\exists\;x_{n_2}\in[a,b],\;\left|\,f_{n_2}(x_{n_2})-f(x_{n_2})\right|\geq\epsilon_0$

$N=n_2,\;\exists\;n_3>n_2,\;\exists\;x_{n_3}\in[a,b],\;\left|\,f_{n_3}(x_{n_3})-f(x_{n_3})\right|\geq\epsilon_0$

$\cdots$

$N=n_{k-1},\;\exists\;n_k>n_{k-1},\;\exists\;x_{n_k}\in[a,b],\;\left|\,f_{n_k}(x_{n_k})-f(x_{n_k})\right|\geq\epsilon_0$

$\cdots$

$\{x_{n_1},\;x_{n_2},\;x_{n_3},\;\cdots,\;x_{n_k},\;\cdots\}$

**聚点定理**
$\{x_{n_k}\}\subset\{x_n\}\subset[a,b]$

$\Rightarrow \lim\limits_{k\to\infty}x_{n_k}=\xi\in[a,b]$

**暗含点态收敛①**
$\lim\limits_{x\to x_0}f(x)=f(x_0)$

$\Rightarrow\lim\limits_{n\to\infty}f_n(x)=f(x)$

$\Rightarrow\lim\limits_{n\to\infty}f_n(\xi)=f(\xi)$

$\Rightarrow \rm{let}\;\epsilon=\epsilon_0,\;\exists\;N_0>N,\;\left|\,f_{N_0}(\xi)-f(\xi)\right|<\dfrac{\epsilon_0}2$

**连续的四则运算**
$\lim\limits_{x\to x_0}f_n(x)=f_n(x_0),\;\lim\limits_{x\to x_0}f(x)=f(x_0)$

$\Rightarrow\lim\limits_{x\to x_0}f_{N_0}(x)=f_{N_0}(x_0)$

$\Rightarrow\lim\limits_{x\to x_0}[f_{N_0}(x)-f(x)]=f_{N_0}(x_0)-f(x_0)$

$\Rightarrow\lim\limits_{x\to\xi}[f_{N_0}(x)-f(x)]=f_{N_0}(\xi)-f(\xi)$

$\Rightarrow \rm{let}\;\epsilon=\epsilon_0,\;\exists\;\delta>0,\;|x-\xi|<\delta,\;\left|[f_{N_0}(x)-f(x)]-[f_{N_0}(\xi)-f(\xi)]\right|<\dfrac{\epsilon_0}2$

$k>K$

$\Rightarrow\lim\limits_{x_{n_k}\to\xi}[f_{N_0}(x)-f(x)]=f_{N_0}(\xi)-f(\xi)$

$\Rightarrow\exists\;x_{n_k},\;\epsilon=\epsilon_0,\;\exists\;\delta>0,\;|x_{n_k}-\xi|<\delta,\;\left|[f_{N_0}(x_{n_k})-f(x_{n_k})]-[f_{N_0}(\xi)-f(\xi)]\right|<\dfrac{\epsilon_0}2$

**三角不等式②**
$\rm{let}\;\epsilon=\epsilon_0,\;\exists\;\delta>0,\;|x_{n_k}-\xi|<\delta,\;\left|[f_{N_0}(x_{n_k})-f(x_{n_k})]-[f_{N_0}(\xi)-f(\xi)]\right|<\dfrac{\epsilon_0}2$

$\Rightarrow\epsilon=\epsilon_0,\;\exists\;\delta>0,\;|x_{n_k}-\xi|<\delta,\;\left|\left|\,f_{N_0}(x_{n_k})-f(x_{n_k})\right|-\left|\,f_{N_0}(\xi)-f(\xi)\right|\right|\leq\left|[f_{N_0}(x_{n_k})-f(x_{n_k})]-[f_{N_0}(\xi)-f(\xi)]\right|<\dfrac{\epsilon_0}2$

$\Rightarrow\epsilon=\epsilon_0,\;\exists\;\delta>0,\;|x_{n_k}-\xi|<\delta,\;\left|\,f_{N_0}(x_{n_k})-f(x_{n_k})\right|<\left|\,f_{N_0}(\xi)-f(\xi)\right|+\dfrac{\epsilon_0}2$

**由①②得**
$\Rightarrow\underline{\epsilon=\epsilon_0,\;\exists\;N_0\in N^+,\;\exists\;x_{n_k}\in[a,b],\;\left|\,f_{N_0}(x_{n_k})-f(x_{n_k})\right|<\epsilon_0}$

**利用单调性**
$n>N,\;x_0\in[a,b],\;f_n(x_0)<f_{n+1}(x_0)\;\rm{or}\;f_n(x_0)>f_{n+1}(x_0)$

$f_N(x)<f_n(x)\nearrow$

$\Rightarrow f_N(x)<f_n(x)<f(x)$

$\Rightarrow f_N(x)-f(x)<f_n(x)-f(x)<0$

$\Rightarrow|\,f_N(x)-f(x)|>|\,f_n(x)-f(x)|$

$\,f_N(x)>f_n(x)\searrow$

$\Rightarrow f_N(x)>f_n(x)>f(x)$

$\Rightarrow f_N(x)-f(x)>f_n(x)-f(x)>0$

$\Rightarrow|\,f_N(x)-f(x)|>|\,f_n(x)-f(x)|$

$\Rightarrow|\,f_n(x)-f(x)|\leq|\,f_N(x)-f(x)|$

$\epsilon=\epsilon_0$

$\rm{let}\;N=N_0,\;n_k>N_0\,(k>K)$

$\Rightarrow|\,f_{n_k}(x)-f(x)|\leq|\,f_{N_0}(x)-f(x)|$

$\rm{let}\;x=x_{n_k}$

$\Rightarrow|\,f_{n_k}(x_{n_k})-f(x_{n_k})|\leq|\,f_{N_0}(x_{n_k})-f(x_{n_k})|<\epsilon_0$

$\Rightarrow\underline{\epsilon_0,\;\exists\;N_0\in N^+,\;\exists\;x_{n_k}\in[a,b],\;\left|\,f_{n_k}(x_{n_k})-f(x_{n_k})\right|<\epsilon_0}$
