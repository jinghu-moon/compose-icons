package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) return _sortDescending!!
        _sortDescending = phosphorDuotoneIcon(
            name = "SortDescending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 88.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 184.83656f, 216.83656f, 192.0f, 208.0f, 192.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.LineTo(200.0f, 64.0f),
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
                    PathNode.MoveTo(40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 123.58172f, 43.581722f, 120.0f, 48.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(124.41828f, 120.0f, 128.0f, 123.58172f, 128.0f, 128.0f),
                    PathNode.CurveTo(128.0f, 132.41827f, 124.41828f, 136.0f, 120.0f, 136.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.CurveTo(43.581722f, 136.0f, 40.0f, 132.41827f, 40.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 72.0f),
                    PathNode.LineTo(104.0f, 72.0f),
                    PathNode.CurveTo(108.41828f, 72.0f, 112.0f, 68.41828f, 112.0f, 64.0f),
                    PathNode.CurveTo(112.0f, 59.581722f, 108.41828f, 56.0f, 104.0f, 56.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.CurveTo(43.581722f, 56.0f, 40.0f, 59.581722f, 40.0f, 64.0f),
                    PathNode.CurveTo(40.0f, 68.41828f, 43.581722f, 72.0f, 48.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 184.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.CurveTo(43.581722f, 184.0f, 40.0f, 187.58173f, 40.0f, 192.0f),
                    PathNode.CurveTo(40.0f, 196.41827f, 43.581722f, 200.0f, 48.0f, 200.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.CurveTo(188.41827f, 200.0f, 192.0f, 196.41827f, 192.0f, 192.0f),
                    PathNode.CurveTo(192.0f, 187.58173f, 188.41827f, 184.0f, 184.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(229.66f, 82.34f),
                    PathNode.LineTo(189.66f, 42.34f),
                    PathNode.CurveTo(188.15945f, 40.837784f, 186.12328f, 39.993706f, 184.0f, 39.993706f),
                    PathNode.CurveTo(181.87672f, 39.993706f, 179.84055f, 40.837784f, 178.34f, 42.34f),
                    PathNode.LineTo(138.34f, 82.34f),
                    PathNode.CurveTo(135.21407f, 85.465935f, 135.21407f, 90.534065f, 138.34f, 93.66f),
                    PathNode.CurveTo(141.46593f, 96.785934f, 146.53407f, 96.785934f, 149.66f, 93.66f),
                    PathNode.LineTo(176.0f, 67.31f),
                    PathNode.LineTo(176.0f, 144.0f),
                    PathNode.CurveTo(176.0f, 148.41827f, 179.58173f, 152.0f, 184.0f, 152.0f),
                    PathNode.CurveTo(188.41827f, 152.0f, 192.0f, 148.41827f, 192.0f, 144.0f),
                    PathNode.LineTo(192.0f, 67.31f),
                    PathNode.LineTo(218.34f, 93.66f),
                    PathNode.CurveTo(221.46593f, 96.785934f, 226.53407f, 96.785934f, 229.66f, 93.66f),
                    PathNode.CurveTo(232.78593f, 90.534065f, 232.78593f, 85.465935f, 229.66f, 82.34f),
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
        return _sortDescending!!
    }

private var _sortDescending: ImageVector? = null
