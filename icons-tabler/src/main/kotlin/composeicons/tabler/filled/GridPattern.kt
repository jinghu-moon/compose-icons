package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GridPattern: ImageVector
    get() {
        if (_gridPattern != null) return _gridPattern!!
        _gridPattern = tablerFilledIcon(
            name = "GridPattern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.CurveTo(19.656855f, 3.0f, 21.0f, 4.343146f, 21.0f, 6.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 19.656855f, 19.656855f, 21.0f, 18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.343146f, 21.0f, 3.0f, 19.656855f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 4.343146f, 4.343146f, 3.0f, 6.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.CurveTo(13.447715f, 7.0f, 13.0f, 7.447716f, 13.0f, 8.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.CurveTo(10.999933f, 7.493026f, 10.620493f, 7.066316f, 10.117f, 7.007f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.CurveTo(9.447715f, 7.0f, 9.0f, 7.447716f, 9.0f, 8.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(8.0f, 9.0f),
                    PathNode.CurveTo(7.493026f, 9.000067f, 7.066316f, 9.379507f, 7.007f, 9.883f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.CurveTo(7.0f, 10.552285f, 7.447716f, 11.0f, 8.0f, 11.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.LineTo(8.0f, 13.0f),
                    PathNode.CurveTo(7.493026f, 13.000067f, 7.066316f, 13.379507f, 7.007f, 13.883f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.CurveTo(7.0f, 14.552285f, 7.447716f, 15.0f, 8.0f, 15.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(9.000067f, 16.506975f, 9.379507f, 16.933683f, 9.883f, 16.993f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.CurveTo(10.552285f, 17.0f, 11.0f, 16.552284f, 11.0f, 16.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.CurveTo(13.000067f, 16.506975f, 13.379507f, 16.933683f, 13.883f, 16.993f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.CurveTo(14.552285f, 17.0f, 15.0f, 16.552284f, 15.0f, 16.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(16.0f, 15.0f),
                    PathNode.CurveTo(16.506975f, 14.999933f, 16.933683f, 14.620493f, 16.993f, 14.117f),
                    PathNode.LineTo(17.0f, 14.0f),
                    PathNode.CurveTo(17.0f, 13.447715f, 16.552284f, 13.0f, 16.0f, 13.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.LineTo(16.0f, 11.0f),
                    PathNode.CurveTo(16.506975f, 10.999933f, 16.933683f, 10.620493f, 16.993f, 10.117f),
                    PathNode.LineTo(17.0f, 10.0f),
                    PathNode.CurveTo(17.0f, 9.447715f, 16.552284f, 9.0f, 16.0f, 9.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(15.0f, 8.0f),
                    PathNode.CurveTo(14.999933f, 7.493026f, 14.620493f, 7.066316f, 14.117f, 7.007f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 11.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(11.0f, 11.0f),
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
        return _gridPattern!!
    }

private var _gridPattern: ImageVector? = null
