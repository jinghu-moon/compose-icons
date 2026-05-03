package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = phosphorThinIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 186.840 85.170 C 187.591 85.920 188.013 86.938 188.013 88.000 C 188.013 89.062 187.591 90.080 186.840 90.830 L 162.840 114.830 C 161.277 116.393 158.743 116.393 157.180 114.830 C 155.617 113.267 155.617 110.733 157.180 109.170 L 181.180 85.170 C 181.930 84.419 182.948 83.997 184.010 83.997 C 185.072 83.997 186.090 84.419 186.840 85.170 ZM 213.590 112.080 L 112.080 213.570 C 92.787 232.452 61.890 232.287 42.798 213.201 C 23.707 194.115 23.534 163.219 42.410 143.920 L 143.920 42.430 C 163.213 23.548 194.110 23.713 213.202 42.799 C 232.293 61.885 232.466 92.781 213.590 112.080 ZM 154.350 160.000 L 96.000 101.660 L 48.060 149.570 C 31.947 165.686 31.949 191.812 48.065 207.925 C 64.181 224.038 90.307 224.036 106.420 207.920 ZM 207.940 48.080 C 191.821 31.972 165.699 31.972 149.580 48.080 L 101.650 96.000 L 160.000 154.340 L 207.930 106.430 C 224.012 90.306 224.017 64.209 207.940 48.080 Z"),
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
        return _pill!!
    }

private var _pill: ImageVector? = null
