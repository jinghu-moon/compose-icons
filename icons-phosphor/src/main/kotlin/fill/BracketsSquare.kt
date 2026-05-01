package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BracketsSquare: ImageVector
    get() {
        if (_bracketsSquare != null) return _bracketsSquare!!
        _bracketsSquare = phosphorFillIcon(
            name = "BracketsSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 176.0f),
                    PathNode.CurveTo(108.41828f, 176.0f, 112.0f, 179.58173f, 112.0f, 184.0f),
                    PathNode.CurveTo(112.0f, 188.41827f, 108.41828f, 192.0f, 104.0f, 192.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.CurveTo(67.58172f, 192.0f, 64.0f, 188.41827f, 64.0f, 184.0f),
                    PathNode.LineTo(64.0f, 72.0f),
                    PathNode.CurveTo(64.0f, 67.58172f, 67.58172f, 64.0f, 72.0f, 64.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.CurveTo(108.41828f, 64.0f, 112.0f, 67.58172f, 112.0f, 72.0f),
                    PathNode.CurveTo(112.0f, 76.41828f, 108.41828f, 80.0f, 104.0f, 80.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 184.0f),
                    PathNode.CurveTo(192.0f, 188.41827f, 188.41827f, 192.0f, 184.0f, 192.0f),
                    PathNode.LineTo(152.0f, 192.0f),
                    PathNode.CurveTo(147.58173f, 192.0f, 144.0f, 188.41827f, 144.0f, 184.0f),
                    PathNode.CurveTo(144.0f, 179.58173f, 147.58173f, 176.0f, 152.0f, 176.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.CurveTo(147.58173f, 80.0f, 144.0f, 76.41828f, 144.0f, 72.0f),
                    PathNode.CurveTo(144.0f, 67.58172f, 147.58173f, 64.0f, 152.0f, 64.0f),
                    PathNode.LineTo(184.0f, 64.0f),
                    PathNode.CurveTo(188.41827f, 64.0f, 192.0f, 67.58172f, 192.0f, 72.0f),
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
        return _bracketsSquare!!
    }

private var _bracketsSquare: ImageVector? = null
