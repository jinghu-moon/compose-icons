package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) return _sortAscending!!
        _sortAscending = phosphorFillIcon(
            name = "SortAscending",
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
                    PathNode.LineTo(168.0f, 72.0f),
                    PathNode.CurveTo(172.41827f, 72.0f, 176.0f, 75.58172f, 176.0f, 80.0f),
                    PathNode.CurveTo(176.0f, 84.41828f, 172.41827f, 88.0f, 168.0f, 88.0f),
                    PathNode.LineTo(72.0f, 88.0f),
                    PathNode.CurveTo(67.58172f, 88.0f, 64.0f, 84.41828f, 64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 75.58172f, 67.58172f, 72.0f, 72.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(67.58172f, 184.0f, 64.0f, 180.41827f, 64.0f, 176.0f),
                    PathNode.CurveTo(64.0f, 171.58173f, 67.58172f, 168.0f, 72.0f, 168.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.CurveTo(116.41828f, 168.0f, 120.0f, 171.58173f, 120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 180.41827f, 116.41828f, 184.0f, 112.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 136.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.CurveTo(67.58172f, 136.0f, 64.0f, 132.41827f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 123.58172f, 67.58172f, 120.0f, 72.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(124.41828f, 120.0f, 128.0f, 123.58172f, 128.0f, 128.0f),
                    PathNode.CurveTo(128.0f, 132.41827f, 124.41828f, 136.0f, 120.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(197.66f, 165.66f),
                    PathNode.LineTo(173.66f, 189.66f),
                    PathNode.CurveTo(172.15945f, 191.16223f, 170.12328f, 192.00629f, 168.0f, 192.00629f),
                    PathNode.CurveTo(165.87672f, 192.00629f, 163.84055f, 191.16223f, 162.34f, 189.66f),
                    PathNode.LineTo(138.34f, 165.66f),
                    PathNode.CurveTo(135.21407f, 162.53407f, 135.21407f, 157.46593f, 138.34f, 154.34f),
                    PathNode.CurveTo(141.46593f, 151.21407f, 146.53407f, 151.21407f, 149.66f, 154.34f),
                    PathNode.LineTo(160.0f, 164.69f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 115.58172f, 163.58173f, 112.0f, 168.0f, 112.0f),
                    PathNode.CurveTo(172.41827f, 112.0f, 176.0f, 115.58172f, 176.0f, 120.0f),
                    PathNode.LineTo(176.0f, 164.69f),
                    PathNode.LineTo(186.34f, 154.34f),
                    PathNode.CurveTo(189.46593f, 151.21407f, 194.53407f, 151.21407f, 197.66f, 154.34f),
                    PathNode.CurveTo(200.78593f, 157.46593f, 200.78593f, 162.53407f, 197.66f, 165.66f),
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
        return _sortAscending!!
    }

private var _sortAscending: ImageVector? = null
