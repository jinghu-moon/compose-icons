package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) return _sortDescending!!
        _sortDescending = phosphorFillIcon(
            name = "SortDescending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 72.0f),
                    PathNode.LineTo(112.0f, 72.0f),
                    PathNode.CurveTo(116.41828f, 72.0f, 120.0f, 75.58172f, 120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 84.41828f, 116.41828f, 88.0f, 112.0f, 88.0f),
                    PathNode.LineTo(72.0f, 88.0f),
                    PathNode.CurveTo(67.58172f, 88.0f, 64.0f, 84.41828f, 64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 75.58172f, 67.58172f, 72.0f, 72.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(124.41828f, 120.0f, 128.0f, 123.58172f, 128.0f, 128.0f),
                    PathNode.CurveTo(128.0f, 132.41827f, 124.41828f, 136.0f, 120.0f, 136.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.CurveTo(67.58172f, 136.0f, 64.0f, 132.41827f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 123.58172f, 67.58172f, 120.0f, 72.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(67.58172f, 184.0f, 64.0f, 180.41827f, 64.0f, 176.0f),
                    PathNode.CurveTo(64.0f, 171.58173f, 67.58172f, 168.0f, 72.0f, 168.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.CurveTo(172.41827f, 168.0f, 176.0f, 171.58173f, 176.0f, 176.0f),
                    PathNode.CurveTo(176.0f, 180.41827f, 172.41827f, 184.0f, 168.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(197.66f, 101.66f),
                    PathNode.CurveTo(196.15945f, 103.16222f, 194.12328f, 104.006294f, 192.0f, 104.006294f),
                    PathNode.CurveTo(189.87672f, 104.006294f, 187.84055f, 103.16222f, 186.34f, 101.66f),
                    PathNode.LineTo(176.0f, 91.31f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.CurveTo(176.0f, 140.41827f, 172.41827f, 144.0f, 168.0f, 144.0f),
                    PathNode.CurveTo(163.58173f, 144.0f, 160.0f, 140.41827f, 160.0f, 136.0f),
                    PathNode.LineTo(160.0f, 91.31f),
                    PathNode.LineTo(149.66f, 101.66f),
                    PathNode.CurveTo(146.53407f, 104.785934f, 141.46593f, 104.785934f, 138.34f, 101.66f),
                    PathNode.CurveTo(135.21407f, 98.534065f, 135.21407f, 93.465935f, 138.34f, 90.34f),
                    PathNode.LineTo(162.34f, 66.34f),
                    PathNode.CurveTo(163.84055f, 64.83778f, 165.87672f, 63.993706f, 168.0f, 63.993706f),
                    PathNode.CurveTo(170.12328f, 63.993706f, 172.15945f, 64.83778f, 173.66f, 66.34f),
                    PathNode.LineTo(197.66f, 90.34f),
                    PathNode.CurveTo(199.16223f, 91.840546f, 200.00629f, 93.876724f, 200.00629f, 96.0f),
                    PathNode.CurveTo(200.00629f, 98.123276f, 199.16223f, 100.159454f, 197.66f, 101.66f),
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
        return _sortDescending!!
    }

private var _sortDescending: ImageVector? = null
