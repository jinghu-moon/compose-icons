package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TrendDown: ImageVector
    get() {
        if (_trendDown != null) return _trendDown!!
        _trendDown = phosphorRegularIcon(
            name = "TrendDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.CurveTo(240.0f, 196.41827f, 236.41827f, 200.0f, 232.0f, 200.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.CurveTo(163.58173f, 200.0f, 160.0f, 196.41827f, 160.0f, 192.0f),
                    PathNode.CurveTo(160.0f, 187.58173f, 163.58173f, 184.0f, 168.0f, 184.0f),
                    PathNode.LineTo(212.69f, 184.0f),
                    PathNode.LineTo(136.0f, 107.31f),
                    PathNode.LineTo(101.66f, 141.66f),
                    PathNode.CurveTo(100.159454f, 143.16223f, 98.123276f, 144.00629f, 96.0f, 144.00629f),
                    PathNode.CurveTo(93.876724f, 144.00629f, 91.840546f, 143.16223f, 90.34f, 141.66f),
                    PathNode.LineTo(18.34f, 69.66f),
                    PathNode.CurveTo(15.214068f, 66.534065f, 15.214068f, 61.46593f, 18.34f, 58.34f),
                    PathNode.CurveTo(21.46593f, 55.21407f, 26.53407f, 55.21407f, 29.66f, 58.34f),
                    PathNode.LineTo(96.0f, 124.69f),
                    PathNode.LineTo(130.34f, 90.34f),
                    PathNode.CurveTo(131.84055f, 88.83778f, 133.87672f, 87.993706f, 136.0f, 87.993706f),
                    PathNode.CurveTo(138.12328f, 87.993706f, 140.15945f, 88.83778f, 141.66f, 90.34f),
                    PathNode.LineTo(224.0f, 172.69f),
                    PathNode.LineTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 123.58172f, 227.58173f, 120.0f, 232.0f, 120.0f),
                    PathNode.CurveTo(236.41827f, 120.0f, 240.0f, 123.58172f, 240.0f, 128.0f),
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
        return _trendDown!!
    }

private var _trendDown: ImageVector? = null
