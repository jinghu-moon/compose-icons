package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineDown: ImageVector
    get() {
        if (_arrowLineDown != null) return _arrowLineDown!!
        _arrowLineDown = phosphorFillIcon(
            name = "ArrowLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(50.34f, 117.66f),
                    PathNode.CurveTo(48.04936f, 115.37191f, 47.363674f, 111.92874f, 48.60302f, 108.937675f),
                    PathNode.CurveTo(49.84236f, 105.94662f, 52.76235f, 103.99745f, 56.0f, 104.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.CurveTo(120.0f, 27.581722f, 123.58172f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(132.41827f, 24.0f, 136.0f, 27.581722f, 136.0f, 32.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.CurveTo(203.23764f, 103.99745f, 206.15764f, 105.94662f, 207.39697f, 108.937675f),
                    PathNode.CurveTo(208.63632f, 111.92874f, 207.95064f, 115.37191f, 205.66f, 117.66f),
                    PathNode.LineTo(133.66f, 189.66f),
                    PathNode.CurveTo(132.15945f, 191.16223f, 130.12328f, 192.00629f, 128.0f, 192.00629f),
                    PathNode.CurveTo(125.876724f, 192.00629f, 123.840546f, 191.16223f, 122.34f, 189.66f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 208.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(35.581722f, 208.0f, 32.0f, 211.58173f, 32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 220.41827f, 35.581722f, 224.0f, 40.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 211.58173f, 220.41827f, 208.0f, 216.0f, 208.0f),
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
        return _arrowLineDown!!
    }

private var _arrowLineDown: ImageVector? = null
