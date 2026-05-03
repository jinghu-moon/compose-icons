package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorFillIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.890 72.250 L 229.890 72.250 L 229.890 72.250 C 228.429 69.698 226.290 67.601 223.710 66.190 L 135.680 18.000 C 130.898 15.370 125.102 15.370 120.320 18.000 L 32.320 66.180 C 29.740 67.591 27.601 69.688 26.140 72.240 L 26.140 72.240 L 26.140 72.240 C 24.747 74.655 24.009 77.392 24.000 80.180 L 24.000 175.820 C 24.013 181.655 27.201 187.019 32.320 189.820 L 120.320 237.990 C 125.099 240.631 130.901 240.631 135.680 237.990 L 223.680 189.820 C 228.799 187.019 231.987 181.655 232.000 175.820 L 232.000 80.180 C 231.998 77.398 231.271 74.665 229.890 72.250 ZM 120.000 219.610 L 88.000 202.090 L 88.000 152.000 C 87.993 149.083 86.399 146.400 83.840 145.000 L 40.000 121.000 L 40.000 89.000 L 120.000 132.800 ZM 128.000 118.880 L 48.660 75.440 L 83.140 56.570 L 124.140 79.020 C 126.533 80.329 129.427 80.329 131.820 79.020 L 172.820 56.570 L 207.300 75.440 ZM 216.000 120.980 L 172.160 144.980 C 169.601 146.380 168.007 149.063 168.000 151.980 L 168.000 202.070 L 136.000 219.590 L 136.000 132.740 L 216.000 88.940 Z"),
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
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
