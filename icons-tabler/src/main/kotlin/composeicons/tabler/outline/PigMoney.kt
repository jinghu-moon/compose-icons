package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PigMoney: ImageVector
    get() {
        if (_pigMoney != null) return _pigMoney!!
        _pigMoney = tablerOutlineIcon(
            name = "PigMoney",
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
                    PathNode.MoveTo(5.173f, 8.378001f),
                    PathNode.CurveTo(3.955789f, 7.442485f, 3.641239f, 5.738999f, 4.444086f, 4.430478f),
                    PathNode.CurveTo(5.246934f, 3.121957f, 6.908092f, 2.630673f, 8.293522f, 3.292017f),
                    PathNode.CurveTo(9.678952f, 3.953361f, 10.341561f, 5.553909f, 9.829f, 7.001f)
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
                    PathNode.MoveTo(16.0f, 4.0f),
                    PathNode.LineTo(16.0f, 7.803f),
                    PathNode.CurveTo(17.237612f, 8.519122f, 18.179861f, 9.652447f, 18.658f, 11.0f),
                    PathNode.LineTo(19.999f, 11.0f),
                    PathNode.CurveTo(20.551285f, 11.0f, 20.999f, 11.447715f, 20.999f, 12.0f),
                    PathNode.LineTo(20.999f, 14.0f),
                    PathNode.CurveTo(20.999f, 14.552285f, 20.551285f, 15.0f, 19.999f, 15.0f),
                    PathNode.LineTo(18.657f, 15.0f),
                    PathNode.CurveTo(18.321f, 15.95f, 17.75f, 16.8f, 16.999f, 17.473f),
                    PathNode.LineTo(16.999f, 19.5f),
                    PathNode.CurveTo(16.999f, 20.328426f, 16.327427f, 21.0f, 15.499f, 21.0f),
                    PathNode.CurveTo(14.670573f, 21.0f, 13.999f, 20.328426f, 13.999f, 19.5f),
                    PathNode.LineTo(13.999f, 18.917f),
                    PathNode.CurveTo(13.668546f, 18.972355f, 13.334059f, 19.000118f, 12.999f, 19.0f),
                    PathNode.LineTo(8.999f, 19.0f),
                    PathNode.CurveTo(8.663941f, 19.000118f, 8.329455f, 18.972355f, 7.999f, 18.917f),
                    PathNode.LineTo(7.999f, 19.5f),
                    PathNode.CurveTo(7.999f, 20.328426f, 7.327427f, 21.0f, 6.499f, 21.0f),
                    PathNode.CurveTo(5.670573f, 21.0f, 4.999f, 20.328426f, 4.999f, 19.5f),
                    PathNode.LineTo(4.999f, 17.5f),
                    PathNode.LineTo(4.999f, 17.473f),
                    PathNode.CurveTo(3.144114f, 15.814661f, 2.505192f, 13.18357f, 3.392941f, 10.859221f),
                    PathNode.CurveTo(4.280689f, 8.534874f, 6.51089f, 6.9996f, 8.999f, 7.0f),
                    PathNode.LineTo(11.499f, 7.0f),
                    PathNode.LineTo(15.999f, 4.0f)
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
        return _pigMoney!!
    }

private var _pigMoney: ImageVector? = null
