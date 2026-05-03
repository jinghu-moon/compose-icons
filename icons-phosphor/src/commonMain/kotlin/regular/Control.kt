package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Control: ImageVector
    get() {
        if (_control != null) return _control!!
        _control = phosphorRegularIcon(
            name = "Control",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 125.66f),
                    PathNode.CurveTo(204.15945f, 127.16222f, 202.12328f, 128.00629f, 200.0f, 128.00629f),
                    PathNode.CurveTo(197.87672f, 128.00629f, 195.84055f, 127.16222f, 194.34f, 125.66f),
                    PathNode.LineTo(128.0f, 59.31f),
                    PathNode.LineTo(61.66f, 125.66f),
                    PathNode.CurveTo(58.53407f, 128.78593f, 53.46593f, 128.78593f, 50.34f, 125.66f),
                    PathNode.CurveTo(47.21407f, 122.534065f, 47.21407f, 117.465935f, 50.34f, 114.34f),
                    PathNode.LineTo(122.34f, 42.34f),
                    PathNode.CurveTo(123.840546f, 40.837784f, 125.876724f, 39.993706f, 128.0f, 39.993706f),
                    PathNode.CurveTo(130.12328f, 39.993706f, 132.15945f, 40.837784f, 133.66f, 42.34f),
                    PathNode.LineTo(205.66f, 114.34f),
                    PathNode.CurveTo(207.16223f, 115.840546f, 208.00629f, 117.876724f, 208.00629f, 120.0f),
                    PathNode.CurveTo(208.00629f, 122.123276f, 207.16223f, 124.159454f, 205.66f, 125.66f),
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
        return _control!!
    }

private var _control: ImageVector? = null
