package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) return _deviceMobile!!
        _deviceMobile = tablerFilledIcon(
            name = "DeviceMobile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 2.0f),
                    PathNode.CurveTo(17.588558f, 1.999912f, 18.901804f, 3.238179f, 18.995f, 4.824f),
                    PathNode.LineTo(19.0f, 5.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.000088f, 20.588558f, 17.761822f, 21.901804f, 16.176f, 21.995f),
                    PathNode.LineTo(16.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(6.411443f, 22.000088f, 5.098196f, 20.761822f, 5.005f, 19.176f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(4.999912f, 3.411442f, 6.238179f, 2.098195f, 7.824f, 2.005f),
                    PathNode.LineTo(8.0f, 2.0f),
                    PathNode.LineTo(16.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.CurveTo(11.493025f, 16.000067f, 11.066316f, 16.379507f, 11.007f, 16.883f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(11.007f, 17.127f),
                    PathNode.CurveTo(11.066836f, 17.63005f, 11.493402f, 18.008886f, 12.0f, 18.008886f),
                    PathNode.CurveTo(12.506598f, 18.008886f, 12.933164f, 17.63005f, 12.993f, 17.127f),
                    PathNode.LineTo(13.0f, 17.01f),
                    PathNode.LineTo(12.993f, 16.883f),
                    PathNode.CurveTo(12.933684f, 16.379507f, 12.506975f, 16.000067f, 12.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 4.0f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.LineTo(10.883f, 4.007f),
                    PathNode.CurveTo(10.37995f, 4.066836f, 10.001114f, 4.493403f, 10.001114f, 5.0f),
                    PathNode.CurveTo(10.001114f, 5.506597f, 10.37995f, 5.933164f, 10.883f, 5.993f),
                    PathNode.LineTo(11.0f, 6.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.LineTo(13.117f, 5.993f),
                    PathNode.CurveTo(13.62005f, 5.933164f, 13.998886f, 5.506597f, 13.998886f, 5.0f),
                    PathNode.CurveTo(13.998886f, 4.493403f, 13.62005f, 4.066836f, 13.117f, 4.007f),
                    PathNode.LineTo(13.0f, 4.0f),
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
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
