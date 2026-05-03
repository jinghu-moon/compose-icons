package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorRegularIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(181.66f, 170.34f),
                    PathNode.CurveTo(183.16223f, 171.84055f, 184.00629f, 173.87672f, 184.00629f, 176.0f),
                    PathNode.CurveTo(184.00629f, 178.12328f, 183.16223f, 180.15945f, 181.66f, 181.66f),
                    PathNode.LineTo(133.66f, 229.66f),
                    PathNode.CurveTo(132.15945f, 231.16223f, 130.12328f, 232.00629f, 128.0f, 232.00629f),
                    PathNode.CurveTo(125.876724f, 232.00629f, 123.840546f, 231.16223f, 122.34f, 229.66f),
                    PathNode.LineTo(74.34f, 181.66f),
                    PathNode.CurveTo(71.214066f, 178.53407f, 71.214066f, 173.46593f, 74.34f, 170.34f),
                    PathNode.CurveTo(77.465935f, 167.21407f, 82.534065f, 167.21407f, 85.66f, 170.34f),
                    PathNode.LineTo(128.0f, 212.69f),
                    PathNode.LineTo(170.34f, 170.34f),
                    PathNode.CurveTo(171.84055f, 168.83777f, 173.87672f, 167.99371f, 176.0f, 167.99371f),
                    PathNode.CurveTo(178.12328f, 167.99371f, 180.15945f, 168.83777f, 181.66f, 170.34f),
                    PathNode.Close,
                    PathNode.MoveTo(85.66f, 85.66f),
                    PathNode.LineTo(128.0f, 43.31f),
                    PathNode.LineTo(170.34f, 85.66f),
                    PathNode.CurveTo(173.46593f, 88.785934f, 178.53407f, 88.785934f, 181.66f, 85.66f),
                    PathNode.CurveTo(184.78593f, 82.534065f, 184.78593f, 77.465935f, 181.66f, 74.34f),
                    PathNode.LineTo(133.66f, 26.34f),
                    PathNode.CurveTo(132.15945f, 24.837784f, 130.12328f, 23.993708f, 128.0f, 23.993708f),
                    PathNode.CurveTo(125.876724f, 23.993708f, 123.840546f, 24.837784f, 122.34f, 26.34f),
                    PathNode.LineTo(74.34f, 74.34f),
                    PathNode.CurveTo(71.214066f, 77.465935f, 71.214066f, 82.534065f, 74.34f, 85.66f),
                    PathNode.CurveTo(77.465935f, 88.785934f, 82.534065f, 88.785934f, 85.66f, 85.66f),
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
