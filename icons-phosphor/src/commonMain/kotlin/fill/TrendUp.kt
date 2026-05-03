package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrendUp: ImageVector
    get() {
        if (_trendUp != null) return _trendUp!!
        _trendUp = phosphorFillIcon(
            name = "TrendUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 56.0f),
                    PathNode.LineTo(240.0f, 120.0f),
                    PathNode.CurveTo(240.00255f, 123.237656f, 238.05338f, 126.15764f, 235.06232f, 127.39698f),
                    PathNode.CurveTo(232.07126f, 128.63632f, 228.6281f, 127.95064f, 226.34f, 125.66f),
                    PathNode.LineTo(200.0f, 99.31f),
                    PathNode.LineTo(141.66f, 157.66f),
                    PathNode.CurveTo(140.15945f, 159.16223f, 138.12328f, 160.00629f, 136.0f, 160.00629f),
                    PathNode.CurveTo(133.87672f, 160.00629f, 131.84055f, 159.16223f, 130.34f, 157.66f),
                    PathNode.LineTo(96.0f, 123.31f),
                    PathNode.LineTo(29.66f, 189.66f),
                    PathNode.CurveTo(26.53407f, 192.78593f, 21.46593f, 192.78593f, 18.34f, 189.66f),
                    PathNode.CurveTo(15.214068f, 186.53407f, 15.214068f, 181.46593f, 18.34f, 178.34f),
                    PathNode.LineTo(90.34f, 106.34f),
                    PathNode.CurveTo(91.840546f, 104.83778f, 93.876724f, 103.993706f, 96.0f, 103.993706f),
                    PathNode.CurveTo(98.123276f, 103.993706f, 100.159454f, 104.83778f, 101.66f, 106.34f),
                    PathNode.LineTo(136.0f, 140.69f),
                    PathNode.LineTo(188.69f, 88.0f),
                    PathNode.LineTo(162.34f, 61.66f),
                    PathNode.CurveTo(160.04936f, 59.371906f, 159.36368f, 55.928738f, 160.60303f, 52.93768f),
                    PathNode.CurveTo(161.84236f, 49.94662f, 164.76236f, 47.99745f, 168.0f, 48.0f),
                    PathNode.LineTo(232.0f, 48.0f),
                    PathNode.CurveTo(236.41827f, 48.0f, 240.0f, 51.581722f, 240.0f, 56.0f),
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
        return _trendUp!!
    }

private var _trendUp: ImageVector? = null
