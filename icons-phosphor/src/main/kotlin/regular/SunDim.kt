package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SunDim: ImageVector
    get() {
        if (_sunDim != null) return _sunDim!!
        _sunDim = phosphorRegularIcon(
            name = "SunDim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.CurveTo(120.0f, 27.581722f, 123.58172f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(132.41827f, 24.0f, 136.0f, 27.581722f, 136.0f, 32.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.CurveTo(136.0f, 44.418278f, 132.41827f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(123.58172f, 48.0f, 120.0f, 44.418278f, 120.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 163.34622f, 163.34622f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(92.65378f, 192.0f, 64.0f, 163.34622f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 92.65378f, 92.65378f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(163.33023f, 64.03858f, 191.96143f, 92.66977f, 192.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 101.49033f, 154.50967f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(101.49033f, 80.0f, 80.0f, 101.49033f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 154.50967f, 101.49033f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(154.49825f, 175.97244f, 175.97244f, 154.49825f, 176.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(58.34f, 69.66f),
                    PathNode.CurveTo(61.46593f, 72.785934f, 66.534065f, 72.785934f, 69.66f, 69.66f),
                    PathNode.CurveTo(72.785934f, 66.534065f, 72.785934f, 61.46593f, 69.66f, 58.34f),
                    PathNode.LineTo(61.66f, 50.34f),
                    PathNode.CurveTo(58.53407f, 47.21407f, 53.46593f, 47.21407f, 50.34f, 50.34f),
                    PathNode.CurveTo(47.21407f, 53.46593f, 47.21407f, 58.53407f, 50.34f, 61.66f),
                    PathNode.Close,
                    PathNode.MoveTo(58.34f, 186.34f),
                    PathNode.LineTo(50.34f, 194.34f),
                    PathNode.CurveTo(47.21407f, 197.46593f, 47.21407f, 202.53407f, 50.34f, 205.66f),
                    PathNode.CurveTo(53.46593f, 208.78593f, 58.53407f, 208.78593f, 61.66f, 205.66f),
                    PathNode.LineTo(69.66f, 197.66f),
                    PathNode.CurveTo(72.785934f, 194.53407f, 72.785934f, 189.46593f, 69.66f, 186.34f),
                    PathNode.CurveTo(66.534065f, 183.21407f, 61.46593f, 183.21407f, 58.34f, 186.34f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 72.0f),
                    PathNode.CurveTo(194.12238f, 72.00167f, 196.15842f, 71.15991f, 197.66f, 69.66f),
                    PathNode.LineTo(205.66f, 61.66f),
                    PathNode.CurveTo(208.78593f, 58.53407f, 208.78593f, 53.46593f, 205.66f, 50.34f),
                    PathNode.CurveTo(202.53407f, 47.21407f, 197.46593f, 47.21407f, 194.34f, 50.34f),
                    PathNode.LineTo(186.34f, 58.34f),
                    PathNode.CurveTo(184.04936f, 60.628094f, 183.36368f, 64.07126f, 184.60303f, 67.062325f),
                    PathNode.CurveTo(185.84236f, 70.05338f, 188.76236f, 72.00255f, 192.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(197.66f, 186.34f),
                    PathNode.CurveTo(194.53407f, 183.21407f, 189.46593f, 183.21407f, 186.34f, 186.34f),
                    PathNode.CurveTo(183.21407f, 189.46593f, 183.21407f, 194.53407f, 186.34f, 197.66f),
                    PathNode.LineTo(194.34f, 205.66f),
                    PathNode.CurveTo(197.46593f, 208.78593f, 202.53407f, 208.78593f, 205.66f, 205.66f),
                    PathNode.CurveTo(208.78593f, 202.53407f, 208.78593f, 197.46593f, 205.66f, 194.34f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 120.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.CurveTo(27.581722f, 120.0f, 24.0f, 123.58172f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 132.41827f, 27.581722f, 136.0f, 32.0f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(44.418278f, 136.0f, 48.0f, 132.41827f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 123.58172f, 44.418278f, 120.0f, 40.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(123.58172f, 208.0f, 120.0f, 211.58173f, 120.0f, 216.0f),
                    PathNode.LineTo(120.0f, 224.0f),
                    PathNode.CurveTo(120.0f, 228.41827f, 123.58172f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(132.41827f, 232.0f, 136.0f, 228.41827f, 136.0f, 224.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.CurveTo(136.0f, 211.58173f, 132.41827f, 208.0f, 128.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(211.58173f, 120.0f, 208.0f, 123.58172f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 132.41827f, 211.58173f, 136.0f, 216.0f, 136.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.CurveTo(228.41827f, 136.0f, 232.0f, 132.41827f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 123.58172f, 228.41827f, 120.0f, 224.0f, 120.0f),
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
        return _sunDim!!
    }

private var _sunDim: ImageVector? = null
