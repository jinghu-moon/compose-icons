package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigRightLine: ImageVector
    get() {
        if (_arrowBigRightLine != null) return _arrowBigRightLine!!
        _arrowBigRightLine = tablerFilledIcon(
            name = "ArrowBigRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.089f, 3.634f),
                    PathNode.CurveTo(11.420711f, 3.975939f, 11.000177f, 4.663312f, 11.0f, 5.414f),
                    PathNode.LineTo(10.999f, 8.0f),
                    PathNode.LineTo(6.0f, 8.0f),
                    PathNode.CurveTo(5.447716f, 8.0f, 5.0f, 8.447715f, 5.0f, 9.0f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.LineTo(5.007f, 15.117f),
                    PathNode.CurveTo(5.066316f, 15.620493f, 5.493026f, 15.999933f, 6.0f, 16.0f),
                    PathNode.LineTo(10.999f, 15.999f),
                    PathNode.LineTo(11.0f, 18.586f),
                    PathNode.CurveTo(11.000173f, 19.394793f, 11.487455f, 20.123869f, 12.234691f, 20.433355f),
                    PathNode.CurveTo(12.981927f, 20.742844f, 13.842011f, 20.571815f, 14.414f, 20.0f),
                    PathNode.LineTo(21.0f, 13.414f),
                    PathNode.CurveTo(21.780764f, 12.633f, 21.780764f, 11.367f, 21.0f, 10.586f),
                    PathNode.LineTo(14.414f, 4.0f),
                    PathNode.CurveTo(13.842029f, 3.42767f, 12.981555f, 3.256364f, 12.234f, 3.566f),
                    PathNode.LineTo(12.089f, 3.634f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.506975f, 8.000067f, 3.933684f, 8.379507f, 3.993f, 8.883f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.CurveTo(3.999413f, 15.529094f, 3.58679f, 15.966165f, 3.058605f, 15.997172f),
                    PathNode.CurveTo(2.530421f, 16.02818f, 2.069491f, 15.64239f, 2.007f, 15.117f),
                    PathNode.LineTo(2.0f, 15.0f),
                    PathNode.LineTo(2.0f, 9.0f),
                    PathNode.CurveTo(2.0f, 8.447715f, 2.447715f, 8.0f, 3.0f, 8.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBigRightLine!!
    }

private var _arrowBigRightLine: ImageVector? = null
