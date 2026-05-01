package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GasPump: ImageVector
    get() {
        if (_gasPump != null) return _gasPump!!
        _gasPump = phosphorBoldIcon(
            name = "GasPump",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.8f, 66.83f),
                    PathNode.LineTo(228.49f, 47.51f),
                    PathNode.CurveTo(223.79558f, 42.81558f, 216.18442f, 42.81558f, 211.49f, 47.51f),
                    PathNode.CurveTo(206.79558f, 52.20442f, 206.79558f, 59.81558f, 211.49f, 64.51f),
                    PathNode.LineTo(230.83f, 83.8f),
                    PathNode.CurveTo(231.57996f, 84.55079f, 232.00084f, 85.56882f, 232.0f, 86.63f),
                    PathNode.LineTo(232.0f, 166.0f),
                    PathNode.CurveTo(232.0f, 169.3137f, 229.3137f, 172.0f, 226.0f, 172.0f),
                    PathNode.CurveTo(222.6863f, 172.0f, 220.0f, 169.3137f, 220.0f, 166.0f),
                    PathNode.LineTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 112.536026f, 207.46397f, 100.0f, 192.0f, 100.0f),
                    PathNode.LineTo(180.0f, 100.0f),
                    PathNode.LineTo(180.0f, 56.0f),
                    PathNode.CurveTo(180.0f, 40.53603f, 167.46397f, 28.0f, 152.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(56.53603f, 28.0f, 44.0f, 40.53603f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 204.0f),
                    PathNode.LineTo(32.0f, 204.0f),
                    PathNode.CurveTo(25.372583f, 204.0f, 20.0f, 209.37259f, 20.0f, 216.0f),
                    PathNode.CurveTo(20.0f, 222.62741f, 25.372583f, 228.0f, 32.0f, 228.0f),
                    PathNode.LineTo(192.0f, 228.0f),
                    PathNode.CurveTo(198.62741f, 228.0f, 204.0f, 222.62741f, 204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 209.37259f, 198.62741f, 204.0f, 192.0f, 204.0f),
                    PathNode.LineTo(180.0f, 204.0f),
                    PathNode.LineTo(180.0f, 124.0f),
                    PathNode.LineTo(192.0f, 124.0f),
                    PathNode.CurveTo(194.20914f, 124.0f, 196.0f, 125.79086f, 196.0f, 128.0f),
                    PathNode.LineTo(196.0f, 166.0f),
                    PathNode.CurveTo(196.0f, 182.56854f, 209.43146f, 196.0f, 226.0f, 196.0f),
                    PathNode.CurveTo(242.56854f, 196.0f, 256.0f, 182.56854f, 256.0f, 166.0f),
                    PathNode.LineTo(256.0f, 86.63f),
                    PathNode.CurveTo(256.02158f, 79.19956f, 253.06873f, 72.0695f, 247.8f, 66.83f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 204.0f),
                    PathNode.LineTo(68.0f, 56.0f),
                    PathNode.CurveTo(68.0f, 53.79086f, 69.79086f, 52.0f, 72.0f, 52.0f),
                    PathNode.LineTo(152.0f, 52.0f),
                    PathNode.CurveTo(154.20914f, 52.0f, 156.0f, 53.79086f, 156.0f, 56.0f),
                    PathNode.LineTo(156.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 112.0f),
                    PathNode.CurveTo(140.0f, 118.62742f, 134.62741f, 124.0f, 128.0f, 124.0f),
                    PathNode.LineTo(96.0f, 124.0f),
                    PathNode.CurveTo(89.37258f, 124.0f, 84.0f, 118.62742f, 84.0f, 112.0f),
                    PathNode.CurveTo(84.0f, 105.37258f, 89.37258f, 100.0f, 96.0f, 100.0f),
                    PathNode.LineTo(128.0f, 100.0f),
                    PathNode.CurveTo(134.62741f, 100.0f, 140.0f, 105.37258f, 140.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
