package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorLightIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.37012f, 33.796955f, 46.98458f, 33.477768f, 44.53943f, 35.255135f),
                    PathNode.CurveTo(42.09428f, 37.032505f, 41.353188f, 40.351322f, 42.81f, 43.0f),
                    PathNode.CurveTo(37.490612f, 45.12326f, 34.001007f, 50.272514f, 34.0f, 56.0f),
                    PathNode.LineTo(34.0f, 112.0f),
                    PathNode.CurveTo(34.0f, 163.94f, 59.12f, 195.4f, 80.2f, 212.64f),
                    PathNode.CurveTo(102.93f, 231.24f, 125.47f, 237.53f, 126.42f, 237.79f),
                    PathNode.CurveTo(127.454414f, 238.07236f, 128.5456f, 238.07236f, 129.58f, 237.79f),
                    PathNode.CurveTo(130.94f, 237.42f, 161.49f, 228.84f, 187.25f, 202.09f),
                    PathNode.LineTo(203.56f, 220.0f),
                    PathNode.CurveTo(205.79123f, 222.45215f, 209.58786f, 222.63123f, 212.04f, 220.4f),
                    PathNode.CurveTo(214.49214f, 218.16876f, 214.67123f, 214.37215f, 212.44f, 211.92f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 225.72f),
                    PathNode.CurveTo(113.23636f, 220.647f, 99.4998f, 212.97269f, 87.44f, 203.06f),
                    PathNode.CurveTo(59.94f, 180.39f, 46.0f, 149.75f, 46.0f, 112.0f),
                    PathNode.LineTo(46.0f, 56.0f),
                    PathNode.CurveTo(46.0f, 54.89543f, 46.89543f, 54.0f, 48.0f, 54.0f),
                    PathNode.LineTo(52.6f, 54.0f),
                    PathNode.LineTo(179.16f, 193.19f),
                    PathNode.CurveTo(164.8925f, 207.89388f, 147.3676f, 219.03706f, 128.0f, 225.72f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 56.0f),
                    PathNode.LineTo(222.0f, 112.0f),
                    PathNode.CurveTo(222.0f, 132.29f, 218.17f, 151.05f, 210.62f, 167.77f),
                    PathNode.CurveTo(209.64902f, 169.91954f, 207.50868f, 171.30078f, 205.15f, 171.3f),
                    PathNode.CurveTo(204.29718f, 171.30186f, 203.45422f, 171.11758f, 202.68f, 170.76f),
                    PathNode.CurveTo(199.66385f, 169.39665f, 198.32149f, 165.84831f, 199.68f, 162.83f),
                    PathNode.CurveTo(206.53f, 147.67f, 210.0f, 130.57f, 210.0f, 112.0f),
                    PathNode.LineTo(210.0f, 56.0f),
                    PathNode.CurveTo(210.0f, 54.89543f, 209.10457f, 54.0f, 208.0f, 54.0f),
                    PathNode.LineTo(98.52f, 54.0f),
                    PathNode.CurveTo(95.20629f, 54.0f, 92.52f, 51.31371f, 92.52f, 48.0f),
                    PathNode.CurveTo(92.52f, 44.68629f, 95.20629f, 42.0f, 98.52f, 42.0f),
                    PathNode.LineTo(208.0f, 42.0f),
                    PathNode.CurveTo(215.73198f, 42.0f, 222.0f, 48.268013f, 222.0f, 56.0f),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
