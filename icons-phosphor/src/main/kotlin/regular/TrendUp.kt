package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TrendUp: ImageVector
    get() {
        if (_trendUp != null) return _trendUp!!
        _trendUp = phosphorRegularIcon(
            name = "TrendUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 56.0f),
                    PathNode.LineTo(240.0f, 120.0f),
                    PathNode.CurveTo(240.0f, 124.41828f, 236.41827f, 128.0f, 232.0f, 128.0f),
                    PathNode.CurveTo(227.58173f, 128.0f, 224.0f, 124.41828f, 224.0f, 120.0f),
                    PathNode.LineTo(224.0f, 75.31f),
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
                    PathNode.LineTo(212.69f, 64.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.CurveTo(163.58173f, 64.0f, 160.0f, 60.418278f, 160.0f, 56.0f),
                    PathNode.CurveTo(160.0f, 51.581722f, 163.58173f, 48.0f, 168.0f, 48.0f),
                    PathNode.LineTo(232.0f, 48.0f),
                    PathNode.CurveTo(236.41827f, 48.0f, 240.0f, 51.581722f, 240.0f, 56.0f),
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
        return _trendUp!!
    }

private var _trendUp: ImageVector? = null
