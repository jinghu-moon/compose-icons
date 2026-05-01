package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorThinIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(171.17f, 84.82f),
                    PathNode.CurveTo(165.42273f, 46.1627f, 131.2937f, 18.16626f, 92.25879f, 20.088215f),
                    PathNode.CurveTo(53.22388f, 22.01017f, 22.01017f, 53.22388f, 20.088215f, 92.25879f),
                    PathNode.CurveTo(18.16626f, 131.2937f, 46.1627f, 165.42273f, 84.82f, 171.17f),
                    PathNode.CurveTo(90.56728f, 209.8273f, 124.696304f, 237.82375f, 163.73122f, 235.90178f),
                    PathNode.CurveTo(202.76611f, 233.97983f, 233.97983f, 202.76611f, 235.90178f, 163.73122f),
                    PathNode.CurveTo(237.82375f, 124.696304f, 209.8273f, 90.56728f, 171.17f, 84.82f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 160.0f),
                    PathNode.CurveTo(227.99539f, 164.38724f, 227.57011f, 168.76395f, 226.73f, 173.07f),
                    PathNode.LineTo(169.39f, 115.73f),
                    PathNode.CurveTo(171.12106f, 109.296165f, 171.9986f, 102.66264f, 172.0f, 96.0f),
                    PathNode.CurveTo(172.0f, 95.0f, 172.0f, 94.0f, 171.93f, 93.06f),
                    PathNode.CurveTo(204.41577f, 98.76212f, 228.08308f, 127.0177f, 228.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.81f, 152.46f),
                    PathNode.LineTo(205.14f, 210.8f),
                    PathNode.CurveTo(198.39857f, 216.79764f, 190.53308f, 221.3966f, 182.0f, 224.33f),
                    PathNode.LineTo(124.22f, 166.55f),
                    PathNode.CurveTo(132.51709f, 163.2126f, 140.16331f, 158.44345f, 146.81f, 152.46f),
                    PathNode.Close,
                    PathNode.MoveTo(152.46f, 146.81f),
                    PathNode.CurveTo(158.44443f, 140.16032f, 163.21364f, 132.51064f, 166.55f, 124.21f),
                    PathNode.LineTo(224.33f, 182.0f),
                    PathNode.CurveTo(221.3978f, 190.53662f, 216.79877f, 198.40562f, 210.8f, 205.15f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 96.0f),
                    PathNode.CurveTo(28.0f, 58.444637f, 58.444637f, 28.0f, 96.0f, 28.0f),
                    PathNode.CurveTo(133.55536f, 28.0f, 164.0f, 58.444637f, 164.0f, 96.0f),
                    PathNode.CurveTo(164.0f, 133.55536f, 133.55536f, 164.0f, 96.0f, 164.0f),
                    PathNode.CurveTo(58.460632f, 163.96141f, 28.038584f, 133.53937f, 28.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(93.06f, 171.93f),
                    PathNode.CurveTo(94.06f, 171.93f, 95.06f, 172.0f, 96.0f, 172.0f),
                    PathNode.CurveTo(102.66264f, 171.9986f, 109.296165f, 171.12106f, 115.73f, 169.39f),
                    PathNode.LineTo(173.07f, 226.73f),
                    PathNode.CurveTo(168.76395f, 227.57011f, 164.38724f, 227.99539f, 160.0f, 228.0f),
                    PathNode.CurveTo(127.0177f, 228.08308f, 98.76212f, 204.41577f, 93.06f, 171.93f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _subtract!!
    }

private var _subtract: ImageVector? = null
