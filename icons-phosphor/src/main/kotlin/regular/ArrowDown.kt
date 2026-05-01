package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = phosphorRegularIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 149.66f),
                    PathNode.LineTo(133.66f, 221.66f),
                    PathNode.CurveTo(132.15945f, 223.16223f, 130.12328f, 224.00629f, 128.0f, 224.00629f),
                    PathNode.CurveTo(125.876724f, 224.00629f, 123.840546f, 223.16223f, 122.34f, 221.66f),
                    PathNode.LineTo(50.34f, 149.66f),
                    PathNode.CurveTo(47.21407f, 146.53407f, 47.21407f, 141.46593f, 50.34f, 138.34f),
                    PathNode.CurveTo(53.46593f, 135.21407f, 58.53407f, 135.21407f, 61.66f, 138.34f),
                    PathNode.LineTo(120.0f, 196.69f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.CurveTo(120.0f, 35.581722f, 123.58172f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(132.41827f, 32.0f, 136.0f, 35.581722f, 136.0f, 40.0f),
                    PathNode.LineTo(136.0f, 196.69f),
                    PathNode.LineTo(194.34f, 138.34f),
                    PathNode.CurveTo(197.46593f, 135.21407f, 202.53407f, 135.21407f, 205.66f, 138.34f),
                    PathNode.CurveTo(208.78593f, 141.46593f, 208.78593f, 146.53407f, 205.66f, 149.66f),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
