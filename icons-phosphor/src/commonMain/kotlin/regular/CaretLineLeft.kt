package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretLineLeft: ImageVector
    get() {
        if (_caretLineLeft != null) return _caretLineLeft!!
        _caretLineLeft = phosphorRegularIcon(
            name = "CaretLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(197.66f, 202.34f),
                    PathNode.CurveTo(200.78593f, 205.46593f, 200.78593f, 210.53407f, 197.66f, 213.66f),
                    PathNode.CurveTo(194.53407f, 216.78593f, 189.46593f, 216.78593f, 186.34f, 213.66f),
                    PathNode.LineTo(106.34f, 133.66f),
                    PathNode.CurveTo(104.83778f, 132.15945f, 103.993706f, 130.12328f, 103.993706f, 128.0f),
                    PathNode.CurveTo(103.993706f, 125.876724f, 104.83778f, 123.840546f, 106.34f, 122.34f),
                    PathNode.LineTo(186.34f, 42.34f),
                    PathNode.CurveTo(189.46593f, 39.21407f, 194.53407f, 39.21407f, 197.66f, 42.34f),
                    PathNode.CurveTo(200.78593f, 45.46593f, 200.78593f, 50.53407f, 197.66f, 53.66f),
                    PathNode.LineTo(123.31f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 40.0f),
                    PathNode.CurveTo(67.58172f, 40.0f, 64.0f, 43.581722f, 64.0f, 48.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.CurveTo(64.0f, 212.41827f, 67.58172f, 216.0f, 72.0f, 216.0f),
                    PathNode.CurveTo(76.41828f, 216.0f, 80.0f, 212.41827f, 80.0f, 208.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.CurveTo(80.0f, 43.581722f, 76.41828f, 40.0f, 72.0f, 40.0f),
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
        return _caretLineLeft!!
    }

private var _caretLineLeft: ImageVector? = null
