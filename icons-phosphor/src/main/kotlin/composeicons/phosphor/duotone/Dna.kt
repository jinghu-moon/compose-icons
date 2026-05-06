package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = phosphorDuotoneIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M103.8 140.1 128 128l24.2 12.1c24.393 12.197 39.801 37.128 39.8 64.4v3.5h-128v-3.5c-.001-27.272 15.407-52.203 39.8-64.4ZM192 51.5v-3.5h-128v3.5c-.001 27.272 15.407 52.203 39.8 64.4L128 128l24.2-12.1C176.593 103.703 192.001 78.772 192 51.5Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M200 204.5v27.5c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-27.5c.08-24.266-13.641-46.468-35.38-57.25L100.22 123.06C73.047 109.583 55.898 81.831 56 51.5v-27.5c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v27.5c-.08 24.266 13.641 46.468 35.38 57.25l48.4 24.19c27.173 13.477 44.322 41.229 44.22 71.56ZM160 200h-87.83c.385-5.45 1.47-10.828 3.23-16h72.71c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-64.65c4.015-5.803 8.965-10.899 14.65-15.08 3.568-2.615 4.34-7.627 1.725-11.195C97.22 138.157 92.208 137.385 88.64 140 68.147 155.107 56.035 179.04 56 204.5v27.5c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h88c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM192 16c-4.418 0-8 3.582-8 8v16h-88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h87.83c-.385 5.45-1.47 10.828-3.23 16h-72.71c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64.65c-4.014 5.803-8.965 10.899-14.65 15.08-3.562 2.615-4.33 7.623-1.715 11.185 2.615 3.562 7.623 4.33 11.185 1.715C187.848 100.877 199.958 76.953 200 51.5v-27.5c0-4.418-3.582-8-8-8Z"),
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
        return _dna!!
    }

private var _dna: ImageVector? = null
