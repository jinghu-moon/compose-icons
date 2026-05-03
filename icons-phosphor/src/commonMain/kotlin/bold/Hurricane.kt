package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorBoldIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 92.0f),
                    PathNode.CurveTo(108.11775f, 92.0f, 92.0f, 108.11775f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 147.88223f, 108.11775f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(147.88223f, 164.0f, 164.0f, 147.88223f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 108.11775f, 147.88223f, 92.0f, 128.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.37f, 43.0f),
                    PathNode.LineTo(171.51f, 15.35f),
                    PathNode.CurveTo(172.6657f, 11.367514f, 171.68336f, 7.070572f, 168.912f, 3.985862f),
                    PathNode.CurveTo(166.14066f, 0.901153f, 161.97307f, -0.534117f, 157.89f, 0.19f),
                    PathNode.CurveTo(136.67519f, 4.626573f, 116.3538f, 12.5868f, 97.77f, 23.74f),
                    PathNode.CurveTo(57.36f, 48.28f, 36.0f, 84.33f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.011745f, 165.1598f, 58.34171f, 198.67644f, 92.63f, 213.0f),
                    PathNode.LineTo(84.49f, 240.65f),
                    PathNode.CurveTo(83.43671f, 244.27298f, 84.14868f, 248.18039f, 86.41216f, 251.199f),
                    PathNode.CurveTo(88.67564f, 254.21764f, 92.22702f, 255.99594f, 96.0f, 256.0f),
                    PathNode.CurveTo(96.707664f, 256.00128f, 97.413956f, 255.93767f, 98.11f, 255.81f),
                    PathNode.CurveTo(119.324814f, 251.37343f, 139.64621f, 243.4132f, 158.23f, 232.26f),
                    PathNode.CurveTo(198.64f, 207.72f, 220.0f, 171.67f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.98825f, 90.840195f, 197.6583f, 57.323563f, 163.37f, 43.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.37f, 211.35f),
                    PathNode.CurveTo(136.03497f, 217.60039f, 125.05874f, 222.72308f, 113.63f, 226.63f),
                    PathNode.LineTo(118.91f, 208.63f),
                    PathNode.CurveTo(119.82895f, 205.52342f, 119.45278f, 202.17726f, 117.86702f, 199.35225f),
                    PathNode.CurveTo(116.28124f, 196.52724f, 113.62061f, 194.46342f, 110.49f, 193.63f),
                    PathNode.CurveTo(80.744934f, 185.70337f, 60.03483f, 158.78311f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 92.88f, 76.7f, 64.82f, 109.65f, 44.61f),
                    PathNode.CurveTo(119.98496f, 38.356834f, 130.96114f, 33.23082f, 142.39f, 29.32f),
                    PathNode.LineTo(137.11f, 47.32f),
                    PathNode.CurveTo(136.19106f, 50.426582f, 136.56721f, 53.772743f, 138.15298f, 56.597748f),
                    PathNode.CurveTo(139.73875f, 59.422756f, 142.39938f, 61.486572f, 145.53f, 62.32f),
                    PathNode.CurveTo(175.28506f, 70.25902f, 195.99022f, 97.20402f, 196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 163.12f, 179.3f, 191.17f, 146.35f, 211.39f),
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
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
