package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorDuotoneIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 138.0f),
                    PathNode.LineTo(160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 30.326887f, 145.67311f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(110.32689f, 16.0f, 96.0f, 30.326887f, 96.0f, 48.0f),
                    PathNode.LineTo(96.0f, 138.0f),
                    PathNode.CurveTo(75.92032f, 151.98169f, 67.24275f, 177.38092f, 74.56984f, 200.72606f),
                    PathNode.CurveTo(81.89693f, 224.07118f, 103.53203f, 239.9565f, 128.0f, 239.9565f),
                    PathNode.CurveTo(152.46797f, 239.9565f, 174.10307f, 224.07118f, 181.43016f, 200.72606f),
                    PathNode.CurveTo(188.75725f, 177.38092f, 180.07968f, 151.98169f, 160.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(114.74516f, 208.0f, 104.0f, 197.25484f, 104.0f, 184.0f),
                    PathNode.CurveTo(104.0f, 170.74516f, 114.74516f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(141.25484f, 160.0f, 152.0f, 170.74516f, 152.0f, 184.0f),
                    PathNode.CurveTo(152.0f, 197.25484f, 141.25484f, 208.0f, 128.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 153.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 83.58172f, 132.41827f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(123.58172f, 80.0f, 120.0f, 83.58172f, 120.0f, 88.0f),
                    PathNode.LineTo(120.0f, 153.0f),
                    PathNode.CurveTo(104.397545f, 157.02853f, 94.2246f, 172.03029f, 96.25505f, 188.016f),
                    PathNode.CurveTo(98.2855f, 204.00171f, 111.88586f, 215.98387f, 128.0f, 215.98387f),
                    PathNode.CurveTo(144.11415f, 215.98387f, 157.7145f, 204.00171f, 159.74495f, 188.016f),
                    PathNode.CurveTo(161.7754f, 172.03029f, 151.60245f, 157.02853f, 136.0f, 153.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(119.163445f, 200.0f, 112.0f, 192.83656f, 112.0f, 184.0f),
                    PathNode.CurveTo(112.0f, 175.16344f, 119.163445f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(136.83656f, 168.0f, 144.0f, 175.16344f, 144.0f, 184.0f),
                    PathNode.CurveTo(144.0f, 192.83656f, 136.83656f, 200.0f, 128.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 134.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.CurveTo(168.0f, 25.90861f, 150.09138f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(105.90861f, 8.0f, 88.0f, 25.90861f, 88.0f, 48.0f),
                    PathNode.LineTo(88.0f, 134.0f),
                    PathNode.CurveTo(66.786156f, 150.98466f, 58.61165f, 179.51443f, 67.61192f, 205.15622f),
                    PathNode.CurveTo(76.612206f, 230.798f, 100.82453f, 247.95999f, 128.0f, 247.95999f),
                    PathNode.CurveTo(155.17546f, 247.95999f, 179.3878f, 230.798f, 188.38808f, 205.15622f),
                    PathNode.CurveTo(197.38835f, 179.51443f, 189.21384f, 150.98466f, 168.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 232.0f),
                    PathNode.CurveTo(107.02391f, 232.00172f, 88.47614f, 218.38275f, 82.19708f, 198.36852f),
                    PathNode.CurveTo(75.918015f, 178.35428f, 83.36213f, 156.58087f, 100.58f, 144.6f),
                    PathNode.CurveTo(102.73495f, 143.09537f, 104.01337f, 140.62822f, 104.0f, 138.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.CurveTo(104.0f, 34.745167f, 114.74516f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(141.25484f, 24.0f, 152.0f, 34.745167f, 152.0f, 48.0f),
                    PathNode.LineTo(152.0f, 138.0f),
                    PathNode.CurveTo(151.99976f, 140.6141f, 153.27669f, 143.06343f, 155.42f, 144.56f),
                    PathNode.CurveTo(172.67476f, 156.52913f, 180.14594f, 178.325f, 173.86243f, 198.36256f),
                    PathNode.CurveTo(167.57892f, 218.40013f, 148.99966f, 232.02695f, 128.0f, 232.0f),
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
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
