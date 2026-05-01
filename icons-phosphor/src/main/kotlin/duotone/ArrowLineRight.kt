package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowLineRight: ImageVector
    get() {
        if (_arrowLineRight != null) return _arrowLineRight!!
        _arrowLineRight = phosphorDuotoneIcon(
            name = "ArrowLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 128.0f),
                    PathNode.LineTo(112.0f, 200.0f),
                    PathNode.LineTo(112.0f, 56.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(117.66f, 50.34f),
                    PathNode.CurveTo(115.37191f, 48.04936f, 111.92874f, 47.363674f, 108.937675f, 48.60302f),
                    PathNode.CurveTo(105.94662f, 49.84236f, 103.99745f, 52.76235f, 104.0f, 56.0f),
                    PathNode.LineTo(104.0f, 120.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.CurveTo(27.581722f, 120.0f, 24.0f, 123.58172f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 132.41827f, 27.581722f, 136.0f, 32.0f, 136.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.LineTo(104.0f, 200.0f),
                    PathNode.CurveTo(103.99745f, 203.23764f, 105.94662f, 206.15764f, 108.937675f, 207.39697f),
                    PathNode.CurveTo(111.92874f, 208.63632f, 115.37191f, 207.95064f, 117.66f, 205.66f),
                    PathNode.LineTo(189.66f, 133.66f),
                    PathNode.CurveTo(191.16223f, 132.15945f, 192.00629f, 130.12328f, 192.00629f, 128.0f),
                    PathNode.CurveTo(192.00629f, 125.876724f, 191.16223f, 123.840546f, 189.66f, 122.34f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 180.69f),
                    PathNode.LineTo(120.0f, 75.31f),
                    PathNode.LineTo(172.69f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 40.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 220.41827f, 220.41827f, 224.0f, 216.0f, 224.0f),
                    PathNode.CurveTo(211.58173f, 224.0f, 208.0f, 220.41827f, 208.0f, 216.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 35.581722f, 211.58173f, 32.0f, 216.0f, 32.0f),
                    PathNode.CurveTo(220.41827f, 32.0f, 224.0f, 35.581722f, 224.0f, 40.0f),
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
        return _arrowLineRight!!
    }

private var _arrowLineRight: ImageVector? = null
