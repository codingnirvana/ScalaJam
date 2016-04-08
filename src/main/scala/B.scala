object B extends Solver(inputFile = "B.in") {
  override type Input = String
  override type Output = Input

  override def read = {
    in.next()
  }

  override def apply(input: Input) = {
    input
  }
}
