package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorThinIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 198.62741f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.LineTo(60.0f, 224.0f),
                    PathNode.CurveTo(60.0f, 226.20914f, 61.79086f, 228.0f, 64.0f, 228.0f),
                    PathNode.CurveTo(66.20914f, 228.0f, 68.0f, 226.20914f, 68.0f, 224.0f),
                    PathNode.LineTo(68.0f, 204.0f),
                    PathNode.LineTo(188.0f, 204.0f),
                    PathNode.LineTo(188.0f, 224.0f),
                    PathNode.CurveTo(188.0f, 226.20914f, 189.79086f, 228.0f, 192.0f, 228.0f),
                    PathNode.CurveTo(194.20914f, 228.0f, 196.0f, 226.20914f, 196.0f, 224.0f),
                    PathNode.LineTo(196.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 198.62741f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 49.37258f, 222.62741f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 196.0f),
                    PathNode.LineTo(40.0f, 196.0f),
                    PathNode.CurveTo(37.79086f, 196.0f, 36.0f, 194.20914f, 36.0f, 192.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(218.20914f, 52.0f, 220.0f, 53.79086f, 220.0f, 56.0f),
                    PathNode.LineTo(220.0f, 124.0f),
                    PathNode.LineTo(195.81f, 124.0f),
                    PathNode.CurveTo(193.67163f, 100.57536f, 173.4878f, 82.97528f, 149.99013f, 84.04557f),
                    PathNode.CurveTo(126.49245f, 85.11587f, 107.992195f, 104.47797f, 107.992195f, 128.0f),
                    PathNode.CurveTo(107.992195f, 151.52203f, 126.49245f, 170.88414f, 149.99013f, 171.95442f),
                    PathNode.CurveTo(173.4878f, 173.02472f, 193.67163f, 155.42464f, 195.81f, 132.0f),
                    PathNode.LineTo(220.0f, 132.0f),
                    PathNode.LineTo(220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 194.20914f, 218.20914f, 196.0f, 216.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.3f, 124.0f),
                    PathNode.CurveTo(161.35185f, 118.489815f, 155.71733f, 115.18451f, 149.95706f, 116.17282f),
                    PathNode.CurveTo(144.1968f, 117.161125f, 139.9863f, 122.15556f, 139.9863f, 128.0f),
                    PathNode.CurveTo(139.9863f, 133.84444f, 144.1968f, 138.83888f, 149.95706f, 139.82718f),
                    PathNode.CurveTo(155.71733f, 140.81549f, 161.35185f, 137.5102f, 163.3f, 132.0f),
                    PathNode.LineTo(187.77f, 132.0f),
                    PathNode.CurveTo(185.64732f, 150.98573f, 169.06424f, 165.00722f, 149.9898f, 163.94423f),
                    PathNode.CurveTo(130.91539f, 162.88124f, 115.99291f, 147.10402f, 115.99291f, 128.0f),
                    PathNode.CurveTo(115.99291f, 108.89598f, 130.91539f, 93.11875f, 149.9898f, 92.05577f),
                    PathNode.CurveTo(169.06424f, 90.99279f, 185.64732f, 105.01427f, 187.77f, 124.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _vault!!
    }

private var _vault: ImageVector? = null
