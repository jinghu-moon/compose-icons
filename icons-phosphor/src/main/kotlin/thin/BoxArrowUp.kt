package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BoxArrowUp: ImageVector
    get() {
        if (_boxArrowUp != null) return _boxArrowUp!!
        _boxArrowUp = phosphorThinIcon(
            name = "BoxArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.58f, 70.21f),
                    PathNode.LineTo(203.58f, 38.21f),
                    PathNode.CurveTo(202.90175f, 36.854572f, 201.51566f, 35.998917f, 200.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(54.48434f, 35.998917f, 53.098255f, 36.854572f, 52.42f, 38.21f),
                    PathNode.LineTo(36.42f, 70.21f),
                    PathNode.CurveTo(36.142914f, 70.76596f, 35.99911f, 71.378815f, 36.0f, 72.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 72.0f),
                    PathNode.CurveTo(220.00089f, 71.378815f, 219.85709f, 70.76596f, 219.58f, 70.21f),
                    PathNode.Close,
                    PathNode.MoveTo(58.47f, 44.0f),
                    PathNode.LineTo(197.53f, 44.0f),
                    PathNode.LineTo(209.53f, 68.0f),
                    PathNode.LineTo(46.47f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 76.0f),
                    PathNode.LineTo(212.0f, 76.0f),
                    PathNode.LineTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.83f, 133.17f),
                    PathNode.CurveTo(164.39296f, 134.73297f, 164.39296f, 137.26703f, 162.83f, 138.83f),
                    PathNode.CurveTo(161.26703f, 140.39296f, 158.73297f, 140.39296f, 157.17f, 138.83f),
                    PathNode.LineTo(132.0f, 113.66f),
                    PathNode.LineTo(132.0f, 184.0f),
                    PathNode.CurveTo(132.0f, 186.20914f, 130.20914f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(125.79086f, 188.0f, 124.0f, 186.20914f, 124.0f, 184.0f),
                    PathNode.LineTo(124.0f, 113.66f),
                    PathNode.LineTo(98.83f, 138.83f),
                    PathNode.CurveTo(97.26704f, 140.39296f, 94.73296f, 140.39296f, 93.17f, 138.83f),
                    PathNode.CurveTo(91.60703f, 137.26703f, 91.60703f, 134.73297f, 93.17f, 133.17f),
                    PathNode.LineTo(125.17f, 101.17f),
                    PathNode.CurveTo(125.92027f, 100.418884f, 126.93836f, 99.99686f, 128.0f, 99.99686f),
                    PathNode.CurveTo(129.06163f, 99.99686f, 130.07973f, 100.418884f, 130.83f, 101.17f),
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
        return _boxArrowUp!!
    }

private var _boxArrowUp: ImageVector? = null
