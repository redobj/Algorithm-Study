# Algorithm

2018.01.15
循环不变式
	三条性质：
		1.初始化：循环的第一次迭代前，它为真。
		2.保持：如果循环的某次迭代之前它为真，那么下次迭代前它仍为真。
		3.终止：当循环终止时，不变式为我们提供一个有用的性质，该性质有助于证明算法是正确的。



2018.01.16
分治模式在每层递归时都有三个步骤
分解：分解原问题为若干子问题，这些子问题是原问题的规模较小的实例
解决：解决这些子问题，递归求解个子问题。然而，若子问题的规模足够小，则直接求解。
合并：合并这些子问题的解成原问题的解