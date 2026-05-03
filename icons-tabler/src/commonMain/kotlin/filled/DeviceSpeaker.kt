package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceSpeaker: ImageVector
    get() {
        if (_deviceSpeaker != null) return _deviceSpeaker!!
        _deviceSpeaker = tablerFilledIcon(
            name = "DeviceSpeaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(18.656855f, 2.0f, 20.0f, 3.343146f, 20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.656855f, 18.656855f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 3.343146f, 5.343146f, 2.0f, 7.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 11.0f),
                    PathNode.CurveTo(9.868599f, 10.999998f, 8.111571f, 12.671265f, 8.005f, 14.8f),
                    PathNode.LineTo(8.0f, 15.0f),
                    PathNode.CurveTo(8.0f, 17.209139f, 9.790861f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(14.209139f, 19.0f, 16.0f, 17.209139f, 16.0f, 15.0f),
                    PathNode.CurveTo(16.0f, 12.790861f, 14.209139f, 11.0f, 12.0f, 11.0f),
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(11.447715f, 6.0f, 11.0f, 6.447716f, 11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 7.01f),
                    PathNode.CurveTo(11.0f, 7.562285f, 11.447715f, 8.01f, 12.0f, 8.01f),
                    PathNode.CurveTo(12.552285f, 8.01f, 13.0f, 7.562285f, 13.0f, 7.01f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.CurveTo(13.0f, 6.447716f, 12.552285f, 6.0f, 12.0f, 6.0f)
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
        return _deviceSpeaker!!
    }

private var _deviceSpeaker: ImageVector? = null
