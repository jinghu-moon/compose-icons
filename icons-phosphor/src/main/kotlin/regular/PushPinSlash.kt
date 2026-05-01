package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) return _pushPinSlash!!
        _pushPinSlash = phosphorRegularIcon(
            name = "PushPinSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(67.37f, 73.2f),
                    PathNode.CurveTo(56.57513f, 75.61549f, 46.508675f, 80.56132f, 38.0f, 87.63f),
                    PathNode.CurveTo(34.459236f, 90.47715f, 32.295906f, 94.69539f, 32.049797f, 99.23221f),
                    PathNode.CurveTo(31.803686f, 103.76903f, 33.49801f, 108.19653f, 36.71f, 111.41f),
                    PathNode.LineTo(85.0f, 159.71f),
                    PathNode.LineTo(42.34f, 202.34f),
                    PathNode.CurveTo(39.21407f, 205.46593f, 39.21407f, 210.53407f, 42.34f, 213.66f),
                    PathNode.CurveTo(45.46593f, 216.78593f, 50.53407f, 216.78593f, 53.66f, 213.66f),
                    PathNode.LineTo(96.29f, 171.0f),
                    PathNode.LineTo(144.58f, 219.29f),
                    PathNode.CurveTo(147.57822f, 222.30083f, 151.65096f, 223.99539f, 155.9f, 224.0f),
                    PathNode.CurveTo(156.28f, 224.0f, 156.65f, 224.0f, 157.03f, 224.0f),
                    PathNode.CurveTo(161.64507f, 223.68024f, 165.89319f, 221.37007f, 168.67f, 217.67f),
                    PathNode.CurveTo(173.39601f, 211.44629f, 177.28894f, 204.632f, 180.25f, 197.4f),
                    PathNode.LineTo(202.09f, 221.4f),
                    PathNode.CurveTo(204.00189f, 223.55516f, 206.92493f, 224.51585f, 209.7426f, 223.91515f),
                    PathNode.CurveTo(212.56026f, 223.31444f, 214.8373f, 221.24509f, 215.70395f, 218.49756f),
                    PathNode.CurveTo(216.57062f, 215.75002f, 215.89302f, 212.7487f, 213.93f, 210.64f),
                    PathNode.Close,
                    PathNode.MoveTo(155.9f, 208.0f),
                    PathNode.LineTo(48.0f, 100.08f),
                    PathNode.CurveTo(58.23f, 91.83f, 69.2f, 87.72f, 80.66f, 87.81f),
                    PathNode.LineTo(167.82f, 183.69f),
                    PathNode.CurveTo(165.59f, 193.56f, 160.24f, 202.23f, 155.9f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(235.32f, 104.0f),
                    PathNode.LineTo(190.68f, 148.79f),
                    PathNode.CurveTo(187.55959f, 151.91869f, 182.4937f, 151.92542f, 179.365f, 148.805f),
                    PathNode.CurveTo(176.23631f, 145.68459f, 176.22958f, 140.6187f, 179.35f, 137.49f),
                    PathNode.LineTo(224.0f, 92.7f),
                    PathNode.LineTo(163.32f, 32.0f),
                    PathNode.LineTo(122.1f, 73.35f),
                    PathNode.CurveTo(118.96002f, 76.34411f, 114.005714f, 76.2896f, 110.93238f, 73.22711f),
                    PathNode.CurveTo(107.859055f, 70.16463f, 107.78701f, 65.21055f, 110.77f, 62.06f),
                    PathNode.LineTo(152.0f, 20.7f),
                    PathNode.CurveTo(155.00069f, 17.698627f, 159.0709f, 16.012417f, 163.315f, 16.012417f),
                    PathNode.CurveTo(167.5591f, 16.012417f, 171.62932f, 17.698627f, 174.63f, 20.7f),
                    PathNode.LineTo(235.32f, 81.38f),
                    PathNode.CurveTo(241.56345f, 87.62754f, 241.56345f, 97.752464f, 235.32f, 104.0f),
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
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
