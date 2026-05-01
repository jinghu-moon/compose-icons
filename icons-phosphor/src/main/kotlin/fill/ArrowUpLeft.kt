package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorFillIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(197.66f, 197.66f),
                    PathNode.CurveTo(196.15945f, 199.16223f, 194.12328f, 200.00629f, 192.0f, 200.00629f),
                    PathNode.CurveTo(189.87672f, 200.00629f, 187.84055f, 199.16223f, 186.34f, 197.66f),
                    PathNode.LineTo(116.0f, 127.31f),
                    PathNode.LineTo(69.66f, 173.66f),
                    PathNode.CurveTo(67.37191f, 175.95064f, 63.928738f, 176.63632f, 60.93768f, 175.39697f),
                    PathNode.CurveTo(57.94662f, 174.15764f, 55.99745f, 171.23764f, 56.0f, 168.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.CurveTo(56.0f, 59.581722f, 59.581722f, 56.0f, 64.0f, 56.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(171.23764f, 55.99745f, 174.15764f, 57.94662f, 175.39697f, 60.93768f),
                    PathNode.CurveTo(176.63632f, 63.928738f, 175.95064f, 67.37191f, 173.66f, 69.66f),
                    PathNode.LineTo(127.31f, 116.0f),
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
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
