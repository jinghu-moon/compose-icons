package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorBoldIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.000 93.000 L 140.000 69.200 L 161.830 82.290 C 165.510 84.588 170.144 84.721 173.950 82.636 C 177.756 80.552 180.140 76.576 180.185 72.238 C 180.231 67.899 177.931 63.874 174.170 61.710 L 151.320 48.000 L 174.170 34.290 C 179.720 30.824 181.470 23.552 178.106 17.940 C 174.741 12.329 167.501 10.447 161.830 13.710 L 128.000 34.000 L 94.170 13.710 C 88.499 10.447 81.259 12.329 77.894 17.940 C 74.530 23.552 76.280 30.824 81.830 34.290 L 104.680 48.000 L 81.830 61.710 C 78.069 63.874 75.769 67.899 75.815 72.238 C 75.860 76.576 78.244 80.552 82.050 82.636 C 85.856 84.721 90.490 84.588 94.170 82.290 L 116.000 69.200 L 116.000 93.000 C 76.858 99.259 49.099 134.551 52.239 174.066 C 55.378 213.581 88.360 244.047 128.000 244.047 C 167.640 244.047 200.622 213.581 203.761 174.066 C 206.901 134.551 179.142 99.259 140.000 93.000 ZM 128.000 220.000 C 99.281 220.000 76.000 196.719 76.000 168.000 C 76.000 139.281 99.281 116.000 128.000 116.000 C 156.719 116.000 180.000 139.281 180.000 168.000 C 179.967 196.705 156.705 219.967 128.000 220.000 Z"),
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
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
