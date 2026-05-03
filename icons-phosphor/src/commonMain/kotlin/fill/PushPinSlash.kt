package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) return _pushPinSlash!!
        _pushPinSlash = phosphorFillIcon(
            name = "PushPinSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.33f, 104.0f),
                    PathNode.LineTo(187.71f, 151.78f),
                    PathNode.CurveTo(186.93614f, 152.55379f, 185.87904f, 152.97673f, 184.785f, 152.95027f),
                    PathNode.CurveTo(183.69098f, 152.92383f, 182.65556f, 152.45029f, 181.92f, 151.64f),
                    PathNode.LineTo(108.0f, 70.27f),
                    PathNode.CurveTo(106.56918f, 68.69174f, 106.62634f, 66.26902f, 108.13f, 64.76f),
                    PathNode.LineTo(152.0f, 20.7f),
                    PathNode.CurveTo(155.00069f, 17.698627f, 159.0709f, 16.012417f, 163.315f, 16.012417f),
                    PathNode.CurveTo(167.5591f, 16.012417f, 171.62932f, 17.698627f, 174.63f, 20.7f),
                    PathNode.LineTo(235.32f, 81.38f),
                    PathNode.CurveTo(241.56621f, 87.62478f, 241.57068f, 97.7497f, 235.33f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.371407f, 32.924206f, 50.168728f, 31.975693f, 47.87259f, 32.015877f),
                    PathNode.CurveTo(45.576454f, 32.056057f, 43.408306f, 33.08106f, 41.92f, 34.83f),
                    PathNode.CurveTo(39.33879f, 38.00203f, 39.496803f, 42.592953f, 42.29f, 45.58f),
                    PathNode.LineTo(67.32f, 73.15f),
                    PathNode.CurveTo(58.26f, 75.09f, 48.2f, 79.37f, 38.0f, 87.63f),
                    PathNode.CurveTo(34.459236f, 90.47715f, 32.295906f, 94.69539f, 32.049797f, 99.23221f),
                    PathNode.CurveTo(31.803686f, 103.76903f, 33.49801f, 108.19653f, 36.71f, 111.41f),
                    PathNode.LineTo(85.0f, 159.71f),
                    PathNode.LineTo(42.55f, 202.14f),
                    PathNode.CurveTo(39.481857f, 205.11151f, 39.22036f, 209.94481f, 41.95f, 213.23f),
                    PathNode.CurveTo(43.402775f, 214.91237f, 45.49001f, 215.91444f, 47.711327f, 215.99602f),
                    PathNode.CurveTo(49.93264f, 216.07756f, 52.08775f, 215.23128f, 53.66f, 213.66f),
                    PathNode.LineTo(96.29f, 171.0f),
                    PathNode.LineTo(144.58f, 219.29f),
                    PathNode.CurveTo(147.57822f, 222.30083f, 151.65096f, 223.99539f, 155.9f, 224.0f),
                    PathNode.CurveTo(156.28f, 224.0f, 156.65f, 224.0f, 157.03f, 224.0f),
                    PathNode.CurveTo(161.64507f, 223.68024f, 165.89319f, 221.37007f, 168.67f, 217.67f),
                    PathNode.CurveTo(173.42262f, 211.47864f, 177.33649f, 204.68654f, 180.31f, 197.47f),
                    PathNode.LineTo(202.08f, 221.42f),
                    PathNode.CurveTo(203.9919f, 223.57516f, 206.91493f, 224.53586f, 209.73259f, 223.93515f),
                    PathNode.CurveTo(212.55025f, 223.33443f, 214.82729f, 221.26509f, 215.69395f, 218.51756f),
                    PathNode.CurveTo(216.56061f, 215.77002f, 215.88303f, 212.76869f, 213.92f, 210.66f),
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
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
