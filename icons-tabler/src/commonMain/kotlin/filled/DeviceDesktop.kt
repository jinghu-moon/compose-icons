package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceDesktop: ImageVector
    get() {
        if (_deviceDesktop != null) return _deviceDesktop!!
        _deviceDesktop = tablerFilledIcon(
            name = "DeviceDesktop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 21.0f),
                    PathNode.CurveTo(6.447716f, 21.0f, 6.0f, 20.552284f, 6.0f, 20.0f),
                    PathNode.CurveTo(6.0f, 19.447716f, 6.447716f, 19.0f, 7.0f, 19.0f),
                    PathNode.LineTo(8.0f, 19.0f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.CurveTo(2.895431f, 17.0f, 2.0f, 16.10457f, 2.0f, 15.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.895431f, 2.895431f, 3.0f, 4.0f, 3.0f),
                    PathNode.LineTo(20.0f, 3.0f),
                    PathNode.CurveTo(21.10457f, 3.0f, 22.0f, 3.895431f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 15.0f),
                    PathNode.CurveTo(22.0f, 16.10457f, 21.10457f, 17.0f, 20.0f, 17.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.LineTo(16.0f, 19.0f),
                    PathNode.LineTo(17.0f, 19.0f),
                    PathNode.CurveTo(17.552284f, 19.0f, 18.0f, 19.447716f, 18.0f, 20.0f),
                    PathNode.CurveTo(18.0f, 20.552284f, 17.552284f, 21.0f, 17.0f, 21.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 17.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.LineTo(14.0f, 19.0f),
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
        return _deviceDesktop!!
    }

private var _deviceDesktop: ImageVector? = null
