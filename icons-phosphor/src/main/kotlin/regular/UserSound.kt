package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorRegularIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 165.68f),
                    PathNode.CurveTo(169.76613f, 149.63197f, 181.77513f, 118.44987f, 173.4295f, 89.26455f),
                    PathNode.CurveTo(165.08388f, 60.079227f, 138.4051f, 39.960007f, 108.05f, 39.960007f),
                    PathNode.CurveTo(77.6949f, 39.960007f, 51.01612f, 60.079227f, 42.670498f, 89.26455f),
                    PathNode.CurveTo(34.324867f, 118.44987f, 46.333878f, 149.63197f, 72.1f, 165.68f),
                    PathNode.CurveTo(51.45f, 172.44f, 32.87f, 185.07f, 17.93f, 202.85f),
                    PathNode.CurveTo(15.085733f, 206.23274f, 15.522256f, 211.28073f, 18.905f, 214.12498f),
                    PathNode.CurveTo(22.287745f, 216.96927f, 27.335733f, 216.53275f, 30.18f, 213.15f),
                    PathNode.CurveTo(50.25f, 189.19f, 77.91f, 176.0f, 108.0f, 176.0f),
                    PathNode.CurveTo(138.09f, 176.0f, 165.75f, 189.19f, 185.88f, 213.15f),
                    PathNode.CurveTo(188.72427f, 216.53275f, 193.77226f, 216.96927f, 197.155f, 214.12498f),
                    PathNode.CurveTo(200.53775f, 211.28073f, 200.97427f, 206.23274f, 198.13f, 202.85f),
                    PathNode.CurveTo(183.18f, 185.07f, 164.6f, 172.44f, 144.0f, 165.68f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 108.0f),
                    PathNode.CurveTo(56.0f, 79.2812f, 79.2812f, 56.0f, 108.0f, 56.0f),
                    PathNode.CurveTo(136.71881f, 56.0f, 160.0f, 79.2812f, 160.0f, 108.0f),
                    PathNode.CurveTo(160.0f, 136.71881f, 136.71881f, 160.0f, 108.0f, 160.0f),
                    PathNode.CurveTo(79.2949f, 159.96693f, 56.033066f, 136.7051f, 56.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(207.36f, 65.6f),
                    PathNode.CurveTo(218.87965f, 92.693f, 218.87965f, 123.307f, 207.36f, 150.4f),
                    PathNode.CurveTo(206.10187f, 153.3482f, 203.20543f, 155.26079f, 200.0f, 155.26f),
                    PathNode.CurveTo(197.31001f, 155.2621f, 194.79904f, 153.91216f, 193.31714f, 151.66718f),
                    PathNode.CurveTo(191.83524f, 149.42215f, 191.58081f, 146.58269f, 192.64f, 144.11f),
                    PathNode.CurveTo(202.4536f, 121.036804f, 202.4536f, 94.963196f, 192.64f, 71.89f),
                    PathNode.CurveTo(190.90306f, 67.82519f, 192.79019f, 63.121937f, 196.855f, 61.385f),
                    PathNode.CurveTo(200.91982f, 59.648064f, 205.62306f, 61.535183f, 207.36f, 65.6f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 108.0f),
                    PathNode.CurveTo(248.03757f, 126.96095f, 244.19545f, 145.72911f, 236.71f, 163.15f),
                    PathNode.CurveTo(234.88968f, 167.07542f, 230.27812f, 168.84207f, 226.30103f, 167.1376f),
                    PathNode.CurveTo(222.32393f, 165.43314f, 220.42285f, 160.87535f, 222.01f, 156.85f),
                    PathNode.CurveTo(235.33006f, 125.64533f, 235.33006f, 90.35467f, 222.01f, 59.15f),
                    PathNode.CurveTo(220.78407f, 56.506355f, 221.09259f, 53.405216f, 222.81535f, 51.054928f),
                    PathNode.CurveTo(224.53812f, 48.70464f, 227.40259f, 47.47701f, 230.29263f, 47.85038f),
                    PathNode.CurveTo(233.18268f, 48.223747f, 235.64111f, 50.139053f, 236.71f, 52.85f),
                    PathNode.CurveTo(244.19545f, 70.27088f, 248.03757f, 89.03905f, 248.0f, 108.0f),
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
        return _userSound!!
    }

private var _userSound: ImageVector? = null
