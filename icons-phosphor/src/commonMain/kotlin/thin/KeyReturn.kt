package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.KeyReturn: ImageVector
    get() {
        if (_keyReturn != null) return _keyReturn!!
        _keyReturn = phosphorThinIcon(
            name = "KeyReturn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 104.0f),
                    PathNode.LineTo(180.0f, 136.0f),
                    PathNode.CurveTo(180.0f, 138.20914f, 178.20914f, 140.0f, 176.0f, 140.0f),
                    PathNode.LineTo(89.66f, 140.0f),
                    PathNode.LineTo(106.83f, 157.17f),
                    PathNode.CurveTo(108.39297f, 158.73297f, 108.39297f, 161.26703f, 106.83f, 162.83f),
                    PathNode.CurveTo(105.26704f, 164.39296f, 102.73296f, 164.39296f, 101.17f, 162.83f),
                    PathNode.LineTo(77.17f, 138.83f),
                    PathNode.CurveTo(76.418884f, 138.07973f, 75.99686f, 137.06163f, 75.99686f, 136.0f),
                    PathNode.CurveTo(75.99686f, 134.93837f, 76.418884f, 133.92027f, 77.17f, 133.17f),
                    PathNode.LineTo(101.17f, 109.17f),
                    PathNode.CurveTo(102.73296f, 107.60703f, 105.26704f, 107.60703f, 106.83f, 109.17f),
                    PathNode.CurveTo(108.39297f, 110.73296f, 108.39297f, 113.26704f, 106.83f, 114.83f),
                    PathNode.LineTo(89.66f, 132.0f),
                    PathNode.LineTo(172.0f, 132.0f),
                    PathNode.LineTo(172.0f, 104.0f),
                    PathNode.CurveTo(172.0f, 101.79086f, 173.79086f, 100.0f, 176.0f, 100.0f),
                    PathNode.CurveTo(178.20914f, 100.0f, 180.0f, 101.79086f, 180.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.LineTo(228.0f, 200.0f),
                    PathNode.CurveTo(228.0f, 206.62741f, 222.62741f, 212.0f, 216.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(33.37258f, 212.0f, 28.0f, 206.62741f, 28.0f, 200.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 49.37258f, 33.37258f, 44.0f, 40.0f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(222.62741f, 44.0f, 228.0f, 49.37258f, 228.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 53.79086f, 218.20914f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(37.79086f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 202.20914f, 37.79086f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(218.20914f, 204.0f, 220.0f, 202.20914f, 220.0f, 200.0f),
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
        return _keyReturn!!
    }

private var _keyReturn: ImageVector? = null
