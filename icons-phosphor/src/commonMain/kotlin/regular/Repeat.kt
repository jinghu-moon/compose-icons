package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Repeat: ImageVector
    get() {
        if (_repeat != null) return _repeat!!
        _repeat = phosphorRegularIcon(
            name = "Repeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.0f, 128.0f),
                    PathNode.CurveTo(24.044088f, 88.25378f, 56.253773f, 56.04409f, 96.0f, 56.0f),
                    PathNode.LineTo(204.69f, 56.0f),
                    PathNode.LineTo(194.34f, 45.66f),
                    PathNode.CurveTo(191.21407f, 42.53407f, 191.21407f, 37.46593f, 194.34f, 34.34f),
                    PathNode.CurveTo(197.46593f, 31.21407f, 202.53407f, 31.214067f, 205.66f, 34.34f),
                    PathNode.LineTo(229.66f, 58.34f),
                    PathNode.CurveTo(231.16223f, 59.840546f, 232.00629f, 61.876724f, 232.00629f, 64.0f),
                    PathNode.CurveTo(232.00629f, 66.123276f, 231.16223f, 68.159454f, 229.66f, 69.66f),
                    PathNode.LineTo(205.66f, 93.66f),
                    PathNode.CurveTo(202.53407f, 96.785934f, 197.46593f, 96.785934f, 194.34f, 93.66f),
                    PathNode.CurveTo(191.21407f, 90.534065f, 191.21407f, 85.465935f, 194.34f, 82.34f),
                    PathNode.LineTo(204.69f, 72.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.CurveTo(65.08576f, 72.033066f, 40.03307f, 97.08576f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 132.41827f, 36.418278f, 136.0f, 32.0f, 136.0f),
                    PathNode.CurveTo(27.581722f, 136.0f, 24.0f, 132.41827f, 24.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 120.0f),
                    PathNode.CurveTo(219.58173f, 120.0f, 216.0f, 123.58172f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.96693f, 158.91423f, 190.91423f, 183.96693f, 160.0f, 184.0f),
                    PathNode.LineTo(51.31f, 184.0f),
                    PathNode.LineTo(61.66f, 173.66f),
                    PathNode.CurveTo(64.785934f, 170.53407f, 64.785934f, 165.46593f, 61.66f, 162.34f),
                    PathNode.CurveTo(58.53407f, 159.21407f, 53.46593f, 159.21407f, 50.34f, 162.34f),
                    PathNode.LineTo(26.34f, 186.34f),
                    PathNode.CurveTo(24.837784f, 187.84055f, 23.993708f, 189.87672f, 23.993708f, 192.0f),
                    PathNode.CurveTo(23.993708f, 194.12328f, 24.837784f, 196.15945f, 26.34f, 197.66f),
                    PathNode.LineTo(50.34f, 221.66f),
                    PathNode.CurveTo(53.46593f, 224.78593f, 58.53407f, 224.78593f, 61.66f, 221.66f),
                    PathNode.CurveTo(64.785934f, 218.53407f, 64.785934f, 213.46593f, 61.66f, 210.34f),
                    PathNode.LineTo(51.31f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.CurveTo(199.74623f, 199.95592f, 231.95592f, 167.74623f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 123.58172f, 228.41827f, 120.0f, 224.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _repeat!!
    }

private var _repeat: ImageVector? = null
