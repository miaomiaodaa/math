**內容**
$\{y_n\},\ y_{n-1}<y_{n},\ \lim_{n\to\infty}y_n=+\infty$

$\{x_n\}$

$\lim_{n\to\infty}\frac{x_n-x_{n-1}}{y_n-y_{n-1}} =l\;(\pm\infty)$

$\iff\lim_{n\to\infty}\frac{x_n}{y_n} =l\;(\pm\infty)$

**证法1: 意想不到的恒等变形**
$\lim\limits_{n\to\infty}\dfrac{x_n-x_{n-1}}{y_n-y_{n-1}}=l$

$\Rightarrow\forall\;\epsilon>0,\;\exists\;N>0,\;n>N,\;\left|\dfrac{x_n-x_{n-1}}{y_n-y_{n-1}}-l\right|<\dfrac\epsilon2$

$\Rightarrow l-\dfrac\epsilon2<\dfrac{x_n-x_{n-1}}{y_n-y_{n-1}}<l+\dfrac\epsilon2$

$\Rightarrow$

$l-\dfrac\epsilon2<\dfrac{x_{N+1}-x_{N}}{y_{N+1}-y_{N}}<l+\dfrac\epsilon2$

$l-\dfrac\epsilon2<\dfrac{x_{N+2}-x_{N+1}}{y_{N+2}-y_{N+1}}<l+\dfrac\epsilon2$

$l-\dfrac\epsilon2<\dfrac{x_{N+3}-x_{N+2}}{y_{N+3}-y_{N+2}}<l+\dfrac\epsilon2$

$\cdots$

$l-\dfrac\epsilon2<\dfrac{x_{n-1}-x_{n-2}}{y_{n-1}-y_{n-2}}<l+\dfrac\epsilon2$

$l-\dfrac\epsilon2<\dfrac{x_{n}-x_{n-1}}{y_{n}-y_{n-1}}<l+\dfrac\epsilon2$

$\Rightarrow l-\dfrac\epsilon2<\dfrac{x_{n}-x_{N}}{y_{n}-y_{N}}<l+\dfrac\epsilon2$

$\Rightarrow\left|\dfrac{x_n-x_{N}}{y_n-y_{N}}-l\right|<\dfrac\epsilon2$

---

$\underline{\dfrac{x_n}{y_n}-l=\dfrac{x_N-ly_N}{y_n}+\left(1-\dfrac{y_N}{y_n}\right)\left(\dfrac{x_n-x_N}{y_n-y_N}-l\right)}$

$\Rightarrow\left|\dfrac{x_n}{y_n}-l\right|<\left|\dfrac{x_N-ly_N}{y_n}\right|+\left|\left(\dfrac{x_n-x_N}{y_n-y_N}-l\right)\right|<\dfrac\epsilon2+\dfrac\epsilon2=\epsilon$

$\Rightarrow\forall\;\epsilon>0,\;\exists\;N>0,\;n>N,\;\left|\dfrac{x_n}{y_n}-l\right|<\epsilon$

---

$0<\left(1-\dfrac{y_N}{y_n}\right)<1$

$\Rightarrow\left(1-\dfrac{y_N}{y_n}\right)\left|\left(\dfrac{x_n-x_N}{y_n-y_N}-l\right)\right|<1\cdot\left|\left(\dfrac{x_n-x_N}{y_n-y_N}-l\right)\right|$

**证法2: 分类讨论**
