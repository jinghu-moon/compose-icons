package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Cross2: ImageVector
    get() {
        if (_cross2 != null) return _cross2!!
        _cross2 = radixIcon(
            name = "Cross2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.969 3.219 C 11.193 2.994 11.557 2.994 11.781 3.219 C 12.006 3.443 12.006 3.807 11.781 4.031 L 8.313 7.500 L 11.781 10.969 L 11.856 11.059 C 12.003 11.282 11.978 11.585 11.781 11.781 C 11.585 11.978 11.282 12.003 11.059 11.855 L 10.969 11.781 L 7.500 8.312 L 4.031 11.781 C 3.807 12.006 3.443 12.006 3.219 11.781 C 2.994 11.557 2.994 11.193 3.219 10.969 L 6.688 7.500 L 3.219 4.031 L 3.145 3.941 C 2.997 3.718 3.022 3.415 3.219 3.219 C 3.415 3.022 3.718 2.997 3.941 3.144 L 4.031 3.219 L 7.500 6.687 L 10.969 3.219 Z"),
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
        return _cross2!!
    }

private var _cross2: ImageVector? = null
