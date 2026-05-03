package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorBoldIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(75.9f, 88.52f),
                    PathNode.LineTo(39.23f, 127.81f),
                    PathNode.CurveTo(36.52719f, 130.7045f, 35.426495f, 134.74611f, 36.288338f, 138.6114f),
                    PathNode.CurveTo(37.150177f, 142.4767f, 39.86357f, 145.66788f, 43.54f, 147.14f),
                    PathNode.LineTo(94.72f, 167.61f),
                    PathNode.LineTo(84.13f, 238.22f),
                    PathNode.CurveTo(83.332016f, 243.42487f, 86.02042f, 248.54189f, 90.7592f, 250.8378f),
                    PathNode.CurveTo(95.497986f, 253.13373f, 101.17993f, 252.0721f, 104.77f, 248.22f),
                    PathNode.LineTo(163.67f, 185.11f),
                    PathNode.LineTo(199.12f, 224.11f),
                    PathNode.CurveTo(203.5975f, 228.91977f, 211.1107f, 229.23367f, 215.9738f, 224.81416f),
                    PathNode.CurveTo(220.83693f, 220.39465f, 221.24089f, 212.88574f, 216.88f, 207.97f),
                    PathNode.Close,
                    PathNode.MoveTo(113.6f, 203.55f),
                    PathNode.LineTo(119.87f, 161.78f),
                    PathNode.CurveTo(120.69488f, 156.2761f, 117.62718f, 150.92729f, 112.46f, 148.86f),
                    PathNode.LineTo(68.74f, 131.37f),
                    PathNode.LineTo(92.09f, 106.37f),
                    PathNode.LineTo(147.47f, 167.29f),
                    PathNode.Close,
                    PathNode.MoveTo(111.41f, 68.06f),
                    PathNode.CurveTo(109.070656f, 65.8878f, 107.69325f, 62.87301f, 107.58253f, 59.6826f),
                    PathNode.CurveTo(107.4718f, 56.492188f, 108.63688f, 53.389153f, 110.82f, 51.06f),
                    PathNode.LineTo(151.23f, 7.81f),
                    PathNode.CurveTo(154.82007f, 3.957897f, 160.50201f, 2.896273f, 165.2408f, 5.192195f),
                    PathNode.CurveTo(169.97958f, 7.488118f, 172.66798f, 12.605142f, 171.87f, 17.81f),
                    PathNode.LineTo(161.28f, 88.39f),
                    PathNode.LineTo(212.46f, 108.86f),
                    PathNode.CurveTo(216.13643f, 110.332115f, 218.84982f, 113.52331f, 219.71167f, 117.3886f),
                    PathNode.CurveTo(220.5735f, 121.25389f, 219.47281f, 125.29551f, 216.77f, 128.19f),
                    PathNode.LineTo(199.95f, 146.19f),
                    PathNode.CurveTo(195.42679f, 151.0363f, 187.8313f, 151.29822f, 182.985f, 146.775f),
                    PathNode.CurveTo(178.1387f, 142.25179f, 177.87679f, 134.65628f, 182.4f, 129.81f),
                    PathNode.LineTo(187.26f, 124.6f),
                    PathNode.LineTo(143.54f, 107.11f),
                    PathNode.CurveTo(138.37282f, 105.04271f, 135.30513f, 99.69392f, 136.13f, 94.19f),
                    PathNode.LineTo(142.4f, 52.42f),
                    PathNode.LineTo(128.4f, 67.42f),
                    PathNode.CurveTo(126.23497f, 69.763245f, 123.22596f, 71.147896f, 120.037895f, 71.26799f),
                    PathNode.CurveTo(116.84984f, 71.388084f, 113.745186f, 70.23372f, 111.41f, 68.06f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
