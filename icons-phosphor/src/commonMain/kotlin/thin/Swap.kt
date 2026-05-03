package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorThinIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 158.62741f, 214.62741f, 164.0f, 208.0f, 164.0f),
                    PathNode.LineTo(89.66f, 164.0f),
                    PathNode.LineTo(106.83f, 181.17f),
                    PathNode.CurveTo(108.39297f, 182.73297f, 108.39297f, 185.26703f, 106.83f, 186.83f),
                    PathNode.CurveTo(105.26704f, 188.39296f, 102.73296f, 188.39296f, 101.17f, 186.83f),
                    PathNode.LineTo(77.17f, 162.83f),
                    PathNode.CurveTo(76.418884f, 162.07973f, 75.99686f, 161.06163f, 75.99686f, 160.0f),
                    PathNode.CurveTo(75.99686f, 158.93837f, 76.418884f, 157.92027f, 77.17f, 157.17f),
                    PathNode.LineTo(101.17f, 133.17f),
                    PathNode.CurveTo(102.73296f, 131.60704f, 105.26704f, 131.60704f, 106.83f, 133.17f),
                    PathNode.CurveTo(108.39297f, 134.73297f, 108.39297f, 137.26703f, 106.83f, 138.83f),
                    PathNode.LineTo(89.66f, 156.0f),
                    PathNode.LineTo(208.0f, 156.0f),
                    PathNode.CurveTo(210.20914f, 156.0f, 212.0f, 154.20914f, 212.0f, 152.0f),
                    PathNode.LineTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 45.79086f, 210.20914f, 44.0f, 208.0f, 44.0f),
                    PathNode.LineTo(96.0f, 44.0f),
                    PathNode.CurveTo(93.79086f, 44.0f, 92.0f, 45.79086f, 92.0f, 48.0f),
                    PathNode.LineTo(92.0f, 56.0f),
                    PathNode.CurveTo(92.0f, 58.20914f, 90.20914f, 60.0f, 88.0f, 60.0f),
                    PathNode.CurveTo(85.79086f, 60.0f, 84.0f, 58.20914f, 84.0f, 56.0f),
                    PathNode.LineTo(84.0f, 48.0f),
                    PathNode.CurveTo(84.0f, 41.37258f, 89.37258f, 36.0f, 96.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(214.62741f, 36.0f, 220.0f, 41.37258f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 196.0f),
                    PathNode.CurveTo(165.79086f, 196.0f, 164.0f, 197.79086f, 164.0f, 200.0f),
                    PathNode.LineTo(164.0f, 208.0f),
                    PathNode.CurveTo(164.0f, 210.20914f, 162.20914f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 101.79086f, 45.79086f, 100.0f, 48.0f, 100.0f),
                    PathNode.LineTo(166.34f, 100.0f),
                    PathNode.LineTo(149.17f, 117.17f),
                    PathNode.CurveTo(147.60704f, 118.73296f, 147.60704f, 121.26704f, 149.17f, 122.83f),
                    PathNode.CurveTo(150.73297f, 124.39297f, 153.26703f, 124.39297f, 154.83f, 122.83f),
                    PathNode.LineTo(178.83f, 98.83f),
                    PathNode.CurveTo(179.58112f, 98.07973f, 180.00314f, 97.06164f, 180.00314f, 96.0f),
                    PathNode.CurveTo(180.00314f, 94.93836f, 179.58112f, 93.92027f, 178.83f, 93.17f),
                    PathNode.LineTo(154.83f, 69.17f),
                    PathNode.CurveTo(153.26703f, 67.60703f, 150.73297f, 67.60703f, 149.17f, 69.17f),
                    PathNode.CurveTo(147.60704f, 70.73296f, 147.60704f, 73.26704f, 149.17f, 74.83f),
                    PathNode.LineTo(166.34f, 92.0f),
                    PathNode.LineTo(48.0f, 92.0f),
                    PathNode.CurveTo(41.37258f, 92.0f, 36.0f, 97.37258f, 36.0f, 104.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(166.62741f, 220.0f, 172.0f, 214.62741f, 172.0f, 208.0f),
                    PathNode.LineTo(172.0f, 200.0f),
                    PathNode.CurveTo(172.0f, 197.79086f, 170.20914f, 196.0f, 168.0f, 196.0f),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
