package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceIpad: ImageVector
    get() {
        if (_deviceIpad != null) return _deviceIpad!!
        _deviceIpad = tablerFilledIcon(
            name = "DeviceIpad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.CurveTo(19.656855f, 2.0f, 21.0f, 3.343146f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.656855f, 19.656855f, 22.0f, 18.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(4.343146f, 22.0f, 3.0f, 20.656855f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.343146f, 4.343146f, 2.0f, 6.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 18.0f),
                    PathNode.LineTo(9.0f, 18.0f),
                    PathNode.CurveTo(8.447715f, 18.0f, 8.0f, 18.447716f, 8.0f, 19.0f),
                    PathNode.CurveTo(8.0f, 19.552284f, 8.447715f, 20.0f, 9.0f, 20.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.CurveTo(15.552285f, 20.0f, 16.0f, 19.552284f, 16.0f, 19.0f),
                    PathNode.CurveTo(16.0f, 18.447716f, 15.552285f, 18.0f, 15.0f, 18.0f)
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
        return _deviceIpad!!
    }

private var _deviceIpad: ImageVector? = null
