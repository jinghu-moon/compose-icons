package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CompassRose: ImageVector
    get() {
        if (_compassRose != null) return _compassRose!!
        _compassRose = phosphorRegularIcon(
            name = "CompassRose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 249.940 120.240 L 222.890 113.480 C 216.584 71.984 184.016 39.416 142.520 33.110 L 135.760 6.110 C 134.868 2.551 131.669 0.055 128.000 0.055 C 124.331 0.055 121.132 2.551 120.240 6.110 L 113.480 33.160 C 71.984 39.466 39.416 72.034 33.110 113.530 L 6.110 120.290 C 2.551 121.182 0.055 124.381 0.055 128.050 C 0.055 131.719 2.551 134.918 6.110 135.810 L 33.160 142.570 C 39.466 184.066 72.034 216.634 113.530 222.940 L 120.290 249.990 C 121.182 253.549 124.381 256.045 128.050 256.045 C 131.719 256.045 134.918 253.549 135.810 249.990 L 142.570 222.940 C 184.066 216.634 216.634 184.066 222.940 142.570 L 249.990 135.810 C 253.549 134.918 256.045 131.719 256.045 128.050 C 256.045 124.381 253.549 121.182 249.990 120.290 ZM 154.450 143.140 L 139.310 128.000 L 154.450 112.860 L 215.000 128.000 ZM 101.550 143.140 L 41.000 128.000 L 101.570 112.860 L 116.690 128.000 ZM 205.770 109.200 L 158.600 97.400 L 146.800 50.230 C 175.972 57.251 198.749 80.028 205.770 109.200 ZM 143.140 101.550 L 128.000 116.690 L 112.860 101.550 L 128.000 41.000 ZM 109.200 50.230 L 97.400 97.400 L 50.230 109.200 C 57.251 80.028 80.028 57.251 109.200 50.230 ZM 50.200 146.800 L 97.400 158.600 L 109.200 205.770 C 80.028 198.749 57.251 175.972 50.230 146.800 ZM 112.830 154.450 L 128.000 139.310 L 143.140 154.450 L 128.000 215.000 ZM 146.770 205.770 L 158.570 158.600 L 205.740 146.800 C 198.724 175.964 175.960 198.739 146.800 205.770 Z"),
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
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null
