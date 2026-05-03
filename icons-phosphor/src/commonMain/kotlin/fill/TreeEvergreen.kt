package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorFillIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.19f, 195.51f),
                    PathNode.CurveTo(229.84839f, 198.25777f, 227.05782f, 200.00043f, 224.0f, 200.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.LineTo(136.0f, 240.0f),
                    PathNode.CurveTo(136.0f, 244.41827f, 132.41827f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(123.58172f, 248.0f, 120.0f, 244.41827f, 120.0f, 240.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(28.94596f, 199.99771f, 26.159683f, 198.25682f, 24.818584f, 195.51299f),
                    PathNode.CurveTo(23.477488f, 192.76915f, 23.815582f, 189.50114f, 25.69f, 187.09f),
                    PathNode.LineTo(71.69f, 128.0f),
                    PathNode.LineTo(48.0f, 128.0f),
                    PathNode.CurveTo(44.951576f, 128.0003f, 42.167923f, 126.26809f, 40.821644f, 123.53306f),
                    PathNode.CurveTo(39.47536f, 120.79803f, 39.80046f, 117.535576f, 41.66f, 115.12f),
                    PathNode.LineTo(121.66f, 11.12f),
                    PathNode.CurveTo(123.17442f, 9.15208f, 125.51682f, 7.998976f, 128.0f, 7.998976f),
                    PathNode.CurveTo(130.48318f, 7.998976f, 132.82558f, 9.15208f, 134.34f, 11.12f),
                    PathNode.LineTo(214.34f, 115.12f),
                    PathNode.CurveTo(216.19954f, 117.535576f, 216.52464f, 120.79803f, 215.17834f, 123.53306f),
                    PathNode.CurveTo(213.83208f, 126.26809f, 211.04843f, 128.0003f, 208.0f, 128.0f),
                    PathNode.LineTo(184.36f, 128.0f),
                    PathNode.LineTo(230.31f, 187.09f),
                    PathNode.CurveTo(232.18602f, 189.4988f, 232.52742f, 192.76537f, 231.19f, 195.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
