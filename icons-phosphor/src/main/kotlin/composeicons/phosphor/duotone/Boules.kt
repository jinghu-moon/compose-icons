package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorDuotoneIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.52 88.48 88.52 215.48c-21.287-9.656-38.344-26.713-48-48L167.52 40.48c21.287 9.656 38.344 26.713 48 48Z"),
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM184.28 60.41 60.4 184.28c-3.913-4.694-7.328-9.781-10.19-15.18L169.1 50.21c5.401 2.862 10.489 6.281 15.18 10.2ZM195.59 71.72c3.919 4.691 7.338 9.779 10.2 15.18L86.9 205.79C81.499 202.928 76.411 199.509 71.72 195.59ZM128 40c8.482-.003 16.92 1.223 25.05 3.64L43.64 153.05C35.734 126.425 40.861 97.63 57.472 75.371 74.082 53.111 100.226 40 128 40ZM128 216c-8.465-.002-16.886-1.228-25-3.64L212.36 103c7.887 26.618 2.751 55.398-13.858 77.644C181.894 202.891 155.762 215.996 128 216Z"),
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
        return _boules!!
    }

private var _boules: ImageVector? = null
