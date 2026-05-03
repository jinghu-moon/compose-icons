package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorThinIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 72.0f),
                    PathNode.LineTo(140.0f, 184.0f),
                    PathNode.CurveTo(140.0f, 186.20914f, 138.20914f, 188.0f, 136.0f, 188.0f),
                    PathNode.CurveTo(133.79086f, 188.0f, 132.0f, 186.20914f, 132.0f, 184.0f),
                    PathNode.LineTo(132.0f, 72.0f),
                    PathNode.CurveTo(132.0f, 69.79086f, 133.79086f, 68.0f, 136.0f, 68.0f),
                    PathNode.CurveTo(138.20914f, 68.0f, 140.0f, 69.79086f, 140.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 68.0f),
                    PathNode.LineTo(176.0f, 68.0f),
                    PathNode.CurveTo(173.79086f, 68.0f, 172.0f, 69.79086f, 172.0f, 72.0f),
                    PathNode.LineTo(172.0f, 184.0f),
                    PathNode.CurveTo(172.0f, 186.20914f, 173.79086f, 188.0f, 176.0f, 188.0f),
                    PathNode.CurveTo(178.20914f, 188.0f, 180.0f, 186.20914f, 180.0f, 184.0f),
                    PathNode.LineTo(180.0f, 132.0f),
                    PathNode.LineTo(224.0f, 132.0f),
                    PathNode.CurveTo(226.20914f, 132.0f, 228.0f, 130.20914f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 125.79086f, 226.20914f, 124.0f, 224.0f, 124.0f),
                    PathNode.LineTo(180.0f, 124.0f),
                    PathNode.LineTo(180.0f, 76.0f),
                    PathNode.LineTo(232.0f, 76.0f),
                    PathNode.CurveTo(234.20914f, 76.0f, 236.0f, 74.20914f, 236.0f, 72.0f),
                    PathNode.CurveTo(236.0f, 69.79086f, 234.20914f, 68.0f, 232.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 124.0f),
                    PathNode.LineTo(72.0f, 124.0f),
                    PathNode.CurveTo(69.79086f, 124.0f, 68.0f, 125.79086f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 130.20914f, 69.79086f, 132.0f, 72.0f, 132.0f),
                    PathNode.LineTo(92.0f, 132.0f),
                    PathNode.LineTo(92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 167.46397f, 79.463974f, 180.0f, 64.0f, 180.0f),
                    PathNode.CurveTo(48.53603f, 180.0f, 36.0f, 167.46397f, 36.0f, 152.0f),
                    PathNode.LineTo(36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 88.536026f, 48.53603f, 76.0f, 64.0f, 76.0f),
                    PathNode.CurveTo(77.0f, 76.0f, 89.0f, 85.0f, 92.13f, 97.0f),
                    PathNode.CurveTo(92.44243f, 98.43164f, 93.51266f, 99.57786f, 94.91953f, 99.987595f),
                    PathNode.CurveTo(96.326416f, 100.39733f, 97.84473f, 100.005005f, 98.877f, 98.965f),
                    PathNode.CurveTo(99.90926f, 97.92499f, 100.29024f, 96.40378f, 99.87f, 95.0f),
                    PathNode.CurveTo(95.85f, 79.36f, 80.76f, 68.0f, 64.0f, 68.0f),
                    PathNode.CurveTo(44.11775f, 68.0f, 28.0f, 84.11775f, 28.0f, 104.0f),
                    PathNode.LineTo(28.0f, 152.0f),
                    PathNode.CurveTo(28.0f, 171.88223f, 44.11775f, 188.0f, 64.0f, 188.0f),
                    PathNode.CurveTo(83.88225f, 188.0f, 100.0f, 171.88223f, 100.0f, 152.0f),
                    PathNode.LineTo(100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 125.79086f, 98.20914f, 124.0f, 96.0f, 124.0f),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
