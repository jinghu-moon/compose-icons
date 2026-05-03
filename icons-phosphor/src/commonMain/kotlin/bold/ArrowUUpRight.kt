package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) return _arrowUUpRight!!
        _arrowUUpRight = phosphorBoldIcon(
            name = "ArrowUUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(167.51f, 127.51f),
                    PathNode.LineTo(195.0f, 100.0f),
                    PathNode.LineTo(88.0f, 100.0f),
                    PathNode.CurveTo(63.69947f, 100.0f, 44.0f, 119.69947f, 44.0f, 144.0f),
                    PathNode.CurveTo(44.0f, 168.30052f, 63.69947f, 188.0f, 88.0f, 188.0f),
                    PathNode.LineTo(176.0f, 188.0f),
                    PathNode.CurveTo(182.62741f, 188.0f, 188.0f, 193.37259f, 188.0f, 200.0f),
                    PathNode.CurveTo(188.0f, 206.62741f, 182.62741f, 212.0f, 176.0f, 212.0f),
                    PathNode.LineTo(88.0f, 212.0f),
                    PathNode.CurveTo(50.444637f, 212.0f, 20.0f, 181.55536f, 20.0f, 144.0f),
                    PathNode.CurveTo(20.0f, 106.44463f, 50.444637f, 76.0f, 88.0f, 76.0f),
                    PathNode.LineTo(195.0f, 76.0f),
                    PathNode.LineTo(167.51f, 48.49f),
                    PathNode.CurveTo(162.81558f, 43.79558f, 162.81558f, 36.18442f, 167.51f, 31.49f),
                    PathNode.CurveTo(172.20442f, 26.79558f, 179.81558f, 26.79558f, 184.51f, 31.49f),
                    PathNode.LineTo(232.51f, 79.49f),
                    PathNode.CurveTo(234.76945f, 81.74162f, 236.03946f, 84.80018f, 236.03946f, 87.99f),
                    PathNode.CurveTo(236.03946f, 91.17982f, 234.76945f, 94.23838f, 232.51f, 96.49f),
                    PathNode.LineTo(184.51f, 144.49f),
                    PathNode.CurveTo(179.81558f, 149.18442f, 172.20442f, 149.18442f, 167.51f, 144.49f),
                    PathNode.CurveTo(162.81558f, 139.79558f, 162.81558f, 132.18442f, 167.51f, 127.49f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
