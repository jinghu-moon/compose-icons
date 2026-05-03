package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TrendUp: ImageVector
    get() {
        if (_trendUp != null) return _trendUp!!
        _trendUp = phosphorDuotoneIcon(
            name = "TrendUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 120.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 48.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.CurveTo(164.76236f, 47.99745f, 161.84236f, 49.94662f, 160.60303f, 52.93768f),
                    PathNode.CurveTo(159.36368f, 55.928738f, 160.04936f, 59.371906f, 162.34f, 61.66f),
                    PathNode.LineTo(188.69f, 88.0f),
                    PathNode.LineTo(136.0f, 140.69f),
                    PathNode.LineTo(101.66f, 106.34f),
                    PathNode.CurveTo(100.159454f, 104.83778f, 98.123276f, 103.993706f, 96.0f, 103.993706f),
                    PathNode.CurveTo(93.876724f, 103.993706f, 91.840546f, 104.83778f, 90.34f, 106.34f),
                    PathNode.LineTo(18.34f, 178.34f),
                    PathNode.CurveTo(15.214068f, 181.46593f, 15.214068f, 186.53407f, 18.34f, 189.66f),
                    PathNode.CurveTo(21.46593f, 192.78593f, 26.53407f, 192.78593f, 29.66f, 189.66f),
                    PathNode.LineTo(96.0f, 123.31f),
                    PathNode.LineTo(130.34f, 157.66f),
                    PathNode.CurveTo(131.84055f, 159.16223f, 133.87672f, 160.00629f, 136.0f, 160.00629f),
                    PathNode.CurveTo(138.12328f, 160.00629f, 140.15945f, 159.16223f, 141.66f, 157.66f),
                    PathNode.LineTo(200.0f, 99.31f),
                    PathNode.LineTo(226.34f, 125.66f),
                    PathNode.CurveTo(228.6281f, 127.95064f, 232.07126f, 128.63632f, 235.06232f, 127.39698f),
                    PathNode.CurveTo(238.05338f, 126.15764f, 240.00255f, 123.237656f, 240.0f, 120.0f),
                    PathNode.LineTo(240.0f, 56.0f),
                    PathNode.CurveTo(240.0f, 51.581722f, 236.41827f, 48.0f, 232.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 100.69f),
                    PathNode.LineTo(187.31f, 64.0f),
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _trendUp!!
    }

private var _trendUp: ImageVector? = null
