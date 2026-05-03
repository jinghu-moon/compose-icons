package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Globe2: ImageVector
    get() {
        if (_globe2 != null) return _globe2!!
        _globe2 = radixIcon(
            name = "Globe2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 0.900 C 11.145 0.900 14.100 3.856 14.100 7.501 C 14.100 11.145 11.145 14.100 7.500 14.100 C 3.856 14.100 0.900 11.146 0.900 7.501 C 0.900 3.856 3.855 0.900 7.500 0.900 ZM 10.214 7.950 C 10.128 9.834 9.496 11.702 8.302 13.142 C 10.924 12.773 12.972 10.620 13.180 7.950 L 10.214 7.950 ZM 1.819 7.950 C 2.019 10.509 3.908 12.592 6.373 13.087 C 5.241 11.654 4.643 9.809 4.560 7.950 L 1.819 7.950 ZM 5.462 7.950 C 5.552 9.791 6.192 11.571 7.355 12.857 C 8.559 11.571 9.220 9.790 9.313 7.950 L 5.462 7.950 ZM 7.355 2.141 C 6.192 3.427 5.552 5.208 5.462 7.049 L 9.313 7.049 C 9.220 5.209 8.559 3.428 7.355 2.141 ZM 8.302 1.857 C 9.496 3.297 10.128 5.166 10.214 7.049 L 13.180 7.049 C 12.971 4.379 10.924 2.227 8.302 1.857 ZM 6.374 1.911 C 3.908 2.405 2.020 4.490 1.820 7.049 L 4.560 7.049 C 4.643 5.190 5.241 3.344 6.374 1.911 Z"),
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
        return _globe2!!
    }

private var _globe2: ImageVector? = null
