package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorFillIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 200.0f),
                    PathNode.CurveTo(136.0f, 204.41827f, 132.41827f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(123.58172f, 208.0f, 120.0f, 204.41827f, 120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.CurveTo(120.0f, 155.58173f, 123.58172f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(132.41827f, 152.0f, 136.0f, 155.58173f, 136.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 120.0f),
                    PathNode.LineTo(147.31f, 120.0f),
                    PathNode.LineTo(173.66f, 146.34f),
                    PathNode.CurveTo(176.78593f, 149.46593f, 176.78593f, 154.53407f, 173.66f, 157.66f),
                    PathNode.CurveTo(170.53407f, 160.78593f, 165.46593f, 160.78593f, 162.34f, 157.66f),
                    PathNode.LineTo(128.0f, 123.31f),
                    PathNode.LineTo(93.66f, 157.66f),
                    PathNode.CurveTo(90.534065f, 160.78593f, 85.465935f, 160.78593f, 82.34f, 157.66f),
                    PathNode.CurveTo(79.214066f, 154.53407f, 79.214066f, 149.46593f, 82.34f, 146.34f),
                    PathNode.LineTo(108.69f, 120.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.CurveTo(67.58172f, 120.0f, 64.0f, 116.41828f, 64.0f, 112.0f),
                    PathNode.CurveTo(64.0f, 107.58172f, 67.58172f, 104.0f, 72.0f, 104.0f),
                    PathNode.LineTo(108.69f, 104.0f),
                    PathNode.LineTo(82.34f, 77.66f),
                    PathNode.CurveTo(79.214066f, 74.534065f, 79.214066f, 69.465935f, 82.34f, 66.34f),
                    PathNode.CurveTo(85.465935f, 63.21407f, 90.534065f, 63.21407f, 93.66f, 66.34f),
                    PathNode.LineTo(120.0f, 92.69f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.CurveTo(120.0f, 51.581722f, 123.58172f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(132.41827f, 48.0f, 136.0f, 51.581722f, 136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 92.69f),
                    PathNode.LineTo(162.34f, 66.34f),
                    PathNode.CurveTo(165.46593f, 63.21407f, 170.53407f, 63.21407f, 173.66f, 66.34f),
                    PathNode.CurveTo(176.78593f, 69.465935f, 176.78593f, 74.534065f, 173.66f, 77.66f),
                    PathNode.LineTo(147.31f, 104.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.CurveTo(188.41827f, 104.0f, 192.0f, 107.58172f, 192.0f, 112.0f),
                    PathNode.CurveTo(192.0f, 116.41828f, 188.41827f, 120.0f, 184.0f, 120.0f),
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
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
