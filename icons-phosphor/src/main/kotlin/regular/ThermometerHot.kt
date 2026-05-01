package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) return _thermometerHot!!
        _thermometerHot = phosphorRegularIcon(
            name = "ThermometerHot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 153.0f),
                    PathNode.LineTo(128.0f, 48.0f),
                    PathNode.CurveTo(128.0f, 43.581722f, 124.41828f, 40.0f, 120.0f, 40.0f),
                    PathNode.CurveTo(115.58172f, 40.0f, 112.0f, 43.581722f, 112.0f, 48.0f),
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
                    PathNode.Close,
                    PathNode.MoveTo(177.3f, 80.77f),
                    PathNode.CurveTo(174.887f, 77.0696f, 175.9301f, 72.11376f, 179.63f, 69.7f),
                    PathNode.CurveTo(194.63f, 59.91f, 206.5f, 64.95f, 215.14f, 68.64f),
                    PathNode.CurveTo(223.0f, 72.0f, 227.76f, 74.0f, 235.63f, 68.89f),
                    PathNode.CurveTo(239.33307f, 66.47652f, 244.29152f, 67.521935f, 246.705f, 71.225f),
                    PathNode.CurveTo(249.11848f, 74.92807f, 248.07307f, 79.88651f, 244.37f, 82.3f),
                    PathNode.CurveTo(237.88f, 86.53f, 232.0f, 88.0f, 226.69f, 88.0f),
                    PathNode.CurveTo(219.69f, 88.0f, 213.77f, 85.46f, 208.86f, 83.37f),
                    PathNode.CurveTo(201.0f, 80.0f, 196.24f, 78.0f, 188.37f, 83.11f),
                    PathNode.CurveTo(186.59177f, 84.26784f, 184.42639f, 84.671776f, 182.35031f, 84.23293f),
                    PathNode.CurveTo(180.27423f, 83.79408f, 178.45755f, 82.548416f, 177.3f, 80.77f),
                    PathNode.Close,
                    PathNode.MoveTo(246.7f, 103.23f),
                    PathNode.CurveTo(249.113f, 106.9304f, 248.0699f, 111.88624f, 244.37f, 114.3f),
                    PathNode.CurveTo(237.88f, 118.53f, 232.0f, 120.0f, 226.69f, 120.0f),
                    PathNode.CurveTo(219.69f, 120.0f, 213.77f, 117.46f, 208.86f, 115.37f),
                    PathNode.CurveTo(200.99f, 112.01f, 196.24f, 109.99f, 188.37f, 115.12f),
                    PathNode.CurveTo(184.66693f, 117.533485f, 179.70848f, 116.48807f, 177.295f, 112.785f),
                    PathNode.CurveTo(174.88152f, 109.08194f, 175.92693f, 104.12348f, 179.63f, 101.71f),
                    PathNode.CurveTo(194.63f, 91.92f, 206.5f, 96.96f, 215.14f, 100.65f),
                    PathNode.CurveTo(223.01f, 104.01f, 227.76f, 106.04f, 235.63f, 100.9f),
                    PathNode.CurveTo(239.3304f, 98.487f, 244.28624f, 99.5301f, 246.7f, 103.23f),
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
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
