package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorFillIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.92f, 132.11f),
                    PathNode.CurveTo(229.83f, 186.11f, 186.09f, 229.83f, 132.11f, 231.92f),
                    PathNode.CurveTo(100.645905f, 233.14557f, 70.31901f, 220.0582f, 49.625893f, 196.32455f),
                    PathNode.CurveTo(28.932774f, 172.5909f, 20.099184f, 140.76375f, 25.6f, 109.76f),
                    PathNode.CurveTo(25.874262f, 108.299255f, 26.935827f, 107.11102f, 28.35655f, 106.67452f),
                    PathNode.CurveTo(29.777275f, 106.23802f, 31.32288f, 106.62524f, 32.37f, 107.68f),
                    PathNode.LineTo(75.37f, 150.68f),
                    PathNode.CurveTo(69.02421f, 162.45677f, 71.89549f, 177.07738f, 82.223785f, 185.57959f),
                    PathNode.CurveTo(92.55208f, 194.08182f, 107.45196f, 194.09036f, 117.79f, 185.6f),
                    PathNode.LineTo(178.89f, 135.76f),
                    PathNode.CurveTo(189.43848f, 127.044136f, 194.13376f, 113.10164f, 191.00653f, 99.78034f),
                    PathNode.CurveTo(187.87927f, 86.459045f, 177.47028f, 76.06235f, 164.1453f, 72.95088f),
                    PathNode.CurveTo(150.8203f, 69.839424f, 136.88336f, 74.55121f, 128.18f, 85.11f),
                    PathNode.LineTo(85.18f, 137.85f),
                    PathNode.LineTo(35.0f, 87.67f),
                    PathNode.CurveTo(33.786858f, 86.45808f, 33.481148f, 84.60773f, 34.24f, 83.07f),
                    PathNode.CurveTo(55.559074f, 38.604565f, 105.17399f, 15.223583f, 153.03783f, 27.086645f),
                    PathNode.CurveTo(200.90164f, 38.949707f, 233.85448f, 82.795135f, 231.94f, 132.07f),
                    PathNode.Close,
                    PathNode.MoveTo(121.58f, 118.55f),
                    PathNode.LineTo(90.77f, 156.33f),
                    PathNode.CurveTo(89.13702f, 158.26172f, 88.16619f, 160.666f, 88.0f, 163.19f),
                    PathNode.CurveTo(87.83176f, 166.47078f, 88.9948f, 169.6806f, 91.22559f, 172.09212f),
                    PathNode.CurveTo(93.45638f, 174.50363f, 96.56607f, 175.91269f, 99.85f, 176.0f),
                    PathNode.CurveTo(102.68793f, 176.04872f, 105.44892f, 175.07634f, 107.63f, 173.26f),
                    PathNode.LineTo(107.63f, 173.26f),
                    PathNode.LineTo(145.41f, 142.45f),
                    PathNode.CurveTo(134.0098f, 138.90321f, 125.09334f, 129.96056f, 121.58f, 118.55f),
                    PathNode.Close,
                    PathNode.MoveTo(175.9f, 110.0f),
                    PathNode.CurveTo(176.74542f, 101.58714f, 172.20909f, 93.55157f, 164.56923f, 89.928925f),
                    PathNode.CurveTo(156.92938f, 86.306274f, 147.83684f, 87.87934f, 141.8581f, 93.85809f),
                    PathNode.CurveTo(135.87935f, 99.836845f, 134.30627f, 108.92938f, 137.92892f, 116.56924f),
                    PathNode.CurveTo(141.55157f, 124.20908f, 149.58714f, 128.74542f, 158.0f, 127.9f),
                    PathNode.CurveTo(167.46404f, 126.94894f, 174.94894f, 119.464035f, 175.9f, 110.0f),
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
        return _steamLogo!!
    }

private var _steamLogo: ImageVector? = null
