package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Martini: ImageVector
    get() {
        if (_martini != null) return _martini!!
        _martini = phosphorThinIcon(
            name = "Martini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.83f, 42.83f),
                    PathNode.CurveTo(235.97533f, 41.685955f, 236.31816f, 39.96437f, 235.69849f, 38.468838f),
                    PathNode.CurveTo(235.07881f, 36.97331f, 233.61882f, 35.998726f, 232.0f, 36.0f),
                    PathNode.LineTo(24.0f, 36.0f),
                    PathNode.CurveTo(22.381174f, 35.998726f, 20.92118f, 36.97331f, 20.30151f, 38.468838f),
                    PathNode.CurveTo(19.681837f, 39.96437f, 20.02468f, 41.685955f, 21.17f, 42.83f),
                    PathNode.LineTo(124.0f, 145.66f),
                    PathNode.LineTo(124.0f, 212.0f),
                    PathNode.LineTo(88.0f, 212.0f),
                    PathNode.CurveTo(85.79086f, 212.0f, 84.0f, 213.79086f, 84.0f, 216.0f),
                    PathNode.CurveTo(84.0f, 218.20914f, 85.79086f, 220.0f, 88.0f, 220.0f),
                    PathNode.LineTo(168.0f, 220.0f),
                    PathNode.CurveTo(170.20914f, 220.0f, 172.0f, 218.20914f, 172.0f, 216.0f),
                    PathNode.CurveTo(172.0f, 213.79086f, 170.20914f, 212.0f, 168.0f, 212.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.LineTo(132.0f, 145.66f),
                    PathNode.Close,
                    PathNode.MoveTo(33.66f, 44.0f),
                    PathNode.LineTo(222.34f, 44.0f),
                    PathNode.LineTo(198.34f, 68.0f),
                    PathNode.LineTo(57.66f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 138.34f),
                    PathNode.LineTo(65.66f, 76.0f),
                    PathNode.LineTo(190.34f, 76.0f),
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
        return _martini!!
    }

private var _martini: ImageVector? = null
