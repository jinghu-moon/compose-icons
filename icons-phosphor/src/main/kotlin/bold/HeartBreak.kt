package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorBoldIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 178.000 36.000 C 160.487 35.955 143.683 42.915 131.330 55.330 L 128.000 58.660 L 124.670 55.330 C 105.794 36.453 77.406 30.806 52.743 41.022 C 28.080 51.238 11.999 75.305 12.000 102.000 C 12.000 174.340 117.810 232.140 122.310 234.570 C 125.862 236.483 130.138 236.483 133.690 234.570 C 138.190 232.140 244.000 174.340 244.000 102.000 C 243.956 65.567 214.433 36.044 178.000 36.000 ZM 172.510 178.360 C 158.583 190.178 143.694 200.815 128.000 210.160 C 112.306 200.815 97.417 190.178 83.490 178.360 C 61.820 159.770 36.000 131.420 36.000 102.000 C 35.999 85.012 46.232 69.696 61.927 63.194 C 77.622 56.693 95.688 60.287 107.700 72.300 L 111.000 75.630 L 103.480 83.150 C 101.221 85.402 99.951 88.460 99.951 91.650 C 99.951 94.840 101.221 97.898 103.480 100.150 L 125.180 121.850 L 111.480 135.540 C 106.786 140.234 106.786 147.846 111.480 152.540 C 116.174 157.234 123.786 157.234 128.480 152.540 L 150.660 130.350 C 152.919 128.098 154.189 125.040 154.189 121.850 C 154.189 118.660 152.919 115.602 150.660 113.350 L 129.000 91.630 L 148.300 72.300 C 160.312 60.287 178.378 56.693 194.073 63.194 C 209.768 69.696 220.001 85.012 220.000 102.000 C 220.000 131.420 194.180 159.770 172.510 178.360 Z"),
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
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
