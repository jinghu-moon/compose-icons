package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowSquareUp: ImageVector
    get() {
        if (_arrowSquareUp != null) return _arrowSquareUp!!
        _arrowSquareUp = phosphorFillIcon(
            name = "ArrowSquareUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.66f, 125.66f),
                    PathNode.CurveTo(164.15945f, 127.16222f, 162.12328f, 128.00629f, 160.0f, 128.00629f),
                    PathNode.CurveTo(157.87672f, 128.00629f, 155.84055f, 127.16222f, 154.34f, 125.66f),
                    PathNode.LineTo(136.0f, 107.31f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.CurveTo(136.0f, 172.41827f, 132.41827f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(123.58172f, 176.0f, 120.0f, 172.41827f, 120.0f, 168.0f),
                    PathNode.LineTo(120.0f, 107.31f),
                    PathNode.LineTo(101.66f, 125.66f),
                    PathNode.CurveTo(98.534065f, 128.78593f, 93.465935f, 128.78593f, 90.34f, 125.66f),
                    PathNode.CurveTo(87.214066f, 122.534065f, 87.214066f, 117.465935f, 90.34f, 114.34f),
                    PathNode.LineTo(122.34f, 82.34f),
                    PathNode.CurveTo(123.840546f, 80.83778f, 125.876724f, 79.993706f, 128.0f, 79.993706f),
                    PathNode.CurveTo(130.12328f, 79.993706f, 132.15945f, 80.83778f, 133.66f, 82.34f),
                    PathNode.LineTo(165.66f, 114.34f),
                    PathNode.CurveTo(167.16223f, 115.840546f, 168.00629f, 117.876724f, 168.00629f, 120.0f),
                    PathNode.CurveTo(168.00629f, 122.123276f, 167.16223f, 124.159454f, 165.66f, 125.66f),
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
        return _arrowSquareUp!!
    }

private var _arrowSquareUp: ImageVector? = null
