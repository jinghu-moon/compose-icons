package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BoxArrowDown: ImageVector
    get() {
        if (_boxArrowDown != null) return _boxArrowDown!!
        _boxArrowDown = phosphorThinIcon(
            name = "BoxArrowDown",
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
                    PathNode.MoveTo(162.83f, 149.17f),
                    PathNode.CurveTo(163.58112f, 149.92027f, 164.00314f, 150.93837f, 164.00314f, 152.0f),
                    PathNode.CurveTo(164.00314f, 153.06163f, 163.58112f, 154.07973f, 162.83f, 154.83f),
                    PathNode.LineTo(130.83f, 186.83f),
                    PathNode.CurveTo(130.07973f, 187.58112f, 129.06163f, 188.00314f, 128.0f, 188.00314f),
                    PathNode.CurveTo(126.93836f, 188.00314f, 125.92027f, 187.58112f, 125.17f, 186.83f),
                    PathNode.LineTo(93.17f, 154.83f),
                    PathNode.CurveTo(91.60703f, 153.26703f, 91.60703f, 150.73297f, 93.17f, 149.17f),
                    PathNode.CurveTo(94.73296f, 147.60704f, 97.26704f, 147.60704f, 98.83f, 149.17f),
                    PathNode.LineTo(124.0f, 174.34f),
                    PathNode.LineTo(124.0f, 104.0f),
                    PathNode.CurveTo(124.0f, 101.79086f, 125.79086f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(130.20914f, 100.0f, 132.0f, 101.79086f, 132.0f, 104.0f),
                    PathNode.LineTo(132.0f, 174.34f),
                    PathNode.LineTo(157.17f, 149.17f),
                    PathNode.CurveTo(157.92027f, 148.41888f, 158.93837f, 147.99686f, 160.0f, 147.99686f),
                    PathNode.CurveTo(161.06163f, 147.99686f, 162.07973f, 148.41888f, 162.83f, 149.17f),
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
        return _boxArrowDown!!
    }

private var _boxArrowDown: ImageVector? = null
