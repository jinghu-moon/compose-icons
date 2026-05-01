package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) return _userSwitch!!
        _userSwitch = phosphorRegularIcon(
            name = "UserSwitch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(253.66f, 133.66f),
                    PathNode.LineTo(229.66f, 157.66f),
                    PathNode.CurveTo(228.15945f, 159.16223f, 226.12328f, 160.00629f, 224.0f, 160.00629f),
                    PathNode.CurveTo(221.87672f, 160.00629f, 219.84055f, 159.16223f, 218.34f, 157.66f),
                    PathNode.LineTo(194.34f, 133.66f),
                    PathNode.CurveTo(191.21407f, 130.53407f, 191.21407f, 125.465935f, 194.34f, 122.34f),
                    PathNode.CurveTo(197.46593f, 119.214066f, 202.53407f, 119.214066f, 205.66f, 122.34f),
                    PathNode.LineTo(216.0f, 132.69f),
                    PathNode.LineTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.01884f, 89.768425f, 191.3505f, 55.898537f, 154.95686f, 44.187138f),
                    PathNode.CurveTo(118.56323f, 32.47574f, 78.77146f, 45.602493f, 56.49f, 76.67f),
                    PathNode.CurveTo(53.91083f, 80.25985f, 48.90985f, 81.07917f, 45.32f, 78.5f),
                    PathNode.CurveTo(41.73015f, 75.92083f, 40.91083f, 70.91985f, 43.49f, 67.33f),
                    PathNode.CurveTo(69.82391f, 30.614403f, 116.85143f, 15.102436f, 159.86186f, 28.944897f),
                    PathNode.CurveTo(202.87228f, 42.787357f, 232.02432f, 82.81693f, 232.0f, 128.0f),
                    PathNode.LineTo(232.0f, 132.69f),
                    PathNode.LineTo(242.34f, 122.34f),
                    PathNode.CurveTo(245.46593f, 119.214066f, 250.53407f, 119.214066f, 253.66f, 122.34f),
                    PathNode.CurveTo(256.78592f, 125.465935f, 256.78592f, 130.53407f, 253.66f, 133.66f),
                    PathNode.Close,
                    PathNode.MoveTo(212.48f, 188.66f),
                    PathNode.CurveTo(186.13902f, 225.34709f, 139.13063f, 240.83989f, 96.13832f, 227.00333f),
                    PathNode.CurveTo(53.146008f, 213.16678f, 23.998188f, 173.16403f, 24.0f, 128.0f),
                    PathNode.LineTo(24.0f, 123.31f),
                    PathNode.LineTo(13.66f, 133.66f),
                    PathNode.CurveTo(10.534068f, 136.78593f, 5.465932f, 136.78593f, 2.34f, 133.66f),
                    PathNode.CurveTo(-0.785932f, 130.53407f, -0.785932f, 125.465935f, 2.34f, 122.34f),
                    PathNode.LineTo(26.34f, 98.34f),
                    PathNode.CurveTo(27.840546f, 96.83778f, 29.876726f, 95.993706f, 32.0f, 95.993706f),
                    PathNode.CurveTo(34.123276f, 95.993706f, 36.159454f, 96.83778f, 37.66f, 98.34f),
                    PathNode.LineTo(61.66f, 122.34f),
                    PathNode.CurveTo(64.785934f, 125.465935f, 64.785934f, 130.53407f, 61.66f, 133.66f),
                    PathNode.CurveTo(58.53407f, 136.78593f, 53.46593f, 136.78593f, 50.34f, 133.66f),
                    PathNode.LineTo(40.0f, 123.31f),
                    PathNode.LineTo(40.0f, 128.0f),
                    PathNode.CurveTo(39.981037f, 149.54193f, 47.898487f, 170.3359f, 62.24f, 186.41f),
                    PathNode.CurveTo(71.16231f, 173.48077f, 83.708176f, 163.47818f, 98.3f, 157.66f),
                    PathNode.CurveTo(82.2332f, 145.00536f, 75.949425f, 123.56005f, 82.64587f, 104.23546f),
                    PathNode.CurveTo(89.342316f, 84.91087f, 107.54806f, 71.951775f, 128.0f, 71.951775f),
                    PathNode.CurveTo(148.45195f, 71.951775f, 166.65768f, 84.91087f, 173.35413f, 104.23546f),
                    PathNode.CurveTo(180.05058f, 123.56005f, 173.7668f, 145.00536f, 157.7f, 157.66f),
                    PathNode.CurveTo(172.30522f, 163.47923f, 184.85983f, 173.4937f, 193.78f, 186.44f),
                    PathNode.CurveTo(195.80267f, 184.16837f, 197.70847f, 181.7953f, 199.49f, 179.33f),
                    PathNode.CurveTo(202.06917f, 175.74014f, 207.07014f, 174.92084f, 210.66f, 177.5f),
                    PathNode.CurveTo(214.24985f, 180.07916f, 215.06917f, 185.08015f, 212.49f, 188.67f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(145.67311f, 152.0f, 160.0f, 137.67311f, 160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 102.32689f, 145.67311f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(110.32689f, 88.0f, 96.0f, 102.32689f, 96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 137.67311f, 110.32689f, 152.0f, 128.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(147.52444f, 215.97458f, 166.48862f, 209.47147f, 181.92f, 197.51f),
                    PathNode.CurveTo(170.1589f, 179.11612f, 149.83252f, 167.98657f, 128.0f, 167.98657f),
                    PathNode.CurveTo(106.16747f, 167.98657f, 85.8411f, 179.11612f, 74.08f, 197.51f),
                    PathNode.CurveTo(89.48826f, 209.51427f, 108.46756f, 216.02255f, 128.0f, 216.0f),
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
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
