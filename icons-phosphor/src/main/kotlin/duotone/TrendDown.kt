package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TrendDown: ImageVector
    get() {
        if (_trendDown != null) return _trendDown!!
        _trendDown = phosphorDuotoneIcon(
            name = "TrendDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.LineTo(168.0f, 192.0f),
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
                    PathNode.MoveTo(235.06f, 120.61f),
                    PathNode.CurveTo(232.07097f, 119.369934f, 228.62924f, 120.05276f, 226.34f, 122.34f),
                    PathNode.LineTo(200.0f, 148.69f),
                    PathNode.LineTo(141.66f, 90.34f),
                    PathNode.CurveTo(140.15945f, 88.83778f, 138.12328f, 87.993706f, 136.0f, 87.993706f),
                    PathNode.CurveTo(133.87672f, 87.993706f, 131.84055f, 88.83778f, 130.34f, 90.34f),
                    PathNode.LineTo(96.0f, 124.69f),
                    PathNode.LineTo(29.66f, 58.34f),
                    PathNode.CurveTo(26.53407f, 55.21407f, 21.46593f, 55.21407f, 18.34f, 58.34f),
                    PathNode.CurveTo(15.214068f, 61.46593f, 15.214068f, 66.534065f, 18.34f, 69.66f),
                    PathNode.LineTo(90.34f, 141.66f),
                    PathNode.CurveTo(91.840546f, 143.16223f, 93.876724f, 144.00629f, 96.0f, 144.00629f),
                    PathNode.CurveTo(98.123276f, 144.00629f, 100.159454f, 143.16223f, 101.66f, 141.66f),
                    PathNode.LineTo(136.0f, 107.31f),
                    PathNode.LineTo(188.69f, 160.0f),
                    PathNode.LineTo(162.34f, 186.34f),
                    PathNode.CurveTo(160.04936f, 188.6281f, 159.36368f, 192.07126f, 160.60303f, 195.06232f),
                    PathNode.CurveTo(161.84236f, 198.05338f, 164.76236f, 200.00255f, 168.0f, 200.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(236.41827f, 200.0f, 240.0f, 196.41827f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 128.0f),
                    PathNode.CurveTo(239.99933f, 124.76432f, 238.04962f, 121.84765f, 235.06f, 120.61f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 184.0f),
                    PathNode.LineTo(187.31f, 184.0f),
                    PathNode.LineTo(224.0f, 147.31f),
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
