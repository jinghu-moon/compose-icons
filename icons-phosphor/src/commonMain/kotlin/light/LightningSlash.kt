package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorLightIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.163273f, 33.886772f, 46.65007f, 33.860672f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(42.03432f, 38.019005f, 41.69497f, 41.515873f, 43.56f, 44.0f),
                    PathNode.LineTo(84.05f, 88.58f),
                    PathNode.LineTo(43.61f, 131.91f),
                    PathNode.CurveTo(42.24398f, 133.3746f, 41.69879f, 135.42421f, 42.156605f, 137.37395f),
                    PathNode.CurveTo(42.61442f, 139.32368f, 44.014877f, 140.91644f, 45.89f, 141.62f),
                    PathNode.LineTo(105.12f, 163.83f),
                    PathNode.LineTo(90.12f, 238.83f),
                    PathNode.CurveTo(89.59074f, 241.461f, 90.87298f, 244.12347f, 93.26f, 245.35f),
                    PathNode.CurveTo(94.10975f, 245.77846f, 95.04833f, 246.00111f, 96.0f, 246.0f),
                    PathNode.CurveTo(97.664955f, 246.0f, 99.25506f, 245.30818f, 100.39f, 244.09f),
                    PathNode.LineTo(163.73f, 176.22f),
                    PathNode.LineTo(203.56f, 220.0f),
                    PathNode.CurveTo(205.79123f, 222.45215f, 209.58786f, 222.63123f, 212.04f, 220.4f),
                    PathNode.CurveTo(214.49214f, 218.16876f, 214.67123f, 214.37215f, 212.44f, 211.92f),
                    PathNode.Close,
                    PathNode.MoveTo(106.0f, 220.46f),
                    PathNode.LineTo(117.85f, 161.18f),
                    PathNode.CurveTo(118.43062f, 158.29556f, 116.83398f, 155.4157f, 114.08f, 154.38f),
                    PathNode.LineTo(58.48f, 133.53f),
                    PathNode.LineTo(92.12f, 97.53f),
                    PathNode.LineTo(155.6f, 167.36f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 69.55f),
                    PathNode.CurveTo(107.578354f, 67.28834f, 107.448524f, 63.491817f, 109.71f, 61.07f),
                    PathNode.LineTo(155.59f, 11.91f),
                    PathNode.CurveTo(157.42009f, 9.949116f, 160.32932f, 9.44107f, 162.71568f, 10.665623f),
                    PathNode.CurveTo(165.10205f, 11.890175f, 166.38579f, 14.549825f, 165.86f, 17.18f),
                    PathNode.LineTo(150.86f, 92.18f),
                    PathNode.LineTo(210.09f, 114.39f),
                    PathNode.CurveTo(211.96512f, 115.09355f, 213.36557f, 116.68631f, 213.8234f, 118.63605f),
                    PathNode.CurveTo(214.2812f, 120.585785f, 213.73602f, 122.6354f, 212.37f, 124.1f),
                    PathNode.LineTo(190.08f, 148.0f),
                    PathNode.CurveTo(188.62224f, 149.58861f, 186.42421f, 150.2729f, 184.32231f, 149.7925f),
                    PathNode.CurveTo(182.22043f, 149.3121f, 180.53792f, 147.74084f, 179.91504f, 145.67668f),
                    PathNode.CurveTo(179.29216f, 143.61253f, 179.82469f, 141.37288f, 181.31f, 139.81f),
                    PathNode.LineTo(197.49f, 122.48f),
                    PathNode.LineTo(141.89f, 101.63f),
                    PathNode.CurveTo(139.13602f, 100.59431f, 137.53938f, 97.71443f, 138.12f, 94.83f),
                    PathNode.LineTo(150.0f, 35.54f),
                    PathNode.LineTo(118.5f, 69.25f),
                    PathNode.CurveTo(117.41458f, 70.420364f, 115.907555f, 71.109985f, 114.31234f, 71.16629f),
                    PathNode.CurveTo(112.717125f, 71.22259f, 111.16523f, 70.64093f, 110.0f, 69.55f),
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
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
