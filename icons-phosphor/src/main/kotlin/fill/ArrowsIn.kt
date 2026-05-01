package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorFillIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 104.0f),
                    PathNode.LineTo(144.0f, 64.0f),
                    PathNode.CurveTo(143.99745f, 60.76235f, 145.94662f, 57.84236f, 148.93768f, 56.60302f),
                    PathNode.CurveTo(151.92874f, 55.363674f, 155.3719f, 56.04936f, 157.66f, 58.34f),
                    PathNode.LineTo(172.0f, 72.69f),
                    PathNode.LineTo(202.34f, 42.34f),
                    PathNode.CurveTo(205.46593f, 39.21407f, 210.53407f, 39.21407f, 213.66f, 42.34f),
                    PathNode.CurveTo(216.78593f, 45.46593f, 216.78593f, 50.53407f, 213.66f, 53.66f),
                    PathNode.LineTo(183.31f, 84.0f),
                    PathNode.LineTo(197.66f, 98.34f),
                    PathNode.CurveTo(199.95064f, 100.62809f, 200.63632f, 104.07126f, 199.39697f, 107.062325f),
                    PathNode.CurveTo(198.15764f, 110.05338f, 195.23764f, 112.00255f, 192.0f, 112.0f),
                    PathNode.LineTo(152.0f, 112.0f),
                    PathNode.CurveTo(147.58173f, 112.0f, 144.0f, 108.41828f, 144.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 144.0f),
                    PathNode.LineTo(64.0f, 144.0f),
                    PathNode.CurveTo(60.76235f, 143.99745f, 57.84236f, 145.94662f, 56.60302f, 148.93768f),
                    PathNode.CurveTo(55.363674f, 151.92874f, 56.04936f, 155.3719f, 58.34f, 157.66f),
                    PathNode.LineTo(72.69f, 172.0f),
                    PathNode.LineTo(42.34f, 202.34f),
                    PathNode.CurveTo(39.21407f, 205.46593f, 39.21407f, 210.53407f, 42.34f, 213.66f),
                    PathNode.CurveTo(45.46593f, 216.78593f, 50.53407f, 216.78593f, 53.66f, 213.66f),
                    PathNode.LineTo(84.0f, 183.31f),
                    PathNode.LineTo(98.34f, 197.66f),
                    PathNode.CurveTo(100.62809f, 199.95064f, 104.07126f, 200.63632f, 107.062325f, 199.39697f),
                    PathNode.CurveTo(110.05338f, 198.15764f, 112.00255f, 195.23764f, 112.0f, 192.0f),
                    PathNode.LineTo(112.0f, 152.0f),
                    PathNode.CurveTo(112.0f, 147.58173f, 108.41828f, 144.0f, 104.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(107.06f, 56.61f),
                    PathNode.CurveTo(104.07096f, 55.369938f, 100.62924f, 56.052757f, 98.34f, 58.34f),
                    PathNode.LineTo(84.0f, 72.69f),
                    PathNode.LineTo(53.66f, 42.34f),
                    PathNode.CurveTo(50.53407f, 39.21407f, 45.46593f, 39.21407f, 42.34f, 42.34f),
                    PathNode.CurveTo(39.21407f, 45.46593f, 39.21407f, 50.53407f, 42.34f, 53.66f),
                    PathNode.LineTo(72.69f, 84.0f),
                    PathNode.LineTo(58.34f, 98.34f),
                    PathNode.CurveTo(56.04936f, 100.62809f, 55.363674f, 104.07126f, 56.60302f, 107.062325f),
                    PathNode.CurveTo(57.84236f, 110.05338f, 60.76235f, 112.00255f, 64.0f, 112.0f),
                    PathNode.LineTo(104.0f, 112.0f),
                    PathNode.CurveTo(108.41828f, 112.0f, 112.0f, 108.41828f, 112.0f, 104.0f),
                    PathNode.LineTo(112.0f, 64.0f),
                    PathNode.CurveTo(111.99934f, 60.764324f, 110.04962f, 57.847645f, 107.06f, 56.61f),
                    PathNode.Close,
                    PathNode.MoveTo(183.31f, 172.0f),
                    PathNode.LineTo(197.66f, 157.66f),
                    PathNode.CurveTo(199.95064f, 155.3719f, 200.63632f, 151.92874f, 199.39697f, 148.93768f),
                    PathNode.CurveTo(198.15764f, 145.94662f, 195.23764f, 143.99745f, 192.0f, 144.0f),
                    PathNode.LineTo(152.0f, 144.0f),
                    PathNode.CurveTo(147.58173f, 144.0f, 144.0f, 147.58173f, 144.0f, 152.0f),
                    PathNode.LineTo(144.0f, 192.0f),
                    PathNode.CurveTo(143.99745f, 195.23764f, 145.94662f, 198.15764f, 148.93768f, 199.39697f),
                    PathNode.CurveTo(151.92874f, 200.63632f, 155.3719f, 199.95064f, 157.66f, 197.66f),
                    PathNode.LineTo(172.0f, 183.31f),
                    PathNode.LineTo(202.34f, 213.66f),
                    PathNode.CurveTo(205.46593f, 216.78593f, 210.53407f, 216.78593f, 213.66f, 213.66f),
                    PathNode.CurveTo(216.78593f, 210.53407f, 216.78593f, 205.46593f, 213.66f, 202.34f),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
