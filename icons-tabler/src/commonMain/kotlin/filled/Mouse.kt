package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mouse: ImageVector
    get() {
        if (_mouse != null) return _mouse!!
        _mouse = tablerFilledIcon(
            name = "Mouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(16.761423f, 2.0f, 19.0f, 4.238577f, 19.0f, 7.0f),
                    PathNode.LineTo(19.0f, 17.0f),
                    PathNode.CurveTo(19.0f, 19.761423f, 16.761423f, 22.0f, 14.0f, 22.0f),
                    PathNode.LineTo(10.0f, 22.0f),
                    PathNode.CurveTo(7.238577f, 22.0f, 5.0f, 19.761423f, 5.0f, 17.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.CurveTo(5.0f, 4.238577f, 7.238577f, 2.0f, 10.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(11.447715f, 6.0f, 11.0f, 6.447716f, 11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.007f, 11.117f),
                    PathNode.CurveTo(11.06949f, 11.64239f, 11.530421f, 12.028179f, 12.058605f, 11.997172f),
                    PathNode.CurveTo(12.586789f, 11.966165f, 12.999413f, 11.529094f, 13.0f, 11.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(12.993f, 6.883f),
                    PathNode.CurveTo(12.933684f, 6.379507f, 12.506975f, 6.000067f, 12.0f, 6.0f),
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
        return _mouse!!
    }

private var _mouse: ImageVector? = null
