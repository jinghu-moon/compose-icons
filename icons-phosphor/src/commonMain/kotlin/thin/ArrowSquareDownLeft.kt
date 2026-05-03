package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareDownLeft: ImageVector
    get() {
        if (_arrowSquareDownLeft != null) return _arrowSquareDownLeft!!
        _arrowSquareDownLeft = phosphorThinIcon(
            name = "ArrowSquareDownLeft",
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
                    PathNode.MoveTo(162.83f, 93.17f),
                    PathNode.CurveTo(163.58112f, 93.92027f, 164.00314f, 94.93836f, 164.00314f, 96.0f),
                    PathNode.CurveTo(164.00314f, 97.06164f, 163.58112f, 98.07973f, 162.83f, 98.83f),
                    PathNode.LineTo(105.66f, 156.0f),
                    PathNode.LineTo(144.0f, 156.0f),
                    PathNode.CurveTo(146.20914f, 156.0f, 148.0f, 157.79086f, 148.0f, 160.0f),
                    PathNode.CurveTo(148.0f, 162.20914f, 146.20914f, 164.0f, 144.0f, 164.0f),
                    PathNode.LineTo(96.0f, 164.0f),
                    PathNode.CurveTo(93.79086f, 164.0f, 92.0f, 162.20914f, 92.0f, 160.0f),
                    PathNode.LineTo(92.0f, 112.0f),
                    PathNode.CurveTo(92.0f, 109.79086f, 93.79086f, 108.0f, 96.0f, 108.0f),
                    PathNode.CurveTo(98.20914f, 108.0f, 100.0f, 109.79086f, 100.0f, 112.0f),
                    PathNode.LineTo(100.0f, 150.34f),
                    PathNode.LineTo(157.17f, 93.17f),
                    PathNode.CurveTo(157.92027f, 92.418884f, 158.93837f, 91.99686f, 160.0f, 91.99686f),
                    PathNode.CurveTo(161.06163f, 91.99686f, 162.07973f, 92.418884f, 162.83f, 93.17f),
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
        return _arrowSquareDownLeft!!
    }

private var _arrowSquareDownLeft: ImageVector? = null
