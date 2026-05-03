package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SignRight: ImageVector
    get() {
        if (_signRight != null) return _signRight!!
        _signRight = tablerFilledIcon(
            name = "SignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 2.0f),
                    PathNode.CurveTo(10.506975f, 2.000067f, 10.933684f, 2.379507f, 10.993f, 2.883f),
                    PathNode.LineTo(11.0f, 3.0f),
                    PathNode.LineTo(11.0f, 5.0f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.CurveTo(16.258854f, 4.999994f, 16.507626f, 5.100363f, 16.694f, 5.28f),
                    PathNode.LineTo(16.781f, 5.375f),
                    PathNode.LineTo(18.781f, 7.875f),
                    PathNode.CurveTo(19.044243f, 8.203985f, 19.073036f, 8.662678f, 18.853f, 9.022f),
                    PathNode.LineTo(18.781f, 9.125f),
                    PathNode.LineTo(16.781f, 11.625f),
                    PathNode.CurveTo(16.619343f, 11.827091f, 16.385633f, 11.958642f, 16.129f, 11.992f),
                    PathNode.LineTo(16.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.CurveTo(12.529094f, 20.000587f, 12.966165f, 20.41321f, 12.997172f, 20.941395f),
                    PathNode.CurveTo(13.028179f, 21.46958f, 12.64239f, 21.93051f, 12.117f, 21.993f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(7.470907f, 21.999413f, 7.033836f, 21.58679f, 7.002828f, 21.058605f),
                    PathNode.CurveTo(6.971821f, 20.53042f, 7.35761f, 20.06949f, 7.883f, 20.007f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.CurveTo(5.493026f, 11.999933f, 5.066316f, 11.620493f, 5.007f, 11.117f),
                    PathNode.LineTo(5.0f, 11.0f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.CurveTo(5.000067f, 5.493026f, 5.379507f, 5.066316f, 5.883f, 5.007f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.LineTo(9.0f, 5.0f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.CurveTo(9.0f, 2.447715f, 9.447715f, 2.0f, 10.0f, 2.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _signRight!!
    }

private var _signRight: ImageVector? = null
