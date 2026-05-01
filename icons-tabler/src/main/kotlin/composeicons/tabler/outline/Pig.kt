package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pig: ImageVector
    get() {
        if (_pig != null) return _pig!!
        _pig = tablerOutlineIcon(
            name = "Pig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(15.0f, 11.01f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 3.0f),
                    PathNode.LineTo(16.0f, 6.803f),
                    PathNode.CurveTo(17.237612f, 7.519123f, 18.179861f, 8.652447f, 18.658f, 10.0f),
                    PathNode.LineTo(19.999f, 10.0f),
                    PathNode.CurveTo(20.551285f, 10.0f, 20.999f, 10.447715f, 20.999f, 11.0f),
                    PathNode.LineTo(20.999f, 13.0f),
                    PathNode.CurveTo(20.999f, 13.552285f, 20.551285f, 14.0f, 19.999f, 14.0f),
                    PathNode.LineTo(18.657f, 14.0f),
                    PathNode.CurveTo(18.320578f, 14.950387f, 17.750404f, 15.800834f, 16.999f, 16.473f),
                    PathNode.LineTo(16.999f, 18.5f),
                    PathNode.CurveTo(16.999f, 19.328426f, 16.327427f, 20.0f, 15.499f, 20.0f),
                    PathNode.CurveTo(14.670573f, 20.0f, 13.999f, 19.328426f, 13.999f, 18.5f),
                    PathNode.LineTo(13.999f, 17.917f),
                    PathNode.CurveTo(13.668546f, 17.972355f, 13.334059f, 18.000118f, 12.999f, 18.0f),
                    PathNode.LineTo(8.999f, 18.0f),
                    PathNode.CurveTo(8.663941f, 18.000118f, 8.329455f, 17.972355f, 7.999f, 17.917f),
                    PathNode.LineTo(7.999f, 18.5f),
                    PathNode.CurveTo(7.999f, 19.328426f, 7.327427f, 20.0f, 6.499f, 20.0f),
                    PathNode.CurveTo(5.670573f, 20.0f, 4.999f, 19.328426f, 4.999f, 18.5f),
                    PathNode.LineTo(4.999f, 16.5f),
                    PathNode.LineTo(4.999f, 16.473f),
                    PathNode.CurveTo(3.144114f, 14.814661f, 2.505192f, 12.18357f, 3.392941f, 9.859221f),
                    PathNode.CurveTo(4.280689f, 7.534874f, 6.51089f, 5.9996f, 8.999f, 6.0f),
                    PathNode.LineTo(11.499f, 6.0f),
                    PathNode.LineTo(15.999f, 3.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pig!!
    }

private var _pig: ImageVector? = null
