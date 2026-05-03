package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorRegularIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.18f, 91.05f),
                    PathNode.CurveTo(237.10852f, 84.42353f, 230.9424f, 79.93502f, 224.0f, 80.0f),
                    PathNode.LineTo(163.0f, 80.0f),
                    PathNode.LineTo(143.23f, 19.26f),
                    PathNode.CurveTo(141.18376f, 12.573421f, 135.01613f, 8.003037f, 128.02347f, 7.991555f),
                    PathNode.CurveTo(121.0308f, 7.980072f, 114.84818f, 12.530176f, 112.78f, 19.21f),
                    PathNode.LineTo(93.06f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(25.042967f, 79.98143f, 18.87126f, 84.46061f, 16.732288f, 91.08069f),
                    PathNode.CurveTo(14.593319f, 97.70077f, 16.977365f, 104.94434f, 22.63f, 109.0f),
                    PathNode.LineTo(72.09f, 144.58f),
                    PathNode.LineTo(53.15f, 203.0f),
                    PathNode.CurveTo(50.935394f, 209.5979f, 53.313747f, 216.86711f, 59.0f, 220.88f),
                    PathNode.CurveTo(64.57227f, 225.0186f, 72.19773f, 225.0186f, 77.77f, 220.88f),
                    PathNode.LineTo(128.0f, 184.75f),
                    PathNode.LineTo(178.23f, 220.88f),
                    PathNode.CurveTo(183.83655f, 224.94972f, 191.42538f, 224.94885f, 197.031f, 220.87784f),
                    PathNode.CurveTo(202.63663f, 216.80681f, 204.9854f, 209.5906f, 202.85f, 203.0f),
                    PathNode.LineTo(183.85f, 144.54f),
                    PathNode.LineTo(233.34f, 108.93f),
                    PathNode.CurveTo(239.02534f, 104.91643f, 241.40015f, 97.645676f, 239.18f, 91.05f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 24.15f),
                    PathNode.LineTo(146.12f, 80.0f),
                    PathNode.LineTo(109.88f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 96.0f),
                    PathNode.LineTo(87.87f, 96.0f),
                    PathNode.LineTo(77.3f, 128.56f),
                    PathNode.Close,
                    PathNode.MoveTo(68.34f, 208.0f),
                    PathNode.LineTo(68.34f, 208.0f),
                    PathNode.LineTo(85.73f, 154.41f),
                    PathNode.LineTo(114.27f, 174.95f),
                    PathNode.Close,
                    PathNode.MoveTo(90.91f, 138.43f),
                    PathNode.LineTo(104.69f, 96.0f),
                    PathNode.LineTo(151.31f, 96.0f),
                    PathNode.LineTo(165.06f, 138.38f),
                    PathNode.LineTo(128.0f, 165.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.6f, 208.0f),
                    PathNode.LineTo(187.6f, 208.0f),
                    PathNode.LineTo(141.7f, 175.0f),
                    PathNode.LineTo(170.24f, 154.46f),
                    PathNode.Close,
                    PathNode.MoveTo(178.67f, 128.62f),
                    PathNode.LineTo(168.13f, 96.0f),
                    PathNode.LineTo(224.0f, 96.0f),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
