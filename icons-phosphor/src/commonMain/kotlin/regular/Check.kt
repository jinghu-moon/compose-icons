package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = phosphorRegularIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 77.66f),
                    PathNode.LineTo(101.66f, 205.66f),
                    PathNode.CurveTo(100.159454f, 207.16223f, 98.123276f, 208.00629f, 96.0f, 208.00629f),
                    PathNode.CurveTo(93.876724f, 208.00629f, 91.840546f, 207.16223f, 90.34f, 205.66f),
                    PathNode.LineTo(34.34f, 149.66f),
                    PathNode.CurveTo(31.214067f, 146.53407f, 31.21407f, 141.46593f, 34.34f, 138.34f),
                    PathNode.CurveTo(37.46593f, 135.21407f, 42.53407f, 135.21407f, 45.66f, 138.34f),
                    PathNode.LineTo(96.0f, 188.69f),
                    PathNode.LineTo(218.34f, 66.34f),
                    PathNode.CurveTo(221.46593f, 63.21407f, 226.53407f, 63.21407f, 229.66f, 66.34f),
                    PathNode.CurveTo(232.78593f, 69.465935f, 232.78593f, 74.534065f, 229.66f, 77.66f),
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
        return _check!!
    }

private var _check: ImageVector? = null
