object main extends App{
  def VolumeOfSphere(r:Int):Double = {
    return (4 * math.Pi * r * r * r)/3
  }
    println("Volume of sphere = "+VolumeOfSphere(5))
}
 //output---->392.6999
