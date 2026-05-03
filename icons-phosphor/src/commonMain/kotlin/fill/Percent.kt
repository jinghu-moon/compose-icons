package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorFillIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 172.0f),
                    PathNode.CurveTo(176.0f, 178.62741f, 170.62741f, 184.0f, 164.0f, 184.0f),
                    PathNode.CurveTo(157.37259f, 184.0f, 152.0f, 178.62741f, 152.0f, 172.0f),
                    PathNode.CurveTo(152.0f, 165.37259f, 157.37259f, 160.0f, 164.0f, 160.0f),
                    PathNode.CurveTo(170.62741f, 160.0f, 176.0f, 165.37259f, 176.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 96.0f),
                    PathNode.CurveTo(98.62742f, 96.0f, 104.0f, 90.62742f, 104.0f, 84.0f),
                    PathNode.CurveTo(104.0f, 77.37258f, 98.62742f, 72.0f, 92.0f, 72.0f),
                    PathNode.CurveTo(85.37258f, 72.0f, 80.0f, 77.37258f, 80.0f, 84.0f),
                    PathNode.CurveTo(80.0f, 90.62742f, 85.37258f, 96.0f, 92.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 84.0f),
                    PathNode.CurveTo(64.0f, 99.463974f, 76.536026f, 112.0f, 92.0f, 112.0f),
                    PathNode.CurveTo(107.463974f, 112.0f, 120.0f, 99.463974f, 120.0f, 84.0f),
                    PathNode.CurveTo(120.0f, 68.536026f, 107.463974f, 56.0f, 92.0f, 56.0f),
                    PathNode.CurveTo(76.536026f, 56.0f, 64.0f, 68.536026f, 64.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 172.0f),
                    PathNode.CurveTo(192.0f, 156.53603f, 179.46397f, 144.0f, 164.0f, 144.0f),
                    PathNode.CurveTo(148.53603f, 144.0f, 136.0f, 156.53603f, 136.0f, 172.0f),
                    PathNode.CurveTo(136.0f, 187.46397f, 148.53603f, 200.0f, 164.0f, 200.0f),
                    PathNode.CurveTo(179.46397f, 200.0f, 192.0f, 187.46397f, 192.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.66f, 66.34f),
                    PathNode.CurveTo(188.15945f, 64.83778f, 186.12328f, 63.993706f, 184.0f, 63.993706f),
                    PathNode.CurveTo(181.87672f, 63.993706f, 179.84055f, 64.83778f, 178.34f, 66.34f),
                    PathNode.LineTo(66.34f, 178.34f),
                    PathNode.CurveTo(63.21407f, 181.46593f, 63.21407f, 186.53407f, 66.34f, 189.66f),
                    PathNode.CurveTo(69.465935f, 192.78593f, 74.534065f, 192.78593f, 77.66f, 189.66f),
                    PathNode.LineTo(189.66f, 77.66f),
                    PathNode.CurveTo(191.16223f, 76.159454f, 192.00629f, 74.123276f, 192.00629f, 72.0f),
                    PathNode.CurveTo(192.00629f, 69.876724f, 191.16223f, 67.840546f, 189.66f, 66.34f),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
