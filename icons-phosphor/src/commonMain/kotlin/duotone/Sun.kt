package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sun: ImageVector
    get() {
        if (_sun != null) return _sun!!
        _sun = phosphorDuotoneIcon(
            name = "Sun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 158.92795f, 158.92795f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(97.07206f, 184.0f, 72.0f, 158.92795f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 97.07206f, 97.07206f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(158.92795f, 72.0f, 184.0f, 97.07206f, 184.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 16.0f),
                    PathNode.CurveTo(120.0f, 11.581722f, 123.58172f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(132.41827f, 8.0f, 136.0f, 11.581722f, 136.0f, 16.0f),
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
                    PathNode.LineTo(53.66f, 42.34f),
                    PathNode.CurveTo(50.53407f, 39.21407f, 45.46593f, 39.21407f, 42.34f, 42.34f),
                    PathNode.CurveTo(39.21407f, 45.46593f, 39.21407f, 50.53407f, 42.34f, 53.66f),
                    PathNode.Close,
                    PathNode.MoveTo(58.34f, 186.34f),
                    PathNode.LineTo(42.34f, 202.34f),
                    PathNode.CurveTo(39.21407f, 205.46593f, 39.21407f, 210.53407f, 42.34f, 213.66f),
                    PathNode.CurveTo(45.46593f, 216.78593f, 50.53407f, 216.78593f, 53.66f, 213.66f),
                    PathNode.LineTo(69.66f, 197.66f),
                    PathNode.CurveTo(72.785934f, 194.53407f, 72.785934f, 189.46593f, 69.66f, 186.34f),
                    PathNode.CurveTo(66.534065f, 183.21407f, 61.46593f, 183.21407f, 58.34f, 186.34f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 72.0f),
                    PathNode.CurveTo(194.12238f, 72.00167f, 196.15842f, 71.15991f, 197.66f, 69.66f),
                    PathNode.LineTo(213.66f, 53.66f),
                    PathNode.CurveTo(216.78593f, 50.53407f, 216.78593f, 45.46593f, 213.66f, 42.34f),
                    PathNode.CurveTo(210.53407f, 39.21407f, 205.46593f, 39.21407f, 202.34f, 42.34f),
                    PathNode.LineTo(186.34f, 58.34f),
                    PathNode.CurveTo(184.04936f, 60.628094f, 183.36368f, 64.07126f, 184.60303f, 67.062325f),
                    PathNode.CurveTo(185.84236f, 70.05338f, 188.76236f, 72.00255f, 192.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(197.66f, 186.34f),
                    PathNode.CurveTo(194.53407f, 183.21407f, 189.46593f, 183.21407f, 186.34f, 186.34f),
                    PathNode.CurveTo(183.21407f, 189.46593f, 183.21407f, 194.53407f, 186.34f, 197.66f),
                    PathNode.LineTo(202.34f, 213.66f),
                    PathNode.CurveTo(205.46593f, 216.78593f, 210.53407f, 216.78593f, 213.66f, 213.66f),
                    PathNode.CurveTo(216.78593f, 210.53407f, 216.78593f, 205.46593f, 213.66f, 202.34f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 123.58172f, 44.418278f, 120.0f, 40.0f, 120.0f),
                    PathNode.LineTo(16.0f, 120.0f),
                    PathNode.CurveTo(11.581722f, 120.0f, 8.0f, 123.58172f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 132.41827f, 11.581722f, 136.0f, 16.0f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(44.418278f, 136.0f, 48.0f, 132.41827f, 48.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(123.58172f, 208.0f, 120.0f, 211.58173f, 120.0f, 216.0f),
                    PathNode.LineTo(120.0f, 240.0f),
                    PathNode.CurveTo(120.0f, 244.41827f, 123.58172f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(132.41827f, 248.0f, 136.0f, 244.41827f, 136.0f, 240.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.CurveTo(136.0f, 211.58173f, 132.41827f, 208.0f, 128.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(211.58173f, 120.0f, 208.0f, 123.58172f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 132.41827f, 211.58173f, 136.0f, 216.0f, 136.0f),
                    PathNode.LineTo(240.0f, 136.0f),
                    PathNode.CurveTo(244.41827f, 136.0f, 248.0f, 132.41827f, 248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 123.58172f, 244.41827f, 120.0f, 240.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sun!!
    }

private var _sun: ImageVector? = null
