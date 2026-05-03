package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) return _arrowLineUpLeft!!
        _arrowLineUpLeft = phosphorFillIcon(
            name = "ArrowLineUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(64.0f, 144.0f),
                    PathNode.LineTo(64.0f, 48.0f),
                    PathNode.CurveTo(64.0f, 43.581722f, 67.58172f, 40.0f, 72.0f, 40.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(171.23764f, 39.99745f, 174.15764f, 41.94662f, 175.39697f, 44.93768f),
                    PathNode.CurveTo(176.63632f, 47.928738f, 175.95064f, 51.371906f, 173.66f, 53.66f),
                    PathNode.LineTo(131.31f, 96.0f),
                    PathNode.LineTo(189.66f, 154.34f),
                    PathNode.CurveTo(192.78593f, 157.46593f, 192.78593f, 162.53407f, 189.66f, 165.66f),
                    PathNode.CurveTo(186.53407f, 168.78593f, 181.46593f, 168.78593f, 178.34f, 165.66f),
                    PathNode.LineTo(120.0f, 107.31f),
                    PathNode.LineTo(77.66f, 149.66f),
                    PathNode.CurveTo(75.37191f, 151.95064f, 71.92874f, 152.63632f, 68.937675f, 151.39697f),
                    PathNode.CurveTo(65.94662f, 150.15764f, 63.99745f, 147.23764f, 64.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(43.581722f, 200.0f, 40.0f, 203.58173f, 40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 212.41827f, 43.581722f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(228.41827f, 216.0f, 232.0f, 212.41827f, 232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 203.58173f, 228.41827f, 200.0f, 224.0f, 200.0f),
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
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
