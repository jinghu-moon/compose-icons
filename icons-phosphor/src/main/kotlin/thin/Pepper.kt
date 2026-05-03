package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = phosphorThinIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 163.790 44.140 C 161.792 25.872 146.377 12.029 128.000 12.000 C 125.791 12.000 124.000 13.791 124.000 16.000 C 124.000 18.209 125.791 20.000 128.000 20.000 C 141.981 20.003 153.818 30.320 155.730 44.170 C 124.352 46.443 100.043 72.540 100.000 104.000 C 100.000 152.750 73.290 185.340 20.600 200.870 C 15.222 202.424 11.633 207.491 11.951 213.080 C 12.270 218.669 16.410 223.296 21.930 224.230 C 36.714 226.773 51.689 228.035 66.690 228.000 C 78.339 228.025 89.976 227.257 101.520 225.700 C 134.750 221.110 161.720 210.290 181.710 193.520 C 207.120 172.210 220.000 142.090 220.000 104.000 C 219.955 72.356 195.369 46.173 163.790 44.140 ZM 160.000 52.000 C 183.483 52.033 204.040 67.777 210.190 90.440 L 192.000 99.540 L 161.790 84.430 C 160.663 83.866 159.337 83.866 158.210 84.430 L 128.000 99.540 L 109.810 90.440 C 115.960 67.777 136.517 52.033 160.000 52.000 ZM 176.570 187.390 C 151.100 208.760 95.690 229.160 23.330 216.390 C 21.464 216.108 20.048 214.559 19.935 212.675 C 19.821 210.791 21.041 209.084 22.860 208.580 C 78.560 192.140 108.000 156.000 108.000 104.000 C 108.002 102.200 108.096 100.401 108.280 98.610 L 126.210 107.610 C 127.337 108.174 128.663 108.174 129.790 107.610 L 160.000 92.480 L 190.210 107.590 C 191.337 108.154 192.663 108.154 193.790 107.590 L 211.720 98.590 C 211.905 100.387 211.998 102.193 212.000 104.000 C 212.000 139.620 200.080 167.670 176.570 187.390 Z"),
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
