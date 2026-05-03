package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Snowflake: ImageVector
    get() {
        if (_snowflake != null) return _snowflake!!
        _snowflake = phosphorDuotoneIcon(
            name = "Snowflake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 220.000 128.000 C 220.000 178.810 178.810 220.000 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.787 36.055 219.945 77.213 220.000 128.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 223.770 150.090 C 224.277 152.151 223.944 154.328 222.845 156.144 C 221.746 157.959 219.971 159.264 217.910 159.770 L 193.270 165.770 L 199.730 189.880 C 200.280 191.930 199.992 194.115 198.930 195.953 C 197.869 197.791 196.120 199.132 194.070 199.680 C 193.396 199.874 192.701 199.982 192.000 200.000 C 188.382 199.997 185.216 197.565 184.280 194.070 L 176.560 165.270 L 136.000 141.860 L 136.000 188.690 L 157.660 210.340 C 160.786 213.466 160.786 218.534 157.660 221.660 C 154.534 224.786 149.466 224.786 146.340 221.660 L 128.000 203.310 L 109.660 221.660 C 106.534 224.786 101.466 224.786 98.340 221.660 C 95.214 218.534 95.214 213.466 98.340 210.340 L 120.000 188.690 L 120.000 141.860 L 79.450 165.270 L 71.730 194.070 C 70.793 197.569 67.622 200.001 64.000 200.000 C 63.298 199.999 62.599 199.908 61.920 199.730 C 59.870 199.182 58.121 197.841 57.060 196.003 C 55.998 194.165 55.710 191.980 56.260 189.930 L 62.720 165.820 L 38.080 159.820 C 33.789 158.765 31.165 154.431 32.220 150.140 C 33.275 145.849 37.609 143.225 41.900 144.280 L 71.350 151.510 L 112.000 128.000 L 71.360 104.540 L 41.910 111.770 C 41.285 111.925 40.644 112.002 40.000 112.000 C 35.952 112.003 32.539 108.981 32.053 104.962 C 31.566 100.943 34.158 97.194 38.090 96.230 L 62.730 90.230 L 56.270 66.070 C 55.127 61.801 57.661 57.413 61.930 56.270 C 66.199 55.127 70.587 57.661 71.730 61.930 L 79.450 90.730 L 120.000 114.140 L 120.000 67.310 L 98.340 45.660 C 95.214 42.534 95.214 37.466 98.340 34.340 C 101.466 31.214 106.534 31.214 109.660 34.340 L 128.000 52.690 L 146.340 34.340 C 149.466 31.214 154.534 31.214 157.660 34.340 C 160.786 37.466 160.786 42.534 157.660 45.660 L 136.000 67.310 L 136.000 114.140 L 176.550 90.730 L 184.270 61.930 C 185.413 57.661 189.801 55.127 194.070 56.270 C 198.339 57.413 200.873 61.801 199.730 66.070 L 193.270 90.180 L 217.910 96.180 C 221.958 97.044 224.678 100.853 224.182 104.962 C 223.685 109.072 220.137 112.124 216.000 112.000 C 215.356 112.002 214.715 111.925 214.090 111.770 L 184.640 104.540 L 144.000 128.000 L 184.640 151.460 L 214.090 144.230 C 216.151 143.723 218.328 144.056 220.144 145.155 C 221.959 146.254 223.264 148.029 223.770 150.090 Z"),
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
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
