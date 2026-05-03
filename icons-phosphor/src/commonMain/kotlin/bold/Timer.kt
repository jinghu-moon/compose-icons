package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = phosphorBoldIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(74.98067f, 44.0f, 32.0f, 86.98067f, 32.0f, 140.0f),
                    PathNode.CurveTo(32.0f, 193.01933f, 74.98067f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(181.01933f, 236.0f, 224.0f, 193.01933f, 224.0f, 140.0f),
                    PathNode.CurveTo(223.93938f, 87.00579f, 180.9942f, 44.06062f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(88.2355f, 212.0f, 56.0f, 179.7645f, 56.0f, 140.0f),
                    PathNode.CurveTo(56.0f, 100.2355f, 88.2355f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(167.7645f, 68.0f, 200.0f, 100.2355f, 200.0f, 140.0f),
                    PathNode.CurveTo(199.95592f, 179.74623f, 167.74623f, 211.95592f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.49f, 99.51f),
                    PathNode.CurveTo(166.74945f, 101.76162f, 168.01947f, 104.82018f, 168.01947f, 108.01f),
                    PathNode.CurveTo(168.01947f, 111.19982f, 166.74945f, 114.25838f, 164.49f, 116.51f),
                    PathNode.LineTo(136.49f, 144.51f),
                    PathNode.CurveTo(131.79558f, 149.20442f, 124.18442f, 149.20442f, 119.49f, 144.51f),
                    PathNode.CurveTo(114.79558f, 139.81558f, 114.79558f, 132.20442f, 119.49f, 127.51f),
                    PathNode.LineTo(147.49f, 99.51f),
                    PathNode.CurveTo(149.74162f, 97.25055f, 152.80019f, 95.98054f, 155.99f, 95.98054f),
                    PathNode.CurveTo(159.17982f, 95.98054f, 162.23837f, 97.25055f, 164.49f, 99.51f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 16.0f),
                    PathNode.CurveTo(92.0f, 9.372583f, 97.37258f, 4.0f, 104.0f, 4.0f),
                    PathNode.LineTo(152.0f, 4.0f),
                    PathNode.CurveTo(158.62741f, 4.0f, 164.0f, 9.372583f, 164.0f, 16.0f),
                    PathNode.CurveTo(164.0f, 22.627417f, 158.62741f, 28.0f, 152.0f, 28.0f),
                    PathNode.LineTo(104.0f, 28.0f),
                    PathNode.CurveTo(97.37258f, 28.0f, 92.0f, 22.627417f, 92.0f, 16.0f),
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
        return _timer!!
    }

private var _timer: ImageVector? = null
