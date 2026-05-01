package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = phosphorLightIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 186.0f),
                    PathNode.LineTo(230.0f, 186.0f),
                    PathNode.LineTo(230.0f, 56.28f),
                    PathNode.LineTo(241.26f, 53.87f),
                    PathNode.CurveTo(244.5019f, 53.17412f, 246.56587f, 49.98191f, 245.87f, 46.74f),
                    PathNode.CurveTo(245.17412f, 43.49809f, 241.98192f, 41.43412f, 238.74f, 42.13f),
                    PathNode.LineTo(14.74f, 90.13f),
                    PathNode.CurveTo(11.498089f, 90.82588f, 9.434121f, 94.01809f, 10.13f, 97.26f),
                    PathNode.CurveTo(10.825879f, 100.501915f, 14.018088f, 102.56588f, 17.26f, 101.87f),
                    PathNode.LineTo(26.0f, 100.0f),
                    PathNode.LineTo(26.0f, 186.0f),
                    PathNode.LineTo(16.0f, 186.0f),
                    PathNode.CurveTo(12.686292f, 186.0f, 10.0f, 188.6863f, 10.0f, 192.0f),
                    PathNode.CurveTo(10.0f, 195.3137f, 12.686292f, 198.0f, 16.0f, 198.0f),
                    PathNode.LineTo(240.0f, 198.0f),
                    PathNode.CurveTo(243.3137f, 198.0f, 246.0f, 195.3137f, 246.0f, 192.0f),
                    PathNode.CurveTo(246.0f, 188.6863f, 243.3137f, 186.0f, 240.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 97.42f),
                    PathNode.LineTo(218.0f, 58.85f),
                    PathNode.LineTo(218.0f, 186.0f),
                    PathNode.LineTo(190.0f, 186.0f),
                    PathNode.LineTo(190.0f, 128.0f),
                    PathNode.CurveTo(190.0f, 124.686295f, 187.3137f, 122.0f, 184.0f, 122.0f),
                    PathNode.LineTo(72.0f, 122.0f),
                    PathNode.CurveTo(68.686295f, 122.0f, 66.0f, 124.686295f, 66.0f, 128.0f),
                    PathNode.LineTo(66.0f, 186.0f),
                    PathNode.LineTo(38.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 154.0f),
                    PathNode.LineTo(78.0f, 154.0f),
                    PathNode.LineTo(78.0f, 134.0f),
                    PathNode.LineTo(178.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.0f, 166.0f),
                    PathNode.LineTo(178.0f, 166.0f),
                    PathNode.LineTo(178.0f, 186.0f),
                    PathNode.LineTo(78.0f, 186.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
