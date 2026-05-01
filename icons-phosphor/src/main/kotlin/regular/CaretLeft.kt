package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) return _caretLeft!!
        _caretLeft = phosphorRegularIcon(
            name = "CaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(165.66f, 202.34f),
                    PathNode.CurveTo(168.78593f, 205.46593f, 168.78593f, 210.53407f, 165.66f, 213.66f),
                    PathNode.CurveTo(162.53407f, 216.78593f, 157.46593f, 216.78593f, 154.34f, 213.66f),
                    PathNode.LineTo(74.34f, 133.66f),
                    PathNode.CurveTo(72.83778f, 132.15945f, 71.993706f, 130.12328f, 71.993706f, 128.0f),
                    PathNode.CurveTo(71.993706f, 125.876724f, 72.83778f, 123.840546f, 74.34f, 122.34f),
                    PathNode.LineTo(154.34f, 42.34f),
                    PathNode.CurveTo(157.46593f, 39.21407f, 162.53407f, 39.21407f, 165.66f, 42.34f),
                    PathNode.CurveTo(168.78593f, 45.46593f, 168.78593f, 50.53407f, 165.66f, 53.66f),
                    PathNode.LineTo(91.31f, 128.0f),
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
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
