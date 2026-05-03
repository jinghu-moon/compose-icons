package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorDuotoneIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 64.0f),
                    PathNode.LineTo(192.0f, 168.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 56.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(84.762344f, 55.99745f, 81.84236f, 57.94662f, 80.60302f, 60.93768f),
                    PathNode.CurveTo(79.36368f, 63.928738f, 80.04936f, 67.37191f, 82.34f, 69.66f),
                    PathNode.LineTo(128.69f, 116.0f),
                    PathNode.LineTo(58.34f, 186.34f),
                    PathNode.CurveTo(55.21407f, 189.46593f, 55.21407f, 194.53407f, 58.34f, 197.66f),
                    PathNode.CurveTo(61.46593f, 200.78593f, 66.534065f, 200.78593f, 69.66f, 197.66f),
                    PathNode.LineTo(140.0f, 127.31f),
                    PathNode.LineTo(186.34f, 173.66f),
                    PathNode.CurveTo(188.6281f, 175.95064f, 192.07126f, 176.63632f, 195.06232f, 175.39697f),
                    PathNode.CurveTo(198.05338f, 174.15764f, 200.00255f, 171.23764f, 200.0f, 168.0f),
                    PathNode.LineTo(200.0f, 64.0f),
                    PathNode.CurveTo(200.0f, 59.581722f, 196.41827f, 56.0f, 192.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 148.69f),
                    PathNode.LineTo(145.66f, 110.35f),
                    PathNode.LineTo(145.66f, 110.35f),
                    PathNode.LineTo(107.31f, 72.0f),
                    PathNode.LineTo(184.0f, 72.0f),
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
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
