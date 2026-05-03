package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsInSimple: ImageVector
    get() {
        if (_arrowsInSimple != null) return _arrowsInSimple!!
        _arrowsInSimple = phosphorFillIcon(
            name = "ArrowsInSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 144.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.CurveTo(120.00255f, 195.23764f, 118.05338f, 198.15764f, 115.062325f, 199.39697f),
                    PathNode.CurveTo(112.07126f, 200.63632f, 108.62809f, 199.95064f, 106.34f, 197.66f),
                    PathNode.LineTo(88.0f, 179.31f),
                    PathNode.LineTo(53.66f, 213.66f),
                    PathNode.CurveTo(50.53407f, 216.78593f, 45.46593f, 216.78593f, 42.34f, 213.66f),
                    PathNode.CurveTo(39.21407f, 210.53407f, 39.21407f, 205.46593f, 42.34f, 202.34f),
                    PathNode.LineTo(76.69f, 168.0f),
                    PathNode.LineTo(58.34f, 149.66f),
                    PathNode.CurveTo(56.04936f, 147.3719f, 55.363674f, 143.92874f, 56.60302f, 140.93768f),
                    PathNode.CurveTo(57.84236f, 137.94662f, 60.76235f, 135.99745f, 64.0f, 136.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.CurveTo(116.41828f, 136.0f, 120.0f, 139.58173f, 120.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.66f, 42.34f),
                    PathNode.CurveTo(212.15945f, 40.837784f, 210.12328f, 39.993706f, 208.0f, 39.993706f),
                    PathNode.CurveTo(205.87672f, 39.993706f, 203.84055f, 40.837784f, 202.34f, 42.34f),
                    PathNode.LineTo(168.0f, 76.69f),
                    PathNode.LineTo(149.66f, 58.34f),
                    PathNode.CurveTo(147.3719f, 56.04936f, 143.92874f, 55.363674f, 140.93768f, 56.60302f),
                    PathNode.CurveTo(137.94662f, 57.84236f, 135.99745f, 60.76235f, 136.0f, 64.0f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.CurveTo(136.0f, 116.41828f, 139.58173f, 120.0f, 144.0f, 120.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.CurveTo(195.23764f, 120.00255f, 198.15764f, 118.05338f, 199.39697f, 115.062325f),
                    PathNode.CurveTo(200.63632f, 112.07126f, 199.95064f, 108.62809f, 197.66f, 106.34f),
                    PathNode.LineTo(179.31f, 88.0f),
                    PathNode.LineTo(213.66f, 53.66f),
                    PathNode.CurveTo(215.16223f, 52.159454f, 216.00629f, 50.123276f, 216.00629f, 48.0f),
                    PathNode.CurveTo(216.00629f, 45.876724f, 215.16223f, 43.840546f, 213.66f, 42.34f),
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
        return _arrowsInSimple!!
    }

private var _arrowsInSimple: ImageVector? = null
