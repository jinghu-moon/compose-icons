package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsInLineVertical: ImageVector
    get() {
        if (_arrowsInLineVertical != null) return _arrowsInLineVertical!!
        _arrowsInLineVertical = phosphorThinIcon(
            name = "ArrowsInLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 130.20914f, 218.20914f, 132.0f, 216.0f, 132.0f),
                    PathNode.LineTo(40.0f, 132.0f),
                    PathNode.CurveTo(37.79086f, 132.0f, 36.0f, 130.20914f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 125.79086f, 37.79086f, 124.0f, 40.0f, 124.0f),
                    PathNode.LineTo(216.0f, 124.0f),
                    PathNode.CurveTo(218.20914f, 124.0f, 220.0f, 125.79086f, 220.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(125.17f, 98.83f),
                    PathNode.CurveTo(125.92027f, 99.581116f, 126.93836f, 100.00314f, 128.0f, 100.00314f),
                    PathNode.CurveTo(129.06163f, 100.00314f, 130.07973f, 99.581116f, 130.83f, 98.83f),
                    PathNode.LineTo(162.83f, 66.83f),
                    PathNode.CurveTo(164.39296f, 65.26704f, 164.39296f, 62.732967f, 162.83f, 61.17f),
                    PathNode.CurveTo(161.26703f, 59.607033f, 158.73297f, 59.607033f, 157.17f, 61.17f),
                    PathNode.LineTo(132.0f, 86.34f),
                    PathNode.LineTo(132.0f, 16.0f),
                    PathNode.CurveTo(132.0f, 13.790861f, 130.20914f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(125.79086f, 12.0f, 124.0f, 13.790861f, 124.0f, 16.0f),
                    PathNode.LineTo(124.0f, 86.34f),
                    PathNode.LineTo(98.83f, 61.17f),
                    PathNode.CurveTo(97.26704f, 59.607033f, 94.73296f, 59.607033f, 93.17f, 61.17f),
                    PathNode.CurveTo(91.60703f, 62.732967f, 91.60703f, 65.26704f, 93.17f, 66.83f),
                    PathNode.Close,
                    PathNode.MoveTo(130.83f, 157.17f),
                    PathNode.CurveTo(130.07973f, 156.41888f, 129.06163f, 155.99686f, 128.0f, 155.99686f),
                    PathNode.CurveTo(126.93836f, 155.99686f, 125.92027f, 156.41888f, 125.17f, 157.17f),
                    PathNode.LineTo(93.17f, 189.17f),
                    PathNode.CurveTo(91.60703f, 190.73297f, 91.60703f, 193.26703f, 93.17f, 194.83f),
                    PathNode.CurveTo(94.73296f, 196.39296f, 97.26704f, 196.39296f, 98.83f, 194.83f),
                    PathNode.LineTo(124.0f, 169.66f),
                    PathNode.LineTo(124.0f, 240.0f),
                    PathNode.CurveTo(124.0f, 242.20914f, 125.79086f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(130.20914f, 244.0f, 132.0f, 242.20914f, 132.0f, 240.0f),
                    PathNode.LineTo(132.0f, 169.66f),
                    PathNode.LineTo(157.17f, 194.83f),
                    PathNode.CurveTo(158.73297f, 196.39296f, 161.26703f, 196.39296f, 162.83f, 194.83f),
                    PathNode.CurveTo(164.39296f, 193.26703f, 164.39296f, 190.73297f, 162.83f, 189.17f),
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
        return _arrowsInLineVertical!!
    }

private var _arrowsInLineVertical: ImageVector? = null
