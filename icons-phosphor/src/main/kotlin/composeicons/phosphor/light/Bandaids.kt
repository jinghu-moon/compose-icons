package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorLightIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M181.74 128 210.87 98.87c9.633-9.593 13.407-23.601 9.898-36.735C217.258 49.001 206.999 38.742 193.865 35.232c-13.134-3.51-27.142 .265-36.735 9.898L128 74.26 98.87 45.13C89.277 35.497 75.269 31.723 62.135 35.232 49.001 38.742 38.742 49.001 35.232 62.135c-3.51 13.134 .265 27.142 9.898 36.735L74.26 128 45.13 157.13c-9.633 9.593-13.407 23.601-9.898 36.735 3.51 13.134 13.768 23.393 26.902 26.902 13.134 3.51 27.142-.265 36.735-9.898L128 181.74l29.13 29.13c9.593 9.633 23.601 13.407 36.735 9.898 13.134-3.51 23.393-13.768 26.902-26.902 3.51-13.134-.265-27.142-9.898-36.735ZM165.62 53.62h0c6.533-6.74 16.191-9.435 25.27-7.052 9.079 2.383 16.168 9.475 18.549 18.554 2.381 9.08-.318 18.737-7.059 25.268l-29.13 29.13L136.49 82.75ZM164.77 128 128 164.77 91.23 128 128 91.23ZM53.62 90.38C46.802 83.866 44.045 74.17 46.416 65.043 48.788 55.916 55.916 48.788 65.043 46.416c9.127-2.371 18.823 .385 25.337 7.204l29.13 29.13L82.75 119.52ZM90.38 202.38c-6.514 6.818-16.21 9.575-25.337 7.204C55.916 207.212 48.788 200.084 46.416 190.957c-2.371-9.127 .385-18.823 7.204-25.337L82.75 136.49l36.76 36.76ZM202.38 202.38c-10.153 10.147-26.607 10.147-36.76 0L136.48 173.25l36.77-36.77 29.13 29.14c10.147 10.153 10.147 26.607 0 36.76ZM118 128c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10Z"),
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
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
