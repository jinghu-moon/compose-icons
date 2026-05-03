package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrendUp: ImageVector
    get() {
        if (_trendUp != null) return _trendUp!!
        _trendUp = phosphorThinIcon(
            name = "TrendUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.LineTo(236.0f, 120.0f),
                    PathNode.CurveTo(236.0f, 122.20914f, 234.20914f, 124.0f, 232.0f, 124.0f),
                    PathNode.CurveTo(229.79086f, 124.0f, 228.0f, 122.20914f, 228.0f, 120.0f),
                    PathNode.LineTo(228.0f, 65.66f),
                    PathNode.LineTo(138.83f, 154.83f),
                    PathNode.CurveTo(138.07973f, 155.58112f, 137.06163f, 156.00314f, 136.0f, 156.00314f),
                    PathNode.CurveTo(134.93837f, 156.00314f, 133.92027f, 155.58112f, 133.17f, 154.83f),
                    PathNode.LineTo(96.0f, 117.66f),
                    PathNode.LineTo(26.83f, 186.83f),
                    PathNode.CurveTo(25.267035f, 188.39296f, 22.732965f, 188.39296f, 21.17f, 186.83f),
                    PathNode.CurveTo(19.607035f, 185.26703f, 19.607035f, 182.73297f, 21.17f, 181.17f),
                    PathNode.LineTo(93.17f, 109.17f),
                    PathNode.CurveTo(93.92027f, 108.418884f, 94.93836f, 107.99686f, 96.0f, 107.99686f),
                    PathNode.CurveTo(97.06164f, 107.99686f, 98.07973f, 108.418884f, 98.83f, 109.17f),
                    PathNode.LineTo(136.0f, 146.34f),
                    PathNode.LineTo(222.34f, 60.0f),
                    PathNode.LineTo(168.0f, 60.0f),
                    PathNode.CurveTo(165.79086f, 60.0f, 164.0f, 58.20914f, 164.0f, 56.0f),
                    PathNode.CurveTo(164.0f, 53.79086f, 165.79086f, 52.0f, 168.0f, 52.0f),
                    PathNode.LineTo(232.0f, 52.0f),
                    PathNode.CurveTo(234.20914f, 52.0f, 236.0f, 53.79086f, 236.0f, 56.0f),
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
        return _trendUp!!
    }

private var _trendUp: ImageVector? = null
