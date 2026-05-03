package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Transform: ImageVector
    get() {
        if (_transform != null) return _transform!!
        _transform = radixIcon(
            name = "Transform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.342 0.855 C 3.796 0.901 4.151 1.284 4.151 1.750 L 4.151 2.050 L 10.850 2.050 L 10.850 1.750 C 10.850 1.253 11.253 0.850 11.750 0.850 L 13.250 0.850 L 13.342 0.855 C 13.796 0.901 14.151 1.284 14.151 1.750 L 14.151 3.250 L 14.146 3.342 C 14.100 3.796 13.716 4.151 13.250 4.151 L 12.951 4.151 L 12.951 10.850 L 13.250 10.850 L 13.342 10.855 C 13.796 10.901 14.151 11.285 14.151 11.750 L 14.151 13.250 L 14.146 13.342 C 14.100 13.796 13.716 14.151 13.250 14.151 L 11.750 14.151 C 11.253 14.151 10.850 13.747 10.850 13.250 L 10.850 12.951 L 4.151 12.951 L 4.151 13.250 L 4.146 13.342 C 4.100 13.796 3.716 14.151 3.250 14.151 L 1.750 14.151 C 1.253 14.151 0.850 13.747 0.850 13.250 L 0.850 11.750 C 0.850 11.253 1.253 10.850 1.750 10.850 L 2.050 10.850 L 2.050 4.151 L 1.750 4.151 C 1.253 4.151 0.850 3.747 0.850 3.250 L 0.850 1.750 C 0.850 1.253 1.253 0.850 1.750 0.850 L 3.250 0.850 L 3.342 0.855 ZM 1.750 13.250 L 3.250 13.250 L 3.250 11.750 L 1.750 11.750 L 1.750 13.250 ZM 11.750 13.250 L 13.250 13.250 L 13.250 11.750 L 11.750 11.750 L 11.750 13.250 ZM 4.151 2.951 L 4.151 3.250 L 4.146 3.342 C 4.100 3.796 3.716 4.151 3.250 4.151 L 2.951 4.151 L 2.951 10.850 L 3.250 10.850 L 3.342 10.855 C 3.796 10.901 4.151 11.285 4.151 11.750 L 4.151 12.050 L 10.850 12.050 L 10.850 11.750 C 10.850 11.253 11.253 10.850 11.750 10.850 L 12.050 10.850 L 12.050 4.151 L 11.750 4.151 C 11.253 4.151 10.850 3.747 10.850 3.250 L 10.850 2.951 L 4.151 2.951 ZM 7.092 5.105 C 7.546 5.151 7.901 5.534 7.901 6.000 L 7.901 7.000 L 7.896 7.092 C 7.895 7.097 7.894 7.101 7.893 7.106 C 7.928 7.102 7.964 7.100 8.000 7.100 L 9.000 7.100 L 9.092 7.105 C 9.546 7.151 9.901 7.534 9.901 8.000 L 9.901 9.000 L 9.896 9.092 C 9.850 9.546 9.466 9.901 9.000 9.901 L 8.000 9.901 C 7.503 9.901 7.100 9.497 7.100 9.000 L 7.100 8.000 C 7.100 7.964 7.102 7.928 7.106 7.893 C 7.071 7.897 7.036 7.901 7.000 7.901 L 6.000 7.901 C 5.503 7.901 5.100 7.497 5.100 7.000 L 5.100 6.000 C 5.100 5.503 5.503 5.100 6.000 5.100 L 7.000 5.100 L 7.092 5.105 ZM 8.000 9.000 L 9.000 9.000 L 9.000 8.000 L 8.000 8.000 L 8.000 9.000 ZM 6.000 7.000 L 7.000 7.000 L 7.000 6.000 L 6.000 6.000 L 6.000 7.000 ZM 1.750 3.250 L 3.250 3.250 L 3.250 1.750 L 1.750 1.750 L 1.750 3.250 ZM 11.750 3.250 L 13.250 3.250 L 13.250 1.750 L 11.750 1.750 L 11.750 3.250 Z"),
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
        return _transform!!
    }

private var _transform: ImageVector? = null
