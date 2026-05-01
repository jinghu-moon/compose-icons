package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorThinIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 128.0f),
                    PathNode.CurveTo(116.00361f, 129.14577f, 115.51572f, 130.23807f, 114.66f, 131.0f),
                    PathNode.LineTo(42.66f, 195.0f),
                    PathNode.CurveTo(41.003147f, 196.46907f, 38.46908f, 196.31685f, 37.0f, 194.66f),
                    PathNode.CurveTo(35.53092f, 193.00314f, 35.683147f, 190.46907f, 37.34f, 189.0f),
                    PathNode.LineTo(106.0f, 128.0f),
                    PathNode.LineTo(37.34f, 67.0f),
                    PathNode.CurveTo(35.683147f, 65.53092f, 35.53092f, 62.996853f, 37.0f, 61.34f),
                    PathNode.CurveTo(38.46908f, 59.683147f, 41.003147f, 59.53092f, 42.66f, 61.0f),
                    PathNode.LineTo(114.66f, 125.0f),
                    PathNode.CurveTo(115.51572f, 125.76193f, 116.00361f, 126.85423f, 116.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 188.0f),
                    PathNode.LineTo(120.0f, 188.0f),
                    PathNode.CurveTo(117.79086f, 188.0f, 116.0f, 189.79086f, 116.0f, 192.0f),
                    PathNode.CurveTo(116.0f, 194.20914f, 117.79086f, 196.0f, 120.0f, 196.0f),
                    PathNode.LineTo(216.0f, 196.0f),
                    PathNode.CurveTo(218.20914f, 196.0f, 220.0f, 194.20914f, 220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 189.79086f, 218.20914f, 188.0f, 216.0f, 188.0f),
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
        return _terminal!!
    }

private var _terminal: ImageVector? = null
