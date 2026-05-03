package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Slideshow: ImageVector
    get() {
        if (_slideshow != null) return _slideshow!!
        _slideshow = phosphorThinIcon(
            name = "Slideshow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 52.0f),
                    PathNode.LineTo(64.0f, 52.0f),
                    PathNode.CurveTo(57.37258f, 52.0f, 52.0f, 57.37258f, 52.0f, 64.0f),
                    PathNode.LineTo(52.0f, 192.0f),
                    PathNode.CurveTo(52.0f, 198.62741f, 57.37258f, 204.0f, 64.0f, 204.0f),
                    PathNode.LineTo(192.0f, 204.0f),
                    PathNode.CurveTo(198.62741f, 204.0f, 204.0f, 198.62741f, 204.0f, 192.0f),
                    PathNode.LineTo(204.0f, 64.0f),
                    PathNode.CurveTo(204.0f, 57.37258f, 198.62741f, 52.0f, 192.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 192.0f),
                    PathNode.CurveTo(196.0f, 194.20914f, 194.20914f, 196.0f, 192.0f, 196.0f),
                    PathNode.LineTo(64.0f, 196.0f),
                    PathNode.CurveTo(61.79086f, 196.0f, 60.0f, 194.20914f, 60.0f, 192.0f),
                    PathNode.LineTo(60.0f, 64.0f),
                    PathNode.CurveTo(60.0f, 61.79086f, 61.79086f, 60.0f, 64.0f, 60.0f),
                    PathNode.LineTo(192.0f, 60.0f),
                    PathNode.CurveTo(194.20914f, 60.0f, 196.0f, 61.79086f, 196.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.LineTo(236.0f, 200.0f),
                    PathNode.CurveTo(236.0f, 202.20914f, 234.20914f, 204.0f, 232.0f, 204.0f),
                    PathNode.CurveTo(229.79086f, 204.0f, 228.0f, 202.20914f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 53.79086f, 229.79086f, 52.0f, 232.0f, 52.0f),
                    PathNode.CurveTo(234.20914f, 52.0f, 236.0f, 53.79086f, 236.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 202.20914f, 26.209139f, 204.0f, 24.0f, 204.0f),
                    PathNode.CurveTo(21.790861f, 204.0f, 20.0f, 202.20914f, 20.0f, 200.0f),
                    PathNode.LineTo(20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 53.79086f, 21.790861f, 52.0f, 24.0f, 52.0f),
                    PathNode.CurveTo(26.209139f, 52.0f, 28.0f, 53.79086f, 28.0f, 56.0f),
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
        return _slideshow!!
    }

private var _slideshow: ImageVector? = null
