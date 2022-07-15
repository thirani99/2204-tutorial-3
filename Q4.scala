object main extends App{
  def coverPrice(x: Int): Double = { //total cost for cover pages
  return x * 24.95
  }

  def discount(x: Int): Double = { // discount for all copies
  return  coverPrice(x)*0.4
  }

  def afterReduceDiscount(x:Int):Double= {
  return coverPrice(x)-discount(x)
  }

  def shippingCost(x: Int): Double = { // shipping cost
  if(x<=50) {
     x*3.00
  }
  else {
     50*3.00 + (x-50)*0.75
  }

  }

  def total_cost(x:Int):Double = {
     afterReduceDiscount(x) + shippingCost(x)
  }
  //Question 4 - cost of books
  val final_cost = total_cost(60)
  println("Final Cost = "+final_cost)
}


//output--->1055.69999999
