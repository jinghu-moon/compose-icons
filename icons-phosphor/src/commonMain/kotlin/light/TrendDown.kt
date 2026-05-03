package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrendDown: ImageVector
    get() {
        if (_trendDown != null) return _trendDown!!
        _trendDown = phosphorLightIcon(
            name = "TrendDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 128.0f),
                    PathNode.LineTo(238.0f, 192.0f),
                    PathNode.CurveTo(238.0f, 195.3137f, 235.3137f, 198.0f, 232.0f, 198.0f),
                    PathNode.LineTo(168.0f, 198.0f),
                    PathNode.CurveTo(164.6863f, 198.0f, 162.0f, 195.3137f, 162.0f, 192.0f),
                    PathNode.CurveTo(162.0f, 188.6863f, 164.6863f, 186.0f, 168.0f, 186.0f),
                    PathNode.LineTo(217.52f, 186.0f),
                    PathNode.LineTo(136.0f, 104.49f),
                    PathNode.LineTo(100.24f, 140.24f),
                    PathNode.CurveTo(97.89746f, 142.57962f, 94.10254f, 142.57962f, 91.76f, 140.24f),
                    PathNode.LineTo(19.76f, 68.24f),
                    PathNode.CurveTo(17.557129f, 65.87592f, 17.62213f, 62.19192f, 19.907026f, 59.907024f),
                    PathNode.CurveTo(22.191923f, 57.622128f, 25.875921f, 57.55713f, 28.24f, 59.76f),
                    PathNode.LineTo(96.0f, 127.51f),
                    PathNode.LineTo(131.76f, 91.76f),
                    PathNode.CurveTo(134.10254f, 89.42038f, 137.89746f, 89.42038f, 140.24f, 91.76f),
                    PathNode.LineTo(226.0f, 177.52f),
                    PathNode.LineTo(226.0f, 128.0f),
                    PathNode.CurveTo(226.0f, 124.686295f, 228.6863f, 122.0f, 232.0f, 122.0f),
                    PathNode.CurveTo(235.3137f, 122.0f, 238.0f, 124.686295f, 238.0f, 128.0f),
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
        return _trendDown!!
    }

private var _trendDown: ImageVector? = null
