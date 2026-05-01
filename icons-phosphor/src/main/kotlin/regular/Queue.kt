package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorRegularIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 59.581722f, 35.581722f, 56.0f, 40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(220.41827f, 56.0f, 224.0f, 59.581722f, 224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 68.41828f, 220.41827f, 72.0f, 216.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(35.581722f, 72.0f, 32.0f, 68.41828f, 32.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(35.581722f, 120.0f, 32.0f, 123.58172f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 132.41827f, 35.581722f, 136.0f, 40.0f, 136.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.CurveTo(140.41827f, 136.0f, 144.0f, 132.41827f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 123.58172f, 140.41827f, 120.0f, 136.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 187.58173f, 32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 196.41827f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.CurveTo(140.41827f, 200.0f, 144.0f, 196.41827f, 144.0f, 192.0f),
                    PathNode.CurveTo(144.0f, 187.58173f, 140.41827f, 184.0f, 136.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 160.0f),
                    PathNode.CurveTo(247.99863f, 162.7569f, 246.57785f, 165.31885f, 244.24f, 166.78f),
                    PathNode.LineTo(180.24f, 206.78f),
                    PathNode.CurveTo(177.77446f, 208.32097f, 174.66696f, 208.40295f, 172.1236f, 206.99413f),
                    PathNode.CurveTo(169.58023f, 205.5853f, 168.00145f, 202.90749f, 168.0f, 200.0f),
                    PathNode.LineTo(168.0f, 120.0f),
                    PathNode.CurveTo(168.00145f, 117.09251f, 169.58023f, 114.414696f, 172.1236f, 113.005875f),
                    PathNode.CurveTo(174.66696f, 111.597046f, 177.77446f, 111.67903f, 180.24f, 113.22f),
                    PathNode.LineTo(244.24f, 153.22f),
                    PathNode.CurveTo(246.57785f, 154.68115f, 247.99863f, 157.2431f, 248.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.91f, 160.0f),
                    PathNode.LineTo(184.0f, 134.43f),
                    PathNode.LineTo(184.0f, 185.57f),
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
        return _queue!!
    }

private var _queue: ImageVector? = null
