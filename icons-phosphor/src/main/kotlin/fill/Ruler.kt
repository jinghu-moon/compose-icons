package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorFillIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.320 96.000 L 96.000 235.310 C 92.999 238.311 88.929 239.998 84.685 239.998 C 80.441 239.998 76.371 238.311 73.370 235.310 L 20.680 182.630 C 17.679 179.629 15.992 175.559 15.992 171.315 C 15.992 167.071 17.679 163.001 20.680 160.000 L 49.850 130.830 C 50.600 130.079 51.618 129.657 52.680 129.657 C 53.742 129.657 54.760 130.079 55.510 130.830 L 90.340 165.660 C 91.912 167.231 94.067 168.078 96.289 167.996 C 98.510 167.914 100.597 166.912 102.050 165.230 C 104.775 161.943 104.513 157.114 101.450 154.140 L 66.820 119.510 C 65.262 117.949 65.262 115.421 66.820 113.860 L 81.820 98.860 C 82.570 98.109 83.588 97.687 84.650 97.687 C 85.712 97.687 86.730 98.109 87.480 98.860 L 122.310 133.690 C 123.882 135.261 126.037 136.108 128.259 136.026 C 130.480 135.944 132.567 134.942 134.020 133.260 C 136.745 129.973 136.483 125.144 133.420 122.170 L 98.830 87.510 C 97.272 85.949 97.272 83.421 98.830 81.860 L 113.830 66.860 C 115.391 65.302 117.919 65.302 119.480 66.860 L 154.310 101.690 C 155.883 103.265 158.040 104.113 160.264 104.031 C 162.488 103.950 164.577 102.946 166.030 101.260 C 168.752 97.971 168.486 93.141 165.420 90.170 L 130.830 55.510 C 129.272 53.949 129.272 51.421 130.830 49.860 L 160.000 20.690 C 163.001 17.689 167.071 16.002 171.315 16.002 C 175.559 16.002 179.629 17.689 182.630 20.690 L 235.320 73.370 C 238.321 76.371 240.008 80.441 240.008 84.685 C 240.008 88.929 238.321 92.999 235.320 96.000 Z"),
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null
