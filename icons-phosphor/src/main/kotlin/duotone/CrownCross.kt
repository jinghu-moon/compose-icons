package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CrownCross: ImageVector
    get() {
        if (_crownCross != null) return _crownCross!!
        _crownCross = phosphorDuotoneIcon(
            name = "CrownCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 116.0f),
                    PathNode.CurveTo(232.0f, 168.0f, 184.0f, 184.0f, 184.0f, 184.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.CurveTo(184.0f, 212.41827f, 180.41827f, 216.0f, 176.0f, 216.0f),
                    PathNode.LineTo(80.0f, 216.0f),
                    PathNode.CurveTo(75.58172f, 216.0f, 72.0f, 212.41827f, 72.0f, 208.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(72.0f, 184.0f, 24.0f, 168.0f, 24.0f, 116.0f),
                    PathNode.CurveTo(24.0f, 87.2812f, 47.281193f, 64.0f, 76.0f, 64.0f),
                    PathNode.CurveTo(104.72f, 64.0f, 128.0f, 83.28f, 128.0f, 112.0f),
                    PathNode.CurveTo(128.0f, 83.28f, 151.28f, 64.0f, 180.0f, 64.0f),
                    PathNode.CurveTo(208.71881f, 64.0f, 232.0f, 87.2812f, 232.0f, 116.0f),
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
                    PathNode.MoveTo(180.0f, 56.0f),
                    PathNode.CurveTo(162.26f, 56.0f, 146.79f, 62.48f, 136.0f, 73.16f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(156.41827f, 40.0f, 160.0f, 36.418278f, 160.0f, 32.0f),
                    PathNode.CurveTo(160.0f, 27.581722f, 156.41827f, 24.0f, 152.0f, 24.0f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.LineTo(136.0f, 8.0f),
                    PathNode.CurveTo(136.0f, 3.581722f, 132.41827f, 0f, 128.0f, 0f),
                    PathNode.CurveTo(123.58172f, 0f, 120.0f, 3.581722f, 120.0f, 8.0f),
                    PathNode.LineTo(120.0f, 24.0f),
                    PathNode.LineTo(104.0f, 24.0f),
                    PathNode.CurveTo(99.58172f, 24.0f, 96.0f, 27.581722f, 96.0f, 32.0f),
                    PathNode.CurveTo(96.0f, 36.418278f, 99.58172f, 40.0f, 104.0f, 40.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 73.16f),
                    PathNode.CurveTo(109.21f, 62.48f, 93.74f, 56.0f, 76.0f, 56.0f),
                    PathNode.CurveTo(42.878906f, 56.038574f, 16.038574f, 82.87891f, 16.0f, 116.0f),
                    PathNode.CurveTo(16.0f, 145.86f, 30.54f, 164.85f, 42.73f, 175.52f),
                    PathNode.CurveTo(49.135902f, 181.10255f, 56.296246f, 185.75493f, 64.0f, 189.34f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.CurveTo(64.0f, 216.83656f, 71.163445f, 224.0f, 80.0f, 224.0f),
                    PathNode.LineTo(176.0f, 224.0f),
                    PathNode.CurveTo(184.83656f, 224.0f, 192.0f, 216.83656f, 192.0f, 208.0f),
                    PathNode.LineTo(192.0f, 189.34f),
                    PathNode.CurveTo(199.70375f, 185.75493f, 206.8641f, 181.10255f, 213.27f, 175.52f),
                    PathNode.CurveTo(225.46f, 164.85f, 240.0f, 145.86f, 240.0f, 116.0f),
                    PathNode.CurveTo(239.96143f, 82.87891f, 213.1211f, 56.038574f, 180.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.47f, 176.41f),
                    PathNode.CurveTo(178.20314f, 177.49904f, 175.99974f, 180.55641f, 176.0f, 184.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(80.00025f, 180.55641f, 77.79686f, 177.49904f, 74.53f, 176.41f),
                    PathNode.CurveTo(74.1f, 176.27f, 32.0f, 161.7f, 32.0f, 116.0f),
                    PathNode.CurveTo(32.027554f, 91.71089f, 51.71089f, 72.02756f, 76.0f, 72.0f),
                    PathNode.CurveTo(101.5f, 72.0f, 120.0f, 88.82f, 120.0f, 112.0f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 180.41827f, 123.58172f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(132.41827f, 184.0f, 136.0f, 180.41827f, 136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.CurveTo(136.0f, 88.82f, 154.5f, 72.0f, 180.0f, 72.0f),
                    PathNode.CurveTo(204.28911f, 72.02756f, 223.97244f, 91.71089f, 224.0f, 116.0f),
                    PathNode.CurveTo(224.0f, 161.4f, 183.18f, 175.83f, 181.47f, 176.41f),
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
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
