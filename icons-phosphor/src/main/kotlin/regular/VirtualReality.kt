package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) return _virtualReality!!
        _virtualReality = phosphorRegularIcon(
            name = "VirtualReality",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(123.49f, 98.81f),
                    PathNode.LineTo(99.49f, 162.81f),
                    PathNode.CurveTo(98.32614f, 165.94553f, 95.334564f, 168.02612f, 91.99f, 168.02612f),
                    PathNode.CurveTo(88.64544f, 168.02612f, 85.65386f, 165.94553f, 84.49f, 162.81f),
                    PathNode.LineTo(60.49f, 98.81f),
                    PathNode.CurveTo(58.93808f, 94.66786f, 61.037865f, 90.05192f, 65.18f, 88.5f),
                    PathNode.CurveTo(69.322136f, 86.94808f, 73.93808f, 89.04787f, 75.49f, 93.19f),
                    PathNode.LineTo(92.0f, 137.19f),
                    PathNode.LineTo(108.51f, 93.19f),
                    PathNode.CurveTo(110.06192f, 89.04787f, 114.677864f, 86.94808f, 118.82f, 88.5f),
                    PathNode.CurveTo(122.962135f, 90.05192f, 125.06192f, 94.66786f, 123.51f, 98.81f),
                    PathNode.Close,
                    PathNode.MoveTo(256.0f, 128.0f),
                    PathNode.CurveTo(255.9504f, 172.16223f, 220.16223f, 207.9504f, 176.0f, 208.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.CurveTo(35.81722f, 208.0f, 0f, 172.18279f, 0f, 128.0f),
                    PathNode.CurveTo(0f, 83.81722f, 35.81722f, 48.0f, 80.0f, 48.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(220.16223f, 48.0496f, 255.9504f, 83.83778f, 256.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.CurveTo(239.96143f, 92.66977f, 211.33023f, 64.03858f, 176.0f, 64.0f),
                    PathNode.LineTo(80.0f, 64.0f),
                    PathNode.CurveTo(44.653774f, 64.0f, 16.0f, 92.65378f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 163.34622f, 44.653774f, 192.0f, 80.0f, 192.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.CurveTo(211.33023f, 191.96143f, 239.96143f, 163.33023f, 240.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.84f, 138.35f),
                    PathNode.LineTo(191.0f, 156.0f),
                    PathNode.CurveTo(193.19257f, 159.83838f, 191.85838f, 164.72745f, 188.02f, 166.92f),
                    PathNode.CurveTo(184.18163f, 169.11256f, 179.29257f, 167.77838f, 177.1f, 163.94f),
                    PathNode.LineTo(165.66f, 143.94f),
                    PathNode.CurveTo(165.13f, 143.94f, 164.59f, 143.99f, 164.05f, 143.99f),
                    PathNode.LineTo(152.0f, 143.99f),
                    PathNode.LineTo(152.0f, 159.99f),
                    PathNode.CurveTo(152.0f, 164.40828f, 148.41827f, 167.99f, 144.0f, 167.99f),
                    PathNode.CurveTo(139.58173f, 167.99f, 136.0f, 164.40828f, 136.0f, 159.99f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.CurveTo(136.0f, 91.58172f, 139.58173f, 88.0f, 144.0f, 88.0f),
                    PathNode.LineTo(164.0f, 88.0f),
                    PathNode.CurveTo(176.03188f, 88.01136f, 186.71133f, 95.70813f, 190.52771f, 107.11872f),
                    PathNode.CurveTo(194.34409f, 118.529305f, 190.44403f, 131.10231f, 180.84f, 138.35f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 128.0f),
                    PathNode.LineTo(164.0f, 128.0f),
                    PathNode.CurveTo(170.62741f, 128.0f, 176.0f, 122.62742f, 176.0f, 116.0f),
                    PathNode.CurveTo(176.0f, 109.37258f, 170.62741f, 104.0f, 164.0f, 104.0f),
                    PathNode.LineTo(152.0f, 104.0f),
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
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
