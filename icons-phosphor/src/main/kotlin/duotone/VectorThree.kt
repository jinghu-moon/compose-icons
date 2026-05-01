package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.VectorThree: ImageVector
    get() {
        if (_vectorThree != null) return _vectorThree!!
        _vectorThree = phosphorDuotoneIcon(
            name = "VectorThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 40.0f),
                    PathNode.LineTo(232.0f, 136.0f),
                    PathNode.LineTo(164.69f, 203.31f),
                    PathNode.CurveTo(161.68848f, 206.31348f, 157.61618f, 208.00069f, 153.37f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 102.63f),
                    PathNode.CurveTo(47.999313f, 98.38383f, 49.686516f, 94.311516f, 52.69f, 91.31f),
                    PathNode.LineTo(120.0f, 24.0f),
                    PathNode.LineTo(216.0f, 24.0f),
                    PathNode.CurveTo(224.83656f, 24.0f, 232.0f, 31.163445f, 232.0f, 40.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 141.66f),
                    PathNode.LineTo(205.66f, 173.66f),
                    PathNode.CurveTo(202.53407f, 176.78593f, 197.46593f, 176.78593f, 194.34f, 173.66f),
                    PathNode.CurveTo(191.21407f, 170.53407f, 191.21407f, 165.46593f, 194.34f, 162.34f),
                    PathNode.LineTo(212.69f, 144.0f),
                    PathNode.LineTo(123.31f, 144.0f),
                    PathNode.LineTo(67.31f, 200.0f),
                    PathNode.LineTo(96.0f, 200.0f),
                    PathNode.CurveTo(100.41828f, 200.0f, 104.0f, 203.58173f, 104.0f, 208.0f),
                    PathNode.CurveTo(104.0f, 212.41827f, 100.41828f, 216.0f, 96.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.CurveTo(40.0f, 155.58173f, 43.581722f, 152.0f, 48.0f, 152.0f),
                    PathNode.CurveTo(52.418278f, 152.0f, 56.0f, 155.58173f, 56.0f, 160.0f),
                    PathNode.LineTo(56.0f, 188.69f),
                    PathNode.LineTo(112.0f, 132.69f),
                    PathNode.LineTo(112.0f, 43.31f),
                    PathNode.LineTo(93.66f, 61.66f),
                    PathNode.CurveTo(90.534065f, 64.785934f, 85.465935f, 64.785934f, 82.34f, 61.66f),
                    PathNode.CurveTo(79.214066f, 58.53407f, 79.214066f, 53.46593f, 82.34f, 50.34f),
                    PathNode.LineTo(114.34f, 18.34f),
                    PathNode.CurveTo(115.840546f, 16.837784f, 117.876724f, 15.993707f, 120.0f, 15.993707f),
                    PathNode.CurveTo(122.123276f, 15.993707f, 124.159454f, 16.837784f, 125.66f, 18.34f),
                    PathNode.LineTo(157.66f, 50.34f),
                    PathNode.CurveTo(160.78593f, 53.46593f, 160.78593f, 58.53407f, 157.66f, 61.66f),
                    PathNode.CurveTo(154.53407f, 64.785934f, 149.46593f, 64.785934f, 146.34f, 61.66f),
                    PathNode.LineTo(128.0f, 43.31f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(212.69f, 128.0f),
                    PathNode.LineTo(194.34f, 109.66f),
                    PathNode.CurveTo(191.21407f, 106.534065f, 191.21407f, 101.465935f, 194.34f, 98.34f),
                    PathNode.CurveTo(197.46593f, 95.214066f, 202.53407f, 95.214066f, 205.66f, 98.34f),
                    PathNode.LineTo(237.66f, 130.34f),
                    PathNode.CurveTo(239.16223f, 131.84055f, 240.00629f, 133.87672f, 240.00629f, 136.0f),
                    PathNode.CurveTo(240.00629f, 138.12328f, 239.16223f, 140.15945f, 237.66f, 141.66f),
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
        return _vectorThree!!
    }

private var _vectorThree: ImageVector? = null
