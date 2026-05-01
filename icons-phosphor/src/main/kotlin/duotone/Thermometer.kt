package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = phosphorDuotoneIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 138.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 30.326887f, 137.67311f, 16.0f, 120.0f, 16.0f),
                    PathNode.CurveTo(102.32689f, 16.0f, 88.0f, 30.326887f, 88.0f, 48.0f),
                    PathNode.LineTo(88.0f, 138.0f),
                    PathNode.CurveTo(67.92032f, 151.98169f, 59.242752f, 177.38092f, 66.56984f, 200.72606f),
                    PathNode.CurveTo(73.89693f, 224.07118f, 95.53203f, 239.9565f, 120.0f, 239.9565f),
                    PathNode.CurveTo(144.46797f, 239.9565f, 166.10307f, 224.07118f, 173.43016f, 200.72606f),
                    PathNode.CurveTo(180.75725f, 177.38092f, 172.07968f, 151.98169f, 152.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 208.0f),
                    PathNode.CurveTo(106.74516f, 208.0f, 96.0f, 197.25484f, 96.0f, 184.0f),
                    PathNode.CurveTo(96.0f, 170.74516f, 106.74516f, 160.0f, 120.0f, 160.0f),
                    PathNode.CurveTo(133.25484f, 160.0f, 144.0f, 170.74516f, 144.0f, 184.0f),
                    PathNode.CurveTo(144.0f, 197.25484f, 133.25484f, 208.0f, 120.0f, 208.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 56.0f),
                    PathNode.CurveTo(196.53603f, 56.0f, 184.0f, 68.536026f, 184.0f, 84.0f),
                    PathNode.CurveTo(184.0f, 99.463974f, 196.53603f, 112.0f, 212.0f, 112.0f),
                    PathNode.CurveTo(227.46397f, 112.0f, 240.0f, 99.463974f, 240.0f, 84.0f),
                    PathNode.CurveTo(240.0f, 68.536026f, 227.46397f, 56.0f, 212.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 96.0f),
                    PathNode.CurveTo(205.37259f, 96.0f, 200.0f, 90.62742f, 200.0f, 84.0f),
                    PathNode.CurveTo(200.0f, 77.37258f, 205.37259f, 72.0f, 212.0f, 72.0f),
                    PathNode.CurveTo(218.62741f, 72.0f, 224.0f, 77.37258f, 224.0f, 84.0f),
                    PathNode.CurveTo(224.0f, 90.62742f, 218.62741f, 96.0f, 212.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 153.0f),
                    PathNode.LineTo(128.0f, 88.0f),
                    PathNode.CurveTo(128.0f, 83.58172f, 124.41828f, 80.0f, 120.0f, 80.0f),
                    PathNode.CurveTo(115.58172f, 80.0f, 112.0f, 83.58172f, 112.0f, 88.0f),
                    PathNode.LineTo(112.0f, 153.0f),
                    PathNode.CurveTo(96.397545f, 157.02853f, 86.2246f, 172.03029f, 88.25505f, 188.016f),
                    PathNode.CurveTo(90.2855f, 204.00171f, 103.88586f, 215.98387f, 120.0f, 215.98387f),
                    PathNode.CurveTo(136.11415f, 215.98387f, 149.7145f, 204.00171f, 151.74495f, 188.016f),
                    PathNode.CurveTo(153.7754f, 172.03029f, 143.60245f, 157.02853f, 128.0f, 153.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 200.0f),
                    PathNode.CurveTo(111.163445f, 200.0f, 104.0f, 192.83656f, 104.0f, 184.0f),
                    PathNode.CurveTo(104.0f, 175.16344f, 111.163445f, 168.0f, 120.0f, 168.0f),
                    PathNode.CurveTo(128.83656f, 168.0f, 136.0f, 175.16344f, 136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 192.83656f, 128.83656f, 200.0f, 120.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 134.0f),
                    PathNode.LineTo(160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 25.90861f, 142.09138f, 8.0f, 120.0f, 8.0f),
                    PathNode.CurveTo(97.90861f, 8.0f, 80.0f, 25.90861f, 80.0f, 48.0f),
                    PathNode.LineTo(80.0f, 134.0f),
                    PathNode.CurveTo(58.78616f, 150.98466f, 50.61165f, 179.51443f, 59.611927f, 205.15622f),
                    PathNode.CurveTo(68.612206f, 230.798f, 92.82453f, 247.95999f, 120.0f, 247.95999f),
                    PathNode.CurveTo(147.17546f, 247.95999f, 171.3878f, 230.798f, 180.38808f, 205.15622f),
                    PathNode.CurveTo(189.38835f, 179.51443f, 181.21384f, 150.98466f, 160.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 232.0f),
                    PathNode.CurveTo(99.02391f, 232.00172f, 80.47614f, 218.38275f, 74.19708f, 198.36852f),
                    PathNode.CurveTo(67.918015f, 178.35428f, 75.36213f, 156.58087f, 92.58f, 144.6f),
                    PathNode.CurveTo(94.73495f, 143.09537f, 96.01337f, 140.62822f, 96.0f, 138.0f),
                    PathNode.LineTo(96.0f, 48.0f),
                    PathNode.CurveTo(96.0f, 34.745167f, 106.74516f, 24.0f, 120.0f, 24.0f),
                    PathNode.CurveTo(133.25484f, 24.0f, 144.0f, 34.745167f, 144.0f, 48.0f),
                    PathNode.LineTo(144.0f, 138.0f),
                    PathNode.CurveTo(143.99976f, 140.6141f, 145.27669f, 143.06343f, 147.42f, 144.56f),
                    PathNode.CurveTo(164.67476f, 156.52913f, 172.14594f, 178.325f, 165.86243f, 198.36256f),
                    PathNode.CurveTo(159.57892f, 218.40013f, 140.99966f, 232.02695f, 120.0f, 232.0f),
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
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
