package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MoonStars: ImageVector
    get() {
        if (_moonStars != null) return _moonStars!!
        _moonStars = phosphorLightIcon(
            name = "MoonStars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 96c0 3.314-2.686 6-6 6h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h18c3.314 0 6 2.686 6 6ZM144 54h10v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-10v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM215.25 154.28c1.422 1.656 1.831 3.954 1.07 6-14.965 40.869-56.028 66.121-99.252 61.036C73.843 216.23 39.762 182.138 34.691 138.912 29.62 95.686 54.886 54.631 95.76 39.68c2.033-.74 4.307-.328 5.951 1.078 1.644 1.406 2.404 3.588 1.989 5.712-5.207 26.424 1.679 53.792 18.771 74.606C139.562 141.889 165.068 153.967 192 154c5.885 .002 11.755-.567 17.53-1.7 2.124-.421 4.31 .336 5.72 1.98ZM200.88 165.62Q196.46 166 192 166C135.694 165.934 90.066 120.306 90 64q0-4.45 .38-8.88C58.929 71.38 41.467 105.99 47.074 140.948c5.608 34.958 33.019 62.37 67.978 67.978 34.958 5.608 69.568-11.855 85.828-43.306Z"),
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
