package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorFillIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 156.0f),
                    PathNode.CurveTo(200.0f, 162.5f, 192.67f, 168.0f, 184.0f, 168.0f),
                    PathNode.CurveTo(175.33f, 168.0f, 168.0f, 162.5f, 168.0f, 156.0f),
                    PathNode.CurveTo(168.0f, 149.5f, 175.33f, 144.0f, 184.0f, 144.0f),
                    PathNode.CurveTo(192.67f, 144.0f, 200.0f, 149.5f, 200.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(143.37f, 172.88f),
                    PathNode.LineTo(99.37f, 68.88f),
                    PathNode.CurveTo(98.119125f, 65.91739f, 95.21586f, 63.991768f, 92.0f, 63.991768f),
                    PathNode.CurveTo(88.78414f, 63.991768f, 85.880875f, 65.91739f, 84.63f, 68.88f),
                    PathNode.LineTo(40.63f, 172.88f),
                    PathNode.CurveTo(38.90687f, 176.95033f, 40.80966f, 181.64687f, 44.88f, 183.37f),
                    PathNode.CurveTo(48.95034f, 185.09312f, 53.64687f, 183.19034f, 55.37f, 179.12f),
                    PathNode.LineTo(66.84f, 152.0f),
                    PathNode.LineTo(117.16f, 152.0f),
                    PathNode.LineTo(128.63f, 179.12f),
                    PathNode.CurveTo(130.35313f, 183.19034f, 135.04967f, 185.09312f, 139.12f, 183.37f),
                    PathNode.CurveTo(143.19034f, 181.64687f, 145.09312f, 176.95033f, 143.37f, 172.88f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 124.0f),
                    PathNode.CurveTo(216.0f, 108.56f, 201.64f, 96.0f, 184.0f, 96.0f),
                    PathNode.CurveTo(176.53685f, 95.94481f, 169.25299f, 98.28629f, 163.22f, 102.68f),
                    PathNode.CurveTo(159.6771f, 105.31992f, 158.94508f, 110.33209f, 161.585f, 113.875f),
                    PathNode.CurveTo(164.22491f, 117.41791f, 169.23709f, 118.14992f, 172.78f, 115.51f),
                    PathNode.CurveTo(176.04988f, 113.173195f, 179.98135f, 111.9433f, 184.0f, 112.0f),
                    PathNode.CurveTo(192.56f, 112.0f, 199.8f, 117.36f, 200.0f, 123.76f),
                    PathNode.LineTo(200.0f, 131.76f),
                    PathNode.CurveTo(195.03758f, 129.26308f, 189.55515f, 127.9747f, 184.0f, 128.0f),
                    PathNode.CurveTo(166.36f, 128.0f, 152.0f, 140.56f, 152.0f, 156.0f),
                    PathNode.CurveTo(152.0f, 171.44f, 166.36f, 184.0f, 184.0f, 184.0f),
                    PathNode.CurveTo(189.91188f, 184.02716f, 195.735f, 182.56194f, 200.93f, 179.74f),
                    PathNode.CurveTo(202.64961f, 182.98752f, 206.36044f, 184.6459f, 209.92694f, 183.76079f),
                    PathNode.CurveTo(213.49345f, 182.87567f, 215.9983f, 179.6747f, 216.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(73.61f, 136.0f),
                    PathNode.LineTo(110.39f, 136.0f),
                    PathNode.LineTo(92.0f, 92.53f),
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
        return _textAa!!
    }

private var _textAa: ImageVector? = null
