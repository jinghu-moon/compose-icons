package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorFillIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 77.6f),
                    PathNode.CurveTo(236.15945f, 79.10222f, 234.12328f, 79.9463f, 232.0f, 79.9463f),
                    PathNode.CurveTo(229.87672f, 79.9463f, 227.84055f, 79.10222f, 226.34f, 77.6f),
                    PathNode.LineTo(208.0f, 59.25f),
                    PathNode.LineTo(179.3f, 88.0f),
                    PathNode.LineTo(213.65f, 122.35f),
                    PathNode.CurveTo(216.77592f, 125.47593f, 216.77592f, 130.54407f, 213.65f, 133.67f),
                    PathNode.CurveTo(210.52406f, 136.79593f, 205.45593f, 136.79593f, 202.33f, 133.67f),
                    PathNode.LineTo(196.0f, 127.27f),
                    PathNode.LineTo(112.0f, 211.27f),
                    PathNode.CurveTo(108.99772f, 214.29552f, 104.91233f, 215.99806f, 100.65f, 216.0f),
                    PathNode.LineTo(51.26f, 216.0f),
                    PathNode.LineTo(29.6f, 237.66f),
                    PathNode.CurveTo(28.027437f, 239.23457f, 25.870077f, 240.08298f, 23.646208f, 240.00139f),
                    PathNode.CurveTo(21.422338f, 239.91978f, 19.33295f, 238.91559f, 17.88f, 237.23f),
                    PathNode.CurveTo(15.166405f, 233.93417f, 15.431592f, 229.10863f, 18.49f, 226.13f),
                    PathNode.LineTo(39.94f, 204.67f),
                    PathNode.LineTo(39.94f, 155.28f),
                    PathNode.CurveTo(39.94991f, 151.04768f, 41.636303f, 146.99171f, 44.63f, 144.0f),
                    PathNode.LineTo(59.81f, 128.82f),
                    PathNode.CurveTo(60.560272f, 128.0689f, 61.57836f, 127.64685f, 62.64f, 127.64685f),
                    PathNode.CurveTo(63.701637f, 127.64685f, 64.71973f, 128.0689f, 65.47f, 128.82f),
                    PathNode.LineTo(94.3f, 157.63f),
                    PathNode.CurveTo(97.425934f, 160.75594f, 102.49407f, 160.75594f, 105.62f, 157.63f),
                    PathNode.CurveTo(108.74593f, 154.50407f, 108.74593f, 149.43594f, 105.62f, 146.31f),
                    PathNode.LineTo(76.78f, 117.47f),
                    PathNode.CurveTo(76.02889f, 116.71973f, 75.60685f, 115.70164f, 75.60685f, 114.64f),
                    PathNode.CurveTo(75.60685f, 113.57836f, 76.02889f, 112.56027f, 76.78f, 111.81f),
                    PathNode.LineTo(87.78f, 100.81f),
                    PathNode.CurveTo(88.53027f, 100.05889f, 89.54836f, 99.636856f, 90.61f, 99.636856f),
                    PathNode.CurveTo(91.67164f, 99.636856f, 92.68973f, 100.05889f, 93.44f, 100.81f),
                    PathNode.LineTo(122.28f, 129.65f),
                    PathNode.CurveTo(125.40593f, 132.77592f, 130.47408f, 132.77592f, 133.6f, 129.65f),
                    PathNode.CurveTo(136.72594f, 126.52407f, 136.72594f, 121.45593f, 133.6f, 118.33f),
                    PathNode.LineTo(104.79f, 89.46f),
                    PathNode.CurveTo(104.038895f, 88.709724f, 103.61685f, 87.691635f, 103.61685f, 86.63f),
                    PathNode.CurveTo(103.61685f, 85.56836f, 104.038895f, 84.55027f, 104.79f, 83.8f),
                    PathNode.LineTo(128.66f, 59.94f),
                    PathNode.LineTo(122.31f, 53.59f),
                    PathNode.CurveTo(120.77839f, 52.058907f, 119.93296f, 49.972275f, 119.96688f, 47.806885f),
                    PathNode.CurveTo(120.00081f, 45.64149f, 120.91119f, 43.582367f, 122.49f, 42.1f),
                    PathNode.CurveTo(125.7776f, 39.167984f, 130.79211f, 39.34881f, 133.86f, 42.51f),
                    PathNode.LineTo(168.0f, 76.63f),
                    PathNode.LineTo(196.69f, 47.93f),
                    PathNode.LineTo(178.33f, 29.58f),
                    PathNode.CurveTo(176.7971f, 28.050245f, 175.94989f, 25.964384f, 175.98193f, 23.799002f),
                    PathNode.CurveTo(176.01396f, 21.63362f, 176.92252f, 19.573734f, 178.5f, 18.09f),
                    PathNode.CurveTo(181.79092f, 15.156752f, 186.8087f, 15.337533f, 189.88f, 18.5f),
                    PathNode.LineTo(237.66f, 66.28f),
                    PathNode.CurveTo(239.16223f, 67.780556f, 240.00629f, 69.81673f, 240.00629f, 71.94f),
                    PathNode.CurveTo(240.00629f, 74.06327f, 239.16223f, 76.09946f, 237.66f, 77.6f),
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
        return _syringe!!
    }

private var _syringe: ImageVector? = null
