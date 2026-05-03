package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorLightIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(173.88f, 111.94f),
                    PathNode.CurveTo(173.49298f, 110.049515f, 172.22032f, 108.46056f, 170.46f, 107.67f),
                    PathNode.LineTo(119.0f, 84.56f),
                    PathNode.LineTo(133.0f, 25.39f),
                    PathNode.CurveTo(133.63483f, 22.735931f, 132.39865f, 19.98778f, 129.99162f, 18.70199f),
                    PathNode.CurveTo(127.58458f, 17.416199f, 124.61305f, 17.916689f, 122.76f, 19.92f),
                    PathNode.LineTo(27.6f, 122.78f),
                    PathNode.CurveTo(26.287073f, 124.19696f, 25.736668f, 126.159386f, 26.121225f, 128.05244f),
                    PathNode.CurveTo(26.505783f, 129.94551f, 27.778263f, 131.53763f, 29.54f, 132.33f),
                    PathNode.LineTo(81.0f, 155.44f),
                    PathNode.LineTo(67.0f, 214.61f),
                    PathNode.CurveTo(66.367775f, 217.2595f, 67.59963f, 220.00244f, 70.0f, 221.29f),
                    PathNode.CurveTo(72.40461f, 222.56923f, 75.36922f, 222.0683f, 77.22f, 220.07f),
                    PathNode.LineTo(172.42f, 117.22f),
                    PathNode.CurveTo(173.7286f, 115.79784f, 174.27208f, 113.83242f, 173.88f, 111.94f),
                    PathNode.Close,
                    PathNode.MoveTo(83.88f, 195.15f),
                    PathNode.LineTo(93.8f, 153.39f),
                    PathNode.CurveTo(94.46534f, 150.58853f, 93.04677f, 147.70941f, 90.42f, 146.53f),
                    PathNode.LineTo(42.08f, 124.8f),
                    PathNode.LineTo(116.08f, 44.8f),
                    PathNode.LineTo(106.16f, 86.57f),
                    PathNode.CurveTo(105.49466f, 89.37147f, 106.91324f, 92.25059f, 109.54f, 93.43f),
                    PathNode.LineTo(157.92f, 115.16f),
                    PathNode.Close,
                    PathNode.MoveTo(237.32f, 213.31f),
                    PathNode.LineTo(201.32f, 141.31f),
                    PathNode.CurveTo(200.30502f, 139.27351f, 198.2254f, 137.9864f, 195.95f, 137.9864f),
                    PathNode.CurveTo(193.67459f, 137.9864f, 191.59499f, 139.27351f, 190.58f, 141.31f),
                    PathNode.LineTo(154.58f, 213.31f),
                    PathNode.CurveTo(153.09712f, 216.27577f, 154.29922f, 219.88211f, 157.265f, 221.365f),
                    PathNode.CurveTo(160.23077f, 222.84789f, 163.83711f, 221.64577f, 165.32f, 218.68f),
                    PathNode.LineTo(175.71f, 198.0f),
                    PathNode.LineTo(216.29f, 198.0f),
                    PathNode.LineTo(226.63f, 218.68f),
                    PathNode.CurveTo(227.646f, 220.71509f, 229.7254f, 222.00069f, 232.0f, 222.0f),
                    PathNode.CurveTo(232.93146f, 222.00232f, 233.8501f, 221.78294f, 234.68f, 221.36f),
                    PathNode.CurveTo(237.64273f, 219.87686f, 238.84251f, 216.27304f, 237.36f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(181.71f, 186.0f),
                    PathNode.LineTo(196.0f, 157.42f),
                    PathNode.LineTo(210.29f, 186.0f),
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
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
