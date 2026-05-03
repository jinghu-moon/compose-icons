package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gear: ImageVector
    get() {
        if (_gear != null) return _gear!!
        _gear = phosphorFillIcon(
            name = "Gear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 130.160 Q 216.060 128.000 216.000 125.840 L 230.920 107.200 C 232.507 105.215 233.056 102.595 232.400 100.140 C 229.950 90.947 226.291 82.121 221.520 73.890 C 220.252 71.707 218.028 70.250 215.520 69.960 L 191.800 67.320 Q 190.320 65.760 188.800 64.320 L 186.000 40.540 C 185.708 38.030 184.247 35.805 182.060 34.540 C 173.830 29.772 165.003 26.120 155.810 23.680 C 153.355 23.024 150.735 23.573 148.750 25.160 L 130.160 40.000 Q 128.000 40.000 125.840 40.000 L 107.200 25.110 C 105.215 23.523 102.595 22.974 100.140 23.630 C 90.947 26.080 82.121 29.739 73.890 34.510 C 71.707 35.778 70.250 38.002 69.960 40.510 L 67.320 64.270 Q 65.760 65.760 64.320 67.270 L 40.540 70.000 C 38.030 70.292 35.805 71.753 34.540 73.940 C 29.773 82.172 26.118 90.998 23.670 100.190 C 23.017 102.646 23.570 105.267 25.160 107.250 L 40.000 125.840 Q 40.000 128.000 40.000 130.160 L 25.110 148.800 C 23.523 150.785 22.974 153.405 23.630 155.860 C 26.080 165.053 29.739 173.879 34.510 182.110 C 35.778 184.293 38.002 185.750 40.510 186.040 L 64.230 188.680 Q 65.720 190.240 67.230 191.680 L 70.000 215.460 C 70.292 217.970 71.753 220.195 73.940 221.460 C 82.172 226.227 90.998 229.882 100.190 232.330 C 102.646 232.983 105.267 232.430 107.250 230.840 L 125.840 216.000 Q 128.000 216.060 130.160 216.000 L 148.800 230.920 C 150.785 232.507 153.405 233.056 155.860 232.400 C 165.054 229.954 173.882 226.295 182.110 221.520 C 184.293 220.252 185.750 218.028 186.040 215.520 L 188.680 191.800 Q 190.240 190.320 191.680 188.800 L 215.460 186.000 C 217.970 185.708 220.195 184.247 221.460 182.060 C 226.227 173.828 229.882 165.002 232.330 155.810 C 232.983 153.354 232.430 150.733 230.840 148.750 ZM 128.000 168.000 C 105.909 168.000 88.000 150.091 88.000 128.000 C 88.000 105.909 105.909 88.000 128.000 88.000 C 150.091 88.000 168.000 105.909 168.000 128.000 C 168.000 150.091 150.091 168.000 128.000 168.000 Z"),
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
        return _gear!!
    }

private var _gear: ImageVector? = null
