package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) return _gitDiff!!
        _gitDiff = phosphorRegularIcon(
            name = "GitDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 152c-4.418 0-8 3.582-8 8v28.69L66.34 151C64.847 149.506 64.006 147.482 64 145.37v-50.37C79.602 90.971 89.775 75.97 87.745 59.984 85.715 43.998 72.114 32.016 56 32.016c-16.114 0-29.714 11.982-31.745 27.968C22.225 75.97 32.398 90.971 48 95v50.38c-.032 6.374 2.489 12.496 7 17L92.69 200h-28.69c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM40 64C40 55.163 47.163 48 56 48c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C47.163 80 40 72.837 40 64ZM208 161v-50.37c.032-6.374-2.489-12.496-7-17L163.31 56h28.69c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-28.69L189.66 105c1.5 1.502 2.342 3.538 2.34 5.66v50.34c-15.602 4.029-25.775 19.03-23.745 35.016 2.03 15.986 15.631 27.968 31.745 27.968 16.114 0 29.714-11.982 31.745-27.968C233.775 180.03 223.602 165.029 208 161ZM200 208c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
