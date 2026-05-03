package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretRight: ImageVector
    get() {
        if (_caretRight != null) return _caretRight!!
        _caretRight = phosphorRegularIcon(
            name = "CaretRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(181.66f, 133.66f),
                    PathNode.LineTo(101.66f, 213.66f),
                    PathNode.CurveTo(98.534065f, 216.78593f, 93.465935f, 216.78593f, 90.34f, 213.66f),
                    PathNode.CurveTo(87.214066f, 210.53407f, 87.214066f, 205.46593f, 90.34f, 202.34f),
                    PathNode.LineTo(164.69f, 128.0f),
                    PathNode.LineTo(90.34f, 53.66f),
                    PathNode.CurveTo(87.214066f, 50.53407f, 87.214066f, 45.46593f, 90.34f, 42.34f),
                    PathNode.CurveTo(93.465935f, 39.21407f, 98.534065f, 39.21407f, 101.66f, 42.34f),
                    PathNode.LineTo(181.66f, 122.34f),
                    PathNode.CurveTo(183.16223f, 123.840546f, 184.00629f, 125.876724f, 184.00629f, 128.0f),
                    PathNode.CurveTo(184.00629f, 130.12328f, 183.16223f, 132.15945f, 181.66f, 133.66f),
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
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
