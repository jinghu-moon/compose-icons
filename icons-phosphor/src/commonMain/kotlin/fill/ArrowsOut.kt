package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) return _arrowsOut!!
        _arrowsOut = phosphorFillIcon(
            name = "ArrowsOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(109.66f, 146.34f),
                    PathNode.CurveTo(111.16222f, 147.84055f, 112.006294f, 149.87672f, 112.006294f, 152.0f),
                    PathNode.CurveTo(112.006294f, 154.12328f, 111.16222f, 156.15945f, 109.66f, 157.66f),
                    PathNode.LineTo(83.31f, 184.0f),
                    PathNode.LineTo(101.66f, 202.34f),
                    PathNode.CurveTo(103.95064f, 204.6281f, 104.63632f, 208.07126f, 103.39698f, 211.06232f),
                    PathNode.CurveTo(102.15764f, 214.05338f, 99.237656f, 216.00255f, 96.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.CurveTo(39.99745f, 156.76236f, 41.94662f, 153.84236f, 44.93768f, 152.60303f),
                    PathNode.CurveTo(47.928738f, 151.36368f, 51.371906f, 152.04936f, 53.66f, 154.34f),
                    PathNode.LineTo(72.0f, 172.69f),
                    PathNode.LineTo(98.34f, 146.34f),
                    PathNode.CurveTo(99.840546f, 144.83777f, 101.876724f, 143.99371f, 104.0f, 143.99371f),
                    PathNode.CurveTo(106.123276f, 143.99371f, 108.159454f, 144.83777f, 109.66f, 146.34f),
                    PathNode.Close,
                    PathNode.MoveTo(83.31f, 72.0f),
                    PathNode.LineTo(101.66f, 53.66f),
                    PathNode.CurveTo(103.95064f, 51.371906f, 104.63632f, 47.928738f, 103.39698f, 44.93768f),
                    PathNode.CurveTo(102.15764f, 41.94662f, 99.237656f, 39.99745f, 96.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(43.581722f, 40.0f, 40.0f, 43.581722f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.CurveTo(39.99745f, 99.237656f, 41.94662f, 102.15764f, 44.93768f, 103.39698f),
                    PathNode.CurveTo(47.928738f, 104.63632f, 51.371906f, 103.95064f, 53.66f, 101.66f),
                    PathNode.LineTo(72.0f, 83.31f),
                    PathNode.LineTo(98.34f, 109.66f),
                    PathNode.CurveTo(101.465935f, 112.785934f, 106.534065f, 112.785934f, 109.66f, 109.66f),
                    PathNode.CurveTo(112.785934f, 106.534065f, 112.785934f, 101.465935f, 109.66f, 98.34f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.CurveTo(156.76236f, 39.99745f, 153.84236f, 41.94662f, 152.60303f, 44.93768f),
                    PathNode.CurveTo(151.36368f, 47.928738f, 152.04936f, 51.371906f, 154.34f, 53.66f),
                    PathNode.LineTo(172.69f, 72.0f),
                    PathNode.LineTo(146.34f, 98.34f),
                    PathNode.CurveTo(143.21407f, 101.465935f, 143.21407f, 106.534065f, 146.34f, 109.66f),
                    PathNode.CurveTo(149.46593f, 112.785934f, 154.53407f, 112.785934f, 157.66f, 109.66f),
                    PathNode.LineTo(184.0f, 83.31f),
                    PathNode.LineTo(202.34f, 101.66f),
                    PathNode.CurveTo(204.6281f, 103.95064f, 208.07126f, 104.63632f, 211.06232f, 103.39698f),
                    PathNode.CurveTo(214.05338f, 102.15764f, 216.00255f, 99.237656f, 216.0f, 96.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 43.581722f, 212.41827f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.06f, 152.61f),
                    PathNode.CurveTo(208.07097f, 151.36993f, 204.62924f, 152.05275f, 202.34f, 154.34f),
                    PathNode.LineTo(184.0f, 172.69f),
                    PathNode.LineTo(157.66f, 146.34f),
                    PathNode.CurveTo(154.53407f, 143.21407f, 149.46593f, 143.21407f, 146.34f, 146.34f),
                    PathNode.CurveTo(143.21407f, 149.46593f, 143.21407f, 154.53407f, 146.34f, 157.66f),
                    PathNode.LineTo(172.69f, 184.0f),
                    PathNode.LineTo(154.34f, 202.34f),
                    PathNode.CurveTo(152.04936f, 204.6281f, 151.36368f, 208.07126f, 152.60303f, 211.06232f),
                    PathNode.CurveTo(153.84236f, 214.05338f, 156.76236f, 216.00255f, 160.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(212.41827f, 216.0f, 216.0f, 212.41827f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.CurveTo(215.99933f, 156.76434f, 214.04962f, 153.84764f, 211.06f, 152.61f),
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
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
