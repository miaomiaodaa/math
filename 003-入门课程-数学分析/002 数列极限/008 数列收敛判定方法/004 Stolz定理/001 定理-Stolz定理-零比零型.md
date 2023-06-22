**內容**
$\lim\limits_{n\to\infty}x_n=0$

$y_n>y_{n+1},\;\lim\limits_{n\to\infty}y_n=0$

$\lim\limits_{n\to\infty}\dfrac{x_n-x_{n+1}}{y_n-y_{n+1}}=l\;(\pm\infty)$

$\Rightarrow\lim\limits_{n\to\infty}\dfrac{x_n}{y_n}=\lim\limits_{n\to\infty}\dfrac{x_n-x_{n+1}}{y_n-y_{n+1}}=l\;(\pm\infty)$

**证明**
$\lim\limits_{n\to\infty}\dfrac{x_n-x_{n+1}}{y_n-y_{n+1}}=l$

$\Rightarrow\forall\;\epsilon>0,\;\exists\;N>0,\;n>N,\;\left|\dfrac{x_n-x_{n+1}}{y_n-y_{n+1}}-l\right|<\epsilon$

$\Rightarrow l-\epsilon<\dfrac{x_n-x_{n+1}}{y_n-y_{n+1}}<l+\epsilon$

$\Rightarrow$

$(l-\epsilon)(y_n-y_{n+1})<x_n-x_{n+1}<(l+\epsilon)(y_n-y_{n+1})$

$(l-\epsilon)(y_{n+1}-y_{n+2})<x_{n+1}-x_{n+2}<(l+\epsilon)(y_{n+1}-y_{n+2})$

$(l-\epsilon)(y_{n+2}-y_{n+3})<x_{n+2}-x_{n+3}<(l+\epsilon)(y_{n+2}-y_{n+3})$

$\cdots$

$(l-\epsilon)(y_{n+p-2}-y_{n+p-1})<x_{n+p-2}-x_{n+p-1}<(l+\epsilon)(y_{n+p-2}-y_{n+p-1})$

$(l-\epsilon)(y_{n+p-1}-y_{n+p})<x_{n+p-1}-x_{n+p}<(l+\epsilon)(y_{n+p-1}-y_{n+p})$

$\Rightarrow(l-\epsilon)(y_n-y_{n+p})<x_n-x_{n+p}<(l+\epsilon)(y_n-y_{n+p})$

$\Rightarrow \left|\dfrac{x_n-x_{n+p}}{y_n-y_{n+p}}-l\right|<\epsilon$

$\Rightarrow p\to+\infty,\;x_{n+p}\to0,\;y_{n+p}\to0$

$\Rightarrow\left|\dfrac{x_n}{y_n}-l\right|<\epsilon$

(感觉最后一段论证不是分析语言了，有点别扭)
