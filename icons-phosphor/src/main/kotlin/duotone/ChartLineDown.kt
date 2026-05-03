package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartLineDown: ImageVector
    get() {
        if (_chartLineDown != null) return _chartLineDown!!
        _chartLineDown = phosphorDuotoneIcon(
            name = "ChartLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 64.000 L 224.000 208.000 L 32.000 208.000 L 32.000 48.000 L 208.000 48.000 C 216.837 48.000 224.000 55.163 224.000 64.000 Z"),
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
        pathData = parseSvgPathData("M 232.000 208.000 C 232.000 212.418 228.418 216.000 224.000 216.000 L 32.000 216.000 C 27.582 216.000 24.000 212.418 24.000 208.000 L 24.000 48.000 C 24.000 43.582 27.582 40.000 32.000 40.000 C 36.418 40.000 40.000 43.582 40.000 48.000 L 40.000 60.690 L 96.000 116.690 L 122.340 90.340 C 123.841 88.838 125.877 87.994 128.000 87.994 C 130.123 87.994 132.159 88.838 133.660 90.340 L 192.000 148.690 L 192.000 128.000 C 192.000 123.582 195.582 120.000 200.000 120.000 C 204.418 120.000 208.000 123.582 208.000 128.000 L 208.000 168.000 C 208.015 168.266 208.015 168.534 208.000 168.800 C 208.000 168.910 208.000 169.010 207.950 169.120 C 207.900 169.230 207.950 169.420 207.880 169.580 C 207.858 169.705 207.828 169.829 207.790 169.950 C 207.790 170.080 207.730 170.210 207.690 170.340 C 207.650 170.470 207.610 170.570 207.570 170.690 L 207.430 171.080 L 207.280 171.390 C 207.220 171.520 207.160 171.660 207.090 171.790 C 207.020 171.920 206.980 171.970 206.930 172.070 L 206.690 172.460 L 206.480 172.740 L 206.220 173.090 C 206.110 173.230 205.980 173.360 205.860 173.490 L 205.700 173.670 L 205.530 173.820 C 205.397 173.951 205.257 174.075 205.110 174.190 C 205.008 174.279 204.901 174.362 204.790 174.440 L 204.490 174.660 L 204.110 174.890 C 204.013 174.953 203.913 175.009 203.810 175.060 L 203.440 175.250 L 203.100 175.400 L 202.740 175.530 C 202.617 175.582 202.490 175.626 202.360 175.660 L 202.000 175.760 C 201.860 175.760 201.740 175.830 201.600 175.850 L 201.180 175.920 L 200.830 175.970 C 200.567 175.985 200.303 175.985 200.040 175.970 L 160.000 175.970 C 155.582 175.970 152.000 172.388 152.000 167.970 C 152.000 163.552 155.582 159.970 160.000 159.970 L 180.690 159.970 L 128.000 107.310 L 101.660 133.660 C 100.159 135.162 98.123 136.006 96.000 136.006 C 93.877 136.006 91.841 135.162 90.340 133.660 L 40.000 83.310 L 40.000 200.000 L 224.000 200.000 C 228.418 200.000 232.000 203.582 232.000 208.000 Z"),
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
        return _chartLineDown!!
    }

private var _chartLineDown: ImageVector? = null
