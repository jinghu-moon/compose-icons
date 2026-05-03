package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = phosphorThinIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.450 174.000 C 227.988 174.917 228.138 176.011 227.868 177.039 C 227.597 178.067 226.929 178.945 226.010 179.480 L 130.010 235.480 C 128.772 236.195 127.248 236.195 126.010 235.480 L 30.010 179.480 C 28.201 178.330 27.620 175.958 28.693 174.103 C 29.766 172.247 32.111 171.566 34.010 172.560 L 128.010 227.390 L 222.010 172.560 C 223.911 171.468 226.338 172.110 227.450 174.000 ZM 222.000 124.540 L 128.000 179.370 L 34.000 124.540 C 32.101 123.546 29.756 124.227 28.683 126.083 C 27.610 127.938 28.191 130.310 30.000 131.460 L 126.000 187.460 C 127.238 188.175 128.762 188.175 130.000 187.460 L 226.000 131.460 C 227.809 130.310 228.390 127.938 227.317 126.083 C 226.244 124.227 223.899 123.546 222.000 124.540 ZM 28.000 80.000 C 28.001 78.572 28.764 77.254 30.000 76.540 L 126.000 20.540 C 127.238 19.825 128.762 19.825 130.000 20.540 L 226.000 76.540 C 227.234 77.256 227.993 78.574 227.993 80.000 C 227.993 81.426 227.234 82.744 226.000 83.460 L 130.000 139.460 C 128.762 140.175 127.238 140.175 126.000 139.460 L 30.000 83.460 C 28.764 82.746 28.001 81.428 28.000 80.000 ZM 39.940 80.000 L 128.000 131.370 L 216.060 80.000 L 128.000 28.630 Z"),
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
        return _stack!!
    }

private var _stack: ImageVector? = null
