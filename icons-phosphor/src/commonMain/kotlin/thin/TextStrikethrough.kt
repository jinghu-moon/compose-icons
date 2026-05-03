package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorThinIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 130.20914f, 218.20914f, 132.0f, 216.0f, 132.0f),
                    PathNode.LineTo(161.16f, 132.0f),
                    PathNode.CurveTo(176.61f, 139.24f, 188.0f, 149.8f, 188.0f, 168.0f),
                    PathNode.CurveTo(188.0f, 192.26f, 161.08f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(94.92f, 212.0f, 68.0f, 192.26f, 68.0f, 168.0f),
                    PathNode.CurveTo(68.0f, 165.79086f, 69.79086f, 164.0f, 72.0f, 164.0f),
                    PathNode.CurveTo(74.20914f, 164.0f, 76.0f, 165.79086f, 76.0f, 168.0f),
                    PathNode.CurveTo(76.0f, 187.85f, 99.33f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(156.67f, 204.0f, 180.0f, 187.85f, 180.0f, 168.0f),
                    PathNode.CurveTo(180.0f, 148.46f, 163.87f, 139.7f, 137.82f, 132.0f),
                    PathNode.LineTo(40.0f, 132.0f),
                    PathNode.CurveTo(37.79086f, 132.0f, 36.0f, 130.20914f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 125.79086f, 37.79086f, 124.0f, 40.0f, 124.0f),
                    PathNode.LineTo(216.0f, 124.0f),
                    PathNode.CurveTo(218.20914f, 124.0f, 220.0f, 125.79086f, 220.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.33f, 100.0f),
                    PathNode.CurveTo(76.754845f, 100.00276f, 77.17722f, 99.93518f, 77.58f, 99.8f),
                    PathNode.CurveTo(79.6529f, 99.10948f, 80.78821f, 96.88339f, 80.13f, 94.8f),
                    PathNode.CurveTo(79.44603f, 92.61607f, 79.108604f, 90.33843f, 79.13f, 88.05f),
                    PathNode.CurveTo(79.13f, 67.53f, 100.13f, 52.05f, 128.02f, 52.05f),
                    PathNode.CurveTo(148.34f, 52.05f, 165.02f, 60.25f, 172.51f, 73.97f),
                    PathNode.CurveTo(173.63193f, 75.77738f, 175.9722f, 76.39046f, 177.83615f, 75.36529f),
                    PathNode.CurveTo(179.70009f, 74.34011f, 180.4356f, 72.035355f, 179.51f, 70.12f),
                    PathNode.CurveTo(170.54f, 53.75f, 151.29f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(95.57f, 44.0f, 71.11f, 62.92f, 71.11f, 88.0f),
                    PathNode.CurveTo(71.092545f, 91.13892f, 71.5718f, 94.26085f, 72.53f, 97.25f),
                    PathNode.CurveTo(73.069885f, 98.891106f, 74.60237f, 100.000145f, 76.33f, 100.0f),
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
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
