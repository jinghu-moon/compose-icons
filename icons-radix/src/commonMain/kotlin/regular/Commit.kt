package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Commit: ImageVector
    get() {
        if (_commit != null) return _commit!!
        _commit = radixIcon(
            name = "Commit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.676 4.105 C 9.304 4.188 10.630 5.416 10.863 7.000 L 14.500 7.000 L 14.601 7.010 C 14.828 7.057 15.000 7.259 15.000 7.500 C 15.000 7.742 14.828 7.944 14.601 7.991 L 14.500 8.000 L 10.863 8.000 C 10.621 9.641 9.207 10.900 7.500 10.900 L 7.325 10.895 C 5.697 10.812 4.371 9.584 4.138 8.000 L 0.500 8.000 C 0.224 8.000 0.000 7.776 0.000 7.500 C 0.000 7.224 0.224 7.000 0.500 7.000 L 4.138 7.000 C 4.379 5.360 5.792 4.100 7.500 4.100 L 7.676 4.105 ZM 7.500 5.050 C 6.147 5.050 5.051 6.147 5.051 7.500 C 5.051 8.852 6.147 9.950 7.500 9.950 C 8.853 9.949 9.950 8.852 9.950 7.500 C 9.950 6.147 8.853 5.051 7.500 5.050 Z"),
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
        return _commit!!
    }

private var _commit: ImageVector? = null
