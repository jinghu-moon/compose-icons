package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionSlash: ImageVector
    get() {
        if (_selectionSlash != null) return _selectionSlash!!
        _selectionSlash = phosphorFillIcon(
            name = "SelectionSlash",
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
                    PathNode.MoveTo(152.0f, 56.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(192.83656f, 56.0f, 200.0f, 63.163445f, 200.0f, 72.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.CurveTo(200.0f, 108.41828f, 196.41827f, 112.0f, 192.0f, 112.0f),
                    PathNode.CurveTo(187.58173f, 112.0f, 184.0f, 108.41828f, 184.0f, 104.0f),
                    PathNode.LineTo(184.0f, 72.0f),
                    PathNode.LineTo(152.0f, 72.0f),
                    PathNode.CurveTo(147.58173f, 72.0f, 144.0f, 68.41828f, 144.0f, 64.0f),
                    PathNode.CurveTo(144.0f, 59.581722f, 147.58173f, 56.0f, 152.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 200.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(63.163445f, 200.0f, 56.0f, 192.83656f, 56.0f, 184.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.CurveTo(56.0f, 147.58173f, 59.581722f, 144.0f, 64.0f, 144.0f),
                    PathNode.CurveTo(68.41828f, 144.0f, 72.0f, 147.58173f, 72.0f, 152.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.LineTo(104.0f, 184.0f),
                    PathNode.CurveTo(108.41828f, 184.0f, 112.0f, 187.58173f, 112.0f, 192.0f),
                    PathNode.CurveTo(112.0f, 196.41827f, 108.41828f, 200.0f, 104.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.66f, 205.66f),
                    PathNode.CurveTo(204.15945f, 207.16223f, 202.12328f, 208.00629f, 200.0f, 208.00629f),
                    PathNode.CurveTo(197.87672f, 208.00629f, 195.84055f, 207.16223f, 194.34f, 205.66f),
                    PathNode.LineTo(188.69f, 200.0f),
                    PathNode.LineTo(152.0f, 200.0f),
                    PathNode.CurveTo(147.58173f, 200.0f, 144.0f, 196.41827f, 144.0f, 192.0f),
                    PathNode.CurveTo(144.0f, 187.58173f, 147.58173f, 184.0f, 152.0f, 184.0f),
                    PathNode.LineTo(172.69f, 184.0f),
                    PathNode.LineTo(72.0f, 83.31f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.CurveTo(72.0f, 108.41828f, 68.41828f, 112.0f, 64.0f, 112.0f),
                    PathNode.CurveTo(59.581722f, 112.0f, 56.0f, 108.41828f, 56.0f, 104.0f),
                    PathNode.LineTo(56.0f, 67.31f),
                    PathNode.LineTo(50.34f, 61.66f),
                    PathNode.CurveTo(47.21407f, 58.53407f, 47.21407f, 53.46593f, 50.34f, 50.34f),
                    PathNode.CurveTo(53.46593f, 47.21407f, 58.53407f, 47.21407f, 61.66f, 50.34f),
                    PathNode.LineTo(69.66f, 58.34f),
                    PathNode.LineTo(69.66f, 58.34f),
                    PathNode.LineTo(205.66f, 194.34f),
                    PathNode.CurveTo(207.16223f, 195.84055f, 208.00629f, 197.87672f, 208.00629f, 200.0f),
                    PathNode.CurveTo(208.00629f, 202.12328f, 207.16223f, 204.15945f, 205.66f, 205.66f),
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
        return _selectionSlash!!
    }

private var _selectionSlash: ImageVector? = null
