package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = phosphorFillIcon(
            name = "ArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.66f, 133.66f),
                    PathNode.LineTo(149.66f, 205.66f),
                    PathNode.CurveTo(147.3719f, 207.95064f, 143.92874f, 208.63632f, 140.93768f, 207.39697f),
                    PathNode.CurveTo(137.94662f, 206.15764f, 135.99745f, 203.23764f, 136.0f, 200.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(35.581722f, 136.0f, 32.0f, 132.41827f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 123.58172f, 35.581722f, 120.0f, 40.0f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.CurveTo(135.99745f, 52.76235f, 137.94662f, 49.84236f, 140.93768f, 48.60302f),
                    PathNode.CurveTo(143.92874f, 47.363674f, 147.3719f, 48.04936f, 149.66f, 50.34f),
                    PathNode.LineTo(221.66f, 122.34f),
                    PathNode.CurveTo(223.16223f, 123.840546f, 224.00629f, 125.876724f, 224.00629f, 128.0f),
                    PathNode.CurveTo(224.00629f, 130.12328f, 223.16223f, 132.15945f, 221.66f, 133.66f),
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
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
