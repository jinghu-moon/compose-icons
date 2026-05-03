package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Seal: ImageVector
    get() {
        if (_seal != null) return _seal!!
        _seal = phosphorFillIcon(
            name = "Seal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 128.000 C 240.000 138.440 232.490 146.270 225.860 153.180 C 222.090 157.120 218.190 161.180 216.720 164.750 C 215.360 168.020 215.280 173.440 215.200 178.690 C 215.050 188.450 214.890 199.510 207.200 207.200 C 199.510 214.890 188.450 215.050 178.690 215.200 C 173.440 215.280 168.020 215.360 164.750 216.720 C 161.180 218.190 157.120 222.090 153.180 225.860 C 146.270 232.490 138.440 240.000 128.000 240.000 C 117.560 240.000 109.730 232.490 102.820 225.860 C 98.880 222.090 94.820 218.190 91.250 216.720 C 87.980 215.360 82.560 215.280 77.310 215.200 C 67.550 215.050 56.490 214.890 48.800 207.200 C 41.110 199.510 40.950 188.450 40.800 178.690 C 40.720 173.440 40.640 168.020 39.280 164.750 C 37.810 161.180 33.910 157.120 30.140 153.180 C 23.510 146.270 16.000 138.440 16.000 128.000 C 16.000 117.560 23.510 109.730 30.140 102.820 C 33.910 98.880 37.810 94.820 39.280 91.250 C 40.640 87.980 40.720 82.560 40.800 77.310 C 40.950 67.550 41.110 56.490 48.800 48.800 C 56.490 41.110 67.550 40.950 77.310 40.800 C 82.560 40.720 87.980 40.640 91.250 39.280 C 94.820 37.810 98.880 33.910 102.820 30.140 C 109.730 23.510 117.560 16.000 128.000 16.000 C 138.440 16.000 146.270 23.510 153.180 30.140 C 157.120 33.910 161.180 37.810 164.750 39.280 C 168.020 40.640 173.440 40.720 178.690 40.800 C 188.450 40.950 199.510 41.110 207.200 48.800 C 214.890 56.490 215.050 67.550 215.200 77.310 C 215.280 82.560 215.360 87.980 216.720 91.250 C 218.190 94.820 222.090 98.880 225.860 102.820 C 232.490 109.730 240.000 117.560 240.000 128.000 Z"),
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
        return _seal!!
    }

private var _seal: ImageVector? = null
