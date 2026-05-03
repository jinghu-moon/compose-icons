package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Unite: ImageVector
    get() {
        if (_unite != null) return _unite!!
        _unite = phosphorBoldIcon(
            name = "Unite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 178.000 78.000 C 169.084 37.210 131.562 9.161 89.917 12.154 C 48.272 15.146 15.146 48.272 12.154 89.917 C 9.161 131.562 37.210 169.084 78.000 178.000 C 86.916 218.790 124.438 246.839 166.083 243.846 C 207.728 240.854 240.854 207.728 243.846 166.083 C 246.839 124.438 218.790 86.916 178.000 78.000 ZM 220.000 160.000 C 219.995 162.222 219.868 164.442 219.620 166.650 L 175.620 122.650 C 177.715 116.385 179.058 109.892 179.620 103.310 C 203.768 111.694 219.968 134.438 220.000 160.000 ZM 146.000 129.060 L 126.940 110.000 C 135.558 104.276 145.518 100.895 155.840 100.190 C 155.121 110.504 151.730 120.454 146.000 129.060 ZM 110.000 126.940 L 129.060 146.000 C 120.442 151.724 110.482 155.105 100.160 155.810 C 100.879 145.496 104.270 135.546 110.000 126.940 ZM 152.700 76.340 C 146.118 76.902 139.625 78.245 133.360 80.340 L 89.360 36.340 C 91.565 36.106 93.782 35.992 96.000 36.000 C 121.544 36.035 144.274 52.215 152.670 76.340 ZM 64.190 45.160 L 110.920 91.890 C 103.619 97.176 97.206 103.589 91.920 110.890 L 45.160 64.190 C 49.993 56.497 56.497 49.993 64.190 45.160 ZM 36.000 96.000 C 36.005 93.778 36.132 91.558 36.380 89.350 L 80.380 133.350 C 78.285 139.615 76.942 146.108 76.380 152.690 C 52.232 144.306 36.032 121.562 36.000 96.000 ZM 103.330 179.660 C 109.912 179.098 116.405 177.755 122.670 175.660 L 166.670 219.660 C 164.455 219.896 162.228 220.009 160.000 220.000 C 134.456 219.965 111.726 203.785 103.330 179.660 ZM 191.810 210.840 L 145.080 164.110 C 152.381 158.824 158.794 152.411 164.080 145.110 L 210.810 191.840 C 205.982 199.519 199.489 206.012 191.810 210.840 Z"),
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
        return _unite!!
    }

private var _unite: ImageVector? = null
