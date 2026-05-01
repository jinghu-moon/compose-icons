package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineRight: ImageVector
    get() {
        if (_arrowLineRight != null) return _arrowLineRight!!
        _arrowLineRight = phosphorRegularIcon(
            name = "ArrowLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(189.66f, 122.34f),
                    PathNode.CurveTo(191.16223f, 123.840546f, 192.00629f, 125.876724f, 192.00629f, 128.0f),
                    PathNode.CurveTo(192.00629f, 130.12328f, 191.16223f, 132.15945f, 189.66f, 133.66f),
                    PathNode.LineTo(117.66f, 205.66f),
                    PathNode.CurveTo(114.534065f, 208.78593f, 109.465935f, 208.78593f, 106.34f, 205.66f),
                    PathNode.CurveTo(103.214066f, 202.53407f, 103.214066f, 197.46593f, 106.34f, 194.34f),
                    PathNode.LineTo(164.69f, 136.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.CurveTo(27.581722f, 136.0f, 24.0f, 132.41827f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 123.58172f, 27.581722f, 120.0f, 32.0f, 120.0f),
                    PathNode.LineTo(164.69f, 120.0f),
                    PathNode.LineTo(106.34f, 61.66f),
                    PathNode.CurveTo(103.214066f, 58.53407f, 103.214066f, 53.46593f, 106.34f, 50.34f),
                    PathNode.CurveTo(109.465935f, 47.21407f, 114.534065f, 47.21407f, 117.66f, 50.34f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 32.0f),
                    PathNode.CurveTo(211.58173f, 32.0f, 208.0f, 35.581722f, 208.0f, 40.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(208.0f, 220.41827f, 211.58173f, 224.0f, 216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(224.0f, 35.581722f, 220.41827f, 32.0f, 216.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowLineRight!!
    }

private var _arrowLineRight: ImageVector? = null
