package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SealCheck: ImageVector
    get() {
        if (_sealCheck != null) return _sealCheck!!
        _sealCheck = phosphorFillIcon(
            name = "SealCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 225.860 102.820 C 222.090 98.880 218.190 94.820 216.720 91.250 C 215.360 87.980 215.280 82.560 215.200 77.310 C 215.050 67.550 214.890 56.490 207.200 48.800 C 199.510 41.110 188.450 40.950 178.690 40.800 C 173.440 40.720 168.020 40.640 164.750 39.280 C 161.190 37.810 157.120 33.910 153.180 30.140 C 146.280 23.510 138.440 16.000 128.000 16.000 C 117.560 16.000 109.730 23.510 102.820 30.140 C 98.880 33.910 94.820 37.810 91.250 39.280 C 88.000 40.640 82.560 40.720 77.310 40.800 C 67.550 40.950 56.490 41.110 48.800 48.800 C 41.110 56.490 41.000 67.550 40.800 77.310 C 40.720 82.560 40.640 87.980 39.280 91.250 C 37.810 94.810 33.910 98.880 30.140 102.820 C 23.510 109.720 16.000 117.560 16.000 128.000 C 16.000 138.440 23.510 146.270 30.140 153.180 C 33.910 157.120 37.810 161.180 39.280 164.750 C 40.640 168.020 40.720 173.440 40.800 178.690 C 40.950 188.450 41.110 199.510 48.800 207.200 C 56.490 214.890 67.550 215.050 77.310 215.200 C 82.560 215.280 87.980 215.360 91.250 216.720 C 94.810 218.190 98.880 222.090 102.820 225.860 C 109.720 232.490 117.560 240.000 128.000 240.000 C 138.440 240.000 146.270 232.490 153.180 225.860 C 157.120 222.090 161.180 218.190 164.750 216.720 C 168.020 215.360 173.440 215.280 178.690 215.200 C 188.450 215.050 199.510 214.890 207.200 207.200 C 214.890 199.510 215.050 188.450 215.200 178.690 C 215.280 173.440 215.360 168.020 216.720 164.750 C 218.190 161.190 222.090 157.120 225.860 153.180 C 232.490 146.280 240.000 138.440 240.000 128.000 C 240.000 117.560 232.490 109.730 225.860 102.820 ZM 173.660 109.660 L 117.660 165.660 C 116.159 167.162 114.123 168.006 112.000 168.006 C 109.877 168.006 107.841 167.162 106.340 165.660 L 82.340 141.660 C 79.214 138.534 79.214 133.466 82.340 130.340 C 85.466 127.214 90.534 127.214 93.660 130.340 L 112.000 148.690 L 162.340 98.340 C 165.466 95.214 170.534 95.214 173.660 98.340 C 176.786 101.466 176.786 106.534 173.660 109.660 Z"),
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
        return _sealCheck!!
    }

private var _sealCheck: ImageVector? = null
