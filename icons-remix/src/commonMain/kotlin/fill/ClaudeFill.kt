package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ClaudeFill: ImageVector
    get() {
        if (_claudeFill != null) return _claudeFill!!
        _claudeFill = remixIcon(
            name = "ClaudeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.920 15.300 L 9.860 13.100 L 9.920 12.900 L 9.860 12.800 L 9.660 12.800 L 9.000 12.760 L 6.760 12.700 L 4.800 12.600 L 2.900 12.500 L 2.420 12.400 L 2.000 11.800 L 2.040 11.500 L 2.440 11.240 L 3.020 11.280 L 4.280 11.380 L 6.180 11.500 L 7.560 11.580 L 9.600 11.820 L 9.920 11.820 L 9.960 11.680 L 9.860 11.600 L 9.780 11.520 L 7.800 10.200 L 5.680 8.800 L 4.560 7.980 L 3.960 7.580 L 3.660 7.180 L 3.540 6.340 L 4.080 5.740 L 4.820 5.800 L 5.000 5.840 L 5.740 6.420 L 7.340 7.640 L 9.400 9.200 L 9.700 9.440 L 9.820 9.360 L 9.840 9.300 L 9.700 9.080 L 8.600 7.000 L 7.400 4.920 L 6.860 4.060 L 6.720 3.540 C 6.660 3.340 6.640 3.140 6.640 2.940 L 7.240 2.100 L 7.600 2.000 L 8.440 2.120 L 8.760 2.400 L 9.280 3.600 L 10.100 5.460 L 11.400 7.980 L 11.800 8.740 L 12.000 9.420 L 12.060 9.620 L 12.200 9.620 L 12.200 9.520 L 12.300 8.080 L 12.500 6.340 L 12.700 4.100 L 12.760 3.460 L 13.080 2.700 L 13.680 2.300 L 14.200 2.520 L 14.600 3.100 L 14.540 3.460 L 14.320 5.000 L 13.800 7.420 L 13.500 9.060 L 13.680 9.060 L 13.880 8.840 L 14.700 7.760 L 16.080 6.040 L 16.680 5.340 L 17.400 4.600 L 17.860 4.240 L 18.720 4.240 L 19.340 5.180 L 19.060 6.160 L 18.180 7.280 L 17.440 8.220 L 16.380 9.640 L 15.740 10.780 L 15.800 10.860 L 15.940 10.860 L 18.340 10.340 L 19.620 10.120 L 21.140 9.860 L 21.840 10.180 L 21.920 10.500 L 21.640 11.180 L 20.000 11.580 L 18.080 11.980 L 15.220 12.640 L 15.180 12.660 L 15.220 12.720 L 16.500 12.840 L 17.060 12.880 L 18.420 12.880 L 20.940 13.080 L 21.600 13.480 L 21.980 14.020 L 21.920 14.420 L 20.900 14.940 L 19.540 14.620 L 16.340 13.860 L 15.260 13.600 L 15.100 13.600 L 15.100 13.680 L 16.020 14.580 L 17.680 16.080 L 19.800 18.020 L 19.900 18.500 L 19.640 18.900 L 19.360 18.860 L 17.520 17.460 L 16.800 16.860 L 15.200 15.500 L 15.100 15.500 L 15.100 15.640 L 15.460 16.180 L 17.420 19.120 L 17.520 20.020 L 17.380 20.300 L 16.860 20.500 L 16.320 20.380 L 15.160 18.780 L 13.960 16.980 L 13.020 15.340 L 12.920 15.420 L 12.340 21.460 L 12.080 21.760 L 11.480 22.000 L 10.980 21.600 L 10.700 21.000 L 10.980 19.760 L 11.300 18.160 L 11.560 16.880 L 11.800 15.300 L 11.940 14.780 L 11.940 14.740 L 11.800 14.740 L 10.600 16.400 L 8.800 18.860 L 7.360 20.380 L 7.020 20.520 L 6.420 20.220 L 6.480 19.660 L 6.800 19.200 L 8.800 16.640 L 10.000 15.060 L 10.800 14.140 L 10.780 14.040 L 10.720 14.040 L 5.440 17.480 L 4.500 17.600 L 4.100 17.200 L 4.140 16.600 L 4.340 16.400 L 5.940 15.300 L 5.920 15.300 Z"),
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
        return _claudeFill!!
    }

private var _claudeFill: ImageVector? = null
