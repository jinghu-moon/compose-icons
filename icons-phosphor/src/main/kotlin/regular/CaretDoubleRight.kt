package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) return _caretDoubleRight!!
        _caretDoubleRight = phosphorRegularIcon(
            name = "CaretDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(141.66f, 133.66f),
                    PathNode.LineTo(61.66f, 213.66f),
                    PathNode.CurveTo(58.53407f, 216.78593f, 53.46593f, 216.78593f, 50.34f, 213.66f),
                    PathNode.CurveTo(47.21407f, 210.53407f, 47.21407f, 205.46593f, 50.34f, 202.34f),
                    PathNode.LineTo(124.69f, 128.0f),
                    PathNode.LineTo(50.34f, 53.66f),
                    PathNode.CurveTo(47.21407f, 50.53407f, 47.21407f, 45.46593f, 50.34f, 42.34f),
                    PathNode.CurveTo(53.46593f, 39.21407f, 58.53407f, 39.21407f, 61.66f, 42.34f),
                    PathNode.LineTo(141.66f, 122.34f),
                    PathNode.CurveTo(143.16223f, 123.840546f, 144.00629f, 125.876724f, 144.00629f, 128.0f),
                    PathNode.CurveTo(144.00629f, 130.12328f, 143.16223f, 132.15945f, 141.66f, 133.66f),
                    PathNode.Close,
                    PathNode.MoveTo(221.66f, 122.34f),
                    PathNode.LineTo(141.66f, 42.34f),
                    PathNode.CurveTo(138.53407f, 39.21407f, 133.46593f, 39.21407f, 130.34f, 42.34f),
                    PathNode.CurveTo(127.214066f, 45.46593f, 127.214066f, 50.53407f, 130.34f, 53.66f),
                    PathNode.LineTo(204.69f, 128.0f),
                    PathNode.LineTo(130.34f, 202.34f),
                    PathNode.CurveTo(127.214066f, 205.46593f, 127.214066f, 210.53407f, 130.34f, 213.66f),
                    PathNode.CurveTo(133.46593f, 216.78593f, 138.53407f, 216.78593f, 141.66f, 213.66f),
                    PathNode.LineTo(221.66f, 133.66f),
                    PathNode.CurveTo(223.16223f, 132.15945f, 224.00629f, 130.12328f, 224.00629f, 128.0f),
                    PathNode.CurveTo(224.00629f, 125.876724f, 223.16223f, 123.840546f, 221.66f, 122.34f),
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
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
