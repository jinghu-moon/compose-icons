package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorRegularIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.93f, 34.62f),
                    PathNode.CurveTo(52.0181f, 32.46484f, 49.09507f, 31.50414f, 46.27741f, 32.104855f),
                    PathNode.CurveTo(43.45975f, 32.70557f, 41.18271f, 34.774906f, 40.316048f, 37.52244f),
                    PathNode.CurveTo(39.449387f, 40.26998f, 40.126976f, 43.271305f, 42.09f, 45.38f),
                    PathNode.LineTo(69.68f, 75.74f),
                    PathNode.CurveTo(52.75549f, 82.84885f, 37.378807f, 93.18828f, 24.41f, 106.18f),
                    PathNode.CurveTo(4.41f, 126.18f, 2.49f, 155.64f, 19.72f, 177.85f),
                    PathNode.CurveTo(24.060781f, 183.4045f, 31.525423f, 185.46356f, 38.1f, 182.92f),
                    PathNode.LineTo(87.1f, 165.55f),
                    PathNode.LineTo(87.39f, 165.44f),
                    PathNode.CurveTo(92.41194f, 163.4323f, 96.07971f, 159.02345f, 97.14f, 153.72f),
                    PathNode.LineTo(103.04f, 124.21f),
                    PathNode.CurveTo(105.84399f, 123.243416f, 108.70222f, 122.44204f, 111.6f, 121.81f),
                    PathNode.LineTo(202.11f, 221.38f),
                    PathNode.CurveTo(204.02191f, 223.53516f, 206.94493f, 224.49586f, 209.76259f, 223.89514f),
                    PathNode.CurveTo(212.58025f, 223.29443f, 214.85728f, 221.2251f, 215.72395f, 218.47755f),
                    PathNode.CurveTo(216.5906f, 215.73003f, 215.91302f, 212.7287f, 213.95f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(97.63f, 109.14f),
                    PathNode.CurveTo(92.32989f, 111.02859f, 88.41131f, 115.562294f, 87.31f, 121.08f),
                    PathNode.LineTo(81.41f, 150.58f),
                    PathNode.LineTo(32.63f, 167.88f),
                    PathNode.CurveTo(32.53f, 167.88f, 32.46f, 168.01f, 32.36f, 168.05f),
                    PathNode.CurveTo(20.03f, 152.15f, 21.36f, 131.83f, 35.72f, 117.49f),
                    PathNode.CurveTo(48.592083f, 104.61363f, 64.10597f, 94.68502f, 81.19f, 88.39f),
                    PathNode.LineTo(99.49f, 108.53f),
                    PathNode.CurveTo(98.87f, 108.73f, 98.25f, 108.92f, 97.63f, 109.14f),
                    PathNode.Close,
                    PathNode.MoveTo(236.28f, 177.85f),
                    PathNode.CurveTo(231.93924f, 183.4045f, 224.47458f, 185.46356f, 217.9f, 182.92f),
                    PathNode.LineTo(208.65f, 179.64f),
                    PathNode.CurveTo(204.48578f, 178.16264f, 202.30763f, 173.58923f, 203.785f, 169.425f),
                    PathNode.CurveTo(205.26236f, 165.26077f, 209.83577f, 163.08264f, 214.0f, 164.56f),
                    PathNode.LineTo(223.37f, 167.88f),
                    PathNode.LineTo(223.67f, 168.0f),
                    PathNode.CurveTo(235.97f, 152.15f, 234.67f, 131.83f, 220.28f, 117.49f),
                    PathNode.CurveTo(194.62f, 91.83f, 158.4f, 78.22f, 120.93f, 80.18f),
                    PathNode.CurveTo(116.51172f, 80.409195f, 112.7442f, 77.013275f, 112.515f, 72.595f),
                    PathNode.CurveTo(112.285805f, 68.17672f, 115.681725f, 64.409195f, 120.1f, 64.18f),
                    PathNode.CurveTo(162.1f, 61.99f, 202.73f, 77.28f, 231.59f, 106.18f),
                    PathNode.CurveTo(251.58f, 126.17f, 253.51f, 155.64f, 236.28f, 177.85f),
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
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
