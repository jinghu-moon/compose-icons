package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BookOpenUser: ImageVector
    get() {
        if (_bookOpenUser != null) return _bookOpenUser!!
        _bookOpenUser = phosphorBoldIcon(
            name = "BookOpenUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 72h-72c-12.122-.004-23.706 5.01-32 13.85C119.706 77.01 108.122 71.996 96 72h-72C17.373 72 12 77.373 12 84v116c0 6.627 5.373 12 12 12h72c11.046 0 20 8.954 20 20 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-11.046 8.954-20 20-20h72c6.627 0 12-5.373 12-12v-116c0-6.627-5.373-12-12-12ZM96 188h-60v-92h60c11.046 0 20 8.954 20 20v76.81C109.81 189.641 102.954 187.993 96 188ZM220 188h-60c-6.956-.004-13.813 1.652-20 4.83v-76.83c0-11.046 8.954-20 20-20h60ZM86.4 40.79C96.22 27.696 111.633 19.99 128 19.99c16.367 0 31.78 7.706 41.6 20.8 3.982 5.299 2.914 12.823-2.385 16.805-5.299 3.982-12.823 2.914-16.805-2.385C145.123 48.152 136.819 43.997 128 43.997c-8.819 0-17.123 4.155-22.41 11.213-3.982 5.299-11.506 6.367-16.805 2.385C83.486 53.613 82.418 46.089 86.4 40.79Z"),
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
