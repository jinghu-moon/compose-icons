package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorBoldIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 104.000 C 220.000 110.627 214.627 116.000 208.000 116.000 C 201.373 116.000 196.000 110.627 196.000 104.000 C 196.000 66.445 165.555 36.000 128.000 36.000 C 90.445 36.000 60.000 66.445 60.000 104.000 C 60.000 129.000 67.580 136.300 76.350 144.760 C 85.120 153.220 96.000 163.710 96.000 188.000 C 96.000 205.673 110.327 220.000 128.000 220.000 C 137.000 220.000 144.190 216.300 150.750 208.360 C 155.014 203.420 162.444 202.793 167.476 206.949 C 172.507 211.105 173.296 218.519 169.250 223.640 C 158.090 237.150 144.210 244.000 128.000 244.000 C 97.086 243.967 72.033 218.914 72.000 188.000 C 72.000 173.910 67.370 169.440 59.690 162.000 C 49.130 151.860 36.000 139.190 36.000 104.000 C 36.000 53.190 77.190 12.000 128.000 12.000 C 178.810 12.000 220.000 53.190 220.000 104.000 ZM 179.870 157.610 C 177.115 156.015 173.838 155.581 170.763 156.402 C 167.687 157.224 165.063 159.234 163.470 161.990 C 162.567 163.564 160.718 164.333 158.965 163.864 C 157.213 163.395 155.995 161.805 156.000 159.990 C 156.000 152.380 159.650 147.130 165.600 139.190 C 172.000 130.650 180.000 120.000 180.000 104.000 C 180.000 75.281 156.719 52.000 128.000 52.000 C 99.281 52.000 76.000 75.281 76.000 104.000 C 76.000 110.627 81.373 116.000 88.000 116.000 C 94.627 116.000 100.000 110.627 100.000 104.000 C 100.000 88.536 112.536 76.000 128.000 76.000 C 143.464 76.000 156.000 88.536 156.000 104.000 C 156.000 111.610 152.350 116.860 146.400 124.800 C 140.000 133.350 132.000 144.000 132.000 160.000 C 131.999 172.674 140.511 183.768 152.753 187.048 C 164.995 190.328 177.914 184.976 184.250 174.000 C 187.564 168.264 185.604 160.928 179.870 157.610 Z"),
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
        return _ear!!
    }

private var _ear: ImageVector? = null
