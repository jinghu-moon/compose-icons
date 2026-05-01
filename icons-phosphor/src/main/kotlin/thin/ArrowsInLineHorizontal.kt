package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsInLineHorizontal: ImageVector
    get() {
        if (_arrowsInLineHorizontal != null) return _arrowsInLineHorizontal!!
        _arrowsInLineHorizontal = phosphorThinIcon(
            name = "ArrowsInLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 40.0f),
                    PathNode.LineTo(132.0f, 216.0f),
                    PathNode.CurveTo(132.0f, 218.20914f, 130.20914f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(125.79086f, 220.0f, 124.0f, 218.20914f, 124.0f, 216.0f),
                    PathNode.LineTo(124.0f, 40.0f),
                    PathNode.CurveTo(124.0f, 37.79086f, 125.79086f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(130.20914f, 36.0f, 132.0f, 37.79086f, 132.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.83f, 93.17f),
                    PathNode.CurveTo(65.26704f, 91.60703f, 62.732967f, 91.60703f, 61.17f, 93.17f),
                    PathNode.CurveTo(59.607033f, 94.73296f, 59.607033f, 97.26704f, 61.17f, 98.83f),
                    PathNode.LineTo(86.34f, 124.0f),
                    PathNode.LineTo(16.0f, 124.0f),
                    PathNode.CurveTo(13.790861f, 124.0f, 12.0f, 125.79086f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 130.20914f, 13.790861f, 132.0f, 16.0f, 132.0f),
                    PathNode.LineTo(86.34f, 132.0f),
                    PathNode.LineTo(61.17f, 157.17f),
                    PathNode.CurveTo(59.607033f, 158.73297f, 59.607033f, 161.26703f, 61.17f, 162.83f),
                    PathNode.CurveTo(62.732967f, 164.39296f, 65.26704f, 164.39296f, 66.83f, 162.83f),
                    PathNode.LineTo(98.83f, 130.83f),
                    PathNode.CurveTo(99.581116f, 130.07973f, 100.00314f, 129.06163f, 100.00314f, 128.0f),
                    PathNode.CurveTo(100.00314f, 126.93836f, 99.581116f, 125.92027f, 98.83f, 125.17f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 124.0f),
                    PathNode.LineTo(169.66f, 124.0f),
                    PathNode.LineTo(194.83f, 98.83f),
                    PathNode.CurveTo(196.39296f, 97.26704f, 196.39296f, 94.73296f, 194.83f, 93.17f),
                    PathNode.CurveTo(193.26703f, 91.60703f, 190.73297f, 91.60703f, 189.17f, 93.17f),
                    PathNode.LineTo(157.17f, 125.17f),
                    PathNode.CurveTo(156.41888f, 125.92027f, 155.99686f, 126.93836f, 155.99686f, 128.0f),
                    PathNode.CurveTo(155.99686f, 129.06163f, 156.41888f, 130.07973f, 157.17f, 130.83f),
                    PathNode.LineTo(189.17f, 162.83f),
                    PathNode.CurveTo(190.73297f, 164.39296f, 193.26703f, 164.39296f, 194.83f, 162.83f),
                    PathNode.CurveTo(196.39296f, 161.26703f, 196.39296f, 158.73297f, 194.83f, 157.17f),
                    PathNode.LineTo(169.66f, 132.0f),
                    PathNode.LineTo(240.0f, 132.0f),
                    PathNode.CurveTo(242.20914f, 132.0f, 244.0f, 130.20914f, 244.0f, 128.0f),
                    PathNode.CurveTo(244.0f, 125.79086f, 242.20914f, 124.0f, 240.0f, 124.0f),
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
        return _arrowsInLineHorizontal!!
    }

private var _arrowsInLineHorizontal: ImageVector? = null
