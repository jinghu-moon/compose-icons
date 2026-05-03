package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrendUp: ImageVector
    get() {
        if (_trendUp != null) return _trendUp!!
        _trendUp = phosphorLightIcon(
            name = "TrendUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 56.0f),
                    PathNode.LineTo(238.0f, 120.0f),
                    PathNode.CurveTo(238.0f, 123.313705f, 235.3137f, 126.0f, 232.0f, 126.0f),
                    PathNode.CurveTo(228.6863f, 126.0f, 226.0f, 123.313705f, 226.0f, 120.0f),
                    PathNode.LineTo(226.0f, 70.48f),
                    PathNode.LineTo(140.24f, 156.24f),
                    PathNode.CurveTo(137.89746f, 158.57962f, 134.10254f, 158.57962f, 131.76f, 156.24f),
                    PathNode.LineTo(96.0f, 120.49f),
                    PathNode.LineTo(28.24f, 188.24f),
                    PathNode.CurveTo(25.875921f, 190.44287f, 22.191923f, 190.37787f, 19.907026f, 188.09297f),
                    PathNode.CurveTo(17.62213f, 185.80807f, 17.557129f, 182.12408f, 19.76f, 179.76f),
                    PathNode.LineTo(91.76f, 107.76f),
                    PathNode.CurveTo(94.10254f, 105.42038f, 97.89746f, 105.42038f, 100.24f, 107.76f),
                    PathNode.LineTo(136.0f, 143.51f),
                    PathNode.LineTo(217.52f, 62.0f),
                    PathNode.LineTo(168.0f, 62.0f),
                    PathNode.CurveTo(164.6863f, 62.0f, 162.0f, 59.31371f, 162.0f, 56.0f),
                    PathNode.CurveTo(162.0f, 52.68629f, 164.6863f, 50.0f, 168.0f, 50.0f),
                    PathNode.LineTo(232.0f, 50.0f),
                    PathNode.CurveTo(235.3137f, 50.0f, 238.0f, 52.68629f, 238.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _trendUp!!
    }

private var _trendUp: ImageVector? = null
