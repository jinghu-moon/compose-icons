package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) return _thermometerHot!!
        _thermometerHot = phosphorFillIcon(
            name = "ThermometerHot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 146.080 L 152.000 40.000 C 152.000 22.327 137.673 8.000 120.000 8.000 C 102.327 8.000 88.000 22.327 88.000 40.000 L 88.000 146.080 C 67.920 160.062 59.243 185.461 66.570 208.806 C 73.897 232.151 95.532 248.036 120.000 248.036 C 144.468 248.036 166.103 232.151 173.430 208.806 C 180.757 185.461 172.080 160.062 152.000 146.080 ZM 136.000 56.000 L 104.000 56.000 L 104.000 40.000 C 104.000 31.163 111.163 24.000 120.000 24.000 C 128.837 24.000 136.000 31.163 136.000 40.000 ZM 177.300 80.770 C 174.887 77.070 175.930 72.114 179.630 69.700 C 194.630 59.910 206.500 64.950 215.140 68.640 C 223.000 72.000 227.760 74.000 235.630 68.890 C 239.333 66.477 244.292 67.522 246.705 71.225 C 249.118 74.928 248.073 79.887 244.370 82.300 C 237.880 86.530 232.000 88.000 226.690 88.000 C 219.690 88.000 213.770 85.460 208.860 83.370 C 201.000 80.000 196.240 78.000 188.370 83.110 C 186.592 84.268 184.426 84.672 182.350 84.233 C 180.274 83.794 178.458 82.548 177.300 80.770 ZM 246.700 103.230 C 249.113 106.930 248.070 111.886 244.370 114.300 C 237.880 118.530 232.000 120.000 226.690 120.000 C 219.690 120.000 213.770 117.460 208.860 115.370 C 200.990 112.010 196.240 109.990 188.370 115.120 C 184.667 117.533 179.708 116.488 177.295 112.785 C 174.882 109.082 175.927 104.123 179.630 101.710 C 194.630 91.920 206.500 96.960 215.140 100.650 C 223.010 104.010 227.760 106.040 235.630 100.900 C 239.330 98.487 244.286 99.530 246.700 103.230 Z"),
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
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
