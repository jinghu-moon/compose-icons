package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrendDown: ImageVector
    get() {
        if (_trendDown != null) return _trendDown!!
        _trendDown = phosphorThinIcon(
            name = "TrendDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.LineTo(236.0f, 192.0f),
                    PathNode.CurveTo(236.0f, 194.20914f, 234.20914f, 196.0f, 232.0f, 196.0f),
                    PathNode.LineTo(168.0f, 196.0f),
                    PathNode.CurveTo(165.79086f, 196.0f, 164.0f, 194.20914f, 164.0f, 192.0f),
                    PathNode.CurveTo(164.0f, 189.79086f, 165.79086f, 188.0f, 168.0f, 188.0f),
                    PathNode.LineTo(222.34f, 188.0f),
                    PathNode.LineTo(136.0f, 101.66f),
                    PathNode.LineTo(98.83f, 138.83f),
                    PathNode.CurveTo(98.07973f, 139.58112f, 97.06164f, 140.00314f, 96.0f, 140.00314f),
                    PathNode.CurveTo(94.93836f, 140.00314f, 93.92027f, 139.58112f, 93.17f, 138.83f),
                    PathNode.LineTo(21.17f, 66.83f),
                    PathNode.CurveTo(19.607035f, 65.26704f, 19.607035f, 62.732967f, 21.17f, 61.17f),
                    PathNode.CurveTo(22.732965f, 59.607033f, 25.267035f, 59.607033f, 26.83f, 61.17f),
                    PathNode.LineTo(96.0f, 130.34f),
                    PathNode.LineTo(133.17f, 93.17f),
                    PathNode.CurveTo(133.92027f, 92.418884f, 134.93837f, 91.99686f, 136.0f, 91.99686f),
                    PathNode.CurveTo(137.06163f, 91.99686f, 138.07973f, 92.418884f, 138.83f, 93.17f),
                    PathNode.LineTo(228.0f, 182.34f),
                    PathNode.LineTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 125.79086f, 229.79086f, 124.0f, 232.0f, 124.0f),
                    PathNode.CurveTo(234.20914f, 124.0f, 236.0f, 125.79086f, 236.0f, 128.0f),
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
        return _trendDown!!
    }

private var _trendDown: ImageVector? = null
