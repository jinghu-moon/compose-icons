package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigDownLine: ImageVector
    get() {
        if (_arrowBigDownLine != null) return _arrowBigDownLine!!
        _arrowBigDownLine = tablerFilledIcon(
            name = "ArrowBigDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.LineTo(8.883f, 5.007f),
                    PathNode.CurveTo(8.379507f, 5.066316f, 8.000067f, 5.493026f, 8.0f, 6.0f),
                    PathNode.LineTo(8.0f, 10.999f),
                    PathNode.LineTo(5.414f, 11.0f),
                    PathNode.CurveTo(4.605209f, 11.000173f, 3.876132f, 11.487455f, 3.566644f, 12.234691f),
                    PathNode.CurveTo(3.257156f, 12.981927f, 3.428184f, 13.842011f, 4.0f, 14.414f),
                    PathNode.LineTo(10.586f, 21.0f),
                    PathNode.CurveTo(11.367f, 21.780764f, 12.633f, 21.780764f, 13.414f, 21.0f),
                    PathNode.LineTo(20.0f, 14.414f),
                    PathNode.CurveTo(20.57233f, 13.842029f, 20.743635f, 12.981555f, 20.434f, 12.234f),
                    PathNode.LineTo(20.366f, 12.089f),
                    PathNode.CurveTo(20.024061f, 11.420711f, 19.336687f, 11.000177f, 18.586f, 11.0f),
                    PathNode.LineTo(16.0f, 10.999f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.CurveTo(16.0f, 5.447716f, 15.552285f, 5.0f, 15.0f, 5.0f),
                    PathNode.LineTo(9.0f, 5.0f),
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
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.CurveTo(15.529094f, 2.000587f, 15.966165f, 2.413211f, 15.997172f, 2.941395f),
                    PathNode.CurveTo(16.02818f, 3.469579f, 15.64239f, 3.930509f, 15.117f, 3.993f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(8.470906f, 3.999413f, 8.033836f, 3.58679f, 8.002828f, 3.058605f),
                    PathNode.CurveTo(7.971821f, 2.530421f, 8.35761f, 2.069491f, 8.883f, 2.007f),
                    PathNode.LineTo(9.0f, 2.0f),
                    PathNode.LineTo(15.0f, 2.0f),
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
        return _arrowBigDownLine!!
    }

private var _arrowBigDownLine: ImageVector? = null
