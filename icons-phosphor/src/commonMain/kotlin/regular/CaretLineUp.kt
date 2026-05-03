package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretLineUp: ImageVector
    get() {
        if (_caretLineUp != null) return _caretLineUp!!
        _caretLineUp = phosphorRegularIcon(
            name = "CaretLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 197.66f),
                    PathNode.CurveTo(212.15945f, 199.16223f, 210.12328f, 200.00629f, 208.0f, 200.00629f),
                    PathNode.CurveTo(205.87672f, 200.00629f, 203.84055f, 199.16223f, 202.34f, 197.66f),
                    PathNode.LineTo(128.0f, 123.31f),
                    PathNode.LineTo(53.66f, 197.66f),
                    PathNode.CurveTo(50.53407f, 200.78593f, 45.46593f, 200.78593f, 42.34f, 197.66f),
                    PathNode.CurveTo(39.21407f, 194.53407f, 39.21407f, 189.46593f, 42.34f, 186.34f),
                    PathNode.LineTo(122.34f, 106.34f),
                    PathNode.CurveTo(123.840546f, 104.83778f, 125.876724f, 103.993706f, 128.0f, 103.993706f),
                    PathNode.CurveTo(130.12328f, 103.993706f, 132.15945f, 104.83778f, 133.66f, 106.34f),
                    PathNode.LineTo(213.66f, 186.34f),
                    PathNode.CurveTo(215.16223f, 187.84055f, 216.00629f, 189.87672f, 216.00629f, 192.0f),
                    PathNode.CurveTo(216.00629f, 194.12328f, 215.16223f, 196.15945f, 213.66f, 197.66f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 80.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.CurveTo(212.41827f, 80.0f, 216.0f, 76.41828f, 216.0f, 72.0f),
                    PathNode.CurveTo(216.0f, 67.58172f, 212.41827f, 64.0f, 208.0f, 64.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.CurveTo(43.581722f, 64.0f, 40.0f, 67.58172f, 40.0f, 72.0f),
                    PathNode.CurveTo(40.0f, 76.41828f, 43.581722f, 80.0f, 48.0f, 80.0f),
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
        return _caretLineUp!!
    }

private var _caretLineUp: ImageVector? = null
