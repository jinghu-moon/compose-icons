package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Overline: ImageVector
    get() {
        if (_overline != null) return _overline!!
        _overline = radixIcon(
            name = "Overline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.500 3.750 C 10.776 3.751 11.000 3.974 11.000 4.250 L 11.000 9.550 C 11.000 11.483 9.433 13.050 7.500 13.050 C 5.567 13.050 4.001 11.483 4.000 9.550 L 4.000 4.250 C 4.000 3.974 4.224 3.750 4.500 3.750 C 4.776 3.751 5.000 3.974 5.000 4.250 L 5.000 9.550 C 5.001 10.931 6.120 12.050 7.500 12.050 C 8.881 12.050 10.000 10.931 10.000 9.550 L 10.000 4.250 C 10.000 3.974 10.224 3.750 10.500 3.750 ZM 11.581 1.109 C 11.763 1.146 11.901 1.307 11.901 1.500 C 11.901 1.693 11.763 1.854 11.581 1.892 L 11.500 1.901 L 3.500 1.901 C 3.280 1.901 3.100 1.721 3.100 1.500 C 3.100 1.279 3.279 1.100 3.500 1.100 L 11.500 1.100 L 11.581 1.109 Z"),
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
        return _overline!!
    }

private var _overline: ImageVector? = null
