package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Exposure: ImageVector
    get() {
        if (_exposure != null) return _exposure!!
        _exposure = tablerFilledIcon(
            name = "Exposure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.CurveTo(20.656855f, 2.0f, 22.0f, 3.343146f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.656855f, 20.656855f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.343146f, 22.0f, 2.0f, 20.656855f, 2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.343146f, 3.343146f, 2.0f, 5.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(4.447716f, 4.0f, 4.0f, 4.447716f, 4.0f, 5.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(4.0f, 19.29f, 4.123f, 19.55f, 4.321f, 19.732f),
                    PathNode.LineTo(5.931f, 18.148f),
                    PathNode.CurveTo(8.171792f, 15.933843f, 10.401818f, 13.708817f, 12.621f, 11.473f),
                    PathNode.LineTo(19.715f, 4.3f),
                    PathNode.CurveTo(19.526712f, 4.107909f, 19.26898f, 3.99977f, 19.0f, 4.0f),
                    PathNode.MoveTo(18.0f, 15.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.CurveTo(13.447715f, 15.0f, 13.0f, 15.447715f, 13.0f, 16.0f),
                    PathNode.CurveTo(13.0f, 16.552284f, 13.447715f, 17.0f, 14.0f, 17.0f),
                    PathNode.LineTo(18.0f, 17.0f),
                    PathNode.CurveTo(18.552284f, 17.0f, 19.0f, 16.552284f, 19.0f, 16.0f),
                    PathNode.CurveTo(19.0f, 15.447715f, 18.552284f, 15.0f, 18.0f, 15.0f),
                    PathNode.MoveTo(8.0f, 5.0f),
                    PathNode.CurveTo(8.552285f, 5.0f, 9.0f, 5.447716f, 9.0f, 6.0f),
                    PathNode.LineTo(9.0f, 7.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.CurveTo(10.506975f, 7.000067f, 10.933684f, 7.379507f, 10.993f, 7.883f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.CurveTo(11.0f, 8.552285f, 10.552285f, 9.0f, 10.0f, 9.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.CurveTo(8.999933f, 10.506975f, 8.620493f, 10.933684f, 8.117f, 10.993f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.CurveTo(7.447716f, 11.0f, 7.0f, 10.552285f, 7.0f, 10.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.CurveTo(5.493026f, 8.999933f, 5.066316f, 8.620493f, 5.007f, 8.117f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.CurveTo(5.0f, 7.447716f, 5.447716f, 7.0f, 6.0f, 7.0f),
                    PathNode.LineTo(7.0f, 7.0f),
                    PathNode.LineTo(7.0f, 6.0f),
                    PathNode.CurveTo(7.000067f, 5.493026f, 7.379507f, 5.066316f, 7.883f, 5.007f),
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
        return _exposure!!
    }

private var _exposure: ImageVector? = null
