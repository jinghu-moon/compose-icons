package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorLightIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(179.84f, 51.39f),
                    PathNode.CurveTo(164.63612f, 38.791557f, 148.16043f, 27.812231f, 130.68f, 18.63f),
                    PathNode.CurveTo(128.99263f, 17.787603f, 127.00737f, 17.787603f, 125.32f, 18.63f),
                    PathNode.CurveTo(107.83957f, 27.812231f, 91.36388f, 38.791557f, 76.16f, 51.39f),
                    PathNode.CurveTo(42.88f, 79.13f, 26.0f, 107.59f, 26.0f, 136.0f),
                    PathNode.CurveTo(25.99912f, 154.14607f, 35.112354f, 171.07939f, 50.258026f, 181.07384f),
                    PathNode.CurveTo(65.4037f, 191.0683f, 84.55656f, 192.78746f, 101.24f, 185.65f),
                    PathNode.LineTo(90.24f, 222.28f),
                    PathNode.CurveTo(89.695915f, 224.09831f, 90.04423f, 226.06683f, 91.17922f, 227.58804f),
                    PathNode.CurveTo(92.31422f, 229.10925f, 94.102036f, 230.00374f, 96.0f, 230.0f),
                    PathNode.LineTo(160.0f, 230.0f),
                    PathNode.CurveTo(161.89621f, 230.00058f, 163.68109f, 229.10477f, 164.81375f, 227.58403f),
                    PathNode.CurveTo(165.94643f, 226.0633f, 166.29358f, 224.09662f, 165.75f, 222.28f),
                    PathNode.LineTo(154.75f, 185.65f),
                    PathNode.CurveTo(171.43448f, 192.79189f, 190.5907f, 191.07495f, 205.73923f, 181.07994f),
                    PathNode.CurveTo(220.88774f, 171.08493f, 230.00232f, 154.14877f, 230.0f, 136.0f),
                    PathNode.CurveTo(230.0f, 107.59f, 213.12f, 79.13f, 179.84f, 51.39f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 178.0f),
                    PathNode.CurveTo(165.85301f, 178.0005f, 156.0489f, 174.32751f, 148.4f, 167.66f),
                    PathNode.CurveTo(146.38634f, 165.90637f, 143.4561f, 165.69449f, 141.2111f, 167.1402f),
                    PathNode.CurveTo(138.96611f, 168.58589f, 137.94664f, 171.34122f, 138.71f, 173.9f),
                    PathNode.LineTo(151.94f, 218.0f),
                    PathNode.LineTo(104.06f, 218.0f),
                    PathNode.LineTo(117.29f, 173.9f),
                    PathNode.CurveTo(118.05335f, 171.34122f, 117.03389f, 168.58589f, 114.788895f, 167.1402f),
                    PathNode.CurveTo(112.5439f, 165.69449f, 109.61367f, 165.90637f, 107.6f, 167.66f),
                    PathNode.CurveTo(95.18818f, 178.48079f, 77.59806f, 181.05038f, 62.609516f, 174.23233f),
                    PathNode.CurveTo(47.62097f, 167.41426f, 37.999283f, 152.4664f, 38.0f, 136.0f),
                    PathNode.CurveTo(38.0f, 82.27f, 112.77f, 39.0f, 128.0f, 30.78f),
                    PathNode.CurveTo(143.24f, 39.0f, 218.0f, 82.2f, 218.0f, 136.0f),
                    PathNode.CurveTo(218.0f, 159.19595f, 199.19595f, 178.0f, 176.0f, 178.0f),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
