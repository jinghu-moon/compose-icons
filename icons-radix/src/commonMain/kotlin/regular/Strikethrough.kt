package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) return _strikethrough!!
        _strikethrough = radixIcon(
            name = "Strikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.500 2.750 C 10.776 2.750 11.000 2.974 11.000 3.250 L 11.000 7.100 L 12.500 7.100 L 12.581 7.108 C 12.763 7.146 12.901 7.307 12.901 7.500 C 12.901 7.693 12.763 7.854 12.581 7.892 L 12.500 7.900 L 11.000 7.900 L 11.000 8.550 C 11.000 10.483 9.433 12.050 7.500 12.050 C 5.567 12.050 4.000 10.483 4.000 8.550 L 4.000 7.900 L 2.500 7.900 C 2.279 7.900 2.100 7.721 2.100 7.500 C 2.100 7.279 2.279 7.100 2.500 7.100 L 4.000 7.100 L 4.000 3.250 C 4.000 2.974 4.224 2.750 4.500 2.750 C 4.776 2.750 5.000 2.974 5.000 3.250 L 5.000 7.100 L 10.000 7.100 L 10.000 3.250 C 10.000 2.974 10.224 2.750 10.500 2.750 ZM 5.000 7.900 L 5.000 8.550 C 5.000 9.931 6.120 11.050 7.500 11.050 C 8.881 11.050 10.000 9.930 10.000 8.550 L 10.000 7.900 L 5.000 7.900 Z"),
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
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
