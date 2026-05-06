package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MoonStars: ImageVector
    get() {
        if (_moonStars != null) return _moonStars!!
        _moonStars = phosphorRegularIcon(
            name = "MoonStars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 96c0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8ZM144 56h8v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM216.77 153c1.896 2.208 2.444 5.272 1.43 8-15.299 41.724-57.236 67.493-101.371 62.29C72.694 218.088 37.9 183.273 32.722 139.135 27.544 94.997 53.337 53.076 95.07 37.8c2.714-.994 5.752-.447 7.949 1.431 2.197 1.878 3.21 4.794 2.651 7.629-5.693 28.817 3.355 58.575 24.125 79.345 20.77 20.77 50.528 29.818 79.345 24.125 2.839-.555 5.756 .466 7.63 2.67ZM197.38 167.88c-1.79 .09-3.59 .14-5.38 .14C134.58 167.959 88.05 121.42 88 64c0-1.79 0-3.59 .14-5.38C58.966 75.408 43.42 108.662 49.25 141.813c5.829 33.151 31.786 59.108 64.937 64.937 33.151 5.829 66.405-9.716 83.193-38.89Z"),
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
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
