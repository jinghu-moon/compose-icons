package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceUsb: ImageVector
    get() {
        if (_deviceUsb != null) return _deviceUsb!!
        _deviceUsb = tablerFilledIcon(
            name = "DeviceUsb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.CurveTo(15.552285f, 2.0f, 16.0f, 2.447715f, 16.0f, 3.0f),
                    PathNode.LineTo(16.0f, 7.0f),
                    PathNode.LineTo(17.0f, 7.0f),
                    PathNode.CurveTo(17.552284f, 7.0f, 18.0f, 7.447716f, 18.0f, 8.0f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.CurveTo(18.0f, 19.31371f, 15.313708f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(8.686292f, 22.0f, 6.0f, 19.31371f, 6.0f, 16.0f),
                    PathNode.LineTo(6.0f, 8.0f),
                    PathNode.CurveTo(6.0f, 7.447716f, 6.447716f, 7.0f, 7.0f, 7.0f),
                    PathNode.LineTo(8.0f, 7.0f),
                    PathNode.LineTo(8.0f, 3.0f),
                    PathNode.CurveTo(8.0f, 2.447715f, 8.447715f, 2.0f, 9.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.LineTo(14.0f, 7.0f),
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
        return _deviceUsb!!
    }

private var _deviceUsb: ImageVector? = null
