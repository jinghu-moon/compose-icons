package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.IntersectThree: ImageVector
    get() {
        if (_intersectThree != null) return _intersectThree!!
        _intersectThree = phosphorThinIcon(
            name = "IntersectThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M191.69 98.3C191.89 96.23 192 94.13 192 92 192 56.654 163.346 28 128 28 92.654 28 64 56.654 64 92c0 2.13 .11 4.23 .31 6.3C42.589 108.645 28.504 130.299 27.853 154.349c-.651 24.05 12.241 46.434 33.371 57.939 21.13 11.505 46.927 10.189 66.776-3.409 19.848 13.597 45.646 14.914 66.776 3.409 21.13-11.505 34.022-33.889 33.371-57.939-.651-24.05-14.735-45.704-36.457-56.049ZM72 92C72 61.072 97.072 36 128 36c30.928 0 56 25.072 56 56 0 1.07 0 2.13-.1 3.18C165.045 88.995 144.387 91.93 128 103.12 111.613 91.93 90.955 88.995 72.1 95.18 72 94.13 72 93.07 72 92ZM148 156c.003 16.539-7.321 32.23-20 42.85C115.321 188.23 107.997 172.539 108 156c0-1.07 0-2.13 .1-3.18 12.928 4.24 26.872 4.24 39.8 0 .1 1.05 .1 2.11 .1 3.18ZM128 148c-6.429 .005-12.81-1.105-18.86-3.28 2.558-12.345 9.202-23.467 18.86-31.57 9.658 8.103 16.302 19.225 18.86 31.57-6.05 2.175-12.431 3.285-18.86 3.28ZM101.7 141.42C86.993 133.573 76.53 119.601 73.14 103.28c15.994-5.754 33.737-3.913 48.21 5-9.795 8.769-16.656 20.339-19.65 33.14ZM134.7 108.33c14.473-8.913 32.216-10.754 48.21-5-3.39 16.321-13.853 30.293-28.56 38.14-3.008-12.807-9.886-24.378-19.7-33.14ZM92 212C66.307 211.983 43.922 194.484 37.703 169.555c-6.219-24.929 5.323-50.892 27.997-62.975 4.447 18.856 17.163 34.699 34.61 43.12-.2 2.07-.31 4.17-.31 6.3-.003 18.207 7.764 35.549 21.35 47.67C112.532 209.124 102.368 212.008 92 212ZM164 212c-10.368 .008-20.532-2.876-29.35-8.33C148.236 191.549 156.003 174.207 156 156c0-2.13-.11-4.23-.31-6.3 17.447-8.421 30.163-24.264 34.61-43.12 22.674 12.084 34.216 38.047 27.997 62.975C212.078 194.484 189.693 211.983 164 212Z"),
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
        return _intersectThree!!
    }

private var _intersectThree: ImageVector? = null
