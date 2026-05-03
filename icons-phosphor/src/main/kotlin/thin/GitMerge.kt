package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) return _gitMerge!!
        _gitMerge = phosphorThinIcon(
            name = "GitMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 116.000 C 194.298 116.003 182.611 125.921 180.380 139.440 L 134.530 132.890 C 131.648 132.477 129.014 131.031 127.120 128.820 L 87.750 82.900 C 101.507 78.933 110.056 65.227 107.566 51.127 C 105.076 37.028 92.351 27.078 78.067 28.062 C 63.783 29.047 52.543 40.649 52.012 54.957 C 51.480 69.265 61.829 81.668 76.000 83.710 L 76.000 172.290 C 61.465 174.388 51.020 187.360 52.072 202.008 C 53.124 216.656 65.314 228.003 80.000 228.003 C 94.686 228.003 106.876 216.656 107.928 202.008 C 108.980 187.360 98.535 174.388 84.000 172.290 L 84.000 90.810 L 121.000 134.000 C 124.161 137.685 128.554 140.095 133.360 140.780 L 180.190 147.470 C 182.050 162.364 195.324 173.142 210.282 171.905 C 225.241 170.667 236.563 157.855 235.951 142.858 C 235.339 127.861 223.010 116.014 208.000 116.000 ZM 60.000 56.000 C 60.000 44.954 68.954 36.000 80.000 36.000 C 91.046 36.000 100.000 44.954 100.000 56.000 C 100.000 67.046 91.046 76.000 80.000 76.000 C 68.954 76.000 60.000 67.046 60.000 56.000 ZM 100.000 200.000 C 100.000 211.046 91.046 220.000 80.000 220.000 C 68.954 220.000 60.000 211.046 60.000 200.000 C 60.000 188.954 68.954 180.000 80.000 180.000 C 91.046 180.000 100.000 188.954 100.000 200.000 ZM 208.000 164.000 C 196.954 164.000 188.000 155.046 188.000 144.000 C 188.000 132.954 196.954 124.000 208.000 124.000 C 219.046 124.000 228.000 132.954 228.000 144.000 C 228.000 155.046 219.046 164.000 208.000 164.000 Z"),
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
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
