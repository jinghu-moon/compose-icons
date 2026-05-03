package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOutSimple: ImageVector
    get() {
        if (_arrowsOutSimple != null) return _arrowsOutSimple!!
        _arrowsOutSimple = phosphorFillIcon(
            name = "ArrowsOutSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(117.66f, 138.34f),
                    PathNode.CurveTo(119.16222f, 139.84055f, 120.006294f, 141.87672f, 120.006294f, 144.0f),
                    PathNode.CurveTo(120.006294f, 146.12328f, 119.16222f, 148.15945f, 117.66f, 149.66f),
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
                    PathNode.LineTo(106.34f, 138.34f),
                    PathNode.CurveTo(107.840546f, 136.83777f, 109.876724f, 135.99371f, 112.0f, 135.99371f),
                    PathNode.CurveTo(114.123276f, 135.99371f, 116.159454f, 136.83777f, 117.66f, 138.34f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.CurveTo(156.76236f, 39.99745f, 153.84236f, 41.94662f, 152.60303f, 44.93768f),
                    PathNode.CurveTo(151.36368f, 47.928738f, 152.04936f, 51.371906f, 154.34f, 53.66f),
                    PathNode.LineTo(172.69f, 72.0f),
                    PathNode.LineTo(138.34f, 106.34f),
                    PathNode.CurveTo(135.21407f, 109.465935f, 135.21407f, 114.534065f, 138.34f, 117.66f),
                    PathNode.CurveTo(141.46593f, 120.785934f, 146.53407f, 120.785934f, 149.66f, 117.66f),
                    PathNode.LineTo(184.0f, 83.31f),
                    PathNode.LineTo(202.34f, 101.66f),
                    PathNode.CurveTo(204.6281f, 103.95064f, 208.07126f, 104.63632f, 211.06232f, 103.39698f),
                    PathNode.CurveTo(214.05338f, 102.15764f, 216.00255f, 99.237656f, 216.0f, 96.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 43.581722f, 212.41827f, 40.0f, 208.0f, 40.0f),
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
        return _arrowsOutSimple!!
    }

private var _arrowsOutSimple: ImageVector? = null
