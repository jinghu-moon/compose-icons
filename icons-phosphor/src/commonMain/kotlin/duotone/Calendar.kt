package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Calendar: ImageVector
    get() {
        if (_calendar != null) return _calendar!!
        _calendar = phosphorDuotoneIcon(
            name = "Calendar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(40.0f, 43.581722f, 43.581722f, 40.0f, 48.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(212.41827f, 40.0f, 216.0f, 43.581722f, 216.0f, 48.0f),
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
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(184.0f, 32.0f),
                    PathNode.LineTo(184.0f, 24.0f),
                    PathNode.CurveTo(184.0f, 19.581722f, 180.41827f, 16.0f, 176.0f, 16.0f),
                    PathNode.CurveTo(171.58173f, 16.0f, 168.0f, 19.581722f, 168.0f, 24.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.LineTo(88.0f, 32.0f),
                    PathNode.LineTo(88.0f, 24.0f),
                    PathNode.CurveTo(88.0f, 19.581722f, 84.41828f, 16.0f, 80.0f, 16.0f),
                    PathNode.CurveTo(75.58172f, 16.0f, 72.0f, 19.581722f, 72.0f, 24.0f),
                    PathNode.LineTo(72.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 48.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.CurveTo(72.0f, 60.418278f, 75.58172f, 64.0f, 80.0f, 64.0f),
                    PathNode.CurveTo(84.41828f, 64.0f, 88.0f, 60.418278f, 88.0f, 56.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(168.0f, 60.418278f, 171.58173f, 64.0f, 176.0f, 64.0f),
                    PathNode.CurveTo(180.41827f, 64.0f, 184.0f, 60.418278f, 184.0f, 56.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.LineTo(208.0f, 96.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 120.0f),
                    PathNode.LineTo(112.0f, 184.0f),
                    PathNode.CurveTo(112.0f, 188.41827f, 108.41828f, 192.0f, 104.0f, 192.0f),
                    PathNode.CurveTo(99.58172f, 192.0f, 96.0f, 188.41827f, 96.0f, 184.0f),
                    PathNode.LineTo(96.0f, 132.94f),
                    PathNode.LineTo(91.58f, 135.16f),
                    PathNode.CurveTo(87.62564f, 137.13718f, 82.81718f, 135.53436f, 80.84f, 131.58f),
                    PathNode.CurveTo(78.86282f, 127.62564f, 80.465645f, 122.81718f, 84.42f, 120.84f),
                    PathNode.LineTo(100.42f, 112.84f),
                    PathNode.CurveTo(102.90083f, 111.598595f, 105.8477f, 111.731f, 108.2072f, 113.189896f),
                    PathNode.CurveTo(110.566696f, 114.64879f, 112.00198f, 117.22591f, 112.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(171.16f, 150.45f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.LineTo(168.0f, 176.0f),
                    PathNode.CurveTo(172.41827f, 176.0f, 176.0f, 179.58173f, 176.0f, 184.0f),
                    PathNode.CurveTo(176.0f, 188.41827f, 172.41827f, 192.0f, 168.0f, 192.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.CurveTo(132.96982f, 192.0f, 130.19972f, 190.28798f, 128.84459f, 187.57771f),
                    PathNode.CurveTo(127.48945f, 184.86742f, 127.78189f, 181.62415f, 129.6f, 179.2f),
                    PathNode.LineTo(158.38f, 140.83f),
                    PathNode.CurveTo(160.16368f, 138.45541f, 160.48514f, 135.28815f, 159.2149f, 132.6036f),
                    PathNode.CurveTo(157.94467f, 129.91908f, 155.29181f, 128.15915f, 152.32463f, 128.03253f),
                    PathNode.CurveTo(149.35745f, 127.905914f, 146.56432f, 129.43344f, 145.07f, 132.0f),
                    PathNode.CurveTo(143.68213f, 134.55586f, 141.01651f, 136.15717f, 138.10826f, 136.18211f),
                    PathNode.CurveTo(135.2f, 136.20706f, 132.50731f, 134.65172f, 131.0758f, 132.12004f),
                    PathNode.CurveTo(129.64429f, 129.58838f, 129.69951f, 126.47925f, 131.22f, 124.0f),
                    PathNode.CurveTo(136.65327f, 114.59762f, 147.723f, 110.015045f, 158.21225f, 112.82592f),
                    PathNode.CurveTo(168.7015f, 115.636795f, 175.99638f, 125.14066f, 176.0f, 136.0f),
                    PathNode.CurveTo(176.01695f, 141.21742f, 174.31612f, 146.29538f, 171.16f, 150.45f),
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
        return _calendar!!
    }

private var _calendar: ImageVector? = null
