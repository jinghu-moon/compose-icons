package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorRegularIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(117.31f, 134.0f),
                    PathNode.LineTo(45.31f, 198.0f),
                    PathNode.CurveTo(41.996292f, 200.9354f, 36.930393f, 200.62871f, 33.995f, 197.315f),
                    PathNode.CurveTo(31.059607f, 194.0013f, 31.366293f, 188.9354f, 34.68f, 186.0f),
                    PathNode.LineTo(100.0f, 128.0f),
                    PathNode.LineTo(34.69f, 70.0f),
                    PathNode.CurveTo(31.376291f, 67.064606f, 31.069607f, 61.998707f, 34.005f, 58.685f),
                    PathNode.CurveTo(36.94039f, 55.371292f, 42.00629f, 55.064606f, 45.32f, 58.0f),
                    PathNode.LineTo(117.32f, 122.0f),
                    PathNode.CurveTo(119.042f, 123.51866f, 120.028496f, 125.703995f, 120.028496f, 128.0f),
                    PathNode.CurveTo(120.028496f, 130.296f, 119.042f, 132.48134f, 117.32f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 184.0f),
                    PathNode.LineTo(120.0f, 184.0f),
                    PathNode.CurveTo(115.58172f, 184.0f, 112.0f, 187.58173f, 112.0f, 192.0f),
                    PathNode.CurveTo(112.0f, 196.41827f, 115.58172f, 200.0f, 120.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(220.41827f, 200.0f, 224.0f, 196.41827f, 224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 187.58173f, 220.41827f, 184.0f, 216.0f, 184.0f),
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
        return _terminal!!
    }

private var _terminal: ImageVector? = null
