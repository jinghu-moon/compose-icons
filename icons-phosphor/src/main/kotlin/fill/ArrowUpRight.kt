package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorFillIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 64.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.CurveTo(200.00255f, 171.23764f, 198.05338f, 174.15764f, 195.06232f, 175.39697f),
                    PathNode.CurveTo(192.07126f, 176.63632f, 188.6281f, 175.95064f, 186.34f, 173.66f),
                    PathNode.LineTo(140.0f, 127.31f),
                    PathNode.LineTo(69.66f, 197.66f),
                    PathNode.CurveTo(66.534065f, 200.78593f, 61.46593f, 200.78593f, 58.34f, 197.66f),
                    PathNode.CurveTo(55.21407f, 194.53407f, 55.21407f, 189.46593f, 58.34f, 186.34f),
                    PathNode.LineTo(128.69f, 116.0f),
                    PathNode.LineTo(82.34f, 69.66f),
                    PathNode.CurveTo(80.04936f, 67.37191f, 79.36368f, 63.928738f, 80.60302f, 60.93768f),
                    PathNode.CurveTo(81.84236f, 57.94662f, 84.762344f, 55.99745f, 88.0f, 56.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.CurveTo(196.41827f, 56.0f, 200.0f, 59.581722f, 200.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
