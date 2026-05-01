package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorRegularIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(197.66f, 197.66f),
                    PathNode.CurveTo(196.15945f, 199.16223f, 194.12328f, 200.00629f, 192.0f, 200.00629f),
                    PathNode.CurveTo(189.87672f, 200.00629f, 187.84055f, 199.16223f, 186.34f, 197.66f),
                    PathNode.LineTo(72.0f, 83.31f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.CurveTo(72.0f, 172.41827f, 68.41828f, 176.0f, 64.0f, 176.0f),
                    PathNode.CurveTo(59.581722f, 176.0f, 56.0f, 172.41827f, 56.0f, 168.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.CurveTo(56.0f, 59.581722f, 59.581722f, 56.0f, 64.0f, 56.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(172.41827f, 56.0f, 176.0f, 59.581722f, 176.0f, 64.0f),
                    PathNode.CurveTo(176.0f, 68.41828f, 172.41827f, 72.0f, 168.0f, 72.0f),
                    PathNode.LineTo(83.31f, 72.0f),
                    PathNode.LineTo(197.66f, 186.34f),
                    PathNode.CurveTo(199.16223f, 187.84055f, 200.00629f, 189.87672f, 200.00629f, 192.0f),
                    PathNode.CurveTo(200.00629f, 194.12328f, 199.16223f, 196.15945f, 197.66f, 197.66f),
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
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
