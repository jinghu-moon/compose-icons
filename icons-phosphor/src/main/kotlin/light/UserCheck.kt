package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorLightIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 139.000 158.250 C 165.748 144.019 179.371 113.405 172.037 84.008 C 164.704 54.612 138.298 33.983 108.000 33.983 C 77.702 33.983 51.296 54.612 43.963 84.008 C 36.629 113.405 50.252 144.019 77.000 158.250 C 55.000 164.480 35.120 177.410 19.390 196.140 C 17.378 198.684 17.751 202.367 20.234 204.455 C 22.717 206.542 26.409 206.279 28.570 203.860 C 49.110 179.440 77.310 166.000 108.000 166.000 C 138.690 166.000 166.900 179.440 187.410 203.860 C 188.766 205.575 190.948 206.416 193.105 206.055 C 195.261 205.695 197.051 204.190 197.776 202.127 C 198.501 200.064 198.047 197.770 196.590 196.140 C 180.860 177.410 161.000 164.480 139.000 158.250 ZM 54.000 100.000 C 54.000 70.177 78.177 46.000 108.000 46.000 C 137.823 46.000 162.000 70.177 162.000 100.000 C 162.000 129.823 137.823 154.000 108.000 154.000 C 78.190 153.967 54.033 129.810 54.000 100.000 ZM 252.240 132.240 L 220.240 164.240 C 217.897 166.580 214.103 166.580 211.760 164.240 L 195.760 148.240 C 193.557 145.876 193.622 142.192 195.907 139.907 C 198.192 137.622 201.876 137.557 204.240 139.760 L 216.000 151.510 L 243.760 123.760 C 245.256 122.155 247.508 121.494 249.634 122.037 C 251.760 122.580 253.420 124.240 253.963 126.366 C 254.506 128.492 253.845 130.744 252.240 132.240 Z"),
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
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
