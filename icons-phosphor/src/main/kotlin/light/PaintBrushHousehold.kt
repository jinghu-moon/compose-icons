package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) return _paintBrushHousehold!!
        _paintBrushHousehold = phosphorLightIcon(
            name = "PaintBrushHousehold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.230 26.770 C 217.502 15.079 198.528 15.079 186.800 26.770 L 186.480 27.110 L 131.670 91.160 L 119.560 79.060 C 110.969 70.470 97.041 70.470 88.450 79.060 L 11.760 155.750 C 10.633 156.875 10.000 158.403 10.000 159.995 C 10.000 161.587 10.633 163.115 11.760 164.240 L 91.760 244.240 C 92.885 245.367 94.413 246.000 96.005 246.000 C 97.597 246.000 99.125 245.367 100.250 244.240 L 176.940 167.550 C 185.530 158.959 185.530 145.031 176.940 136.440 L 164.840 124.330 L 228.840 69.520 L 229.180 69.200 C 240.884 57.486 240.907 38.511 229.230 26.770 ZM 96.000 231.510 L 76.490 212.000 L 100.250 188.240 C 102.594 185.896 102.594 182.094 100.250 179.750 C 97.906 177.406 94.104 177.406 91.760 179.750 L 68.000 203.510 L 52.490 188.000 L 76.250 164.240 C 78.594 161.896 78.594 158.094 76.250 155.750 C 73.906 153.406 70.104 153.406 67.760 155.750 L 44.000 179.510 L 24.490 160.000 L 72.000 112.480 L 143.520 184.000 ZM 220.890 60.560 L 152.110 119.430 C 150.836 120.517 150.075 122.087 150.010 123.760 C 149.949 125.430 150.586 127.050 151.770 128.230 L 168.450 144.920 C 170.328 146.796 171.383 149.341 171.383 151.995 C 171.383 154.649 170.328 157.194 168.450 159.070 L 152.000 175.510 L 80.490 104.000 L 96.930 87.550 C 98.806 85.672 101.351 84.617 104.005 84.617 C 106.659 84.617 109.204 85.672 111.080 87.550 L 127.770 104.230 C 128.952 105.412 130.574 106.047 132.244 105.983 C 133.915 105.918 135.483 105.160 136.570 103.890 L 195.440 35.110 C 202.510 28.337 213.697 28.457 220.620 35.380 C 227.543 42.303 227.663 53.490 220.890 60.560 Z"),
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
