package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) return _chartLineUp!!
        _chartLineUp = phosphorThinIcon(
            name = "ChartLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 210.20914f, 226.20914f, 212.0f, 224.0f, 212.0f),
                    PathNode.LineTo(32.0f, 212.0f),
                    PathNode.CurveTo(29.790861f, 212.0f, 28.0f, 210.20914f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 45.79086f, 29.790861f, 44.0f, 32.0f, 44.0f),
                    PathNode.CurveTo(34.20914f, 44.0f, 36.0f, 45.79086f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 166.34f),
                    PathNode.LineTo(93.17f, 109.17f),
                    PathNode.CurveTo(93.92027f, 108.418884f, 94.93836f, 107.99686f, 96.0f, 107.99686f),
                    PathNode.CurveTo(97.06164f, 107.99686f, 98.07973f, 108.418884f, 98.83f, 109.17f),
                    PathNode.LineTo(128.0f, 138.34f),
                    PathNode.LineTo(190.34f, 76.0f),
                    PathNode.LineTo(160.0f, 76.0f),
                    PathNode.CurveTo(157.79086f, 76.0f, 156.0f, 74.20914f, 156.0f, 72.0f),
                    PathNode.CurveTo(156.0f, 69.79086f, 157.79086f, 68.0f, 160.0f, 68.0f),
                    PathNode.LineTo(200.0f, 68.0f),
                    PathNode.CurveTo(202.20914f, 68.0f, 204.0f, 69.79086f, 204.0f, 72.0f),
                    PathNode.LineTo(204.0f, 112.0f),
                    PathNode.CurveTo(204.0f, 114.20914f, 202.20914f, 116.0f, 200.0f, 116.0f),
                    PathNode.CurveTo(197.79086f, 116.0f, 196.0f, 114.20914f, 196.0f, 112.0f),
                    PathNode.LineTo(196.0f, 81.66f),
                    PathNode.LineTo(130.83f, 146.83f),
                    PathNode.CurveTo(130.07973f, 147.58112f, 129.06163f, 148.00314f, 128.0f, 148.00314f),
                    PathNode.CurveTo(126.93836f, 148.00314f, 125.92027f, 147.58112f, 125.17f, 146.83f),
                    PathNode.LineTo(96.0f, 117.66f),
                    PathNode.LineTo(36.0f, 177.66f),
                    PathNode.LineTo(36.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(226.20914f, 204.0f, 228.0f, 205.79086f, 228.0f, 208.0f),
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
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
