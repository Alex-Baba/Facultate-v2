open class Circle(private var v:Double):Solids {
    override fun GetArea():Double {
        return v*2*3.14
    }
    override fun GetVolume():Double{
        return v*v*v*4*3.14/3
    }
}
