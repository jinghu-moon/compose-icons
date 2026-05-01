package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorLightIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.84f, 118.63f),
                    PathNode.CurveTo(213.38403f, 116.67953f, 211.9848f, 115.085236f, 210.11f, 114.38f),
                    PathNode.LineTo(150.88f, 92.17f),
                    PathNode.LineTo(165.88f, 17.17f),
                    PathNode.CurveTo(166.40579f, 14.539824f, 165.12206f, 11.880176f, 162.73569f, 10.655622f),
                    PathNode.CurveTo(160.34932f, 9.431069f, 157.44008f, 9.939116f, 155.61f, 11.9f),
                    PathNode.LineTo(43.61f, 131.9f),
                    PathNode.CurveTo(42.24398f, 133.36461f, 41.69879f, 135.41422f, 42.156605f, 137.36395f),
                    PathNode.CurveTo(42.61442f, 139.31369f, 44.014877f, 140.90645f, 45.89f, 141.61f),
                    PathNode.LineTo(105.12f, 163.82f),
                    PathNode.LineTo(90.12f, 238.82f),
                    PathNode.CurveTo(89.59074f, 241.45099f, 90.87298f, 244.11348f, 93.26f, 245.34f),
                    PathNode.CurveTo(94.1089f, 245.77193f, 95.04753f, 245.99802f, 96.0f, 246.0f),
                    PathNode.CurveTo(97.664955f, 246.0f, 99.25506f, 245.30818f, 100.39f, 244.09f),
                    PathNode.LineTo(212.39f, 124.09f),
                    PathNode.CurveTo(213.7535f, 122.625626f, 214.2973f, 120.57793f, 213.84f, 118.63f),
                    PathNode.Close,
                    PathNode.MoveTo(106.0f, 220.46f),
                    PathNode.LineTo(117.85f, 161.18f),
                    PathNode.CurveTo(118.43062f, 158.29556f, 116.83398f, 155.4157f, 114.08f, 154.38f),
                    PathNode.LineTo(58.48f, 133.53f),
                    PathNode.LineTo(149.94f, 35.53f),
                    PathNode.LineTo(138.12f, 94.82f),
                    PathNode.CurveTo(137.53938f, 97.70443f, 139.13602f, 100.584305f, 141.89f, 101.62f),
                    PathNode.LineTo(197.49f, 122.47f),
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
        return _lightning!!
    }

private var _lightning: ImageVector? = null
