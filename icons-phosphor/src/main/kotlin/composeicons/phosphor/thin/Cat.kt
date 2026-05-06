package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cat: ImageVector
    get() {
        if (_cat != null) return _cat!!
        _cat = phosphorThinIcon(
            name = "Cat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.59 36.94c-4.482-1.905-9.673-.869-13.08 2.61l-.19 .2L187.77 62.24C151.63 37.934 104.37 37.934 68.23 62.24L48.68 39.75l-.19-.2C45.063 36.119 39.908 35.088 35.425 36.937 30.942 38.786 28.012 43.151 28 48v88c0 50.72 44.86 92 100 92 55.14 0 100-41.27 100-92v-88c.038-4.859-2.901-9.247-7.41-11.06ZM220 136c0 45.09-39.12 82-88 83.91v-26.25l14.83-14.83c1.053-1.002 1.479-2.496 1.114-3.903-.365-1.407-1.465-2.505-2.873-2.868-1.407-.363-2.901 .066-3.901 1.121L128 186.35 114.83 173.18c-1-1.055-2.494-1.484-3.901-1.121-1.407 .363-2.507 1.461-2.873 2.868-.365 1.407 .061 2.901 1.114 3.903L124 193.66v26.26C75.12 218 36 181.1 36 136v-88c-.021-1.625 .961-3.096 2.47-3.7 .509-.202 1.052-.307 1.6-.31 1.001-.002 1.961 .393 2.67 1.1L64.58 70.23c1.37 1.576 3.722 1.833 5.4 .59C76.747 65.826 84.153 61.764 92 58.74v29.26c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32c7.81-2.281 15.87-3.601 24-3.93v35.93c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-35.91c8.129 .323 16.189 1.636 24 3.91v32c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-29.26c7.84 3.025 15.24 7.088 22 12.08 1.678 1.243 4.03 .986 5.4-.59L213.24 45.12c1.156-1.102 2.858-1.411 4.328-.785 1.47 .626 2.426 2.067 2.432 3.665ZM92 140c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM180 140c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _cat!!
    }

private var _cat: ImageVector? = null
