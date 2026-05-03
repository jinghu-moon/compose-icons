package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = phosphorRegularIcon(
            name = "ArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.66f, 133.66f),
                    PathNode.LineTo(149.66f, 205.66f),
                    PathNode.CurveTo(146.53407f, 208.78593f, 141.46593f, 208.78593f, 138.34f, 205.66f),
                    PathNode.CurveTo(135.21407f, 202.53407f, 135.21407f, 197.46593f, 138.34f, 194.34f),
                    PathNode.LineTo(196.69f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(35.581722f, 136.0f, 32.0f, 132.41827f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 123.58172f, 35.581722f, 120.0f, 40.0f, 120.0f),
                    PathNode.LineTo(196.69f, 120.0f),
                    PathNode.LineTo(138.34f, 61.66f),
                    PathNode.CurveTo(135.21407f, 58.53407f, 135.21407f, 53.46593f, 138.34f, 50.34f),
                    PathNode.CurveTo(141.46593f, 47.21407f, 146.53407f, 47.21407f, 149.66f, 50.34f),
                    PathNode.LineTo(221.66f, 122.34f),
                    PathNode.CurveTo(223.16223f, 123.840546f, 224.00629f, 125.876724f, 224.00629f, 128.0f),
                    PathNode.CurveTo(224.00629f, 130.12328f, 223.16223f, 132.15945f, 221.66f, 133.66f),
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
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
