package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = radixIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.501 0.150 C 8.109 0.150 8.602 0.643 8.602 1.251 C 8.601 1.757 8.259 2.181 7.794 2.310 C 10.142 2.461 12.000 4.413 12.000 6.800 L 12.000 10.250 C 12.000 11.056 12.033 11.707 12.724 12.053 C 12.931 12.156 13.039 12.389 12.986 12.614 C 12.933 12.840 12.732 13.000 12.500 13.000 L 8.159 13.000 C 8.368 13.183 8.500 13.451 8.500 13.750 C 8.500 14.302 8.052 14.750 7.500 14.750 C 6.948 14.750 6.500 14.302 6.500 13.750 C 6.500 13.451 6.632 13.183 6.841 13.000 L 2.500 13.000 C 2.268 13.000 2.067 12.840 2.014 12.614 C 1.961 12.389 2.069 12.156 2.276 12.053 C 2.967 11.707 3.000 11.056 3.000 10.250 L 3.000 6.800 C 3.000 4.413 4.858 2.461 7.207 2.310 C 6.742 2.181 6.400 1.757 6.400 1.251 C 6.400 0.643 6.893 0.150 7.501 0.150 ZM 7.500 3.300 C 5.567 3.300 4.000 4.867 4.000 6.800 L 4.000 10.250 C 4.000 10.695 4.013 11.385 3.699 12.000 L 11.301 12.000 C 10.987 11.385 11.000 10.695 11.000 10.250 L 11.000 6.800 C 11.000 4.867 9.433 3.300 7.500 3.300 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _bell!!
    }

private var _bell: ImageVector? = null
