package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = phosphorBoldIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.0f, 96.0f),
                    PathNode.CurveTo(240.46399f, 88.17382f, 233.46129f, 82.647446f, 225.26f, 82.0f),
                    PathNode.LineTo(168.67f, 77.43f),
                    PathNode.LineTo(146.83f, 24.62f),
                    PathNode.CurveTo(143.69089f, 16.986488f, 136.25375f, 12.003429f, 128.0f, 12.003429f),
                    PathNode.CurveTo(119.74624f, 12.003429f, 112.30911f, 16.986488f, 109.17f, 24.62f),
                    PathNode.LineTo(87.35f, 77.44f),
                    PathNode.LineTo(30.76f, 82.0f),
                    PathNode.CurveTo(22.544859f, 82.67751f, 15.539625f, 88.22102f, 12.992017f, 96.060486f),
                    PathNode.CurveTo(10.444407f, 103.899956f, 12.852551f, 112.50255f, 19.1f, 117.88f),
                    PathNode.LineTo(62.28f, 155.12f),
                    PathNode.LineTo(49.08f, 210.82f),
                    PathNode.CurveTo(47.110855f, 218.8522f, 50.193436f, 227.27777f, 56.88116f, 232.14276f),
                    PathNode.CurveTo(63.56888f, 237.00775f, 72.53425f, 237.3465f, 79.57f, 233.0f),
                    PathNode.LineTo(128.0f, 203.19f),
                    PathNode.LineTo(176.43f, 233.0f),
                    PathNode.CurveTo(183.46286f, 237.31677f, 192.40425f, 236.96893f, 199.0805f, 232.11885f),
                    PathNode.CurveTo(205.75674f, 227.26877f, 208.85144f, 218.8728f, 206.92f, 210.85f),
                    PathNode.LineTo(193.72f, 155.15f),
                    PathNode.LineTo(236.9f, 117.91f),
                    PathNode.CurveTo(243.1863f, 112.518166f, 245.59554f, 103.86464f, 243.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.53f, 141.7f),
                    PathNode.CurveTo(169.13588f, 144.62619f, 167.65504f, 149.19978f, 168.69f, 153.56f),
                    PathNode.LineTo(181.58f, 208.0f),
                    PathNode.LineTo(134.29f, 178.92f),
                    PathNode.CurveTo(130.43271f, 176.54585f, 125.56729f, 176.54585f, 121.71f, 178.92f),
                    PathNode.LineTo(74.42f, 208.0f),
                    PathNode.LineTo(87.31f, 153.6f),
                    PathNode.CurveTo(88.344955f, 149.23978f, 86.86413f, 144.66618f, 83.47f, 141.74f),
                    PathNode.LineTo(41.2f, 105.24f),
                    PathNode.LineTo(96.6f, 100.77f),
                    PathNode.CurveTo(101.09513f, 100.40886f, 105.008286f, 97.558014f, 106.73f, 93.39f),
                    PathNode.LineTo(128.0f, 41.89f),
                    PathNode.LineTo(149.27f, 93.39f),
                    PathNode.CurveTo(150.99171f, 97.558014f, 154.90486f, 100.40886f, 159.4f, 100.77f),
                    PathNode.LineTo(214.8f, 105.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _star!!
    }

private var _star: ImageVector? = null
