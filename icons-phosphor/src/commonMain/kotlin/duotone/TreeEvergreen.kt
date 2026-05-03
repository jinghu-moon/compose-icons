package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorDuotoneIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 192.0f),
                    PathNode.LineTo(88.0f, 120.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.LineTo(128.0f, 16.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.LineTo(168.0f, 120.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.31f, 187.09f),
                    PathNode.LineTo(184.36f, 128.0f),
                    PathNode.LineTo(208.0f, 128.0f),
                    PathNode.CurveTo(211.04843f, 128.0003f, 213.83208f, 126.26809f, 215.17834f, 123.53306f),
                    PathNode.CurveTo(216.52464f, 120.79803f, 216.19954f, 117.535576f, 214.34f, 115.12f),
                    PathNode.LineTo(134.34f, 11.12f),
                    PathNode.CurveTo(132.82558f, 9.15208f, 130.48318f, 7.998976f, 128.0f, 7.998976f),
                    PathNode.CurveTo(125.51682f, 7.998976f, 123.17442f, 9.15208f, 121.66f, 11.12f),
                    PathNode.LineTo(41.66f, 115.12f),
                    PathNode.CurveTo(39.80046f, 117.535576f, 39.47536f, 120.79803f, 40.821644f, 123.53306f),
                    PathNode.CurveTo(42.167923f, 126.26809f, 44.951576f, 128.0003f, 48.0f, 128.0f),
                    PathNode.LineTo(71.64f, 128.0f),
                    PathNode.LineTo(25.69f, 187.09f),
                    PathNode.CurveTo(23.815582f, 189.50114f, 23.477488f, 192.76915f, 24.818584f, 195.51299f),
                    PathNode.CurveTo(26.159683f, 198.25682f, 28.94596f, 199.99771f, 32.0f, 200.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 240.0f),
                    PathNode.CurveTo(120.0f, 244.41827f, 123.58172f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(132.41827f, 248.0f, 136.0f, 244.41827f, 136.0f, 240.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(227.05403f, 199.99771f, 229.84032f, 198.25682f, 231.18141f, 195.51299f),
                    PathNode.CurveTo(232.5225f, 192.76915f, 232.18442f, 189.50114f, 230.31f, 187.09f),
                    PathNode.Close,
                    PathNode.MoveTo(48.36f, 184.0f),
                    PathNode.LineTo(94.36f, 124.91f),
                    PathNode.CurveTo(96.24003f, 122.491714f, 96.574165f, 119.21224f, 95.220505f, 116.46448f),
                    PathNode.CurveTo(93.86685f, 113.71672f, 91.06306f, 111.98312f, 88.0f, 112.0f),
                    PathNode.LineTo(64.25f, 112.0f),
                    PathNode.LineTo(128.0f, 29.12f),
                    PathNode.LineTo(191.75f, 112.0f),
                    PathNode.LineTo(168.0f, 112.0f),
                    PathNode.CurveTo(164.94597f, 112.00229f, 162.15968f, 113.74319f, 160.81859f, 116.487015f),
                    PathNode.CurveTo(159.4775f, 119.23085f, 159.81558f, 122.49883f, 161.69f, 124.91f),
                    PathNode.LineTo(207.64f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
