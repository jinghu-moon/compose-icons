package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorFillIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 152.0f),
                    PathNode.CurveTo(192.0f, 160.83656f, 184.83656f, 168.0f, 176.0f, 168.0f),
                    PathNode.CurveTo(167.16344f, 168.0f, 160.0f, 160.83656f, 160.0f, 152.0f),
                    PathNode.CurveTo(160.0f, 143.16344f, 167.16344f, 136.0f, 176.0f, 136.0f),
                    PathNode.CurveTo(184.83656f, 136.0f, 192.0f, 143.16344f, 192.0f, 152.0f),
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
                    PathNode.MoveTo(208.0f, 152.0f),
                    PathNode.CurveTo(208.0f, 134.32689f, 193.67311f, 120.0f, 176.0f, 120.0f),
                    PathNode.LineTo(187.55f, 100.0f),
                    PathNode.CurveTo(189.75914f, 96.17267f, 188.44733f, 91.27914f, 184.62f, 89.07f),
                    PathNode.CurveTo(180.79266f, 86.86086f, 175.89914f, 88.17267f, 173.69f, 92.0f),
                    PathNode.LineTo(148.29f, 136.0f),
                    PathNode.LineTo(148.15f, 136.27f),
                    PathNode.CurveTo(141.53935f, 147.9519f, 142.92175f, 162.51788f, 151.61194f, 172.74765f),
                    PathNode.CurveTo(160.30212f, 182.9774f, 174.45297f, 186.69658f, 187.04997f, 182.0616f),
                    PathNode.CurveTo(199.64696f, 177.4266f, 208.01257f, 165.42264f, 208.0f, 152.0f),
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
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
