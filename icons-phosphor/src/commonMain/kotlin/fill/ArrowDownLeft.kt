package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorFillIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(197.66f, 69.66f),
                    PathNode.LineTo(127.31f, 140.0f),
                    PathNode.LineTo(173.66f, 186.34f),
                    PathNode.CurveTo(175.95064f, 188.6281f, 176.63632f, 192.07126f, 175.39697f, 195.06232f),
                    PathNode.CurveTo(174.15764f, 198.05338f, 171.23764f, 200.00255f, 168.0f, 200.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.CurveTo(59.581722f, 200.0f, 56.0f, 196.41827f, 56.0f, 192.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.CurveTo(55.99745f, 84.762344f, 57.94662f, 81.84236f, 60.93768f, 80.60302f),
                    PathNode.CurveTo(63.928738f, 79.36368f, 67.37191f, 80.04936f, 69.66f, 82.34f),
                    PathNode.LineTo(116.0f, 128.69f),
                    PathNode.LineTo(186.34f, 58.34f),
                    PathNode.CurveTo(189.46593f, 55.21407f, 194.53407f, 55.21407f, 197.66f, 58.34f),
                    PathNode.CurveTo(200.78593f, 61.46593f, 200.78593f, 66.534065f, 197.66f, 69.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
