class Rectangle(private var l:Double,private var L:Double):NonSolidShape {
    override fun GetArea(): Double {
        return l*L
    }
}