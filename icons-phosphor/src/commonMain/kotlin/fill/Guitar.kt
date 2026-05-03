package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Guitar: ImageVector
    get() {
        if (_guitar != null) return _guitar!!
        _guitar = phosphorFillIcon(
            name = "Guitar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(249.66f, 46.34f),
                    PathNode.LineTo(209.66f, 6.34f),
                    PathNode.CurveTo(206.53407f, 3.214069f, 201.46593f, 3.214069f, 198.34f, 6.34f),
                    PathNode.CurveTo(195.21407f, 9.465932f, 195.21407f, 14.534068f, 198.34f, 17.66f),
                    PathNode.LineTo(200.69f, 20.0f),
                    PathNode.LineTo(140.52f, 80.16f),
                    PathNode.CurveTo(117.73f, 68.3f, 92.21f, 69.29f, 76.75f, 84.74f),
                    PathNode.CurveTo(72.6701f, 88.83734f, 69.474205f, 93.72817f, 67.36f, 99.11f),
                    PathNode.CurveTo(66.03348f, 102.09106f, 63.07287f, 104.00859f, 59.81f, 104.0f),
                    PathNode.CurveTo(45.22f, 104.49f, 32.55f, 109.72f, 23.16f, 119.11f),
                    PathNode.CurveTo(11.08f, 131.22f, 6.0f, 148.6f, 8.74f, 168.07f),
                    PathNode.CurveTo(11.4f, 186.7f, 21.07f, 205.15f, 36.0f, 220.0f),
                    PathNode.CurveTo(50.93f, 234.85f, 69.34f, 244.56f, 88.0f, 247.22f),
                    PathNode.CurveTo(91.34385f, 247.71971f, 94.71908f, 247.98036f, 98.1f, 248.0f),
                    PathNode.CurveTo(113.42f, 248.0f, 126.93f, 242.77f, 136.86f, 232.84f),
                    PathNode.CurveTo(146.25f, 223.45f, 151.48f, 210.78f, 151.97f, 196.19f),
                    PathNode.CurveTo(151.96666f, 192.92004f, 153.8972f, 189.9575f, 156.89f, 188.64f),
                    PathNode.CurveTo(162.27248f, 186.52707f, 167.16356f, 183.33101f, 171.26f, 179.25f),
                    PathNode.CurveTo(186.71f, 163.79f, 187.7f, 138.25f, 175.84f, 115.48f),
                    PathNode.LineTo(236.0f, 55.31f),
                    PathNode.LineTo(238.34f, 57.66f),
                    PathNode.CurveTo(241.46593f, 60.78593f, 246.53407f, 60.78593f, 249.66f, 57.66f),
                    PathNode.CurveTo(252.78593f, 54.53407f, 252.78593f, 49.46593f, 249.66f, 46.34f),
                    PathNode.Close,
                    PathNode.MoveTo(93.66f, 205.65f),
                    PathNode.CurveTo(90.53623f, 208.77173f, 85.47377f, 208.77173f, 82.35f, 205.65f),
                    PathNode.LineTo(50.35f, 173.65f),
                    PathNode.CurveTo(47.22683f, 170.52406f, 47.22907f, 165.45818f, 50.355f, 162.335f),
                    PathNode.CurveTo(53.48093f, 159.21182f, 58.54683f, 159.21407f, 61.67f, 162.34f),
                    PathNode.LineTo(93.67f, 194.34f),
                    PathNode.CurveTo(96.78896f, 197.46652f, 96.784485f, 202.52899f, 93.66f, 205.65f),
                    PathNode.Close,
                    PathNode.MoveTo(135.8f, 159.79f),
                    PathNode.CurveTo(127.792946f, 167.80028f, 115.74876f, 170.1979f, 105.28449f, 165.8647f),
                    PathNode.CurveTo(94.82022f, 161.5315f, 87.997025f, 151.32097f, 87.997025f, 139.995f),
                    PathNode.CurveTo(87.997025f, 128.66904f, 94.82022f, 118.4585f, 105.28449f, 114.12529f),
                    PathNode.CurveTo(115.74876f, 109.79208f, 127.792946f, 112.18972f, 135.8f, 120.2f),
                    PathNode.CurveTo(146.72935f, 131.13377f, 146.72935f, 148.85622f, 135.8f, 159.79f),
                    PathNode.Close,
                    PathNode.MoveTo(166.86f, 101.79f),
                    PathNode.CurveTo(164.9764f, 99.46147f, 162.97372f, 97.231834f, 160.86f, 95.11f),
                    PathNode.CurveTo(158.73706f, 92.993744f, 156.50395f, 90.99097f, 154.17f, 89.11f),
                    PathNode.LineTo(176.0f, 67.31f),
                    PathNode.LineTo(188.69f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 68.68f),
                    PathNode.LineTo(187.32f, 56.0f),
                    PathNode.LineTo(212.0f, 31.31f),
                    PathNode.LineTo(224.69f, 44.0f),
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
        return _guitar!!
    }

private var _guitar: ImageVector? = null
