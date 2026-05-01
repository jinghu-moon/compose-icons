package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorRegularIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(186.66f, 59.56f),
                    PathNode.CurveTo(168.47f, 32.29f, 146.54f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(109.46f, 16.0f, 87.53f, 32.29f, 69.34f, 59.56f),
                    PathNode.CurveTo(50.7f, 87.54f, 40.0f, 121.23f, 40.0f, 152.0f),
                    PathNode.CurveTo(40.0f, 200.60106f, 79.39894f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(176.60106f, 240.0f, 216.0f, 200.60106f, 216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 121.23f, 205.3f, 87.54f, 186.66f, 59.56f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 224.0f),
                    PathNode.CurveTo(88.25378f, 223.95592f, 56.04409f, 191.74623f, 56.0f, 152.0f),
                    PathNode.CurveTo(56.0f, 124.31f, 65.72f, 93.85f, 82.66f, 68.44f),
                    PathNode.CurveTo(97.19f, 46.64f, 115.41f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(137.5f, 32.0f, 150.2f, 40.33f, 162.1f, 53.78f),
                    PathNode.LineTo(122.0f, 98.67f),
                    PathNode.CurveTo(120.133705f, 100.75589f, 119.493256f, 103.66547f, 120.3112f, 106.34221f),
                    PathNode.CurveTo(121.12916f, 109.01895f, 123.28655f, 111.07357f, 126.0f, 111.76f),
                    PathNode.LineTo(150.6f, 117.91f),
                    PathNode.LineTo(144.1f, 150.43f),
                    PathNode.CurveTo(143.23546f, 154.75941f, 146.04153f, 158.97076f, 150.37f, 159.84f),
                    PathNode.CurveTo(150.90617f, 159.9506f, 151.45255f, 160.00424f, 152.0f, 160.0f),
                    PathNode.CurveTo(155.80762f, 159.99313f, 159.08276f, 157.30357f, 159.83f, 153.57f),
                    PathNode.LineTo(167.83f, 113.57f),
                    PathNode.CurveTo(168.66776f, 109.38394f, 166.07104f, 105.277626f, 161.93f, 104.24f),
                    PathNode.LineTo(142.77f, 99.45f),
                    PathNode.LineTo(172.1f, 66.6f),
                    PathNode.CurveTo(172.52f, 67.21f, 172.93f, 67.82f, 173.34f, 68.44f),
                    PathNode.CurveTo(190.28f, 93.85f, 200.0f, 124.31f, 200.0f, 152.0f),
                    PathNode.CurveTo(199.95592f, 191.74623f, 167.74623f, 223.95592f, 128.0f, 224.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
