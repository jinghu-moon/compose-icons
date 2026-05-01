package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = phosphorRegularIcon(
            name = "ArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 117.66f),
                    PathNode.CurveTo(204.15945f, 119.16222f, 202.12328f, 120.006294f, 200.0f, 120.006294f),
                    PathNode.CurveTo(197.87672f, 120.006294f, 195.84055f, 119.16222f, 194.34f, 117.66f),
                    PathNode.LineTo(136.0f, 59.31f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.CurveTo(136.0f, 220.41827f, 132.41827f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(123.58172f, 224.0f, 120.0f, 220.41827f, 120.0f, 216.0f),
                    PathNode.LineTo(120.0f, 59.31f),
                    PathNode.LineTo(61.66f, 117.66f),
                    PathNode.CurveTo(58.53407f, 120.785934f, 53.46593f, 120.785934f, 50.34f, 117.66f),
                    PathNode.CurveTo(47.21407f, 114.534065f, 47.21407f, 109.465935f, 50.34f, 106.34f),
                    PathNode.LineTo(122.34f, 34.34f),
                    PathNode.CurveTo(123.840546f, 32.837784f, 125.876724f, 31.993708f, 128.0f, 31.993708f),
                    PathNode.CurveTo(130.12328f, 31.993708f, 132.15945f, 32.837784f, 133.66f, 34.34f),
                    PathNode.LineTo(205.66f, 106.34f),
                    PathNode.CurveTo(207.16223f, 107.840546f, 208.00629f, 109.876724f, 208.00629f, 112.0f),
                    PathNode.CurveTo(208.00629f, 114.123276f, 207.16223f, 116.159454f, 205.66f, 117.66f),
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
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
