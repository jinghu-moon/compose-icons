package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorLightIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.340 122.730 C 214.392 120.814 214.319 118.477 213.149 116.631 C 211.979 114.784 209.898 113.720 207.716 113.853 C 205.534 113.986 203.597 115.295 202.660 117.270 C 194.736 132.527 182.206 144.900 166.850 152.630 L 148.710 111.830 C 161.864 103.255 168.389 87.472 165.131 72.112 C 161.873 56.751 149.503 44.977 134.000 42.480 L 134.000 24.000 C 134.000 20.686 131.314 18.000 128.000 18.000 C 124.686 18.000 122.000 20.686 122.000 24.000 L 122.000 42.480 C 106.497 44.977 94.127 56.751 90.869 72.112 C 87.611 87.472 94.136 103.255 107.290 111.830 L 58.520 221.560 C 57.172 224.598 58.542 228.152 61.580 229.500 C 64.618 230.848 68.172 229.478 69.520 226.440 L 95.420 168.180 C 105.847 172.045 116.880 174.016 128.000 174.000 C 139.139 173.994 150.194 172.069 160.680 168.310 L 186.520 226.440 C 187.868 229.478 191.422 230.848 194.460 229.500 C 197.498 228.152 198.868 224.598 197.520 221.560 L 171.750 163.560 C 189.592 154.705 204.157 140.406 213.340 122.730 ZM 128.000 54.000 C 142.359 54.000 154.000 65.641 154.000 80.000 C 154.000 94.359 142.359 106.000 128.000 106.000 C 113.641 106.000 102.000 94.359 102.000 80.000 C 102.000 65.641 113.641 54.000 128.000 54.000 ZM 128.000 162.000 C 118.547 162.010 109.163 160.376 100.270 157.170 L 118.270 116.720 C 124.665 118.427 131.395 118.427 137.790 116.720 L 155.790 157.320 C 146.850 160.409 137.459 161.991 128.000 162.000 Z"),
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
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
