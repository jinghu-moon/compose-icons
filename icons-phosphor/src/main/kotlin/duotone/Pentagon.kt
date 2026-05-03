package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorDuotoneIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 223.610 102.830 L 191.610 210.450 C 190.547 213.755 187.472 215.998 184.000 216.000 L 72.000 216.000 C 68.524 216.002 65.445 213.759 64.380 210.450 L 32.380 102.830 C 31.325 99.553 32.485 95.968 35.260 93.930 L 123.260 25.550 C 126.076 23.486 129.904 23.486 132.720 25.550 L 220.720 93.930 C 223.499 95.965 224.663 99.551 223.610 102.830 Z"),
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
        pathData = parseSvgPathData("M 225.560 87.560 L 137.640 19.250 L 137.460 19.110 C 131.836 14.959 124.164 14.959 118.540 19.110 L 118.360 19.250 L 30.440 87.560 C 24.984 91.627 22.698 98.699 24.740 105.190 L 56.740 212.730 L 56.800 212.900 C 58.908 219.516 65.057 224.005 72.000 224.000 L 184.000 224.000 C 190.955 224.019 197.118 219.526 199.230 212.900 L 199.290 212.730 L 231.290 105.190 C 233.326 98.693 231.027 91.619 225.560 87.560 ZM 215.940 100.560 L 184.000 208.000 L 72.000 208.000 L 40.000 100.560 L 39.940 100.390 L 39.940 100.390 L 40.120 100.250 L 128.000 32.000 L 215.820 100.230 L 216.000 100.370 Z"),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
