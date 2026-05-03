package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BoxArrowUp: ImageVector
    get() {
        if (_boxArrowUp != null) return _boxArrowUp!!
        _boxArrowUp = phosphorFillIcon(
            name = "BoxArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.16f, 68.42f),
                    PathNode.LineTo(207.16f, 36.42f),
                    PathNode.CurveTo(205.80348f, 33.70914f, 203.03131f, 31.99783f, 200.0f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(52.96868f, 31.99783f, 50.196514f, 33.70914f, 48.84f, 36.42f),
                    PathNode.LineTo(32.84f, 68.42f),
                    PathNode.CurveTo(32.288567f, 69.53291f, 32.001125f, 70.757965f, 32.0f, 72.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(223.99887f, 70.757965f, 223.71143f, 69.53291f, 223.16f, 68.42f),
                    PathNode.Close,
                    PathNode.MoveTo(165.66f, 141.66f),
                    PathNode.CurveTo(164.15945f, 143.16223f, 162.12328f, 144.00629f, 160.0f, 144.00629f),
                    PathNode.CurveTo(157.87672f, 144.00629f, 155.84055f, 143.16223f, 154.34f, 141.66f),
                    PathNode.LineTo(136.0f, 123.31f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 188.41827f, 132.41827f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(123.58172f, 192.0f, 120.0f, 188.41827f, 120.0f, 184.0f),
                    PathNode.LineTo(120.0f, 123.31f),
                    PathNode.LineTo(101.66f, 141.66f),
                    PathNode.CurveTo(98.534065f, 144.78593f, 93.465935f, 144.78593f, 90.34f, 141.66f),
                    PathNode.CurveTo(87.214066f, 138.53407f, 87.214066f, 133.46593f, 90.34f, 130.34f),
                    PathNode.LineTo(122.34f, 98.34f),
                    PathNode.CurveTo(123.840546f, 96.83778f, 125.876724f, 95.993706f, 128.0f, 95.993706f),
                    PathNode.CurveTo(130.12328f, 95.993706f, 132.15945f, 96.83778f, 133.66f, 98.34f),
                    PathNode.LineTo(165.66f, 130.34f),
                    PathNode.CurveTo(167.16223f, 131.84055f, 168.00629f, 133.87672f, 168.00629f, 136.0f),
                    PathNode.CurveTo(168.00629f, 138.12328f, 167.16223f, 140.15945f, 165.66f, 141.66f),
                    PathNode.Close,
                    PathNode.MoveTo(52.94f, 64.0f),
                    PathNode.LineTo(60.94f, 48.0f),
                    PathNode.LineTo(195.06f, 48.0f),
                    PathNode.LineTo(203.06f, 64.0f),
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
        return _boxArrowUp!!
    }

private var _boxArrowUp: ImageVector? = null
