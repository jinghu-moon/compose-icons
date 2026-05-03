package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) return _paintBrushHousehold!!
        _paintBrushHousehold = phosphorThinIcon(
            name = "PaintBrushHousehold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.810 28.190 C 222.559 22.938 215.437 19.988 208.010 19.988 C 200.583 19.988 193.461 22.938 188.210 28.190 L 188.000 28.420 L 131.780 94.110 L 118.150 80.480 C 114.399 76.728 109.311 74.619 104.005 74.619 C 98.699 74.619 93.611 76.728 89.860 80.480 L 13.170 157.170 C 11.612 158.731 11.612 161.259 13.170 162.820 L 93.170 242.820 C 94.731 244.378 97.259 244.378 98.820 242.820 L 175.510 166.130 C 179.262 162.379 181.371 157.291 181.371 151.985 C 181.371 146.679 179.262 141.591 175.510 137.840 L 161.880 124.210 L 227.580 68.000 L 227.810 67.790 C 233.062 62.539 236.012 55.417 236.012 47.990 C 236.012 40.563 233.062 33.441 227.810 28.190 ZM 96.000 234.340 L 73.660 212.000 L 98.830 186.820 C 100.262 185.240 100.202 182.814 98.694 181.306 C 97.186 179.798 94.760 179.738 93.180 181.170 L 68.000 206.340 L 49.660 188.000 L 74.830 162.820 C 76.262 161.240 76.202 158.814 74.694 157.306 C 73.186 155.798 70.760 155.738 69.180 157.170 L 44.000 182.340 L 21.660 160.000 L 72.000 109.650 L 146.350 184.000 ZM 222.260 62.000 L 153.410 121.000 C 152.562 121.724 152.055 122.770 152.011 123.885 C 151.968 124.999 152.391 126.081 153.180 126.870 L 169.870 143.560 C 172.129 145.812 173.399 148.870 173.399 152.060 C 173.399 155.250 172.129 158.308 169.870 160.560 L 152.000 178.340 L 77.660 104.000 L 95.520 86.130 C 97.772 83.871 100.830 82.601 104.020 82.601 C 107.210 82.601 110.268 83.871 112.520 86.130 L 129.210 102.820 C 129.999 103.609 131.081 104.032 132.195 103.989 C 133.310 103.945 134.356 103.438 135.080 102.590 L 194.000 33.740 C 201.890 26.478 214.104 26.731 221.686 34.314 C 229.269 41.896 229.522 54.110 222.260 62.000 Z"),
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
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
