package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorLightIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.37f, 161.89f),
                    PathNode.CurveTo(182.23288f, 182.14896f, 143.91103f, 183.39436f, 113.52f, 165.07f),
                    PathNode.LineTo(131.46f, 134.0f),
                    PathNode.LineTo(217.8f, 134.0f),
                    PathNode.CurveTo(217.16685f, 143.58144f, 214.99576f, 152.9985f, 211.37f, 161.89f),
                    PathNode.Close,
                    PathNode.MoveTo(88.3f, 47.24f),
                    PathNode.CurveTo(96.9081f, 42.995613f, 106.1426f, 40.162796f, 115.65f, 38.85f),
                    PathNode.CurveTo(147.76744f, 53.950676f, 168.01164f, 86.51607f, 167.34f, 122.0f),
                    PathNode.LineTo(131.46f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(217.8f, 122.0f),
                    PathNode.LineTo(179.34f, 122.0f),
                    PathNode.CurveTo(179.87845f, 89.267166f, 164.6912f, 58.260494f, 138.5f, 38.62f),
                    PathNode.CurveTo(181.54051f, 43.73596f, 214.84802f, 78.75715f, 217.8f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(77.92f, 53.26f),
                    PathNode.LineTo(97.13f, 86.53f),
                    PathNode.CurveTo(68.51715f, 102.43517f, 49.25958f, 131.08913f, 45.34f, 163.59f),
                    PathNode.CurveTo(28.181038f, 123.76823f, 41.881428f, 77.372765f, 77.92f, 53.26f),
                    PathNode.Close,
                    PathNode.MoveTo(57.0f, 183.19f),
                    PathNode.CurveTo(54.052425f, 147.85182f, 72.13028f, 114.07674f, 103.17f, 96.93f),
                    PathNode.LineTo(121.07f, 128.0f),
                    PathNode.LineTo(77.92f, 202.74f),
                    PathNode.CurveTo(69.95438f, 197.37355f, 62.89286f, 190.77448f, 57.0f, 183.19f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(114.23212f, 218.01454f, 100.646484f, 214.85255f, 88.3f, 208.76f),
                    PathNode.LineTo(107.52f, 175.47f),
                    PathNode.CurveTo(135.58298f, 192.2906f, 170.00597f, 194.64793f, 200.1f, 181.81f),
                    PathNode.CurveTo(183.13127f, 204.58354f, 156.40022f, 218.00096f, 128.0f, 218.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
