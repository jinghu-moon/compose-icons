package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorFillIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.28f, 177.85f),
                    PathNode.CurveTo(231.93924f, 183.4045f, 224.47458f, 185.46356f, 217.9f, 182.92f),
                    PathNode.LineTo(193.14f, 163.92f),
                    PathNode.CurveTo(192.9471f, 163.7789f, 192.76945f, 163.61803f, 192.61f, 163.44f),
                    PathNode.LineTo(109.18f, 71.62f),
                    PathNode.CurveTo(108.15868f, 70.50375f, 107.85457f, 68.906784f, 108.39415f, 67.49329f),
                    PathNode.CurveTo(108.93372f, 66.07981f, 110.22465f, 65.09172f, 111.73f, 64.94f),
                    PathNode.CurveTo(154.73f, 60.32f, 199.47f, 74.06f, 231.59f, 106.18f),
                    PathNode.LineTo(231.59f, 106.18f),
                    PathNode.CurveTo(251.58f, 126.17f, 253.51f, 155.64f, 236.28f, 177.85f),
                    PathNode.Close,
                    PathNode.MoveTo(53.93f, 34.62f),
                    PathNode.CurveTo(52.0181f, 32.46484f, 49.09507f, 31.50414f, 46.27741f, 32.104855f),
                    PathNode.CurveTo(43.45975f, 32.70557f, 41.18271f, 34.774906f, 40.316048f, 37.52244f),
                    PathNode.CurveTo(39.449387f, 40.26998f, 40.126976f, 43.271305f, 42.09f, 45.38f),
                    PathNode.LineTo(69.71f, 75.77f),
                    PathNode.CurveTo(52.786247f, 82.88316f, 37.40233f, 93.21043f, 24.41f, 106.18f),
                    PathNode.CurveTo(4.41f, 126.18f, 2.49f, 155.64f, 19.72f, 177.85f),
                    PathNode.CurveTo(24.060781f, 183.4045f, 31.525423f, 185.46356f, 38.1f, 182.92f),
                    PathNode.LineTo(87.1f, 165.55f),
                    PathNode.LineTo(87.39f, 165.44f),
                    PathNode.CurveTo(92.41194f, 163.4323f, 96.07971f, 159.02345f, 97.14f, 153.72f),
                    PathNode.LineTo(103.04f, 124.21f),
                    PathNode.CurveTo(105.84589f, 123.24133f, 108.70777f, 122.443214f, 111.61f, 121.82f),
                    PathNode.LineTo(202.11f, 221.38f),
                    PathNode.CurveTo(204.02191f, 223.53516f, 206.94493f, 224.49586f, 209.76259f, 223.89514f),
                    PathNode.CurveTo(212.58025f, 223.29443f, 214.85728f, 221.2251f, 215.72395f, 218.47755f),
                    PathNode.CurveTo(216.5906f, 215.73003f, 215.91302f, 212.7287f, 213.95f, 210.62f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
