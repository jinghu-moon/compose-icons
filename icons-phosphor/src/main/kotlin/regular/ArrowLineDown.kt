package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineDown: ImageVector
    get() {
        if (_arrowLineDown != null) return _arrowLineDown!!
        _arrowLineDown = phosphorRegularIcon(
            name = "ArrowLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(50.34f, 117.66f),
                    PathNode.CurveTo(47.21407f, 114.534065f, 47.21407f, 109.465935f, 50.34f, 106.34f),
                    PathNode.CurveTo(53.46593f, 103.214066f, 58.53407f, 103.214066f, 61.66f, 106.34f),
                    PathNode.LineTo(120.0f, 164.69f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.CurveTo(120.0f, 27.581722f, 123.58172f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(132.41827f, 24.0f, 136.0f, 27.581722f, 136.0f, 32.0f),
                    PathNode.LineTo(136.0f, 164.69f),
                    PathNode.LineTo(194.34f, 106.34f),
                    PathNode.CurveTo(197.46593f, 103.214066f, 202.53407f, 103.214066f, 205.66f, 106.34f),
                    PathNode.CurveTo(208.78593f, 109.465935f, 208.78593f, 114.534065f, 205.66f, 117.66f),
                    PathNode.LineTo(133.66f, 189.66f),
                    PathNode.CurveTo(132.15945f, 191.16223f, 130.12328f, 192.00629f, 128.0f, 192.00629f),
                    PathNode.CurveTo(125.876724f, 192.00629f, 123.840546f, 191.16223f, 122.34f, 189.66f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 208.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(35.581722f, 208.0f, 32.0f, 211.58173f, 32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 220.41827f, 35.581722f, 224.0f, 40.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 211.58173f, 220.41827f, 208.0f, 216.0f, 208.0f),
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
        return _arrowLineDown!!
    }

private var _arrowLineDown: ImageVector? = null
