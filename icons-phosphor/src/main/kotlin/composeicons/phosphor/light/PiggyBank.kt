package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) return _piggyBank!!
        _piggyBank = phosphorLightIcon(
            name = "PiggyBank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M190 116c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM152 66h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM246 112v32c0 12.15-9.85 22-22 22h-3.77l-16.68 46.71c-1.991 5.573-7.272 9.293-13.19 9.29h-12.72c-5.918 .003-11.199-3.717-13.19-9.29L162.06 206h-60.12l-2.39 6.71c-1.991 5.573-7.272 9.293-13.19 9.29h-12.72c-5.918 .003-11.199-3.717-13.19-9.29L47.76 177.18C35.315 163.223 27.775 145.58 26.29 126.94 18.953 129.394 14.004 136.263 14 144c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 .001-14.328 10.133-26.655 24.19-29.43C29.103 69.302 66.639 34.059 112 34h104c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-28.18c15.619 9.235 27.913 23.178 35.12 39.83 .6 1.38 1.16 2.77 1.68 4.18 11.904 .336 21.379 10.082 21.38 21.99ZM234 112c0-5.523-4.477-10-10-10h-3.66c-2.623 .003-4.943-1.698-5.73-4.2-.764-2.443-1.658-4.843-2.68-7.19C200.208 63.524 173.513 45.993 144 46h-32C82.654 45.997 56.078 63.336 44.259 90.197 32.44 117.059 37.611 148.366 57.44 170c.538 .577 .953 1.257 1.22 2l13.09 36.64c.274 .811 1.034 1.358 1.89 1.36h12.72c.848 .002 1.606-.531 1.89-1.33L92.06 198c.847-2.395 3.11-3.997 5.65-4h68.58c2.54 .003 4.803 1.605 5.65 4l3.81 10.69c.284 .799 1.042 1.332 1.89 1.33h12.72c.848 .002 1.606-.531 1.89-1.33L210.35 158c.847-2.395 3.11-3.997 5.65-4h8c5.523 0 10-4.477 10-10Z"),
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
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
