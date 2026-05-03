package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorRegularIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 194.34f),
                    PathNode.CurveTo(216.78593f, 197.46593f, 216.78593f, 202.53407f, 213.66f, 205.66f),
                    PathNode.CurveTo(210.53407f, 208.78593f, 205.46593f, 208.78593f, 202.34f, 205.66f),
                    PathNode.LineTo(128.0f, 131.31f),
                    PathNode.LineTo(53.66f, 205.66f),
                    PathNode.CurveTo(50.53407f, 208.78593f, 45.46593f, 208.78593f, 42.34f, 205.66f),
                    PathNode.CurveTo(39.21407f, 202.53407f, 39.21407f, 197.46593f, 42.34f, 194.34f),
                    PathNode.LineTo(122.34f, 114.34f),
                    PathNode.CurveTo(123.840546f, 112.83778f, 125.876724f, 111.993706f, 128.0f, 111.993706f),
                    PathNode.CurveTo(130.12328f, 111.993706f, 132.15945f, 112.83778f, 133.66f, 114.34f),
                    PathNode.Close,
                    PathNode.MoveTo(53.66f, 125.66f),
                    PathNode.LineTo(128.0f, 51.31f),
                    PathNode.LineTo(202.34f, 125.66f),
                    PathNode.CurveTo(205.46593f, 128.78593f, 210.53407f, 128.78593f, 213.66f, 125.66f),
                    PathNode.CurveTo(216.78593f, 122.534065f, 216.78593f, 117.465935f, 213.66f, 114.34f),
                    PathNode.LineTo(133.66f, 34.34f),
                    PathNode.CurveTo(132.15945f, 32.837784f, 130.12328f, 31.993708f, 128.0f, 31.993708f),
                    PathNode.CurveTo(125.876724f, 31.993708f, 123.840546f, 32.837784f, 122.34f, 34.34f),
                    PathNode.LineTo(42.34f, 114.34f),
                    PathNode.CurveTo(39.21407f, 117.465935f, 39.21407f, 122.534065f, 42.34f, 125.66f),
                    PathNode.CurveTo(45.46593f, 128.78593f, 50.53407f, 128.78593f, 53.66f, 125.66f),
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
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
