package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorLightIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.570 133.770 L 205.570 53.770 L 205.570 53.770 C 204.479 51.045 201.577 49.509 198.710 50.140 L 134.000 64.520 L 134.000 40.000 C 134.000 36.686 131.314 34.000 128.000 34.000 C 124.686 34.000 122.000 36.686 122.000 40.000 L 122.000 67.190 L 54.700 82.190 C 52.764 82.620 51.166 83.979 50.430 85.820 L 50.430 85.820 L 50.430 85.820 L 18.430 165.820 C 18.154 166.514 18.009 167.253 18.000 168.000 C 18.000 189.860 41.310 198.000 56.000 198.000 C 70.690 198.000 94.000 189.860 94.000 168.000 C 93.998 167.236 93.852 166.480 93.570 165.770 L 64.190 92.330 L 122.000 79.480 L 122.000 210.000 L 104.000 210.000 C 100.686 210.000 98.000 212.686 98.000 216.000 C 98.000 219.314 100.686 222.000 104.000 222.000 L 152.000 222.000 C 155.314 222.000 158.000 219.314 158.000 216.000 C 158.000 212.686 155.314 210.000 152.000 210.000 L 134.000 210.000 L 134.000 76.810 L 190.210 64.320 L 162.430 133.770 C 162.148 134.480 162.002 135.236 162.000 136.000 C 162.000 157.860 185.310 166.000 200.000 166.000 C 214.690 166.000 238.000 157.860 238.000 136.000 C 237.998 135.236 237.852 134.480 237.570 133.770 ZM 56.000 186.000 C 49.885 185.952 43.879 184.385 38.520 181.440 C 33.150 178.310 30.370 174.260 30.030 169.070 L 56.030 104.160 L 82.030 169.070 C 81.060 182.850 62.580 186.000 56.000 186.000 ZM 200.000 154.000 C 193.885 153.952 187.879 152.385 182.520 149.440 C 177.150 146.310 174.370 142.260 174.030 137.070 L 200.030 72.160 L 226.030 137.070 C 225.060 150.850 206.580 154.000 200.000 154.000 Z"),
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
        return _scales!!
    }

private var _scales: ImageVector? = null
