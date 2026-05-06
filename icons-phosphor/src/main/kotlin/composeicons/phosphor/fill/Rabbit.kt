package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rabbit: ImageVector
    get() {
        if (_rabbit != null) return _rabbit!!
        _rabbit = phosphorFillIcon(
            name = "Rabbit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M199.28 149.8C198.257 142.588 196.14 135.573 193 129 212 91.06 223.45 40.72 210.34 19 206.349 12.085 198.924 7.874 190.94 8c-14.12 0-26 11.89-36.44 36.36-6.22 14.62-10.85 31.32-14 44.74-8.269-1.462-16.731-1.462-25 0-3.13-13.42-7.76-30.12-14-44.74C91.1 19.89 79.18 8 65.06 8 57.053 7.883 49.614 12.127 45.64 19.08 32.53 40.76 44 91.1 63 129c-3.129 6.562-5.24 13.562-6.26 20.76-20.921 19.678-21.928 52.589-2.25 73.51 19.678 20.921 52.589 21.928 73.51 2.25L106.88 206.15c-3.397-2.828-3.858-7.873-1.03-11.27 2.828-3.397 7.873-3.858 11.27-1.03L128 202.9l10.88-9.05c3.397-2.828 8.442-2.367 11.27 1.03 2.828 3.397 2.367 8.442-1.03 11.27L128 225.52c13.479 13.006 32.911 17.757 50.871 12.439 17.96-5.318 31.672-19.884 35.896-38.132 4.224-18.248-1.691-37.358-15.487-50.027ZM73.28 113.27C66.62 98.474 61.629 82.982 58.4 67.08c-3.49-18.13-3.15-33 .93-39.72C60.389 25.188 62.648 23.864 65.06 24c6.61 0 14.52 9.7 21.72 26.62 5.93 13.94 10.35 30.12 13.33 43C89.734 97.968 80.526 104.696 73.23 113.26ZM100 176c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM156 176c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM176.55 106.83C170.47 101.28 163.482 96.815 155.89 93.63c3-12.89 7.4-29.07 13.33-43C176.42 33.7 184.33 24 190.94 24c2.412-.136 4.671 1.188 5.73 3.36 4.08 6.74 4.42 21.59 .93 39.72-3.213 15.9-8.187 31.392-14.83 46.19-1.939-2.273-4.016-4.423-6.22-6.44Z"),
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
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
