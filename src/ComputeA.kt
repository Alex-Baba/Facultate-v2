open class ComputeA(private var shapes: Array<NonSolidShape>) :ComputeData {

    override fun Sum():Double{
      return shapes.sumByDouble { it.GetArea() }
    }
}