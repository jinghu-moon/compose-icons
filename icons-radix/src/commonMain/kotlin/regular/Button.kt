package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Button: ImageVector
    get() {
        if (_button != null) return _button!!
        _button = radixIcon(
            name = "Button",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.204 4.011 C 14.213 4.113 15.000 4.964 15.000 6.000 L 15.000 9.000 L 14.989 9.204 C 14.894 10.146 14.146 10.894 13.204 10.989 L 13.000 11.000 L 2.000 11.000 L 1.796 10.989 C 0.854 10.894 0.106 10.146 0.011 9.204 L 0.000 9.000 L 0.000 6.000 C 0.000 4.964 0.787 4.113 1.796 4.011 L 2.000 4.000 L 13.000 4.000 L 13.204 4.011 ZM 2.000 5.000 C 1.482 5.000 1.056 5.393 1.005 5.897 L 1.000 6.000 L 1.000 9.000 C 1.000 9.552 1.448 10.000 2.000 10.000 L 13.000 10.000 C 13.552 10.000 14.000 9.552 14.000 9.000 L 14.000 6.000 C 14.000 5.482 13.607 5.056 13.102 5.005 L 13.000 5.000 L 2.000 5.000 ZM 4.500 6.750 C 4.914 6.750 5.250 7.086 5.250 7.500 C 5.250 7.914 4.914 8.250 4.500 8.250 C 4.086 8.250 3.750 7.914 3.750 7.500 C 3.750 7.086 4.086 6.750 4.500 6.750 ZM 7.500 6.750 C 7.914 6.750 8.250 7.086 8.250 7.500 C 8.250 7.914 7.914 8.250 7.500 8.250 C 7.086 8.250 6.750 7.914 6.750 7.500 C 6.750 7.086 7.086 6.750 7.500 6.750 ZM 10.500 6.750 C 10.914 6.750 11.250 7.086 11.250 7.500 C 11.250 7.914 10.914 8.250 10.500 8.250 C 10.086 8.250 9.750 7.914 9.750 7.500 C 9.750 7.086 10.086 6.750 10.500 6.750 Z"),
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
        return _button!!
    }

private var _button: ImageVector? = null
