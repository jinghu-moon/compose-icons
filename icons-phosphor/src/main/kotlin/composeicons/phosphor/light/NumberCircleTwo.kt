package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) return _numberCircleTwo!!
        _numberCircleTwo = phosphorLightIcon(
            name = "NumberCircleTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM152 122.05l-36 48h36c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-48c-2.273 0-4.35-1.284-5.367-3.317-1.016-2.033-.797-4.465 .567-6.283l43.17-57.56c4.199-5.665 4.703-13.261 1.289-19.431-3.414-6.17-10.116-9.779-17.147-9.232C119.482 86.774 113.418 91.376 111 98c-.676 2.07-2.422 3.612-4.56 4.027-2.138 .415-4.333-.361-5.735-2.028C99.303 98.331 98.914 96.035 99.69 94c3.988-11.077 14.086-18.798 25.821-19.742 11.735-.944 22.937 5.063 28.645 15.36 5.707 10.297 4.864 22.98-2.156 32.432Z"),
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
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
