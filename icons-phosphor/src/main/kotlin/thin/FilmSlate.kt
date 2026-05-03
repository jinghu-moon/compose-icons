package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) return _filmSlate!!
        _filmSlate = phosphorThinIcon(
            name = "FilmSlate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 108.000 L 71.260 108.000 L 209.000 71.640 C 210.032 71.368 210.912 70.696 211.445 69.772 C 211.978 68.848 212.121 67.749 211.840 66.720 L 203.680 36.720 C 201.923 30.438 195.444 26.735 189.140 28.410 L 36.830 68.610 C 33.765 69.403 31.149 71.396 29.570 74.140 C 28.015 76.820 27.597 80.010 28.410 83.000 L 36.080 111.190 C 36.025 111.456 35.998 111.728 36.000 112.000 L 36.000 200.000 C 36.000 206.627 41.373 212.000 48.000 212.000 L 208.000 212.000 C 214.627 212.000 220.000 206.627 220.000 200.000 L 220.000 112.000 C 220.000 109.791 218.209 108.000 216.000 108.000 ZM 126.000 53.330 L 164.000 75.250 L 116.080 87.900 L 78.120 66.000 ZM 191.160 36.130 C 191.487 36.045 191.823 36.001 192.160 36.000 C 193.932 35.950 195.512 37.106 196.000 38.810 L 203.100 64.930 L 175.000 72.350 L 137.000 50.430 ZM 36.460 78.130 C 36.978 77.237 37.831 76.589 38.830 76.330 L 67.100 68.870 L 105.100 90.780 L 43.250 107.120 L 36.130 80.940 C 35.874 79.995 36.007 78.986 36.500 78.140 ZM 212.000 200.000 C 212.000 202.209 210.209 204.000 208.000 204.000 L 48.000 204.000 C 45.791 204.000 44.000 202.209 44.000 200.000 L 44.000 116.000 L 212.000 116.000 Z"),
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
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
