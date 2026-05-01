package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorRegularIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 61.66f),
                    PathNode.LineTo(61.66f, 205.66f),
                    PathNode.CurveTo(58.53407f, 208.78593f, 53.46593f, 208.78593f, 50.34f, 205.66f),
                    PathNode.CurveTo(47.21407f, 202.53407f, 47.21407f, 197.46593f, 50.34f, 194.34f),
                    PathNode.LineTo(194.34f, 50.34f),
                    PathNode.CurveTo(197.46593f, 47.21407f, 202.53407f, 47.21407f, 205.66f, 50.34f),
                    PathNode.CurveTo(208.78593f, 53.46593f, 208.78593f, 58.53407f, 205.66f, 61.66f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 112.0f),
                    PathNode.CurveTo(64.0f, 116.41828f, 67.58172f, 120.0f, 72.0f, 120.0f),
                    PathNode.CurveTo(76.41828f, 120.0f, 80.0f, 116.41828f, 80.0f, 112.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.CurveTo(116.41828f, 80.0f, 120.0f, 76.41828f, 120.0f, 72.0f),
                    PathNode.CurveTo(120.0f, 67.58172f, 116.41828f, 64.0f, 112.0f, 64.0f),
                    PathNode.LineTo(80.0f, 64.0f),
                    PathNode.LineTo(80.0f, 32.0f),
                    PathNode.CurveTo(80.0f, 27.581722f, 76.41828f, 24.0f, 72.0f, 24.0f),
                    PathNode.CurveTo(67.58172f, 24.0f, 64.0f, 27.581722f, 64.0f, 32.0f),
                    PathNode.LineTo(64.0f, 64.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.CurveTo(27.581722f, 64.0f, 24.0f, 67.58172f, 24.0f, 72.0f),
                    PathNode.CurveTo(24.0f, 76.41828f, 27.581722f, 80.0f, 32.0f, 80.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 176.0f),
                    PathNode.LineTo(144.0f, 176.0f),
                    PathNode.CurveTo(139.58173f, 176.0f, 136.0f, 179.58173f, 136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 188.41827f, 139.58173f, 192.0f, 144.0f, 192.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(228.41827f, 192.0f, 232.0f, 188.41827f, 232.0f, 184.0f),
                    PathNode.CurveTo(232.0f, 179.58173f, 228.41827f, 176.0f, 224.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
