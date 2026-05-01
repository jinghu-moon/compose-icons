package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorLightIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 206.0f),
                    PathNode.LineTo(72.0f, 206.0f),
                    PathNode.CurveTo(68.686295f, 206.0f, 66.0f, 203.3137f, 66.0f, 200.0f),
                    PathNode.CurveTo(66.0f, 196.6863f, 68.686295f, 194.0f, 72.0f, 194.0f),
                    PathNode.LineTo(120.0f, 194.0f),
                    PathNode.CurveTo(123.313705f, 194.0f, 126.0f, 196.6863f, 126.0f, 200.0f),
                    PathNode.CurveTo(126.0f, 203.3137f, 123.313705f, 206.0f, 120.0f, 206.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 194.0f),
                    PathNode.LineTo(160.0f, 194.0f),
                    PathNode.CurveTo(156.6863f, 194.0f, 154.0f, 196.6863f, 154.0f, 200.0f),
                    PathNode.CurveTo(154.0f, 203.3137f, 156.6863f, 206.0f, 160.0f, 206.0f),
                    PathNode.LineTo(184.0f, 206.0f),
                    PathNode.CurveTo(187.3137f, 206.0f, 190.0f, 203.3137f, 190.0f, 200.0f),
                    PathNode.CurveTo(190.0f, 196.6863f, 187.3137f, 194.0f, 184.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 226.0f),
                    PathNode.LineTo(104.0f, 226.0f),
                    PathNode.CurveTo(100.686295f, 226.0f, 98.0f, 228.6863f, 98.0f, 232.0f),
                    PathNode.CurveTo(98.0f, 235.3137f, 100.686295f, 238.0f, 104.0f, 238.0f),
                    PathNode.LineTo(160.0f, 238.0f),
                    PathNode.CurveTo(163.3137f, 238.0f, 166.0f, 235.3137f, 166.0f, 232.0f),
                    PathNode.CurveTo(166.0f, 228.6863f, 163.3137f, 226.0f, 160.0f, 226.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 100.0f),
                    PathNode.CurveTo(229.95041f, 140.84851f, 196.84851f, 173.95041f, 156.0f, 174.0f),
                    PathNode.LineTo(76.0f, 174.0f),
                    PathNode.CurveTo(56.96944f, 173.9036f, 39.643623f, 163.01224f, 31.306555f, 145.90479f),
                    PathNode.CurveTo(22.969486f, 128.79733f, 25.066874f, 108.44035f, 36.71694f, 93.39218f),
                    PathNode.CurveTo(48.367016f, 78.34402f, 67.54957f, 71.21412f, 86.2f, 75.0f),
                    PathNode.CurveTo(98.369095f, 41.11609f, 133.13788f, 20.887377f, 168.60869f, 27.054068f),
                    PathNode.CurveTo(204.07948f, 33.22076f, 229.9809f, 63.99714f, 230.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 100.0f),
                    PathNode.CurveTo(217.89091f, 66.51488f, 191.2371f, 39.154266f, 157.7663f, 38.169037f),
                    PathNode.CurveTo(124.2955f, 37.183807f, 96.07849f, 62.929268f, 94.0f, 96.35f),
                    PathNode.CurveTo(93.8067f, 99.66371f, 90.96371f, 102.1933f, 87.65f, 102.0f),
                    PathNode.CurveTo(84.33629f, 101.8067f, 81.8067f, 98.96371f, 82.0f, 95.65f),
                    PathNode.CurveTo(82.176926f, 92.631355f, 82.53423f, 89.625984f, 83.07f, 86.65f),
                    PathNode.CurveTo(68.90728f, 83.99643f, 54.46205f, 89.581535f, 45.768143f, 101.0724f),
                    PathNode.CurveTo(37.074238f, 112.56327f, 35.627426f, 127.982895f, 42.032063f, 140.89044f),
                    PathNode.CurveTo(48.4367f, 153.79799f, 61.590862f, 161.9727f, 76.0f, 162.0f),
                    PathNode.LineTo(156.0f, 162.0f),
                    PathNode.CurveTo(190.22566f, 161.96143f, 217.96143f, 134.22566f, 218.0f, 100.0f),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
