package space.cosmicgoat;

public class ShapeTuple
{
	public final String shapeClass;
	public final String color;

	public ShapeTuple(String shapeClass, String color)
	{
		this.shapeClass = shapeClass;
		this.color = color;
	}

	@Override
	public String toString()
	{
		String shapeName = "shape";
		switch (shapeClass.substring(9))
		{
			case "geom.Ellipse2D$Double":
				shapeName = "circle";
				break;

			case "Polygon":
				shapeName = "triangle";
				break;

			case "Rectangle":
				shapeName = "rectangle";
				break;
		}


		return color + " " + shapeName;
	}

	@Override
	public boolean equals(Object other)
	{
		if (other == this)
		{
			return true;
		}

		if (!(other instanceof ShapeTuple))
		{
			return false;
		}

		ShapeTuple other_ = (ShapeTuple) other;

		// this may cause NPE if nulls are valid values for shapeClass or color. The logic may be improved to handle nulls properly, if needed.
		return other_.shapeClass.equals(this.shapeClass) && other_.color.equals(this.color);
	}

	/*
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shapeClass == null) ? 0 : shapeClass.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}
	*/
}
