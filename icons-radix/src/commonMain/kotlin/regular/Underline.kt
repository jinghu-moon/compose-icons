package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Underline: ImageVector
    get() {
        if (_underline != null) return _underline!!
        _underline = radixIcon(
            name = "Underline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.581 13.108 C 11.763 13.146 11.901 13.307 11.901 13.500 C 11.901 13.693 11.763 13.854 11.581 13.892 L 11.500 13.900 L 3.500 13.900 C 3.279 13.900 3.100 13.721 3.100 13.500 C 3.100 13.279 3.279 13.100 3.500 13.100 L 11.500 13.100 L 11.581 13.108 ZM 10.500 2.250 C 10.776 2.250 11.000 2.474 11.000 2.750 L 11.000 8.050 C 11.000 9.983 9.433 11.550 7.500 11.550 C 5.567 11.550 4.000 9.983 4.000 8.050 L 4.000 2.750 C 4.000 2.474 4.224 2.250 4.500 2.250 C 4.776 2.250 5.000 2.474 5.000 2.750 L 5.000 8.050 C 5.000 9.431 6.120 10.550 7.500 10.550 C 8.881 10.550 10.000 9.430 10.000 8.050 L 10.000 2.750 C 10.000 2.474 10.224 2.250 10.500 2.250 Z"),
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
        return _underline!!
    }

private var _underline: ImageVector? = null
