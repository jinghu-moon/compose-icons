package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorBoldIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(209.88f, 69.83f),
                    PathNode.CurveTo(188.1879f, 48.088806f, 158.71187f, 35.91032f, 128.0f, 36.0f),
                    PathNode.LineTo(127.59f, 36.0f),
                    PathNode.CurveTo(63.85f, 36.22f, 12.0f, 88.76f, 12.0f, 153.13f),
                    PathNode.LineTo(12.0f, 176.0f),
                    PathNode.CurveTo(12.0f, 187.0457f, 20.954306f, 196.0f, 32.0f, 196.0f),
                    PathNode.LineTo(224.0f, 196.0f),
                    PathNode.CurveTo(235.0457f, 196.0f, 244.0f, 187.0457f, 244.0f, 176.0f),
                    PathNode.LineTo(244.0f, 152.0f),
                    PathNode.CurveTo(244.08382f, 121.1471f, 231.79352f, 91.5488f, 209.88f, 69.83f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 172.0f),
                    PathNode.LineTo(127.32f, 172.0f),
                    PathNode.LineTo(173.76f, 107.0f),
                    PathNode.CurveTo(177.62598f, 101.6097f, 176.3903f, 94.105995f, 171.0f, 90.24f),
                    PathNode.CurveTo(165.6097f, 86.37401f, 158.10599f, 87.6097f, 154.24f, 93.0f),
                    PathNode.LineTo(97.82f, 172.0f),
                    PathNode.LineTo(36.0f, 172.0f),
                    PathNode.LineTo(36.0f, 153.13f),
                    PathNode.CurveTo(36.0f, 151.41f, 36.0f, 149.7f, 36.14f, 148.0f),
                    PathNode.LineTo(56.0f, 148.0f),
                    PathNode.CurveTo(62.62742f, 148.0f, 68.0f, 142.62741f, 68.0f, 136.0f),
                    PathNode.CurveTo(68.0f, 129.37259f, 62.62742f, 124.0f, 56.0f, 124.0f),
                    PathNode.LineTo(40.62f, 124.0f),
                    PathNode.CurveTo(51.53f, 90.61f, 80.62f, 65.48f, 116.0f, 60.79f),
                    PathNode.LineTo(116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 86.62742f, 121.37258f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(134.62741f, 92.0f, 140.0f, 86.62742f, 140.0f, 80.0f),
                    PathNode.LineTo(140.0f, 60.8f),
                    PathNode.CurveTo(175.33131f, 65.436264f, 204.80785f, 90.05848f, 215.66f, 124.0f),
                    PathNode.LineTo(200.0f, 124.0f),
                    PathNode.CurveTo(193.37259f, 124.0f, 188.0f, 129.37259f, 188.0f, 136.0f),
                    PathNode.CurveTo(188.0f, 142.62741f, 193.37259f, 148.0f, 200.0f, 148.0f),
                    PathNode.LineTo(219.9f, 148.0f),
                    PathNode.CurveTo(219.96f, 149.33f, 220.0f, 150.66f, 220.0f, 152.0f),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
