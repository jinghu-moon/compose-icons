package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Flower: ImageVector
    get() {
        if (_flower != null) return _flower!!
        _flower = phosphorRegularIcon(
            name = "Flower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.35f, 129.36f),
                    PathNode.CurveTo(209.54f, 128.89f, 208.65f, 128.44f, 207.73f, 128.0f),
                    PathNode.CurveTo(208.65f, 127.56f, 209.54f, 127.11f, 210.35f, 126.64f),
                    PathNode.CurveTo(222.82803f, 119.54553f, 230.54813f, 106.309074f, 230.57968f, 91.95527f),
                    PathNode.CurveTo(230.61124f, 77.60146f, 222.94942f, 64.331184f, 210.5027f, 57.181927f),
                    PathNode.CurveTo(198.05598f, 50.03267f, 182.73282f, 50.100624f, 170.35f, 57.36f),
                    PathNode.CurveTo(169.54f, 57.83f, 168.7f, 58.36f, 167.87f, 58.95f),
                    PathNode.CurveTo(167.95f, 57.95f, 168.0f, 56.95f, 168.0f, 55.95f),
                    PathNode.CurveTo(168.0f, 33.85861f, 150.09138f, 15.95f, 128.0f, 15.95f),
                    PathNode.CurveTo(105.90861f, 15.95f, 88.0f, 33.85861f, 88.0f, 55.95f),
                    PathNode.CurveTo(88.0f, 56.89f, 88.0f, 57.89f, 88.13f, 58.95f),
                    PathNode.CurveTo(87.3f, 58.38f, 86.46f, 57.83f, 85.65f, 57.36f),
                    PathNode.CurveTo(73.26718f, 50.100624f, 57.944023f, 50.03267f, 45.497303f, 57.181927f),
                    PathNode.CurveTo(33.050587f, 64.331184f, 25.38876f, 77.60146f, 25.420317f, 91.95527f),
                    PathNode.CurveTo(25.451872f, 106.309074f, 33.17197f, 119.54553f, 45.65f, 126.64f),
                    PathNode.CurveTo(46.46f, 127.11f, 47.35f, 127.56f, 48.27f, 128.0f),
                    PathNode.CurveTo(47.35f, 128.44f, 46.46f, 128.89f, 45.65f, 129.36f),
                    PathNode.CurveTo(33.17197f, 136.45447f, 25.451872f, 149.69093f, 25.420317f, 164.04474f),
                    PathNode.CurveTo(25.38876f, 178.39853f, 33.050587f, 191.66882f, 45.497303f, 198.81807f),
                    PathNode.CurveTo(57.944023f, 205.96733f, 73.26718f, 205.89938f, 85.65f, 198.64f),
                    PathNode.CurveTo(86.46f, 198.17f, 87.3f, 197.64f, 88.13f, 197.05f),
                    PathNode.CurveTo(88.05f, 198.05f, 88.0f, 199.05f, 88.0f, 200.0f),
                    PathNode.CurveTo(88.0f, 222.09138f, 105.90861f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(150.09138f, 240.0f, 168.0f, 222.09138f, 168.0f, 200.0f),
                    PathNode.CurveTo(168.0f, 199.06f, 167.95f, 198.06f, 167.87f, 197.05f),
                    PathNode.CurveTo(168.7f, 197.62f, 169.54f, 198.17f, 170.35f, 198.64f),
                    PathNode.CurveTo(176.40923f, 202.15013f, 183.28748f, 203.99905f, 190.29f, 204.0f),
                    PathNode.CurveTo(193.80858f, 203.99538f, 197.31151f, 203.53146f, 200.71f, 202.62f),
                    PathNode.CurveTo(216.33739f, 198.43152f, 227.90276f, 185.2415f, 230.01292f, 169.20073f),
                    PathNode.CurveTo(232.1231f, 153.15997f, 224.36247f, 137.42761f, 210.35f, 129.34f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 114.74516f, 114.74516f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(141.25484f, 104.0f, 152.0f, 114.74516f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 141.25484f, 141.25484f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(114.74516f, 152.0f, 104.0f, 141.25484f, 104.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.35f, 71.21f),
                    PathNode.CurveTo(189.82924f, 64.58258f, 204.50758f, 68.51576f, 211.135f, 79.995f),
                    PathNode.CurveTo(217.76242f, 91.474236f, 213.82924f, 106.15258f, 202.35f, 112.78f),
                    PathNode.CurveTo(196.08f, 116.41f, 183.74f, 118.91f, 167.19f, 119.97f),
                    PathNode.CurveTo(165.44409f, 111.50351f, 161.00235f, 103.83047f, 154.53f, 98.1f),
                    PathNode.CurveTo(163.73f, 84.28f, 172.08f, 74.84f, 178.35f, 71.21f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(141.25484f, 32.0f, 152.0f, 42.745167f, 152.0f, 56.0f),
                    PathNode.CurveTo(152.0f, 63.24f, 148.0f, 75.19f, 140.64f, 90.06f),
                    PathNode.CurveTo(132.43713f, 87.3134f, 123.56286f, 87.3134f, 115.36f, 90.06f),
                    PathNode.CurveTo(108.0f, 75.19f, 104.0f, 63.24f, 104.0f, 56.0f),
                    PathNode.CurveTo(104.0f, 42.745167f, 114.74516f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.86f, 80.0f),
                    PathNode.CurveTo(48.041714f, 74.4852f, 53.284348f, 70.46064f, 59.434032f, 68.8121f),
                    PathNode.CurveTo(65.58372f, 67.16356f, 72.13644f, 68.02614f, 77.65f, 71.21f),
                    PathNode.CurveTo(83.92f, 74.84f, 92.27f, 84.28f, 101.47f, 98.1f),
                    PathNode.CurveTo(94.99208f, 103.8383f, 90.54986f, 111.522705f, 88.81f, 120.0f),
                    PathNode.CurveTo(72.26f, 118.94f, 59.92f, 116.44f, 53.65f, 112.82f),
                    PathNode.CurveTo(48.127056f, 109.63819f, 44.096645f, 104.39009f, 42.447666f, 98.23317f),
                    PathNode.CurveTo(40.798695f, 92.07625f, 41.66661f, 85.51626f, 44.86f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(77.65f, 184.79f),
                    PathNode.CurveTo(66.17076f, 191.41742f, 51.492416f, 187.48424f, 44.865f, 176.005f),
                    PathNode.CurveTo(38.237583f, 164.52576f, 42.17076f, 149.84741f, 53.65f, 143.22f),
                    PathNode.CurveTo(59.92f, 139.59f, 72.26f, 137.09f, 88.81f, 136.03f),
                    PathNode.CurveTo(90.55591f, 144.49649f, 94.99764f, 152.16954f, 101.47f, 157.9f),
                    PathNode.CurveTo(92.27f, 171.72f, 83.92f, 181.16f, 77.65f, 184.79f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 224.0f),
                    PathNode.CurveTo(114.74516f, 224.0f, 104.0f, 213.25484f, 104.0f, 200.0f),
                    PathNode.CurveTo(104.0f, 192.76f, 108.0f, 180.81f, 115.36f, 165.94f),
                    PathNode.CurveTo(123.56286f, 168.68658f, 132.43713f, 168.68658f, 140.64f, 165.94f),
                    PathNode.CurveTo(148.0f, 180.81f, 152.0f, 192.76f, 152.0f, 200.0f),
                    PathNode.CurveTo(152.0f, 213.25484f, 141.25484f, 224.0f, 128.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.14f, 176.0f),
                    PathNode.CurveTo(207.95828f, 181.5148f, 202.71565f, 185.53935f, 196.56596f, 187.1879f),
                    PathNode.CurveTo(190.41629f, 188.83644f, 183.86356f, 187.97386f, 178.35f, 184.79f),
                    PathNode.CurveTo(172.08f, 181.16f, 163.73f, 171.72f, 154.53f, 157.9f),
                    PathNode.CurveTo(161.00792f, 152.1617f, 165.45013f, 144.4773f, 167.19f, 136.0f),
                    PathNode.CurveTo(183.74f, 137.06f, 196.08f, 139.56f, 202.35f, 143.18f),
                    PathNode.CurveTo(207.87294f, 146.36182f, 211.90335f, 151.60991f, 213.55232f, 157.76683f),
                    PathNode.CurveTo(215.20131f, 163.92374f, 214.33339f, 170.48373f, 211.14f, 176.0f),
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
        return _flower!!
    }

private var _flower: ImageVector? = null
