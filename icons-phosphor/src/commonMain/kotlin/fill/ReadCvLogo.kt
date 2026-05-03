package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ReadCvLogo: ImageVector
    get() {
        if (_readCvLogo != null) return _readCvLogo!!
        _readCvLogo = phosphorFillIcon(
            name = "ReadCvLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.78f, 39.25f),
                    PathNode.LineTo(80.53f, 16.25f),
                    PathNode.CurveTo(71.82908f, 14.718857f, 63.53384f, 20.52955f, 62.0f, 29.23f),
                    PathNode.LineTo(32.25f, 198.23f),
                    PathNode.CurveTo(31.515123f, 202.41133f, 32.47216f, 206.7133f, 34.910397f, 210.18874f),
                    PathNode.CurveTo(37.348637f, 213.66415f, 41.068153f, 216.02808f, 45.25f, 216.76f),
                    PathNode.LineTo(175.5f, 239.76f),
                    PathNode.CurveTo(179.68286f, 240.4978f, 183.98743f, 239.54214f, 187.4651f, 237.10364f),
                    PathNode.CurveTo(190.9428f, 234.66513f, 193.30818f, 230.94391f, 194.04f, 226.76f),
                    PathNode.LineTo(223.79f, 57.76f),
                    PathNode.CurveTo(225.3077f, 49.056236f, 219.48341f, 40.76973f, 210.78f, 39.25f),
                    PathNode.Close,
                    PathNode.MoveTo(135.5f, 131.56f),
                    PathNode.CurveTo(134.82605f, 135.3799f, 131.5089f, 138.16597f, 127.63f, 138.17f),
                    PathNode.CurveTo(127.160774f, 138.16978f, 126.69242f, 138.12964f, 126.23f, 138.05f),
                    PathNode.LineTo(84.73f, 130.72f),
                    PathNode.CurveTo(80.637054f, 129.71329f, 78.02728f, 125.70361f, 78.76385f, 121.553535f),
                    PathNode.CurveTo(79.500404f, 117.40346f, 83.330605f, 114.53675f, 87.52f, 115.0f),
                    PathNode.LineTo(129.0f, 122.29f),
                    PathNode.CurveTo(131.09195f, 122.655914f, 132.95256f, 123.8386f, 134.17181f, 125.577446f),
                    PathNode.CurveTo(135.39107f, 127.31629f, 135.8689f, 129.46857f, 135.5f, 131.56f),
                    PathNode.Close,
                    PathNode.MoveTo(182.5f, 107.38f),
                    PathNode.CurveTo(181.8267f, 111.19619f, 178.51512f, 113.981125f, 174.64f, 113.99f),
                    PathNode.CurveTo(174.16696f, 113.99094f, 173.69489f, 113.94741f, 173.23f, 113.86f),
                    PathNode.LineTo(90.23f, 99.21f),
                    PathNode.CurveTo(85.878f, 98.43956f, 82.97456f, 94.287f, 83.745f, 89.935f),
                    PathNode.CurveTo(84.515434f, 85.58299f, 88.668f, 82.679565f, 93.02f, 83.45f),
                    PathNode.LineTo(176.02f, 98.11f),
                    PathNode.CurveTo(178.11378f, 98.47358f, 179.97688f, 99.65529f, 181.1982f, 101.3944f),
                    PathNode.CurveTo(182.41953f, 103.133514f, 182.8987f, 105.28711f, 182.53f, 107.38f),
                    PathNode.Close,
                    PathNode.MoveTo(188.05f, 75.86f),
                    PathNode.CurveTo(187.37604f, 79.6799f, 184.0589f, 82.465965f, 180.18f, 82.47f),
                    PathNode.CurveTo(179.7108f, 82.46936f, 179.24248f, 82.429214f, 178.78f, 82.35f),
                    PathNode.LineTo(95.78f, 67.69f),
                    PathNode.CurveTo(92.898384f, 67.2659f, 90.47496f, 65.30917f, 89.45322f, 62.581604f),
                    PathNode.CurveTo(88.43148f, 59.85404f, 88.97289f, 56.78669f, 90.86668f, 54.573734f),
                    PathNode.CurveTo(92.76045f, 52.36078f, 95.70732f, 51.35195f, 98.56f, 51.94f),
                    PathNode.LineTo(181.56f, 66.59f),
                    PathNode.CurveTo(183.65562f, 66.95124f, 185.5212f, 68.131966f, 186.74458f, 69.87135f),
                    PathNode.CurveTo(187.96797f, 71.61074f, 188.44849f, 73.76564f, 188.08f, 75.86f),
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
        return _readCvLogo!!
    }

private var _readCvLogo: ImageVector? = null
