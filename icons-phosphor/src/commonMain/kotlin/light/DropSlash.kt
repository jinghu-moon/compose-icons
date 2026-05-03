package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorLightIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.163273f, 33.886772f, 46.65007f, 33.860672f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(42.03432f, 38.019005f, 41.69497f, 41.515873f, 43.56f, 44.0f),
                    PathNode.LineTo(67.26f, 70.07f),
                    PathNode.CurveTo(50.51f, 94.93f, 42.0f, 119.77f, 42.0f, 144.0f),
                    PathNode.CurveTo(42.00354f, 178.90334f, 63.10237f, 210.34293f, 95.40097f, 223.57333f),
                    PathNode.CurveTo(127.69957f, 236.80374f, 164.79137f, 229.20065f, 189.28f, 204.33f),
                    PathNode.LineTo(203.56f, 220.0f),
                    PathNode.CurveTo(205.79123f, 222.45215f, 209.58786f, 222.63123f, 212.04f, 220.4f),
                    PathNode.CurveTo(214.49214f, 218.16876f, 214.67123f, 214.37215f, 212.44f, 211.92f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(87.15149f, 217.95041f, 54.04959f, 184.84851f, 54.0f, 144.0f),
                    PathNode.CurveTo(54.0f, 123.0f, 61.27f, 101.24f, 75.59f, 79.27f),
                    PathNode.LineTo(181.18f, 195.42f),
                    PathNode.CurveTo(167.25787f, 209.86003f, 148.05841f, 218.01204f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(91.4f, 49.07f),
                    PathNode.CurveTo(90.24642f, 47.97136f, 89.5771f, 46.45906f, 89.53959f, 44.86647f),
                    PathNode.CurveTo(89.502075f, 43.27388f, 90.099434f, 41.731743f, 91.2f, 40.58f),
                    PathNode.CurveTo(101.40417f, 29.760202f, 112.57004f, 19.889648f, 124.56f, 11.09f),
                    PathNode.CurveTo(126.62557f, 9.644578f, 129.37442f, 9.644578f, 131.44f, 11.09f),
                    PathNode.CurveTo(146.50822f, 22.187958f, 160.29025f, 34.933575f, 172.53f, 49.09f),
                    PathNode.CurveTo(199.66f, 80.26f, 214.0f, 113.09f, 214.0f, 144.0f),
                    PathNode.CurveTo(214.003f, 151.72693f, 212.96706f, 159.41917f, 210.92f, 166.87f),
                    PathNode.CurveTo(210.20468f, 169.47281f, 207.83932f, 171.27753f, 205.14f, 171.28f),
                    PathNode.CurveTo(204.60315f, 171.27913f, 204.06866f, 171.20854f, 203.55f, 171.07f),
                    PathNode.CurveTo(202.01375f, 170.64932f, 200.70781f, 169.63507f, 199.91998f, 168.25075f),
                    PathNode.CurveTo(199.13216f, 166.86641f, 198.9271f, 165.22563f, 199.35f, 163.69f),
                    PathNode.CurveTo(201.11438f, 157.27562f, 202.00575f, 150.65262f, 202.0f, 144.0f),
                    PathNode.CurveTo(202.0f, 84.37f, 143.0f, 35.06f, 128.0f, 23.48f),
                    PathNode.CurveTo(118.007614f, 31.22781f, 108.60812f, 39.711426f, 99.88f, 48.86f),
                    PathNode.CurveTo(97.59584f, 51.25864f, 93.80009f, 51.352646f, 91.4f, 49.07f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
