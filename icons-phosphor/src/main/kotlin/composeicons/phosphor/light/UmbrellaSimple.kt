package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorLightIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 126.79C234.34 84.831 207.13 48.608 167.852 33.404 128.574 18.199 84.067 26.661 53.11 55.22 32.849 73.826 20.333 99.377 18.05 126.79c-.339 3.909 .978 7.781 3.63 10.673 2.652 2.892 6.396 4.538 10.32 4.537h90v58c0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30 0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18v-58h90c3.933 .015 7.69-1.625 10.353-4.519 2.663-2.893 3.987-6.774 3.647-10.691ZM225.51 129.35c-.387 .423-.937 .66-1.51 .65h-192c-.566 .004-1.108-.232-1.49-.65-.393-.42-.586-.988-.53-1.56C33.266 90.408 57.522 58.146 92.521 44.608c34.999-13.538 74.652-5.998 102.239 19.442 18.052 16.567 29.206 39.323 31.24 63.74 .053 .573-.144 1.142-.54 1.56Z"),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
