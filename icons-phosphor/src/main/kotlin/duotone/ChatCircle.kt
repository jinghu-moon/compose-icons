package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorDuotoneIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 128.000 C 224.004 162.314 205.693 194.021 175.970 211.168 C 146.247 228.314 109.632 228.292 79.930 211.110 L 79.930 211.110 L 42.540 223.580 C 39.665 224.539 36.495 223.791 34.352 221.648 C 32.209 219.505 31.461 216.335 32.420 213.460 L 44.890 176.070 L 44.890 176.070 C 24.688 141.127 28.501 97.279 54.431 66.348 C 80.361 35.416 122.870 24.007 160.803 37.799 C 198.736 51.591 223.991 87.637 224.000 128.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 91.477 23.992 57.627 43.143 38.822 74.453 C 20.017 105.763 19.014 144.642 36.180 176.880 L 24.830 210.930 C 22.912 216.680 24.409 223.020 28.695 227.305 C 32.980 231.591 39.320 233.088 45.070 231.170 L 79.120 219.820 C 117.327 240.141 164.125 234.680 196.625 206.107 C 229.126 177.534 240.537 131.821 225.277 91.326 C 210.016 50.831 171.275 24.018 128.000 24.000 ZM 128.000 216.000 C 112.530 216.011 97.331 211.937 83.940 204.190 C 81.957 203.040 79.575 202.796 77.400 203.520 L 40.000 216.000 L 52.470 178.600 C 53.197 176.426 52.957 174.045 51.810 172.060 C 31.866 137.578 37.571 93.999 65.721 65.814 C 93.870 37.629 137.442 31.868 171.949 51.769 C 206.456 71.670 223.292 112.269 212.994 150.749 C 202.697 189.229 167.834 215.993 128.000 216.000 Z"),
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
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
