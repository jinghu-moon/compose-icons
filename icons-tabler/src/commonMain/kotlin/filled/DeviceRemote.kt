package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceRemote: ImageVector
    get() {
        if (_deviceRemote != null) return _deviceRemote!!
        _deviceRemote = tablerFilledIcon(
            name = "DeviceRemote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.CurveTo(16.656855f, 2.0f, 18.0f, 3.343146f, 18.0f, 5.0f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.CurveTo(18.0f, 20.656855f, 16.656855f, 22.0f, 15.0f, 22.0f),
                    PathNode.LineTo(9.0f, 22.0f),
                    PathNode.CurveTo(7.343146f, 22.0f, 6.0f, 20.656855f, 6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(6.0f, 3.343146f, 7.343146f, 2.0f, 9.0f, 2.0f),
                    PathNode.LineTo(11.0f, 2.0f),
                    PathNode.LineTo(11.0f, 3.0f),
                    PathNode.CurveTo(11.000067f, 3.506975f, 11.379507f, 3.933684f, 11.883f, 3.993f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.CurveTo(12.552285f, 4.0f, 13.0f, 3.552285f, 13.0f, 3.0f),
                    PathNode.LineTo(13.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(10.0f, 17.0f),
                    PathNode.CurveTo(9.447715f, 17.0f, 9.0f, 17.447716f, 9.0f, 18.0f),
                    PathNode.LineTo(9.007f, 18.127f),
                    PathNode.CurveTo(9.06949f, 18.65239f, 9.530421f, 19.03818f, 10.058605f, 19.007172f),
                    PathNode.CurveTo(10.586789f, 18.976164f, 10.999413f, 18.539095f, 11.0f, 18.01f),
                    PathNode.LineTo(10.993f, 17.883f),
                    PathNode.CurveTo(10.933684f, 17.379507f, 10.506975f, 17.000067f, 10.0f, 17.0f),
                    PathNode.MoveTo(14.0f, 17.0f),
                    PathNode.CurveTo(13.447715f, 17.0f, 13.0f, 17.447716f, 13.0f, 18.0f),
                    PathNode.LineTo(13.007f, 18.127f),
                    PathNode.CurveTo(13.06949f, 18.65239f, 13.530421f, 19.03818f, 14.058605f, 19.007172f),
                    PathNode.CurveTo(14.586789f, 18.976164f, 14.999413f, 18.539095f, 15.0f, 18.01f),
                    PathNode.LineTo(14.993f, 17.883f),
                    PathNode.CurveTo(14.933684f, 17.379507f, 14.506975f, 17.000067f, 14.0f, 17.0f),
                    PathNode.MoveTo(10.0f, 14.0f),
                    PathNode.CurveTo(9.447715f, 14.0f, 9.0f, 14.447715f, 9.0f, 15.0f),
                    PathNode.LineTo(9.007f, 15.127f),
                    PathNode.CurveTo(9.06949f, 15.65239f, 9.530421f, 16.03818f, 10.058605f, 16.007172f),
                    PathNode.CurveTo(10.586789f, 15.976165f, 10.999413f, 15.539093f, 11.0f, 15.01f),
                    PathNode.LineTo(10.993f, 14.883f),
                    PathNode.CurveTo(10.933684f, 14.379507f, 10.506975f, 14.000067f, 10.0f, 14.0f),
                    PathNode.MoveTo(14.0f, 14.0f),
                    PathNode.CurveTo(13.447715f, 14.0f, 13.0f, 14.447715f, 13.0f, 15.0f),
                    PathNode.LineTo(13.007f, 15.127f),
                    PathNode.CurveTo(13.06949f, 15.65239f, 13.530421f, 16.03818f, 14.058605f, 16.007172f),
                    PathNode.CurveTo(14.586789f, 15.976165f, 14.999413f, 15.539093f, 15.0f, 15.01f),
                    PathNode.LineTo(14.993f, 14.883f),
                    PathNode.CurveTo(14.933684f, 14.379507f, 14.506975f, 14.000067f, 14.0f, 14.0f),
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(10.411443f, 6.999912f, 9.098195f, 8.238179f, 9.005f, 9.824f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.CurveTo(9.0f, 11.656855f, 10.343145f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(13.656855f, 13.0f, 15.0f, 11.656855f, 15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 8.343146f, 13.656855f, 7.0f, 12.0f, 7.0f)
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
        return _deviceRemote!!
    }

private var _deviceRemote: ImageVector? = null
