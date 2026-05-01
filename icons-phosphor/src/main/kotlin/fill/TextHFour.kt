package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorFillIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.46f, 144.0f),
                    PathNode.LineTo(184.0f, 119.13f),
                    PathNode.LineTo(184.0f, 144.0f),
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
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.CurveTo(128.0f, 75.58172f, 124.41828f, 72.0f, 120.0f, 72.0f),
                    PathNode.CurveTo(115.58172f, 72.0f, 112.0f, 75.58172f, 112.0f, 80.0f),
                    PathNode.LineTo(112.0f, 112.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.LineTo(72.0f, 80.0f),
                    PathNode.CurveTo(72.0f, 75.58172f, 68.41828f, 72.0f, 64.0f, 72.0f),
                    PathNode.CurveTo(59.581722f, 72.0f, 56.0f, 75.58172f, 56.0f, 80.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.CurveTo(56.0f, 164.41827f, 59.581722f, 168.0f, 64.0f, 168.0f),
                    PathNode.CurveTo(68.41828f, 168.0f, 72.0f, 164.41827f, 72.0f, 160.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.LineTo(112.0f, 160.0f),
                    PathNode.CurveTo(112.0f, 164.41827f, 115.58172f, 168.0f, 120.0f, 168.0f),
                    PathNode.CurveTo(124.41828f, 168.0f, 128.0f, 164.41827f, 128.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 152.0f),
                    PathNode.CurveTo(212.0f, 147.58173f, 208.41827f, 144.0f, 204.0f, 144.0f),
                    PathNode.LineTo(200.0f, 144.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.CurveTo(199.99861f, 92.59037f, 197.8363f, 89.55632f, 194.61382f, 88.44231f),
                    PathNode.CurveTo(191.39128f, 87.3283f, 187.81683f, 88.37918f, 185.71f, 91.06f),
                    PathNode.LineTo(141.71f, 147.06f),
                    PathNode.CurveTo(139.8195f, 149.46811f, 139.46913f, 152.74396f, 140.80756f, 155.49742f),
                    PathNode.CurveTo(142.146f, 158.25087f, 144.93848f, 159.99902f, 148.0f, 160.0f),
                    PathNode.LineTo(184.0f, 160.0f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.CurveTo(184.0f, 180.41827f, 187.58173f, 184.0f, 192.0f, 184.0f),
                    PathNode.CurveTo(196.41827f, 184.0f, 200.0f, 180.41827f, 200.0f, 176.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.LineTo(204.0f, 160.0f),
                    PathNode.CurveTo(208.41827f, 160.0f, 212.0f, 156.41827f, 212.0f, 152.0f),
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
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
