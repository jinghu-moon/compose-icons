package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BowlSteam: ImageVector
    get() {
        if (_bowlSteam != null) return _bowlSteam!!
        _bowlSteam = phosphorDuotoneIcon(
            name = "BowlSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 120.0f),
                    PathNode.CurveTo(224.01186f, 157.54732f, 202.13275f, 191.65529f, 168.0f, 207.3f),
                    PathNode.LineTo(168.0f, 216.0f),
                    PathNode.CurveTo(168.0f, 220.41827f, 164.41827f, 224.0f, 160.0f, 224.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.CurveTo(91.58172f, 224.0f, 88.0f, 220.41827f, 88.0f, 216.0f),
                    PathNode.LineTo(88.0f, 207.3f),
                    PathNode.CurveTo(53.867252f, 191.65529f, 31.98815f, 157.54732f, 32.0f, 120.0f),
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
                    PathNode.MoveTo(81.77f, 55.0f),
                    PathNode.CurveTo(87.12f, 48.34f, 88.44f, 43.84f, 87.89f, 41.86f),
                    PathNode.CurveTo(87.47f, 40.37f, 85.48f, 39.6f, 85.46f, 39.6f),
                    PathNode.CurveTo(81.71877f, 38.370506f, 79.428764f, 34.601143f, 80.06164f, 30.714254f),
                    PathNode.CurveTo(80.6945f, 26.827364f, 84.06198f, 23.979156f, 88.0f, 24.0f),
                    PathNode.CurveTo(88.80682f, 24.000944f, 89.60899f, 24.12228f, 90.38f, 24.36f),
                    PathNode.CurveTo(91.38f, 24.67f, 100.29f, 27.69f, 103.17f, 37.12f),
                    PathNode.CurveTo(105.63f, 45.19f, 102.62f, 54.57f, 94.23f, 65.01f),
                    PathNode.CurveTo(88.88f, 71.67f, 87.56f, 76.17f, 88.11f, 78.15f),
                    PathNode.CurveTo(88.53f, 79.64f, 90.48f, 80.39f, 90.5f, 80.4f),
                    PathNode.CurveTo(94.23385f, 81.62726f, 96.52313f, 85.38505f, 95.90121f, 89.2659f),
                    PathNode.CurveTo(95.27928f, 93.14675f, 91.93037f, 96.000984f, 88.0f, 96.0f),
                    PathNode.CurveTo(87.19318f, 95.999054f, 86.39101f, 95.87772f, 85.62f, 95.64f),
                    PathNode.CurveTo(84.62f, 95.33f, 75.71f, 92.31f, 72.83f, 82.88f),
                    PathNode.CurveTo(70.37f, 74.81f, 73.38f, 65.43f, 81.77f, 55.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.83f, 82.89f),
                    PathNode.CurveTo(115.71f, 92.32f, 124.62f, 95.34f, 125.62f, 95.65f),
                    PathNode.CurveTo(126.391525f, 95.88433f, 127.19368f, 96.0023f, 128.0f, 96.0f),
                    PathNode.CurveTo(131.93037f, 96.000984f, 135.27928f, 93.14675f, 135.90121f, 89.2659f),
                    PathNode.CurveTo(136.52315f, 85.38505f, 134.23386f, 81.62726f, 130.5f, 80.4f),
                    PathNode.CurveTo(130.5f, 80.4f, 128.5f, 79.64f, 128.11f, 78.15f),
                    PathNode.CurveTo(127.56f, 76.15f, 128.88f, 71.67f, 134.23f, 65.01f),
                    PathNode.CurveTo(142.62f, 54.57f, 145.63f, 45.19f, 143.17f, 37.12f),
                    PathNode.CurveTo(140.29f, 27.69f, 131.39f, 24.67f, 130.38f, 24.36f),
                    PathNode.CurveTo(129.609f, 24.12228f, 128.80682f, 24.000944f, 128.0f, 24.0f),
                    PathNode.CurveTo(124.0738f, 23.994205f, 120.723656f, 26.838444f, 120.092316f, 30.713554f),
                    PathNode.CurveTo(119.46095f, 34.588665f, 121.73501f, 38.349224f, 125.46f, 39.59f),
                    PathNode.CurveTo(125.46f, 39.59f, 127.46f, 40.36f, 127.89f, 41.85f),
                    PathNode.CurveTo(128.44f, 43.85f, 127.12f, 48.33f, 121.77f, 54.99f),
                    PathNode.CurveTo(113.38f, 65.43f, 110.37f, 74.81f, 112.83f, 82.88f),
                    PathNode.Close,
                    PathNode.MoveTo(152.83f, 82.89f),
                    PathNode.CurveTo(155.71f, 92.32f, 164.62f, 95.34f, 165.62f, 95.65f),
                    PathNode.CurveTo(166.39153f, 95.88433f, 167.19368f, 96.0023f, 168.0f, 96.0f),
                    PathNode.CurveTo(171.93037f, 96.000984f, 175.27928f, 93.14675f, 175.90121f, 89.2659f),
                    PathNode.CurveTo(176.52315f, 85.38505f, 174.23386f, 81.62726f, 170.5f, 80.4f),
                    PathNode.CurveTo(170.5f, 80.4f, 168.5f, 79.64f, 168.11f, 78.15f),
                    PathNode.CurveTo(167.56f, 76.15f, 168.88f, 71.67f, 174.23f, 65.01f),
                    PathNode.CurveTo(182.62f, 54.57f, 185.63f, 45.19f, 183.17f, 37.12f),
                    PathNode.CurveTo(180.29f, 27.69f, 171.39f, 24.67f, 170.38f, 24.36f),
                    PathNode.CurveTo(169.609f, 24.12228f, 168.80681f, 24.000944f, 168.0f, 24.0f),
                    PathNode.CurveTo(164.0738f, 23.994205f, 160.72366f, 26.838444f, 160.0923f, 30.713554f),
                    PathNode.CurveTo(159.46095f, 34.588665f, 161.735f, 38.349224f, 165.46f, 39.59f),
                    PathNode.CurveTo(165.46f, 39.59f, 167.46f, 40.36f, 167.89f, 41.85f),
                    PathNode.CurveTo(168.44f, 43.85f, 167.12f, 48.33f, 161.77f, 54.99f),
                    PathNode.CurveTo(153.38f, 65.43f, 150.37f, 74.81f, 152.83f, 82.88f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 120.0f),
                    PathNode.CurveTo(231.92834f, 158.77542f, 210.36201f, 194.31366f, 176.0f, 212.28f),
                    PathNode.LineTo(176.0f, 216.0f),
                    PathNode.CurveTo(176.0f, 224.83656f, 168.83656f, 232.0f, 160.0f, 232.0f),
                    PathNode.LineTo(96.0f, 232.0f),
                    PathNode.CurveTo(87.163445f, 232.0f, 80.0f, 224.83656f, 80.0f, 216.0f),
                    PathNode.LineTo(80.0f, 212.28f),
                    PathNode.CurveTo(45.637978f, 194.31366f, 24.07164f, 158.77542f, 24.0f, 120.0f),
                    PathNode.CurveTo(24.0f, 115.58172f, 27.581722f, 112.0f, 32.0f, 112.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(228.41827f, 112.0f, 232.0f, 115.58172f, 232.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.63f, 128.0f),
                    PathNode.LineTo(40.37f, 128.0f),
                    PathNode.CurveTo(43.29937f, 159.38292f, 62.7368f, 186.82397f, 91.37f, 200.0f),
                    PathNode.CurveTo(94.20503f, 201.31676f, 96.01344f, 204.16414f, 96.0f, 207.29f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.LineTo(160.0f, 207.29f),
                    PathNode.CurveTo(159.99977f, 204.16441f, 161.81985f, 201.32492f, 164.66f, 200.02f),
                    PathNode.CurveTo(193.28735f, 186.83228f, 212.71329f, 159.38367f, 215.63f, 128.0f),
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
        return _bowlSteam!!
    }

private var _bowlSteam: ImageVector? = null
