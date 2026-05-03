package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorRegularIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 247.310 124.760 C 246.960 123.970 238.490 105.180 219.660 86.350 C 194.570 61.260 162.880 48.000 128.000 48.000 C 93.120 48.000 61.430 61.260 36.340 86.350 C 17.510 105.180 9.000 124.000 8.690 124.760 C 7.770 126.829 7.770 129.191 8.690 131.260 C 9.040 132.050 17.510 150.830 36.340 169.660 C 61.430 194.740 93.120 208.000 128.000 208.000 C 162.880 208.000 194.570 194.740 219.660 169.660 C 238.490 150.830 246.960 132.050 247.310 131.260 C 248.230 129.191 248.230 126.829 247.310 124.760 ZM 128.000 192.000 C 97.220 192.000 70.330 180.810 48.070 158.750 C 38.936 149.667 31.166 139.310 25.000 128.000 C 31.164 116.689 38.935 106.332 48.070 97.250 C 70.330 75.190 97.220 64.000 128.000 64.000 C 158.780 64.000 185.670 75.190 207.930 97.250 C 217.081 106.330 224.869 116.687 231.050 128.000 C 223.840 141.460 192.430 192.000 128.000 192.000 ZM 128.000 80.000 C 101.490 80.000 80.000 101.490 80.000 128.000 C 80.000 154.510 101.490 176.000 128.000 176.000 C 154.510 176.000 176.000 154.510 176.000 128.000 C 175.972 101.502 154.498 80.028 128.000 80.000 ZM 128.000 160.000 C 110.327 160.000 96.000 145.673 96.000 128.000 C 96.000 110.327 110.327 96.000 128.000 96.000 C 145.673 96.000 160.000 110.327 160.000 128.000 C 160.000 145.673 145.673 160.000 128.000 160.000 Z"),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
