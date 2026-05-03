package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) return _sortAscending!!
        _sortAscending = phosphorDuotoneIcon(
            name = "SortAscending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 80.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.LineTo(200.0f, 192.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.CurveTo(216.83656f, 64.0f, 224.0f, 71.163445f, 224.0f, 80.0f),
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
                    PathNode.MoveTo(128.0f, 128.0f),
                    PathNode.CurveTo(128.0f, 132.41827f, 124.41828f, 136.0f, 120.0f, 136.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.CurveTo(43.581722f, 136.0f, 40.0f, 132.41827f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 123.58172f, 43.581722f, 120.0f, 48.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(124.41828f, 120.0f, 128.0f, 123.58172f, 128.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 72.0f),
                    PathNode.LineTo(184.0f, 72.0f),
                    PathNode.CurveTo(188.41827f, 72.0f, 192.0f, 68.41828f, 192.0f, 64.0f),
                    PathNode.CurveTo(192.0f, 59.581722f, 188.41827f, 56.0f, 184.0f, 56.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.CurveTo(43.581722f, 56.0f, 40.0f, 59.581722f, 40.0f, 64.0f),
                    PathNode.CurveTo(40.0f, 68.41828f, 43.581722f, 72.0f, 48.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 184.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.CurveTo(43.581722f, 184.0f, 40.0f, 187.58173f, 40.0f, 192.0f),
                    PathNode.CurveTo(40.0f, 196.41827f, 43.581722f, 200.0f, 48.0f, 200.0f),
                    PathNode.LineTo(104.0f, 200.0f),
                    PathNode.CurveTo(108.41828f, 200.0f, 112.0f, 196.41827f, 112.0f, 192.0f),
                    PathNode.CurveTo(112.0f, 187.58173f, 108.41828f, 184.0f, 104.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(229.66f, 162.34f),
                    PathNode.CurveTo(228.15945f, 160.83777f, 226.12328f, 159.99371f, 224.0f, 159.99371f),
                    PathNode.CurveTo(221.87672f, 159.99371f, 219.84055f, 160.83777f, 218.34f, 162.34f),
                    PathNode.LineTo(192.0f, 188.69f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.CurveTo(192.0f, 107.58172f, 188.41827f, 104.0f, 184.0f, 104.0f),
                    PathNode.CurveTo(179.58173f, 104.0f, 176.0f, 107.58172f, 176.0f, 112.0f),
                    PathNode.LineTo(176.0f, 188.69f),
                    PathNode.LineTo(149.66f, 162.34f),
                    PathNode.CurveTo(146.53407f, 159.21407f, 141.46593f, 159.21407f, 138.34f, 162.34f),
                    PathNode.CurveTo(135.21407f, 165.46593f, 135.21407f, 170.53407f, 138.34f, 173.66f),
                    PathNode.LineTo(178.34f, 213.66f),
                    PathNode.CurveTo(179.84055f, 215.16223f, 181.87672f, 216.00629f, 184.0f, 216.00629f),
                    PathNode.CurveTo(186.12328f, 216.00629f, 188.15945f, 215.16223f, 189.66f, 213.66f),
                    PathNode.LineTo(229.66f, 173.66f),
                    PathNode.CurveTo(231.16223f, 172.15945f, 232.00629f, 170.12328f, 232.00629f, 168.0f),
                    PathNode.CurveTo(232.00629f, 165.87672f, 231.16223f, 163.84055f, 229.66f, 162.34f),
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
        return _sortAscending!!
    }

private var _sortAscending: ImageVector? = null
