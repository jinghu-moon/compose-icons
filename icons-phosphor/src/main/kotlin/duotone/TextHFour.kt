package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorDuotoneIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 72.0f),
                    PathNode.LineTo(248.0f, 192.0f),
                    PathNode.CurveTo(248.0f, 200.83656f, 240.83656f, 208.0f, 232.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(47.163445f, 208.0f, 40.0f, 200.83656f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(240.83656f, 56.0f, 248.0f, 63.163445f, 248.0f, 72.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 56.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.CurveTo(152.0f, 180.41827f, 148.41827f, 184.0f, 144.0f, 184.0f),
                    PathNode.CurveTo(139.58173f, 184.0f, 136.0f, 180.41827f, 136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 124.0f),
                    PathNode.LineTo(48.0f, 124.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.CurveTo(48.0f, 180.41827f, 44.418278f, 184.0f, 40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 180.41827f, 32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.CurveTo(44.418278f, 48.0f, 48.0f, 51.581722f, 48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 108.0f),
                    PathNode.LineTo(136.0f, 108.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.CurveTo(136.0f, 51.581722f, 139.58173f, 48.0f, 144.0f, 48.0f),
                    PathNode.CurveTo(148.41827f, 48.0f, 152.0f, 51.581722f, 152.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(256.0f, 184.0f),
                    PathNode.CurveTo(256.0f, 188.41827f, 252.41827f, 192.0f, 248.0f, 192.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(240.0f, 212.41827f, 236.41827f, 216.0f, 232.0f, 216.0f),
                    PathNode.CurveTo(227.58173f, 216.0f, 224.0f, 212.41827f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.CurveTo(172.94597f, 191.99771f, 170.15968f, 190.25682f, 168.81859f, 187.51299f),
                    PathNode.CurveTo(167.4775f, 184.76915f, 167.81558f, 181.50114f, 169.69f, 179.09f),
                    PathNode.LineTo(225.69f, 107.09f),
                    PathNode.CurveTo(227.78911f, 104.39659f, 231.36642f, 103.3325f, 234.59636f, 104.44074f),
                    PathNode.CurveTo(237.8263f, 105.54899f, 239.9967f, 108.58522f, 240.0f, 112.0f),
                    PathNode.LineTo(240.0f, 176.0f),
                    PathNode.LineTo(248.0f, 176.0f),
                    PathNode.CurveTo(252.41827f, 176.0f, 256.0f, 179.58173f, 256.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 135.32f),
                    PathNode.LineTo(192.36f, 176.0f),
                    PathNode.LineTo(224.0f, 176.0f),
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
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
