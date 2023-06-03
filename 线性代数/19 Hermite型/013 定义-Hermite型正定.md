**内容**  
 $\begin{array}{c}  
&(\overline{\alpha})^T\cdot A\cdot\alpha&f&A\\\  
\forall\ \mathbf{0}\neq\alpha\in\mathbb{C}^n&>0&正定型&正定阵\\\  
\forall\ \mathbf{0}\neq\alpha\in\mathbb{C}^n&\geq0&半正定型&半正定阵\\\  
\forall\ \mathbf{0}\neq\alpha\in\mathbb{C}^n&<0&负定型&负定阵\\\  
\forall\ \mathbf{0}\neq\alpha\in\mathbb{C}^n&\leq0&半负定型&半负定阵  
\end{array}$   
  
 $\exists\ \mathbf{0}\neq\alpha,\beta\in\mathbb{R}^n$ ， $(\overline{\alpha})^T\cdot A\cdot\alpha>0,\ (\overline{\beta})^T\cdot A\cdot\beta<0$ ，不定型，不定阵  
  
**说明**  
{正定阵} $\subseteq$ {半正定阵}，即正定阵包含于半正定阵  
两者的差集 $=$ 非正定的半正定阵  
  
**举例**  
 $f=\overline{x_1}\cdot x_1+\overline{x_2}\cdot x_2+\cdots+\overline{x_n}\cdot x_n$  正定型  
 $f=\overline{x_1}\cdot x_1+\overline{x_2}\cdot x_2+\cdots+\overline{x_r}\cdot x_r+0\cdot\overline{x_{r+1}}\cdot x_{r+1}+\cdots+0\cdot\overline{x_n}\cdot x_n$  半正定型  
 $f=-\overline{x_1}\cdot x_1-\overline{x_2}\cdot x_2-\cdots-\overline{x_n}\cdot x_n$  负定型  
 $f=-\overline{x_1}\cdot x_1-\overline{x_2}\cdot x_2-\cdots-\overline{x_r}\cdot x_r-0\cdot\overline{x_{r+1}}\cdot x_{r+1}-\cdots-0\cdot\overline{x_n}\cdot x_n$  半负定型  
 $f=\overline{x_1}\cdot x_1+\cdots+\overline{x_p}\cdot x_p-\overline{x_{p+1}}\cdot x_{p+1}-\cdots-\overline{x_r}\cdot x_r+0\cdot\overline{x_{r+1}}\cdot x_{r+1}+\cdots+0\cdot\overline{x_n}\cdot x_n$  不定型  
观察上面例子，得若是规范标准型，则非常容易判断正定性  
