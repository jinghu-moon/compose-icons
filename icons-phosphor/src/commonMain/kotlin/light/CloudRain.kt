package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorLightIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(157.0f, 195.33f),
                    PathNode.LineTo(125.0f, 243.33f),
                    PathNode.CurveTo(123.16089f, 246.09143f, 119.43143f, 246.83911f, 116.67f, 245.0f),
                    PathNode.CurveTo(113.90858f, 243.16089f, 113.16089f, 239.43143f, 115.0f, 236.67f),
                    PathNode.LineTo(147.0f, 188.67f),
                    PathNode.CurveTo(148.83911f, 185.90857f, 152.56857f, 185.16089f, 155.33f, 187.0f),
                    PathNode.CurveTo(158.09143f, 188.83911f, 158.83911f, 192.56857f, 157.0f, 195.33f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 92.0f),
                    PathNode.CurveTo(229.95041f, 132.84851f, 196.84851f, 165.95041f, 156.0f, 166.0f),
                    PathNode.LineTo(131.21f, 166.0f),
                    PathNode.LineTo(101.0f, 211.33f),
                    PathNode.CurveTo(99.16089f, 214.09143f, 95.43143f, 214.83911f, 92.67f, 213.0f),
                    PathNode.CurveTo(89.90858f, 211.16089f, 89.16089f, 207.43143f, 91.0f, 204.67f),
                    PathNode.LineTo(116.79f, 166.0f),
                    PathNode.LineTo(76.0f, 166.0f),
                    PathNode.CurveTo(56.96944f, 165.9036f, 39.643623f, 155.01224f, 31.306555f, 137.90479f),
                    PathNode.CurveTo(22.969486f, 120.79733f, 25.066874f, 100.44035f, 36.71694f, 85.39218f),
                    PathNode.CurveTo(48.367016f, 70.34402f, 67.54957f, 63.21412f, 86.2f, 67.0f),
                    PathNode.CurveTo(98.369095f, 33.11609f, 133.13788f, 12.887378f, 168.60869f, 19.054068f),
                    PathNode.CurveTo(204.07948f, 25.22076f, 229.9809f, 55.99714f, 230.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 92.0f),
                    PathNode.CurveTo(217.89091f, 58.514874f, 191.2371f, 31.154266f, 157.7663f, 30.169037f),
                    PathNode.CurveTo(124.2955f, 29.183807f, 96.07849f, 54.929268f, 94.0f, 88.35f),
                    PathNode.CurveTo(93.8067f, 91.66371f, 90.96371f, 94.1933f, 87.65f, 94.0f),
                    PathNode.CurveTo(84.33629f, 93.8067f, 81.8067f, 90.96371f, 82.0f, 87.65f),
                    PathNode.CurveTo(82.176926f, 84.631355f, 82.53423f, 81.625984f, 83.07f, 78.65f),
                    PathNode.CurveTo(68.90728f, 75.99643f, 54.46205f, 81.581535f, 45.768143f, 93.0724f),
                    PathNode.CurveTo(37.074238f, 104.56327f, 35.627426f, 119.982895f, 42.032063f, 132.89044f),
                    PathNode.CurveTo(48.4367f, 145.79799f, 61.590862f, 153.9727f, 76.0f, 154.0f),
                    PathNode.LineTo(156.0f, 154.0f),
                    PathNode.CurveTo(190.22566f, 153.96143f, 217.96143f, 126.22566f, 218.0f, 92.0f),
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
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
