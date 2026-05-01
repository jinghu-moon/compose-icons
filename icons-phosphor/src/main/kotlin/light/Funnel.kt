package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorLightIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.77f, 50.34f),
                    PathNode.CurveTo(226.57588f, 45.24656f, 221.54579f, 41.96145f, 216.0f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(34.462784f, 42.010597f, 29.452087f, 45.283794f, 27.217466f, 50.350094f),
                    PathNode.CurveTo(24.982845f, 55.41638f, 25.94423f, 61.323723f, 29.67f, 65.42f),
                    PathNode.LineTo(29.73f, 65.49f),
                    PathNode.LineTo(98.0f, 138.38f),
                    PathNode.LineTo(98.0f, 216.0f),
                    PathNode.CurveTo(98.002174f, 221.16298f, 100.845795f, 225.90572f, 105.39882f, 228.34012f),
                    PathNode.CurveTo(109.951836f, 230.77455f, 115.475174f, 230.50545f, 119.77f, 227.64f),
                    PathNode.LineTo(151.77f, 206.31f),
                    PathNode.CurveTo(155.66356f, 203.71227f, 158.00137f, 199.3406f, 158.0f, 194.66f),
                    PathNode.LineTo(158.0f, 138.38f),
                    PathNode.LineTo(226.33f, 65.38f),
                    PathNode.CurveTo(230.08308f, 61.308273f, 231.0433f, 55.389416f, 228.77f, 50.34f),
                    PathNode.Close,
                    PathNode.MoveTo(217.51f, 57.28f),
                    PathNode.LineTo(147.62f, 131.9f),
                    PathNode.CurveTo(146.5793f, 133.01158f, 146.00015f, 134.47728f, 146.0f, 136.0f),
                    PathNode.LineTo(146.0f, 194.66f),
                    PathNode.CurveTo(146.0021f, 195.33069f, 145.66791f, 195.95778f, 145.11f, 196.33f),
                    PathNode.LineTo(113.11f, 217.66f),
                    PathNode.CurveTo(112.49688f, 218.06906f, 111.70846f, 218.10776f, 111.05823f, 217.7607f),
                    PathNode.CurveTo(110.408005f, 217.41362f, 110.001366f, 216.73706f, 110.0f, 216.0f),
                    PathNode.LineTo(110.0f, 136.0f),
                    PathNode.CurveTo(109.999825f, 134.47728f, 109.42071f, 133.01158f, 108.38f, 131.9f),
                    PathNode.LineTo(38.53f, 57.32f),
                    PathNode.CurveTo(38.015305f, 56.734337f, 37.88788f, 55.90295f, 38.203545f, 55.190018f),
                    PathNode.CurveTo(38.51921f, 54.47709f, 39.220413f, 54.012592f, 40.0f, 54.0f),
                    PathNode.LineTo(216.0f, 54.0f),
                    PathNode.CurveTo(216.79973f, 53.97171f, 217.53146f, 54.447536f, 217.83f, 55.19f),
                    PathNode.CurveTo(218.16817f, 55.88545f, 218.04077f, 56.717594f, 217.51f, 57.28f),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null
