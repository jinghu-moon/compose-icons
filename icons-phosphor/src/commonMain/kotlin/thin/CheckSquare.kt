package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CheckSquare: ImageVector
    get() {
        if (_checkSquare != null) return _checkSquare!!
        _checkSquare = phosphorThinIcon(
            name = "CheckSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(170.83f, 101.17f),
                    PathNode.CurveTo(171.58112f, 101.92027f, 172.00314f, 102.93836f, 172.00314f, 104.0f),
                    PathNode.CurveTo(172.00314f, 105.06164f, 171.58112f, 106.07973f, 170.83f, 106.83f),
                    PathNode.LineTo(114.83f, 162.83f),
                    PathNode.CurveTo(114.07973f, 163.58112f, 113.06164f, 164.00314f, 112.0f, 164.00314f),
                    PathNode.CurveTo(110.93836f, 164.00314f, 109.92027f, 163.58112f, 109.17f, 162.83f),
                    PathNode.LineTo(85.17f, 138.83f),
                    PathNode.CurveTo(83.60703f, 137.26703f, 83.60703f, 134.73297f, 85.17f, 133.17f),
                    PathNode.CurveTo(86.73296f, 131.60704f, 89.26704f, 131.60704f, 90.83f, 133.17f),
                    PathNode.LineTo(112.0f, 154.34f),
                    PathNode.LineTo(165.17f, 101.17f),
                    PathNode.CurveTo(165.92027f, 100.418884f, 166.93837f, 99.99686f, 168.0f, 99.99686f),
                    PathNode.CurveTo(169.06163f, 99.99686f, 170.07973f, 100.418884f, 170.83f, 101.17f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 208.0f),
                    PathNode.CurveTo(220.0f, 214.62741f, 214.62741f, 220.0f, 208.0f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(41.37258f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 48.0f),
                    PathNode.CurveTo(36.0f, 41.37258f, 41.37258f, 36.0f, 48.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(214.62741f, 36.0f, 220.0f, 41.37258f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 45.79086f, 210.20914f, 44.0f, 208.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(45.79086f, 44.0f, 44.0f, 45.79086f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 210.20914f, 45.79086f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(210.20914f, 212.0f, 212.0f, 210.20914f, 212.0f, 208.0f),
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
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null
