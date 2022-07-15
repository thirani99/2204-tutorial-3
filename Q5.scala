object main extends App{

  def easyPeace(x:Int):Int = {
    return x*8
  }
  def tempo(x:Int):Int = {
    return x*7
  }

  var total_time = easyPeace(2)+tempo(3)+easyPeace(2)
  println("Total Running Time = "+total_time)
}

//output-->53
