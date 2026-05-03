package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Football: ImageVector
    get() {
        if (_football != null) return _football!!
        _football = phosphorThinIcon(
            name = "Football",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 225.120 54.560 C 223.059 42.437 213.563 32.941 201.440 30.880 C 169.830 25.520 110.280 23.050 66.660 66.660 C 23.040 110.270 25.520 169.830 30.880 201.440 C 32.941 213.563 42.437 223.059 54.560 225.120 C 65.691 227.014 76.960 227.977 88.250 228.000 C 119.550 228.000 158.440 220.230 189.340 189.340 C 233.000 145.720 230.480 86.170 225.120 54.560 ZM 167.420 35.900 C 178.377 35.939 189.312 36.896 200.110 38.760 C 208.870 40.269 215.731 47.130 217.240 55.890 C 219.933 71.103 220.712 86.593 219.560 102.000 L 154.000 36.430 C 158.330 36.090 162.790 35.900 167.420 35.900 ZM 55.890 217.240 C 47.130 215.731 40.269 208.870 38.760 200.110 C 36.067 184.897 35.288 169.407 36.440 154.000 L 102.000 219.560 C 86.593 220.712 71.103 219.933 55.890 217.240 ZM 183.680 183.680 C 171.460 195.910 148.450 213.020 112.120 218.410 L 37.590 143.880 C 43.000 107.550 60.090 84.540 72.320 72.320 C 84.550 60.100 107.560 43.000 143.890 37.600 L 218.410 112.120 C 213.000 148.450 195.910 171.460 183.680 183.680 ZM 162.810 93.190 C 164.368 94.751 164.368 97.279 162.810 98.840 L 145.650 116.000 L 154.820 125.160 C 156.383 126.723 156.383 129.257 154.820 130.820 C 153.257 132.383 150.723 132.383 149.160 130.820 L 140.000 121.660 L 121.660 140.000 L 130.830 149.170 C 132.393 150.733 132.393 153.267 130.830 154.830 C 129.267 156.393 126.733 156.393 125.170 154.830 L 116.000 145.650 L 98.840 162.810 C 97.849 163.904 96.336 164.363 94.904 164.004 C 93.472 163.646 92.354 162.528 91.996 161.096 C 91.637 159.664 92.096 158.151 93.190 157.160 L 110.350 140.000 L 101.180 130.840 C 99.617 129.277 99.617 126.743 101.180 125.180 C 102.743 123.617 105.277 123.617 106.840 125.180 L 116.010 134.350 L 134.340 116.000 L 125.170 106.830 C 123.607 105.267 123.607 102.733 125.170 101.170 C 126.733 99.607 129.267 99.607 130.830 101.170 L 139.990 110.340 L 157.160 93.180 C 158.724 91.625 161.251 91.630 162.810 93.190 Z"),
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
        return _football!!
    }

private var _football: ImageVector? = null
