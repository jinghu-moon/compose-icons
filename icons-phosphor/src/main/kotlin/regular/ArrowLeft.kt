package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = phosphorRegularIcon(
            name = "ArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 132.41827f, 220.41827f, 136.0f, 216.0f, 136.0f),
                    PathNode.LineTo(59.31f, 136.0f),
                    PathNode.LineTo(117.66f, 194.34f),
                    PathNode.CurveTo(120.785934f, 197.46593f, 120.785934f, 202.53407f, 117.66f, 205.66f),
                    PathNode.CurveTo(114.534065f, 208.78593f, 109.465935f, 208.78593f, 106.34f, 205.66f),
                    PathNode.LineTo(34.34f, 133.66f),
                    PathNode.CurveTo(32.837784f, 132.15945f, 31.993708f, 130.12328f, 31.993708f, 128.0f),
                    PathNode.CurveTo(31.993708f, 125.876724f, 32.837784f, 123.840546f, 34.34f, 122.34f),
                    PathNode.LineTo(106.34f, 50.34f),
                    PathNode.CurveTo(109.465935f, 47.21407f, 114.534065f, 47.21407f, 117.66f, 50.34f),
                    PathNode.CurveTo(120.785934f, 53.46593f, 120.785934f, 58.53407f, 117.66f, 61.66f),
                    PathNode.LineTo(59.31f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(220.41827f, 120.0f, 224.0f, 123.58172f, 224.0f, 128.0f),
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
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
