package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorRegularIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 64.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.CurveTo(200.0f, 172.41827f, 196.41827f, 176.0f, 192.0f, 176.0f),
                    PathNode.CurveTo(187.58173f, 176.0f, 184.0f, 172.41827f, 184.0f, 168.0f),
                    PathNode.LineTo(184.0f, 83.31f),
                    PathNode.LineTo(69.66f, 197.66f),
                    PathNode.CurveTo(66.534065f, 200.78593f, 61.46593f, 200.78593f, 58.34f, 197.66f),
                    PathNode.CurveTo(55.21407f, 194.53407f, 55.21407f, 189.46593f, 58.34f, 186.34f),
                    PathNode.LineTo(172.69f, 72.0f),
                    PathNode.LineTo(88.0f, 72.0f),
                    PathNode.CurveTo(83.58172f, 72.0f, 80.0f, 68.41828f, 80.0f, 64.0f),
                    PathNode.CurveTo(80.0f, 59.581722f, 83.58172f, 56.0f, 88.0f, 56.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.CurveTo(196.41827f, 56.0f, 200.0f, 59.581722f, 200.0f, 64.0f),
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
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
