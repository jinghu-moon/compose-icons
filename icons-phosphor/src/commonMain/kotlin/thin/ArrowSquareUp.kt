package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareUp: ImageVector
    get() {
        if (_arrowSquareUp != null) return _arrowSquareUp!!
        _arrowSquareUp = phosphorThinIcon(
            name = "ArrowSquareUp",
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
                    PathNode.MoveTo(162.83f, 117.17f),
                    PathNode.CurveTo(164.39296f, 118.73296f, 164.39296f, 121.26704f, 162.83f, 122.83f),
                    PathNode.CurveTo(161.26703f, 124.39297f, 158.73297f, 124.39297f, 157.17f, 122.83f),
                    PathNode.LineTo(132.0f, 97.66f),
                    PathNode.LineTo(132.0f, 168.0f),
                    PathNode.CurveTo(132.0f, 170.20914f, 130.20914f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(125.79086f, 172.0f, 124.0f, 170.20914f, 124.0f, 168.0f),
                    PathNode.LineTo(124.0f, 97.66f),
                    PathNode.LineTo(98.83f, 122.83f),
                    PathNode.CurveTo(97.26704f, 124.39297f, 94.73296f, 124.39297f, 93.17f, 122.83f),
                    PathNode.CurveTo(91.60703f, 121.26704f, 91.60703f, 118.73296f, 93.17f, 117.17f),
                    PathNode.LineTo(125.17f, 85.17f),
                    PathNode.CurveTo(125.92027f, 84.418884f, 126.93836f, 83.99686f, 128.0f, 83.99686f),
                    PathNode.CurveTo(129.06163f, 83.99686f, 130.07973f, 84.418884f, 130.83f, 85.17f),
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
        return _arrowSquareUp!!
    }

private var _arrowSquareUp: ImageVector? = null
