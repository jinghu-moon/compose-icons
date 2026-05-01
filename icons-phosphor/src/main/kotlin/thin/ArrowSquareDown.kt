package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareDown: ImageVector
    get() {
        if (_arrowSquareDown != null) return _arrowSquareDown!!
        _arrowSquareDown = phosphorThinIcon(
            name = "ArrowSquareDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.83f, 133.17f),
                    PathNode.CurveTo(163.58112f, 133.92027f, 164.00314f, 134.93837f, 164.00314f, 136.0f),
                    PathNode.CurveTo(164.00314f, 137.06163f, 163.58112f, 138.07973f, 162.83f, 138.83f),
                    PathNode.LineTo(130.83f, 170.83f),
                    PathNode.CurveTo(130.07973f, 171.58112f, 129.06163f, 172.00314f, 128.0f, 172.00314f),
                    PathNode.CurveTo(126.93836f, 172.00314f, 125.92027f, 171.58112f, 125.17f, 170.83f),
                    PathNode.LineTo(93.17f, 138.83f),
                    PathNode.CurveTo(91.60703f, 137.26703f, 91.60703f, 134.73297f, 93.17f, 133.17f),
                    PathNode.CurveTo(94.73296f, 131.60704f, 97.26704f, 131.60704f, 98.83f, 133.17f),
                    PathNode.LineTo(124.0f, 158.34f),
                    PathNode.LineTo(124.0f, 88.0f),
                    PathNode.CurveTo(124.0f, 85.79086f, 125.79086f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(130.20914f, 84.0f, 132.0f, 85.79086f, 132.0f, 88.0f),
                    PathNode.LineTo(132.0f, 158.34f),
                    PathNode.LineTo(157.17f, 133.17f),
                    PathNode.CurveTo(157.92027f, 132.41888f, 158.93837f, 131.99686f, 160.0f, 131.99686f),
                    PathNode.CurveTo(161.06163f, 131.99686f, 162.07973f, 132.41888f, 162.83f, 133.17f),
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
        return _arrowSquareDown!!
    }

private var _arrowSquareDown: ImageVector? = null
