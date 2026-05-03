package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = tablerFilledIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 2.0f),
                    PathNode.LineTo(9.883f, 2.007f),
                    PathNode.CurveTo(9.379507f, 2.066316f, 9.000067f, 2.493025f, 9.0f, 3.0f),
                    PathNode.LineTo(9.0f, 7.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.CurveTo(4.447716f, 7.0f, 4.0f, 7.447716f, 4.0f, 8.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.LineTo(4.007f, 12.117f),
                    PathNode.CurveTo(4.066316f, 12.620493f, 4.493026f, 12.999933f, 5.0f, 13.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.CurveTo(9.0f, 21.552284f, 9.447715f, 22.0f, 10.0f, 22.0f),
                    PathNode.LineTo(14.0f, 22.0f),
                    PathNode.LineTo(14.117f, 21.993f),
                    PathNode.CurveTo(14.620493f, 21.933683f, 14.999933f, 21.506975f, 15.0f, 21.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.LineTo(19.0f, 13.0f),
                    PathNode.CurveTo(19.552284f, 13.0f, 20.0f, 12.552285f, 20.0f, 12.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.LineTo(19.993f, 7.883f),
                    PathNode.CurveTo(19.933683f, 7.379507f, 19.506975f, 7.000067f, 19.0f, 7.0f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.CurveTo(15.0f, 2.447715f, 14.552285f, 2.0f, 14.0f, 2.0f),
                    PathNode.LineTo(10.0f, 2.0f),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
