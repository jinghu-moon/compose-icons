package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretDown: ImageVector
    get() {
        if (_caretDown != null) return _caretDown!!
        _caretDown = phosphorRegularIcon(
            name = "CaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 101.66f),
                    PathNode.LineTo(133.66f, 181.66f),
                    PathNode.CurveTo(132.15945f, 183.16223f, 130.12328f, 184.00629f, 128.0f, 184.00629f),
                    PathNode.CurveTo(125.876724f, 184.00629f, 123.840546f, 183.16223f, 122.34f, 181.66f),
                    PathNode.LineTo(42.34f, 101.66f),
                    PathNode.CurveTo(39.21407f, 98.534065f, 39.21407f, 93.465935f, 42.34f, 90.34f),
                    PathNode.CurveTo(45.46593f, 87.214066f, 50.53407f, 87.214066f, 53.66f, 90.34f),
                    PathNode.LineTo(128.0f, 164.69f),
                    PathNode.LineTo(202.34f, 90.34f),
                    PathNode.CurveTo(205.46593f, 87.214066f, 210.53407f, 87.214066f, 213.66f, 90.34f),
                    PathNode.CurveTo(216.78593f, 93.465935f, 216.78593f, 98.534065f, 213.66f, 101.66f),
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
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
