package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorFillIcon(
            name = "TextTSlash",
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
                    PathNode.MoveTo(128.0f, 72.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(180.41827f, 72.0f, 184.0f, 75.58172f, 184.0f, 80.0f),
                    PathNode.LineTo(184.0f, 96.0f),
                    PathNode.CurveTo(184.0f, 100.41828f, 180.41827f, 104.0f, 176.0f, 104.0f),
                    PathNode.CurveTo(171.58173f, 104.0f, 168.0f, 100.41828f, 168.0f, 96.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.LineTo(128.0f, 88.0f),
                    PathNode.CurveTo(123.58172f, 88.0f, 120.0f, 84.41828f, 120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 75.58172f, 123.58172f, 72.0f, 128.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.27f, 198.0f),
                    PathNode.CurveTo(187.6735f, 199.3979f, 185.587f, 200.10423f, 183.46965f, 199.96358f),
                    PathNode.CurveTo(181.3523f, 199.82292f, 179.37756f, 198.8468f, 177.98f, 197.25f),
                    PathNode.LineTo(135.98f, 149.25f),
                    PathNode.LineTo(135.98f, 176.0f),
                    PathNode.LineTo(147.98f, 176.0f),
                    PathNode.CurveTo(152.39828f, 176.0f, 155.98f, 179.58173f, 155.98f, 184.0f),
                    PathNode.CurveTo(155.98f, 188.41827f, 152.39828f, 192.0f, 147.98f, 192.0f),
                    PathNode.LineTo(108.0f, 192.0f),
                    PathNode.CurveTo(103.58172f, 192.0f, 100.0f, 188.41827f, 100.0f, 184.0f),
                    PathNode.CurveTo(100.0f, 179.58173f, 103.58172f, 176.0f, 108.0f, 176.0f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.LineTo(120.0f, 131.0f),
                    PathNode.LineTo(88.0f, 94.43f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.CurveTo(88.0f, 100.41828f, 84.41828f, 104.0f, 80.0f, 104.0f),
                    PathNode.CurveTo(75.58172f, 104.0f, 72.0f, 100.41828f, 72.0f, 96.0f),
                    PathNode.LineTo(72.0f, 80.0f),
                    PathNode.CurveTo(72.00105f, 78.925285f, 72.21519f, 77.861435f, 72.63f, 76.87f),
                    PathNode.LineTo(66.0f, 69.27f),
                    PathNode.CurveTo(63.400845f, 65.928696f, 63.85457f, 61.14095f, 67.03511f, 58.34737f),
                    PathNode.CurveTo(70.21565f, 55.5538f, 75.02193f, 55.721516f, 78.0f, 58.73f),
                    PathNode.LineTo(190.0f, 186.73f),
                    PathNode.CurveTo(192.90253f, 190.04643f, 192.57611f, 195.08572f, 189.27f, 198.0f),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
