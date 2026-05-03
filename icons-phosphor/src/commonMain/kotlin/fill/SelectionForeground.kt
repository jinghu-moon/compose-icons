package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionForeground: ImageVector
    get() {
        if (_selectionForeground != null) return _selectionForeground!!
        _selectionForeground = phosphorFillIcon(
            name = "SelectionForeground",
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
                    PathNode.MoveTo(88.0f, 200.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(63.163445f, 200.0f, 56.0f, 192.83656f, 56.0f, 184.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.CurveTo(56.0f, 163.58173f, 59.581722f, 160.0f, 64.0f, 160.0f),
                    PathNode.CurveTo(68.41828f, 160.0f, 72.0f, 163.58173f, 72.0f, 168.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.CurveTo(92.41828f, 184.0f, 96.0f, 187.58173f, 96.0f, 192.0f),
                    PathNode.CurveTo(96.0f, 196.41827f, 92.41828f, 200.0f, 88.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 112.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 132.41827f, 68.41828f, 136.0f, 64.0f, 136.0f),
                    PathNode.CurveTo(59.581722f, 136.0f, 56.0f, 132.41827f, 56.0f, 128.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 103.163445f, 63.163445f, 96.0f, 72.0f, 96.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.CurveTo(92.41828f, 96.0f, 96.0f, 99.58172f, 96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 108.41828f, 92.41828f, 112.0f, 88.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 184.0f),
                    PathNode.CurveTo(160.0f, 192.83656f, 152.83656f, 200.0f, 144.0f, 200.0f),
                    PathNode.LineTo(128.0f, 200.0f),
                    PathNode.CurveTo(123.58172f, 200.0f, 120.0f, 196.41827f, 120.0f, 192.0f),
                    PathNode.CurveTo(120.0f, 187.58173f, 123.58172f, 184.0f, 128.0f, 184.0f),
                    PathNode.LineTo(144.0f, 184.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.CurveTo(144.0f, 163.58173f, 147.58173f, 160.0f, 152.0f, 160.0f),
                    PathNode.CurveTo(156.41827f, 160.0f, 160.0f, 163.58173f, 160.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 132.41827f, 156.41827f, 136.0f, 152.0f, 136.0f),
                    PathNode.CurveTo(147.58173f, 136.0f, 144.0f, 132.41827f, 144.0f, 128.0f),
                    PathNode.LineTo(144.0f, 112.0f),
                    PathNode.LineTo(128.0f, 112.0f),
                    PathNode.CurveTo(123.58172f, 112.0f, 120.0f, 108.41828f, 120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 99.58172f, 123.58172f, 96.0f, 128.0f, 96.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.CurveTo(152.83656f, 96.0f, 160.0f, 103.163445f, 160.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 144.0f),
                    PathNode.CurveTo(200.0f, 152.83656f, 192.83656f, 160.0f, 184.0f, 160.0f),
                    PathNode.CurveTo(179.58173f, 160.0f, 176.0f, 156.41827f, 176.0f, 152.0f),
                    PathNode.CurveTo(176.0f, 147.58173f, 179.58173f, 144.0f, 184.0f, 144.0f),
                    PathNode.LineTo(184.0f, 144.0f),
                    PathNode.LineTo(184.0f, 72.0f),
                    PathNode.LineTo(112.0f, 72.0f),
                    PathNode.CurveTo(112.0f, 76.41828f, 108.41828f, 80.0f, 104.0f, 80.0f),
                    PathNode.CurveTo(99.58172f, 80.0f, 96.0f, 76.41828f, 96.0f, 72.0f),
                    PathNode.CurveTo(96.0f, 63.163445f, 103.163445f, 56.0f, 112.0f, 56.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(192.83656f, 56.0f, 200.0f, 63.163445f, 200.0f, 72.0f),
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
        return _selectionForeground!!
    }

private var _selectionForeground: ImageVector? = null
