package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareIn: ImageVector
    get() {
        if (_arrowSquareIn != null) return _arrowSquareIn!!
        _arrowSquareIn = phosphorThinIcon(
            name = "ArrowSquareIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 200.0f),
                    PathNode.CurveTo(124.0f, 202.20914f, 122.20914f, 204.0f, 120.0f, 204.0f),
                    PathNode.CurveTo(117.79086f, 204.0f, 116.0f, 202.20914f, 116.0f, 200.0f),
                    PathNode.LineTo(116.0f, 145.66f),
                    PathNode.LineTo(42.83f, 218.83f),
                    PathNode.CurveTo(41.267033f, 220.39296f, 38.732967f, 220.39296f, 37.17f, 218.83f),
                    PathNode.CurveTo(35.607033f, 217.26703f, 35.607033f, 214.73297f, 37.17f, 213.17f),
                    PathNode.LineTo(110.34f, 140.0f),
                    PathNode.LineTo(56.0f, 140.0f),
                    PathNode.CurveTo(53.79086f, 140.0f, 52.0f, 138.20914f, 52.0f, 136.0f),
                    PathNode.CurveTo(52.0f, 133.79086f, 53.79086f, 132.0f, 56.0f, 132.0f),
                    PathNode.LineTo(120.0f, 132.0f),
                    PathNode.CurveTo(122.20914f, 132.0f, 124.0f, 133.79086f, 124.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(80.0f, 36.0f),
                    PathNode.CurveTo(73.37258f, 36.0f, 68.0f, 41.37258f, 68.0f, 48.0f),
                    PathNode.LineTo(68.0f, 96.0f),
                    PathNode.CurveTo(68.0f, 98.20914f, 69.79086f, 100.0f, 72.0f, 100.0f),
                    PathNode.CurveTo(74.20914f, 100.0f, 76.0f, 98.20914f, 76.0f, 96.0f),
                    PathNode.LineTo(76.0f, 48.0f),
                    PathNode.CurveTo(76.0f, 45.79086f, 77.79086f, 44.0f, 80.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 176.0f),
                    PathNode.CurveTo(212.0f, 178.20914f, 210.20914f, 180.0f, 208.0f, 180.0f),
                    PathNode.LineTo(160.0f, 180.0f),
                    PathNode.CurveTo(157.79086f, 180.0f, 156.0f, 181.79086f, 156.0f, 184.0f),
                    PathNode.CurveTo(156.0f, 186.20914f, 157.79086f, 188.0f, 160.0f, 188.0f),
                    PathNode.LineTo(208.0f, 188.0f),
                    PathNode.CurveTo(214.62741f, 188.0f, 220.0f, 182.62741f, 220.0f, 176.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
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
        return _arrowSquareIn!!
    }

private var _arrowSquareIn: ImageVector? = null
