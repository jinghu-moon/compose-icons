package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorRegularIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 168v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-12.69l-2.21 2.22C226.69 192.9 189.44 232 128 232 65.16 232 27.62 191.09 26.05 189.35c-2.955-3.3-2.675-8.37 .625-11.325 3.3-2.955 8.37-2.675 11.325 .625C38.27 179 72.5 216 128 216c55.5 0 89.73-37 90.07-37.36 .085-.105 .175-.205 .27-.3L220.69 176h-12.69c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM160 94.53v-10.53C160.011 67.349 148.602 52.863 132.412 48.973 116.222 45.082 99.476 52.802 91.92 67.64c-2.01 3.935-6.83 5.495-10.765 3.485C77.22 69.115 75.66 64.295 77.67 60.36 88.589 38.935 112.774 27.792 136.155 33.413 159.536 39.034 176.013 59.953 176 84v92c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-6.53c-20.507 19.733-53.066 19.315-73.06-.937-19.994-20.252-19.994-52.814 0-73.066C106.934 75.215 139.493 74.797 160 94.53ZM160 132C160 112.118 143.882 96 124 96c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36Z"),
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
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
