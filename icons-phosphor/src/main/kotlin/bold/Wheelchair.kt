package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorBoldIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 255.140 187.540 C 252.677 181.388 245.692 178.397 239.540 180.860 L 229.790 184.760 L 202.730 130.630 C 200.697 126.567 196.543 124.001 192.000 124.000 L 116.000 124.000 L 116.000 108.000 L 168.000 108.000 C 174.627 108.000 180.000 102.627 180.000 96.000 C 180.000 89.373 174.627 84.000 168.000 84.000 L 116.000 84.000 L 116.000 77.810 C 131.368 72.013 140.395 56.058 137.449 39.899 C 134.502 23.740 120.425 11.998 104.000 11.998 C 87.575 11.998 73.498 23.740 70.551 39.899 C 67.605 56.058 76.632 72.013 92.000 77.810 L 92.000 86.690 C 58.214 95.911 35.103 127.026 36.037 162.036 C 36.971 197.045 61.708 226.883 95.938 234.290 C 130.168 241.696 165.027 224.752 180.350 193.260 C 182.284 189.400 181.994 184.798 179.593 181.210 C 177.191 177.623 173.047 175.602 168.741 175.918 C 164.435 176.234 160.631 178.840 158.780 182.740 C 148.660 203.542 126.015 215.158 103.216 211.241 C 80.417 207.325 62.947 188.818 60.349 165.832 C 57.751 142.845 70.650 120.906 92.000 112.000 L 92.000 136.000 C 92.000 142.627 97.373 148.000 104.000 148.000 L 184.580 148.000 L 213.260 205.370 C 216.053 210.950 222.657 213.459 228.450 211.140 L 248.450 203.140 C 251.406 201.959 253.772 199.652 255.027 196.726 C 256.281 193.800 256.322 190.496 255.140 187.540 ZM 104.000 36.000 C 109.523 36.000 114.000 40.477 114.000 46.000 C 114.000 51.523 109.523 56.000 104.000 56.000 C 98.477 56.000 94.000 51.523 94.000 46.000 C 94.000 40.477 98.477 36.000 104.000 36.000 Z"),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
