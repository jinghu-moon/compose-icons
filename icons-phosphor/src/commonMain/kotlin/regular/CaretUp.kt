package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretUp: ImageVector
    get() {
        if (_caretUp != null) return _caretUp!!
        _caretUp = phosphorRegularIcon(
            name = "CaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 165.66f),
                    PathNode.CurveTo(212.15945f, 167.16223f, 210.12328f, 168.00629f, 208.0f, 168.00629f),
                    PathNode.CurveTo(205.87672f, 168.00629f, 203.84055f, 167.16223f, 202.34f, 165.66f),
                    PathNode.LineTo(128.0f, 91.31f),
                    PathNode.LineTo(53.66f, 165.66f),
                    PathNode.CurveTo(50.53407f, 168.78593f, 45.46593f, 168.78593f, 42.34f, 165.66f),
                    PathNode.CurveTo(39.21407f, 162.53407f, 39.21407f, 157.46593f, 42.34f, 154.34f),
                    PathNode.LineTo(122.34f, 74.34f),
                    PathNode.CurveTo(123.840546f, 72.83778f, 125.876724f, 71.993706f, 128.0f, 71.993706f),
                    PathNode.CurveTo(130.12328f, 71.993706f, 132.15945f, 72.83778f, 133.66f, 74.34f),
                    PathNode.LineTo(213.66f, 154.34f),
                    PathNode.CurveTo(215.16223f, 155.84055f, 216.00629f, 157.87672f, 216.00629f, 160.0f),
                    PathNode.CurveTo(216.00629f, 162.12328f, 215.16223f, 164.15945f, 213.66f, 165.66f),
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
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
