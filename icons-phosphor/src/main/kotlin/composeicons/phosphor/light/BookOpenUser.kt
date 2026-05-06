package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BookOpenUser: ImageVector
    get() {
        if (_bookOpenUser != null) return _bookOpenUser!!
        _bookOpenUser = phosphorLightIcon(
            name = "BookOpenUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 74h-72c-12.962 .01-25.025 6.625-32 17.55C121.025 80.625 108.962 74.01 96 74h-72c-3.314 0-6 2.686-6 6v120c0 3.314 2.686 6 6 6h72c14.359 0 26 11.641 26 26 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 0-14.359 11.641-26 26-26h72c3.314 0 6-2.686 6-6v-120c0-3.314-2.686-6-6-6ZM96 194h-66v-108h66c14.359 0 26 11.641 26 26v92.31C114.967 197.681 105.665 193.992 96 194ZM226 194h-66c-9.668-.006-18.972 3.691-26 10.33v-92.33c0-14.359 11.641-26 26-26h66ZM91.2 44.4C99.887 32.817 113.521 26 128 26c14.479 0 28.113 6.817 36.8 18.4 1.988 2.651 1.451 6.412-1.2 8.4-2.651 1.988-6.412 1.451-8.4-1.2C148.779 43.039 138.702 38 128 38c-10.702 0-20.779 5.039-27.2 13.6-1.988 2.651-5.749 3.188-8.4 1.2C89.749 50.812 89.212 47.051 91.2 44.4Z"),
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
        return _bookOpenUser!!
    }

private var _bookOpenUser: ImageVector? = null
