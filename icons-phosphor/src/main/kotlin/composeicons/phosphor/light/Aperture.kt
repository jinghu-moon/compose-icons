package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorLightIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200.12 55.88C160.196 16.598 96.066 16.857 56.46 56.46 16.854 96.063 16.591 160.193 55.87 200.12c25.695 26.119 63.424 36.45 98.841 27.064 35.417-9.386 63.078-37.045 72.466-72.461 9.388-35.416-.94-73.146-27.057-98.843ZM98.12 122.55 117.77 99.41l29.86 5.46 10.21 28.58-19.65 23.14-29.86-5.46ZM209.93 90.69c11.392 25.137 10.655 54.105-2 78.63L151.79 159.08ZM203.77 79.41l-36.94 43.48L136.66 38.42c20.803 1.947 40.265 11.126 55 25.94 4.557 4.574 8.617 9.619 12.11 15.05ZM64.36 64.41C80.171 48.488 101.393 39.096 123.81 38.1L143 91.82 54.75 75.71c2.889-4.039 6.103-7.835 9.61-11.35ZM48 86.68l56.14 10.24L46.07 165.31c-11.392-25.137-10.655-54.105 2-78.63ZM52.21 176.59 89.15 133.11l30.17 84.47c-20.803-1.947-40.265-11.126-55-25.94-4.55-4.575-8.603-9.62-12.09-15.05ZM191.62 191.59c-15.816 15.908-37.039 25.283-59.45 26.26L113 164.18l88.24 16.11c-2.886 4.038-6.096 7.834-9.6 11.35Z"),
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
        return _aperture!!
    }

private var _aperture: ImageVector? = null
