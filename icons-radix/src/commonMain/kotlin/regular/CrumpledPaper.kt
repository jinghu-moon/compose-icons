package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CrumpledPaper: ImageVector
    get() {
        if (_crumpledPaper != null) return _crumpledPaper!!
        _crumpledPaper = radixIcon(
            name = "CrumpledPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.609 0.063 L 8.609 1.063 L 8.701 1.098 L 11.701 2.598 C 11.854 2.674 11.950 2.830 11.950 3.000 L 11.950 5.274 L 13.770 6.640 C 13.911 6.746 13.978 6.925 13.940 7.098 L 12.940 11.598 L 12.923 11.654 C 12.876 11.782 12.774 11.883 12.643 11.927 L 9.643 12.927 C 9.637 12.929 9.630 12.931 9.624 12.933 L 6.124 13.933 C 5.936 13.986 5.735 13.912 5.626 13.750 L 4.201 11.612 L 1.327 10.415 L 1.255 10.377 C 1.097 10.274 1.016 10.080 1.064 9.891 L 2.012 6.099 L 0.640 4.270 C 0.556 4.158 0.529 4.013 0.567 3.879 C 0.604 3.744 0.703 3.634 0.833 3.582 L 3.154 2.653 L 4.082 0.333 C 4.155 0.150 4.337 0.039 4.527 0.051 L 4.609 0.063 ZM 6.852 4.281 L 6.804 4.332 C 6.685 4.441 6.514 4.479 6.358 4.427 L 3.515 3.479 L 1.713 4.199 L 2.725 5.550 L 5.000 5.550 C 5.249 5.550 5.450 5.752 5.450 6.000 C 5.450 6.248 5.249 6.450 5.000 6.450 L 2.852 6.450 L 2.031 9.733 L 4.673 10.835 C 4.734 10.861 4.790 10.899 4.834 10.948 L 4.874 11.000 L 6.193 12.977 L 8.403 12.345 L 7.262 11.632 C 7.051 11.500 6.987 11.222 7.118 11.012 C 7.250 10.801 7.528 10.737 7.738 10.868 L 9.254 11.815 L 10.073 9.357 C 10.093 9.298 10.125 9.243 10.167 9.197 L 10.212 9.154 L 12.776 7.019 L 11.433 6.012 L 9.361 6.840 L 8.927 8.143 L 8.890 8.226 C 8.785 8.407 8.564 8.495 8.358 8.427 C 8.151 8.358 8.028 8.154 8.053 7.946 L 8.073 7.857 L 8.573 6.357 C 8.605 6.263 8.666 6.183 8.746 6.128 L 8.833 6.082 L 11.050 5.195 L 11.050 3.277 L 8.625 2.064 L 6.852 4.281 ZM 10.887 9.764 L 10.212 11.788 L 12.116 11.153 L 12.774 8.190 L 10.887 9.764 ZM 4.096 2.724 L 6.345 3.474 L 7.711 1.766 L 4.773 1.031 L 4.096 2.724 Z"),
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
        return _crumpledPaper!!
    }

private var _crumpledPaper: ImageVector? = null
