package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) return _caretDoubleLeft!!
        _caretDoubleLeft = phosphorRegularIcon(
            name = "CaretDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 202.34f),
                    PathNode.CurveTo(208.78593f, 205.46593f, 208.78593f, 210.53407f, 205.66f, 213.66f),
                    PathNode.CurveTo(202.53407f, 216.78593f, 197.46593f, 216.78593f, 194.34f, 213.66f),
                    PathNode.LineTo(114.34f, 133.66f),
                    PathNode.CurveTo(112.83778f, 132.15945f, 111.993706f, 130.12328f, 111.993706f, 128.0f),
                    PathNode.CurveTo(111.993706f, 125.876724f, 112.83778f, 123.840546f, 114.34f, 122.34f),
                    PathNode.LineTo(194.34f, 42.34f),
                    PathNode.CurveTo(197.46593f, 39.21407f, 202.53407f, 39.21407f, 205.66f, 42.34f),
                    PathNode.CurveTo(208.78593f, 45.46593f, 208.78593f, 50.53407f, 205.66f, 53.66f),
                    PathNode.LineTo(131.31f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(51.31f, 128.0f),
                    PathNode.LineTo(125.66f, 53.66f),
                    PathNode.CurveTo(128.78593f, 50.53407f, 128.78593f, 45.46593f, 125.66f, 42.34f),
                    PathNode.CurveTo(122.534065f, 39.21407f, 117.465935f, 39.21407f, 114.34f, 42.34f),
                    PathNode.LineTo(34.34f, 122.34f),
                    PathNode.CurveTo(32.837784f, 123.840546f, 31.993708f, 125.876724f, 31.993708f, 128.0f),
                    PathNode.CurveTo(31.993708f, 130.12328f, 32.837784f, 132.15945f, 34.34f, 133.66f),
                    PathNode.LineTo(114.34f, 213.66f),
                    PathNode.CurveTo(117.465935f, 216.78593f, 122.534065f, 216.78593f, 125.66f, 213.66f),
                    PathNode.CurveTo(128.78593f, 210.53407f, 128.78593f, 205.46593f, 125.66f, 202.34f),
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
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
