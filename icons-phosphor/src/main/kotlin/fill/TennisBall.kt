package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorFillIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 24.810 115.410 C 30.557 67.948 67.951 30.533 115.410 24.760 C 116.514 24.628 117.623 24.962 118.471 25.681 C 119.319 26.400 119.829 27.439 119.880 28.550 C 120.880 53.055 111.588 76.861 94.252 94.208 C 76.915 111.556 53.115 120.864 28.610 119.880 C 27.498 119.832 26.455 119.323 25.734 118.474 C 25.013 117.626 24.678 116.516 24.810 115.410 ZM 227.350 136.110 C 226.230 136.110 225.120 136.040 224.000 136.040 C 200.064 136.009 177.153 145.748 160.565 163.002 C 143.976 180.257 135.147 203.534 136.120 227.450 C 136.171 228.561 136.681 229.600 137.529 230.319 C 138.377 231.038 139.486 231.372 140.590 231.240 C 188.053 225.466 225.447 188.046 231.190 140.580 C 231.322 139.468 230.982 138.351 230.252 137.501 C 229.522 136.652 228.469 136.147 227.350 136.110 ZM 150.460 150.460 C 169.922 130.893 196.403 119.925 224.000 120.000 C 225.000 120.000 226.060 120.000 227.090 120.000 C 228.250 120.042 229.372 119.577 230.163 118.727 C 230.953 117.876 231.336 116.724 231.210 115.570 C 225.535 67.924 187.975 30.360 140.330 24.680 C 139.176 24.554 138.024 24.937 137.173 25.727 C 136.323 26.518 135.858 27.640 135.900 28.800 C 136.819 57.465 125.829 85.230 105.540 105.500 C 86.084 125.081 59.603 136.064 32.000 136.000 C 31.000 136.000 29.940 136.000 28.910 136.000 C 27.750 135.958 26.628 136.423 25.837 137.273 C 25.047 138.124 24.664 139.276 24.790 140.430 C 30.465 188.076 68.025 225.640 115.670 231.320 C 116.824 231.446 117.976 231.063 118.827 230.273 C 119.677 229.482 120.142 228.360 120.100 227.200 C 119.170 198.522 130.161 170.739 150.460 150.460 Z"),
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
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
