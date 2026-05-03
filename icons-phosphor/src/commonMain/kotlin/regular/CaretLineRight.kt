package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretLineRight: ImageVector
    get() {
        if (_caretLineRight != null) return _caretLineRight!!
        _caretLineRight = phosphorRegularIcon(
            name = "CaretLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(149.66f, 122.34f),
                    PathNode.CurveTo(151.16223f, 123.840546f, 152.00629f, 125.876724f, 152.00629f, 128.0f),
                    PathNode.CurveTo(152.00629f, 130.12328f, 151.16223f, 132.15945f, 149.66f, 133.66f),
                    PathNode.LineTo(69.66f, 213.66f),
                    PathNode.CurveTo(66.534065f, 216.78593f, 61.46593f, 216.78593f, 58.34f, 213.66f),
                    PathNode.CurveTo(55.21407f, 210.53407f, 55.21407f, 205.46593f, 58.34f, 202.34f),
                    PathNode.LineTo(132.69f, 128.0f),
                    PathNode.LineTo(58.34f, 53.66f),
                    PathNode.CurveTo(55.21407f, 50.53407f, 55.21407f, 45.46593f, 58.34f, 42.34f),
                    PathNode.CurveTo(61.46593f, 39.21407f, 66.534065f, 39.21407f, 69.66f, 42.34f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 40.0f),
                    PathNode.CurveTo(179.58173f, 40.0f, 176.0f, 43.581722f, 176.0f, 48.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.CurveTo(176.0f, 212.41827f, 179.58173f, 216.0f, 184.0f, 216.0f),
                    PathNode.CurveTo(188.41827f, 216.0f, 192.0f, 212.41827f, 192.0f, 208.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.CurveTo(192.0f, 43.581722f, 188.41827f, 40.0f, 184.0f, 40.0f),
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
        return _caretLineRight!!
    }

private var _caretLineRight: ImageVector? = null
