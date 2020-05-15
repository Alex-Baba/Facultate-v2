open class Square(private var v:Double):Solids {
    override fun GetArea(): Double {
        return v*4
    }
    override fun GetVolume():Double{
        return v*v*v
    }
}