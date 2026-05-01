package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorFillIcon(
            name = "CursorText",
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
                    PathNode.MoveTo(144.0f, 120.0f),
                    PathNode.CurveTo(148.41827f, 120.0f, 152.0f, 123.58172f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 132.41827f, 148.41827f, 136.0f, 144.0f, 136.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.CurveTo(136.0f, 168.83656f, 143.16344f, 176.0f, 152.0f, 176.0f),
                    PathNode.LineTo(160.0f, 176.0f),
                    PathNode.CurveTo(164.41827f, 176.0f, 168.0f, 179.58173f, 168.0f, 184.0f),
                    PathNode.CurveTo(168.0f, 188.41827f, 164.41827f, 192.0f, 160.0f, 192.0f),
                    PathNode.LineTo(152.0f, 192.0f),
                    PathNode.CurveTo(142.80806f, 192.0013f, 134.06172f, 188.03993f, 128.0f, 181.13f),
                    PathNode.CurveTo(121.93827f, 188.03993f, 113.19194f, 192.0013f, 104.0f, 192.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(91.58172f, 192.0f, 88.0f, 188.41827f, 88.0f, 184.0f),
                    PathNode.CurveTo(88.0f, 179.58173f, 91.58172f, 176.0f, 96.0f, 176.0f),
                    PathNode.LineTo(104.0f, 176.0f),
                    PathNode.CurveTo(112.836555f, 176.0f, 120.0f, 168.83656f, 120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.CurveTo(107.58172f, 136.0f, 104.0f, 132.41827f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 123.58172f, 107.58172f, 120.0f, 112.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.CurveTo(120.0f, 87.163445f, 112.836555f, 80.0f, 104.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.CurveTo(91.58172f, 80.0f, 88.0f, 76.41828f, 88.0f, 72.0f),
                    PathNode.CurveTo(88.0f, 67.58172f, 91.58172f, 64.0f, 96.0f, 64.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.CurveTo(113.19194f, 63.998703f, 121.93827f, 67.96007f, 128.0f, 74.87f),
                    PathNode.CurveTo(134.06172f, 67.96007f, 142.80806f, 63.998703f, 152.0f, 64.0f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.CurveTo(164.41827f, 64.0f, 168.0f, 67.58172f, 168.0f, 72.0f),
                    PathNode.CurveTo(168.0f, 76.41828f, 164.41827f, 80.0f, 160.0f, 80.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.CurveTo(143.16344f, 80.0f, 136.0f, 87.163445f, 136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 120.0f),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
