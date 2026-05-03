package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SolarRoof: ImageVector
    get() {
        if (_solarRoof != null) return _solarRoof!!
        _solarRoof = phosphorLightIcon(
            name = "SolarRoof",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.37f, 125.32f),
                    PathNode.LineTo(205.37f, 45.32f),
                    PathNode.CurveTo(204.354f, 43.284912f, 202.2746f, 41.999317f, 200.0f, 42.0f),
                    PathNode.LineTo(56.0f, 42.0f),
                    PathNode.CurveTo(53.7254f, 41.999317f, 51.64599f, 43.284912f, 50.63f, 45.32f),
                    PathNode.LineTo(10.63f, 125.32f),
                    PathNode.CurveTo(10.217512f, 126.15329f, 10.001968f, 127.070206f, 10.0f, 128.0f),
                    PathNode.LineTo(10.0f, 184.0f),
                    PathNode.CurveTo(10.0f, 191.73198f, 16.268013f, 198.0f, 24.0f, 198.0f),
                    PathNode.LineTo(232.0f, 198.0f),
                    PathNode.CurveTo(239.73198f, 198.0f, 246.0f, 191.73198f, 246.0f, 184.0f),
                    PathNode.LineTo(246.0f, 128.0f),
                    PathNode.CurveTo(245.99803f, 127.070206f, 245.78249f, 126.15329f, 245.37f, 125.32f),
                    PathNode.Close,
                    PathNode.MoveTo(99.71f, 122.0f),
                    PathNode.LineTo(85.71f, 94.0f),
                    PathNode.LineTo(120.29f, 94.0f),
                    PathNode.LineTo(134.29f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.29f, 54.0f),
                    PathNode.LineTo(114.29f, 82.0f),
                    PathNode.LineTo(79.71f, 82.0f),
                    PathNode.LineTo(65.71f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.29f, 54.0f),
                    PathNode.LineTo(162.29f, 82.0f),
                    PathNode.LineTo(127.71f, 82.0f),
                    PathNode.LineTo(113.71f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(147.71f, 122.0f),
                    PathNode.LineTo(133.71f, 94.0f),
                    PathNode.LineTo(168.29f, 94.0f),
                    PathNode.LineTo(182.29f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(195.71f, 122.0f),
                    PathNode.LineTo(181.71f, 94.0f),
                    PathNode.LineTo(216.29f, 94.0f),
                    PathNode.LineTo(230.29f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.29f, 82.0f),
                    PathNode.LineTo(175.71f, 82.0f),
                    PathNode.LineTo(161.71f, 54.0f),
                    PathNode.LineTo(196.29f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(22.0f, 184.0f),
                    PathNode.LineTo(22.0f, 129.42f),
                    PathNode.LineTo(56.0f, 61.42f),
                    PathNode.LineTo(90.0f, 129.42f),
                    PathNode.LineTo(90.0f, 186.0f),
                    PathNode.LineTo(24.0f, 186.0f),
                    PathNode.CurveTo(22.89543f, 186.0f, 22.0f, 185.10457f, 22.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 186.0f),
                    PathNode.LineTo(102.0f, 186.0f),
                    PathNode.LineTo(102.0f, 134.0f),
                    PathNode.LineTo(234.0f, 134.0f),
                    PathNode.LineTo(234.0f, 184.0f),
                    PathNode.CurveTo(234.0f, 185.10457f, 233.10457f, 186.0f, 232.0f, 186.0f),
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
        return _solarRoof!!
    }

private var _solarRoof: ImageVector? = null
