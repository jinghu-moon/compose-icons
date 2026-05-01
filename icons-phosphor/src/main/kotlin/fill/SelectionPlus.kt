package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionPlus: ImageVector
    get() {
        if (_selectionPlus != null) return _selectionPlus!!
        _selectionPlus = phosphorFillIcon(
            name = "SelectionPlus",
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
                    PathNode.MoveTo(56.0f, 72.0f),
                    PathNode.CurveTo(56.0f, 63.163445f, 63.163445f, 56.0f, 72.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(100.41828f, 56.0f, 104.0f, 59.581722f, 104.0f, 64.0f),
                    PathNode.CurveTo(104.0f, 68.41828f, 100.41828f, 72.0f, 96.0f, 72.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.LineTo(72.0f, 96.0f),
                    PathNode.CurveTo(72.0f, 100.41828f, 68.41828f, 104.0f, 64.0f, 104.0f),
                    PathNode.CurveTo(59.581722f, 104.0f, 56.0f, 100.41828f, 56.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(63.163445f, 184.0f, 56.0f, 176.83656f, 56.0f, 168.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(56.0f, 131.58173f, 59.581722f, 128.0f, 64.0f, 128.0f),
                    PathNode.CurveTo(68.41828f, 128.0f, 72.0f, 131.58173f, 72.0f, 136.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.CurveTo(116.41828f, 168.0f, 120.0f, 171.58173f, 120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 180.41827f, 116.41828f, 184.0f, 112.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 64.0f),
                    PathNode.CurveTo(128.0f, 59.581722f, 131.58173f, 56.0f, 136.0f, 56.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(176.83656f, 56.0f, 184.0f, 63.163445f, 184.0f, 72.0f),
                    PathNode.LineTo(184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 116.41828f, 180.41827f, 120.0f, 176.0f, 120.0f),
                    PathNode.CurveTo(171.58173f, 120.0f, 168.0f, 116.41828f, 168.0f, 112.0f),
                    PathNode.LineTo(168.0f, 72.0f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.CurveTo(131.58173f, 72.0f, 128.0f, 68.41828f, 128.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 184.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.CurveTo(184.0f, 204.41827f, 180.41827f, 208.0f, 176.0f, 208.0f),
                    PathNode.CurveTo(171.58173f, 208.0f, 168.0f, 204.41827f, 168.0f, 200.0f),
                    PathNode.LineTo(168.0f, 184.0f),
                    PathNode.LineTo(152.0f, 184.0f),
                    PathNode.CurveTo(147.58173f, 184.0f, 144.0f, 180.41827f, 144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 171.58173f, 147.58173f, 168.0f, 152.0f, 168.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 147.58173f, 171.58173f, 144.0f, 176.0f, 144.0f),
                    PathNode.CurveTo(180.41827f, 144.0f, 184.0f, 147.58173f, 184.0f, 152.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.CurveTo(204.41827f, 168.0f, 208.0f, 171.58173f, 208.0f, 176.0f),
                    PathNode.CurveTo(208.0f, 180.41827f, 204.41827f, 184.0f, 200.0f, 184.0f),
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
        return _selectionPlus!!
    }

private var _selectionPlus: ImageVector? = null
