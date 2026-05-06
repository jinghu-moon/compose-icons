package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) return _stripeLogo!!
        _stripeLogo = phosphorBoldIcon(
            name = "StripeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-152v-152h152ZM148 152c0-6.37-6.29-9.32-24-14.42C107.86 132.93 85.77 126.58 85.77 104c0-20.52 18.15-36 42.22-36 17.24 0 32.06 8.14 38.69 21.24 2.006 3.833 1.795 8.449-.554 12.081-2.349 3.633-6.471 5.72-10.79 5.463-4.318-.257-8.164-2.819-10.066-6.704C142.8 95.17 136 92 128 92c-10.22 0-18.22 5.27-18.22 12 0 1.09 0 2.21 3.28 4.17 4.18 2.48 11 4.45 17.6 6.35 8.75 2.52 17.8 5.13 25.38 9.86 13.19 8.23 16 19.56 16 27.62 0 20.19-19.33 36-44 36C106.78 188 88.58 175.65 84.77 158.62c-1.38-6.439 2.687-12.788 9.113-14.226 6.427-1.438 12.811 2.572 14.307 8.986C109.3 158.49 117.21 164 128 164c9.44 0 20-5.13 20-12Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
