package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorFillIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 112.0f),
                    PathNode.LineTo(144.0f, 112.0f),
                    PathNode.LineTo(144.0f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 72.0f),
                    PathNode.CurveTo(96.0f, 76.41828f, 99.58172f, 80.0f, 104.0f, 80.0f),
                    PathNode.CurveTo(108.41828f, 80.0f, 112.0f, 76.41828f, 112.0f, 72.0f),
                    PathNode.LineTo(128.0f, 72.0f),
                    PathNode.CurveTo(132.41827f, 72.0f, 136.0f, 68.41828f, 136.0f, 64.0f),
                    PathNode.CurveTo(136.0f, 59.581722f, 132.41827f, 56.0f, 128.0f, 56.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.CurveTo(103.163445f, 56.0f, 96.0f, 63.163445f, 96.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 112.0f),
                    PathNode.CurveTo(160.0f, 103.163445f, 152.83656f, 96.0f, 144.0f, 96.0f),
                    PathNode.LineTo(72.0f, 96.0f),
                    PathNode.CurveTo(63.163445f, 96.0f, 56.0f, 103.163445f, 56.0f, 112.0f),
                    PathNode.LineTo(56.0f, 184.0f),
                    PathNode.CurveTo(56.0f, 192.83656f, 63.163445f, 200.0f, 72.0f, 200.0f),
                    PathNode.LineTo(144.0f, 200.0f),
                    PathNode.CurveTo(152.83656f, 200.0f, 160.0f, 192.83656f, 160.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 123.58172f, 196.41827f, 120.0f, 192.0f, 120.0f),
                    PathNode.CurveTo(187.58173f, 120.0f, 184.0f, 123.58172f, 184.0f, 128.0f),
                    PathNode.LineTo(184.0f, 144.0f),
                    PathNode.CurveTo(179.58173f, 144.0f, 176.0f, 147.58173f, 176.0f, 152.0f),
                    PathNode.CurveTo(176.0f, 156.41827f, 179.58173f, 160.0f, 184.0f, 160.0f),
                    PathNode.CurveTo(192.83656f, 160.0f, 200.0f, 152.83656f, 200.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 72.0f),
                    PathNode.CurveTo(200.0f, 63.163445f, 192.83656f, 56.0f, 184.0f, 56.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(163.58173f, 56.0f, 160.0f, 59.581722f, 160.0f, 64.0f),
                    PathNode.CurveTo(160.0f, 68.41828f, 163.58173f, 72.0f, 168.0f, 72.0f),
                    PathNode.LineTo(184.0f, 72.0f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.CurveTo(184.0f, 92.41828f, 187.58173f, 96.0f, 192.0f, 96.0f),
                    PathNode.CurveTo(196.41827f, 96.0f, 200.0f, 92.41828f, 200.0f, 88.0f),
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
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
