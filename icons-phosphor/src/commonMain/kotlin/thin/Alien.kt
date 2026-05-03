package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorThinIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(77.21265f, 20.055115f, 36.055115f, 61.21265f, 36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 135.19f, 48.26f, 165.33f, 68.8f, 192.63f),
                    PathNode.CurveTo(84.58f, 213.6f, 108.41f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(147.59f, 236.0f, 171.42f, 213.6f, 187.2f, 192.63f),
                    PathNode.CurveTo(207.74f, 165.33f, 220.0f, 135.19f, 220.0f, 112.0f),
                    PathNode.CurveTo(219.94489f, 61.21265f, 178.78735f, 20.055115f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.8f, 187.82f),
                    PathNode.CurveTo(162.44f, 212.23f, 141.71f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(114.29f, 228.0f, 93.56f, 212.23f, 75.2f, 187.82f),
                    PathNode.CurveTo(56.0f, 162.24f, 44.0f, 133.19f, 44.0f, 112.0f),
                    PathNode.CurveTo(44.0f, 65.60808f, 81.60808f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(174.39192f, 28.0f, 212.0f, 65.60808f, 212.0f, 112.0f),
                    PathNode.CurveTo(212.0f, 133.19f, 200.05f, 162.24f, 180.8f, 187.82f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 136.0f),
                    PathNode.CurveTo(116.0f, 116.11775f, 99.88225f, 100.0f, 80.0f, 100.0f),
                    PathNode.CurveTo(73.37258f, 100.0f, 68.0f, 105.37258f, 68.0f, 112.0f),
                    PathNode.CurveTo(68.0f, 131.88225f, 84.11775f, 148.0f, 104.0f, 148.0f),
                    PathNode.CurveTo(110.62742f, 148.0f, 116.0f, 142.62741f, 116.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 140.0f),
                    PathNode.CurveTo(88.536026f, 140.0f, 76.0f, 127.463974f, 76.0f, 112.0f),
                    PathNode.CurveTo(76.0f, 109.79086f, 77.79086f, 108.0f, 80.0f, 108.0f),
                    PathNode.CurveTo(95.463974f, 108.0f, 108.0f, 120.536026f, 108.0f, 136.0f),
                    PathNode.CurveTo(108.0f, 138.20914f, 106.20914f, 140.0f, 104.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 100.0f),
                    PathNode.CurveTo(156.11777f, 100.0f, 140.0f, 116.11775f, 140.0f, 136.0f),
                    PathNode.CurveTo(140.0f, 142.62741f, 145.37259f, 148.0f, 152.0f, 148.0f),
                    PathNode.CurveTo(171.88223f, 148.0f, 188.0f, 131.88225f, 188.0f, 112.0f),
                    PathNode.CurveTo(188.0f, 105.37258f, 182.62741f, 100.0f, 176.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 140.0f),
                    PathNode.CurveTo(149.79086f, 140.0f, 148.0f, 138.20914f, 148.0f, 136.0f),
                    PathNode.CurveTo(148.0f, 120.536026f, 160.53603f, 108.0f, 176.0f, 108.0f),
                    PathNode.CurveTo(178.20914f, 108.0f, 180.0f, 109.79086f, 180.0f, 112.0f),
                    PathNode.CurveTo(180.0f, 127.463974f, 167.46397f, 140.0f, 152.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 184.0f),
                    PathNode.CurveTo(148.0f, 186.20914f, 146.20914f, 188.0f, 144.0f, 188.0f),
                    PathNode.LineTo(112.0f, 188.0f),
                    PathNode.CurveTo(109.79086f, 188.0f, 108.0f, 186.20914f, 108.0f, 184.0f),
                    PathNode.CurveTo(108.0f, 181.79086f, 109.79086f, 180.0f, 112.0f, 180.0f),
                    PathNode.LineTo(144.0f, 180.0f),
                    PathNode.CurveTo(146.20914f, 180.0f, 148.0f, 181.79086f, 148.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _alien!!
    }

private var _alien: ImageVector? = null
