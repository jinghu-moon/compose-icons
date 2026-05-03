package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretLineDown: ImageVector
    get() {
        if (_caretLineDown != null) return _caretLineDown!!
        _caretLineDown = phosphorRegularIcon(
            name = "CaretLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(42.34f, 77.66f),
                    PathNode.CurveTo(39.21407f, 74.534065f, 39.21407f, 69.465935f, 42.34f, 66.34f),
                    PathNode.CurveTo(45.46593f, 63.21407f, 50.53407f, 63.21407f, 53.66f, 66.34f),
                    PathNode.LineTo(128.0f, 140.69f),
                    PathNode.LineTo(202.34f, 66.34f),
                    PathNode.CurveTo(205.46593f, 63.21407f, 210.53407f, 63.21407f, 213.66f, 66.34f),
                    PathNode.CurveTo(216.78593f, 69.465935f, 216.78593f, 74.534065f, 213.66f, 77.66f),
                    PathNode.LineTo(133.66f, 157.66f),
                    PathNode.CurveTo(132.15945f, 159.16223f, 130.12328f, 160.00629f, 128.0f, 160.00629f),
                    PathNode.CurveTo(125.876724f, 160.00629f, 123.840546f, 159.16223f, 122.34f, 157.66f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 184.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.CurveTo(43.581722f, 184.0f, 40.0f, 187.58173f, 40.0f, 192.0f),
                    PathNode.CurveTo(40.0f, 196.41827f, 43.581722f, 200.0f, 48.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(212.41827f, 200.0f, 216.0f, 196.41827f, 216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 187.58173f, 212.41827f, 184.0f, 208.0f, 184.0f),
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
        return _caretLineDown!!
    }

private var _caretLineDown: ImageVector? = null
