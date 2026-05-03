package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorBoldIcon(
            name = "ContactlessPayment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.580 66.350 C 173.201 104.864 173.201 151.136 152.580 189.650 C 150.600 193.503 146.697 195.990 142.369 196.157 C 138.040 196.324 133.957 194.144 131.687 190.455 C 129.416 186.766 129.311 182.139 131.410 178.350 C 148.246 146.894 148.246 109.106 131.410 77.650 C 129.228 73.856 129.286 69.175 131.559 65.435 C 133.833 61.695 137.963 59.490 142.335 59.680 C 146.708 59.871 150.630 62.427 152.570 66.350 ZM 100.360 77.410 C 97.543 78.897 95.433 81.444 94.495 84.488 C 93.557 87.533 93.868 90.825 95.360 93.640 C 106.816 115.114 106.816 140.886 95.360 162.360 C 93.256 166.152 93.362 170.783 95.636 174.475 C 97.911 178.167 102.000 180.345 106.333 180.172 C 110.665 179.999 114.568 177.502 116.540 173.640 C 131.751 145.114 131.751 110.886 116.540 82.360 C 113.425 76.541 106.197 74.330 100.360 77.410 ZM 236.000 128.000 C 236.000 187.647 187.647 236.000 128.000 236.000 C 68.353 236.000 20.000 187.647 20.000 128.000 C 20.000 68.353 68.353 20.000 128.000 20.000 C 187.619 20.066 235.934 68.381 236.000 128.000 ZM 212.000 128.000 C 212.000 81.608 174.392 44.000 128.000 44.000 C 81.608 44.000 44.000 81.608 44.000 128.000 C 44.000 174.392 81.608 212.000 128.000 212.000 C 174.371 211.950 211.950 174.371 212.000 128.000 Z"),
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
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
