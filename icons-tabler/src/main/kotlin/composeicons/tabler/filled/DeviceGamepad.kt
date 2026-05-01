package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceGamepad: ImageVector
    get() {
        if (_deviceGamepad != null) return _deviceGamepad!!
        _deviceGamepad = tablerFilledIcon(
            name = "DeviceGamepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 5.0f),
                    PathNode.CurveTo(21.656855f, 5.0f, 23.0f, 6.343146f, 23.0f, 8.0f),
                    PathNode.LineTo(23.0f, 16.0f),
                    PathNode.CurveTo(23.0f, 17.656855f, 21.656855f, 19.0f, 20.0f, 19.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(2.343146f, 19.0f, 1.0f, 17.656855f, 1.0f, 16.0f),
                    PathNode.LineTo(1.0f, 8.0f),
                    PathNode.CurveTo(1.0f, 6.343146f, 2.343146f, 5.0f, 4.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.0f, 9.0f),
                    PathNode.LineTo(7.883f, 9.007f),
                    PathNode.CurveTo(7.379507f, 9.066316f, 7.000067f, 9.493025f, 7.0f, 10.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.CurveTo(5.447716f, 11.0f, 5.0f, 11.447715f, 5.0f, 12.0f),
                    PathNode.LineTo(5.007f, 12.117f),
                    PathNode.CurveTo(5.066316f, 12.620493f, 5.493026f, 12.999933f, 6.0f, 13.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.CurveTo(7.0f, 14.552285f, 7.447716f, 15.0f, 8.0f, 15.0f),
                    PathNode.LineTo(8.117f, 14.993f),
                    PathNode.CurveTo(8.620493f, 14.933684f, 8.999933f, 14.506975f, 9.0f, 14.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.CurveTo(10.552285f, 13.0f, 11.0f, 12.552285f, 11.0f, 12.0f),
                    PathNode.LineTo(10.993f, 11.883f),
                    PathNode.CurveTo(10.933684f, 11.379507f, 10.506975f, 11.000067f, 10.0f, 11.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.CurveTo(9.0f, 9.447715f, 8.552285f, 9.0f, 8.0f, 9.0f),
                    PathNode.MoveTo(18.0f, 12.0f),
                    PathNode.CurveTo(17.447716f, 12.0f, 17.0f, 12.447715f, 17.0f, 13.0f),
                    PathNode.LineTo(17.0f, 13.01f),
                    PathNode.CurveTo(17.0f, 13.562284f, 17.447716f, 14.01f, 18.0f, 14.01f),
                    PathNode.CurveTo(18.552284f, 14.01f, 19.0f, 13.562284f, 19.0f, 13.01f),
                    PathNode.LineTo(19.0f, 13.0f),
                    PathNode.CurveTo(19.0f, 12.447715f, 18.552284f, 12.0f, 18.0f, 12.0f),
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.CurveTo(14.447715f, 10.0f, 14.0f, 10.447715f, 14.0f, 11.0f),
                    PathNode.LineTo(14.0f, 11.01f),
                    PathNode.CurveTo(14.0f, 11.562284f, 14.447715f, 12.01f, 15.0f, 12.01f),
                    PathNode.CurveTo(15.552285f, 12.01f, 16.0f, 11.562284f, 16.0f, 11.01f),
                    PathNode.LineTo(16.0f, 11.0f),
                    PathNode.CurveTo(16.0f, 10.447715f, 15.552285f, 10.0f, 15.0f, 10.0f)
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
        return _deviceGamepad!!
    }

private var _deviceGamepad: ImageVector? = null
