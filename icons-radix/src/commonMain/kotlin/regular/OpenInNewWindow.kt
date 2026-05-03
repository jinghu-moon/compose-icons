package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.OpenInNewWindow: ImageVector
    get() {
        if (_openInNewWindow != null) return _openInNewWindow!!
        _openInNewWindow = radixIcon(
            name = "OpenInNewWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.500 6.000 C 8.533 6.000 8.565 6.002 8.598 6.009 C 8.649 6.019 8.696 6.039 8.740 6.063 C 8.781 6.086 8.819 6.112 8.854 6.146 C 8.887 6.180 8.913 6.219 8.936 6.259 C 8.960 6.303 8.980 6.350 8.990 6.401 C 8.997 6.434 9.000 6.467 9.000 6.500 L 9.000 9.500 C 9.000 9.776 8.776 10.000 8.500 10.000 C 8.224 10.000 8.000 9.776 8.000 9.500 L 8.000 7.707 L 2.854 12.854 C 2.658 13.049 2.342 13.049 2.146 12.854 C 1.951 12.658 1.951 12.342 2.146 12.146 L 7.293 7.000 L 5.500 7.000 C 5.224 7.000 5.000 6.776 5.000 6.500 C 5.000 6.224 5.224 6.000 5.500 6.000 L 8.500 6.000 ZM 12.000 2.000 C 12.552 2.000 13.000 2.448 13.000 3.000 L 13.000 12.000 C 13.000 12.552 12.552 13.000 12.000 13.000 L 8.500 13.000 C 8.224 13.000 8.000 12.776 8.000 12.500 C 8.000 12.224 8.224 12.000 8.500 12.000 L 12.000 12.000 L 12.000 3.000 L 3.000 3.000 L 3.000 6.500 C 3.000 6.776 2.776 7.000 2.500 7.000 C 2.224 7.000 2.000 6.776 2.000 6.500 L 2.000 3.000 C 2.000 2.448 2.448 2.000 3.000 2.000 L 12.000 2.000 Z"),
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
        return _openInNewWindow!!
    }

private var _openInNewWindow: ImageVector? = null
