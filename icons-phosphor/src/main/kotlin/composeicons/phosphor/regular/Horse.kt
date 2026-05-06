package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorRegularIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 100c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM232 129.48C231.064 185.468 186.081 230.725 130.1 232h-2.17c-25.504 .179-50.174-9.082-69.26-26-3.314-2.946-3.611-8.021-.665-11.335 2.946-3.314 8.021-3.611 11.335-.665 6.027 5.393 12.796 9.896 20.1 13.37L116 170.84C93.22 161.01 68.53 165.19 54.6 167.55 42.57 169.628 30.411 164.644 23.3 154.72L23 154.29l-13.78-22C8.091 130.483 7.73 128.3 8.216 126.226c.486-2.074 1.78-3.869 3.594-4.986L112 59.53v-27.53c0-4.418 3.582-8 8-8h8c27.841-.003 54.52 11.157 74.067 30.982 19.547 19.825 30.329 46.66 29.933 74.498ZM216 129.26c.337-23.557-8.785-46.265-25.325-63.042C174.135 49.442 151.559 39.998 128 40v24c-.002 2.777-1.444 5.355-3.81 6.81L27.06 130.59l9.36 15c3.601 4.848 9.635 7.242 15.58 6.18 16-2.7 48.77-8.24 78.07 8.18C151.316 158.819 167.972 141.276 168 120c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8-.04 29.281-22.604 53.6-51.8 55.83l-27.11 37.28c8.059 2.09 16.366 3.062 24.69 2.89 47.355-1.103 85.401-39.379 86.22-86.74Z"),
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
        return _horse!!
    }

private var _horse: ImageVector? = null
