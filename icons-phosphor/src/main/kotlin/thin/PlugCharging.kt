package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PlugCharging: ImageVector
    get() {
        if (_plugCharging != null) return _plugCharging!!
        _plugCharging = phosphorThinIcon(
            name = "PlugCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 60.0f),
                    PathNode.LineTo(172.0f, 60.0f),
                    PathNode.LineTo(172.0f, 16.0f),
                    PathNode.CurveTo(172.0f, 13.790861f, 170.20914f, 12.0f, 168.0f, 12.0f),
                    PathNode.CurveTo(165.79086f, 12.0f, 164.0f, 13.790861f, 164.0f, 16.0f),
                    PathNode.LineTo(164.0f, 60.0f),
                    PathNode.LineTo(92.0f, 60.0f),
                    PathNode.LineTo(92.0f, 16.0f),
                    PathNode.CurveTo(92.0f, 13.790861f, 90.20914f, 12.0f, 88.0f, 12.0f),
                    PathNode.CurveTo(85.79086f, 12.0f, 84.0f, 13.790861f, 84.0f, 16.0f),
                    PathNode.LineTo(84.0f, 60.0f),
                    PathNode.LineTo(32.55f, 60.0f),
                    PathNode.CurveTo(28.13f, 60.0f, 28.0f, 63.59f, 28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 66.20914f, 29.790861f, 68.0f, 32.0f, 68.0f),
                    PathNode.LineTo(52.0f, 68.0f),
                    PathNode.LineTo(52.0f, 160.0f),
                    PathNode.CurveTo(52.0f, 179.88223f, 68.11775f, 196.0f, 88.0f, 196.0f),
                    PathNode.LineTo(124.0f, 196.0f),
                    PathNode.LineTo(124.0f, 240.0f),
                    PathNode.CurveTo(124.0f, 242.20914f, 125.79086f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(130.20914f, 244.0f, 132.0f, 242.20914f, 132.0f, 240.0f),
                    PathNode.LineTo(132.0f, 196.0f),
                    PathNode.LineTo(168.0f, 196.0f),
                    PathNode.CurveTo(187.88223f, 196.0f, 204.0f, 179.88223f, 204.0f, 160.0f),
                    PathNode.LineTo(204.0f, 68.0f),
                    PathNode.LineTo(224.0f, 68.0f),
                    PathNode.CurveTo(226.20914f, 68.0f, 228.0f, 66.20914f, 228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 61.79086f, 226.20914f, 60.0f, 224.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 160.0f),
                    PathNode.CurveTo(196.0f, 175.46397f, 183.46397f, 188.0f, 168.0f, 188.0f),
                    PathNode.LineTo(88.0f, 188.0f),
                    PathNode.CurveTo(72.536026f, 188.0f, 60.0f, 175.46397f, 60.0f, 160.0f),
                    PathNode.LineTo(60.0f, 68.0f),
                    PathNode.LineTo(196.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.71f, 130.28f),
                    PathNode.CurveTo(107.96291f, 129.20282f, 107.79105f, 127.827934f, 108.25f, 126.6f),
                    PathNode.LineTo(120.25f, 94.6f),
                    PathNode.CurveTo(121.0232f, 92.52893f, 123.32893f, 91.4768f, 125.4f, 92.25f),
                    PathNode.CurveTo(127.47107f, 93.0232f, 128.5232f, 95.32893f, 127.75f, 97.4f),
                    PathNode.LineTo(117.75f, 124.0f),
                    PathNode.LineTo(144.0f, 124.0f),
                    PathNode.CurveTo(145.3116f, 123.999016f, 146.54036f, 124.641106f, 147.28848f, 125.718414f),
                    PathNode.CurveTo(148.0366f, 126.79572f, 148.20906f, 128.17136f, 147.75f, 129.4f),
                    PathNode.LineTo(135.75f, 161.4f),
                    PathNode.CurveTo(134.9768f, 163.47107f, 132.67107f, 164.5232f, 130.6f, 163.75f),
                    PathNode.CurveTo(128.52893f, 162.9768f, 127.4768f, 160.67107f, 128.25f, 158.6f),
                    PathNode.LineTo(138.25f, 132.0f),
                    PathNode.LineTo(112.0f, 132.0f),
                    PathNode.CurveTo(110.68757f, 132.00113f, 109.45809f, 131.35835f, 108.71f, 130.28f),
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
        return _plugCharging!!
    }

private var _plugCharging: ImageVector? = null
