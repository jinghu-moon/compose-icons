package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorBoldIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 92.000 C 108.118 92.000 92.000 108.118 92.000 128.000 C 92.000 147.882 108.118 164.000 128.000 164.000 C 147.882 164.000 164.000 147.882 164.000 128.000 C 164.000 108.118 147.882 92.000 128.000 92.000 ZM 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 ZM 163.370 43.000 L 171.510 15.350 C 172.666 11.368 171.683 7.071 168.912 3.986 C 166.141 0.901 161.973 -0.534 157.890 0.190 C 136.675 4.627 116.354 12.587 97.770 23.740 C 57.360 48.280 36.000 84.330 36.000 128.000 C 36.012 165.160 58.342 198.676 92.630 213.000 L 84.490 240.650 C 83.437 244.273 84.149 248.180 86.412 251.199 C 88.676 254.218 92.227 255.996 96.000 256.000 C 96.708 256.001 97.414 255.938 98.110 255.810 C 119.325 251.373 139.646 243.413 158.230 232.260 C 198.640 207.720 220.000 171.670 220.000 128.000 C 219.988 90.840 197.658 57.324 163.370 43.000 ZM 146.370 211.350 C 136.035 217.600 125.059 222.723 113.630 226.630 L 118.910 208.630 C 119.829 205.523 119.453 202.177 117.867 199.352 C 116.281 196.527 113.621 194.463 110.490 193.630 C 80.745 185.703 60.035 158.783 60.000 128.000 C 60.000 92.880 76.700 64.820 109.650 44.610 C 119.985 38.357 130.961 33.231 142.390 29.320 L 137.110 47.320 C 136.191 50.427 136.567 53.773 138.153 56.598 C 139.739 59.423 142.399 61.487 145.530 62.320 C 175.285 70.259 195.990 97.204 196.000 128.000 C 196.000 163.120 179.300 191.170 146.350 211.390 Z"),
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
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
