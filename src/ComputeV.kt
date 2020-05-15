open class ComputeV(private val shapes: Array<SolidShape>):ComputeData{
    override fun Sum(): Double {
        return shapes.sumByDouble { it.GetVolume() }
    }
}

