package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) return _caretDoubleDown!!
        _caretDoubleDown = phosphorRegularIcon(
            name = "CaretDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 130.34f),
                    PathNode.CurveTo(215.16223f, 131.84055f, 216.00629f, 133.87672f, 216.00629f, 136.0f),
                    PathNode.CurveTo(216.00629f, 138.12328f, 215.16223f, 140.15945f, 213.66f, 141.66f),
                    PathNode.LineTo(133.66f, 221.66f),
                    PathNode.CurveTo(132.15945f, 223.16223f, 130.12328f, 224.00629f, 128.0f, 224.00629f),
                    PathNode.CurveTo(125.876724f, 224.00629f, 123.840546f, 223.16223f, 122.34f, 221.66f),
                    PathNode.LineTo(42.34f, 141.66f),
                    PathNode.CurveTo(39.21407f, 138.53407f, 39.21407f, 133.46593f, 42.34f, 130.34f),
                    PathNode.CurveTo(45.46593f, 127.214066f, 50.53407f, 127.214066f, 53.66f, 130.34f),
                    PathNode.LineTo(128.0f, 204.69f),
                    PathNode.LineTo(202.34f, 130.34f),
                    PathNode.CurveTo(203.84055f, 128.83778f, 205.87672f, 127.993706f, 208.0f, 127.993706f),
                    PathNode.CurveTo(210.12328f, 127.993706f, 212.15945f, 128.83778f, 213.66f, 130.34f),
                    PathNode.Close,
                    PathNode.MoveTo(122.34f, 141.66f),
                    PathNode.CurveTo(123.840546f, 143.16223f, 125.876724f, 144.00629f, 128.0f, 144.00629f),
                    PathNode.CurveTo(130.12328f, 144.00629f, 132.15945f, 143.16223f, 133.66f, 141.66f),
                    PathNode.LineTo(213.66f, 61.66f),
                    PathNode.CurveTo(216.78593f, 58.53407f, 216.78593f, 53.46593f, 213.66f, 50.34f),
                    PathNode.CurveTo(210.53407f, 47.21407f, 205.46593f, 47.21407f, 202.34f, 50.34f),
                    PathNode.LineTo(128.0f, 124.69f),
                    PathNode.LineTo(53.66f, 50.34f),
                    PathNode.CurveTo(50.53407f, 47.21407f, 45.46593f, 47.21407f, 42.34f, 50.34f),
                    PathNode.CurveTo(39.21407f, 53.46593f, 39.21407f, 58.53407f, 42.34f, 61.66f),
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
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
