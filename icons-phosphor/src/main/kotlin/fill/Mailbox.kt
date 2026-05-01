package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = phosphorFillIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 152.0f),
                    PathNode.CurveTo(104.0f, 156.41827f, 100.41828f, 160.0f, 96.0f, 160.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.CurveTo(51.581722f, 160.0f, 48.0f, 156.41827f, 48.0f, 152.0f),
                    PathNode.CurveTo(48.0f, 147.58173f, 51.581722f, 144.0f, 56.0f, 144.0f),
                    PathNode.LineTo(96.0f, 144.0f),
                    PathNode.CurveTo(100.41828f, 144.0f, 104.0f, 147.58173f, 104.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 32.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.CurveTo(196.41827f, 32.0f, 200.0f, 28.418278f, 200.0f, 24.0f),
                    PathNode.CurveTo(200.0f, 19.581722f, 196.41827f, 16.0f, 192.0f, 16.0f),
                    PathNode.LineTo(160.0f, 16.0f),
                    PathNode.CurveTo(155.58173f, 16.0f, 152.0f, 19.581722f, 152.0f, 24.0f),
                    PathNode.LineTo(152.0f, 56.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 116.0f),
                    PathNode.LineTo(240.0f, 176.0f),
                    PathNode.CurveTo(240.0f, 184.83656f, 232.83656f, 192.0f, 224.0f, 192.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.LineTo(136.0f, 224.0f),
                    PathNode.CurveTo(136.0f, 228.41827f, 132.41827f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(123.58172f, 232.0f, 120.0f, 228.41827f, 120.0f, 224.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(23.163445f, 192.0f, 16.0f, 184.83656f, 16.0f, 176.0f),
                    PathNode.LineTo(16.0f, 116.0f),
                    PathNode.CurveTo(16.038574f, 82.87891f, 42.878906f, 56.038574f, 76.0f, 56.0f),
                    PathNode.LineTo(152.0f, 56.0f),
                    PathNode.LineTo(152.0f, 144.0f),
                    PathNode.CurveTo(152.0f, 148.41827f, 155.58173f, 152.0f, 160.0f, 152.0f),
                    PathNode.CurveTo(164.41827f, 152.0f, 168.0f, 148.41827f, 168.0f, 144.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.LineTo(180.0f, 56.0f),
                    PathNode.CurveTo(213.1211f, 56.038574f, 239.96143f, 82.87891f, 240.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 116.0f),
                    PathNode.CurveTo(120.0f, 91.69947f, 100.30053f, 72.0f, 76.0f, 72.0f),
                    PathNode.CurveTo(51.69947f, 72.0f, 32.0f, 91.69947f, 32.0f, 116.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.LineTo(120.0f, 176.0f),
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
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
