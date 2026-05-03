package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorRegularIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 225.560 87.560 L 137.640 19.250 L 137.460 19.110 C 131.836 14.959 124.164 14.959 118.540 19.110 L 118.360 19.250 L 30.440 87.560 C 24.984 91.627 22.698 98.699 24.740 105.190 L 56.740 212.730 L 56.800 212.900 C 58.908 219.516 65.057 224.005 72.000 224.000 L 184.000 224.000 C 190.955 224.019 197.118 219.526 199.230 212.900 L 199.290 212.730 L 231.290 105.190 C 233.326 98.693 231.027 91.619 225.560 87.560 ZM 215.940 100.560 L 184.000 208.000 L 72.000 208.000 L 40.000 100.560 L 39.940 100.390 L 39.940 100.390 L 40.120 100.250 L 128.000 32.000 L 215.820 100.230 L 216.000 100.370 Z"),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
