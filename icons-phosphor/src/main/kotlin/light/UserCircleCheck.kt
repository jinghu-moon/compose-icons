package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCircleCheck: ImageVector
    get() {
        if (_userCircleCheck != null) return _userCircleCheck!!
        _userCircleCheck = phosphorLightIcon(
            name = "UserCircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.680 106.080 C 218.414 106.630 216.212 109.723 216.760 112.990 C 217.584 117.951 217.999 122.971 218.000 128.000 C 218.017 150.922 209.253 172.980 193.510 189.640 C 184.083 174.981 169.991 163.927 153.510 158.260 C 170.384 147.021 177.910 126.060 172.039 106.654 C 166.168 87.249 148.284 73.975 128.010 73.975 C 107.736 73.975 89.852 87.249 83.981 106.654 C 78.110 126.060 85.636 147.021 102.510 158.260 C 86.029 163.927 71.937 174.981 62.510 189.640 C 37.888 163.512 31.160 125.245 45.395 92.286 C 59.629 59.327 92.099 37.989 128.000 38.000 C 133.026 38.001 138.042 38.416 143.000 39.240 C 145.133 39.642 147.317 38.861 148.711 37.197 C 150.105 35.533 150.491 33.246 149.722 31.217 C 148.952 29.187 147.147 27.731 145.000 27.410 C 101.290 20.063 57.844 41.814 37.535 81.211 C 17.227 120.607 24.714 168.613 56.055 199.955 C 87.397 231.296 135.403 238.783 174.799 218.475 C 214.196 198.166 235.947 154.720 228.600 111.010 C 228.338 109.438 227.461 108.034 226.163 107.109 C 224.865 106.184 223.252 105.814 221.680 106.080 ZM 94.000 120.000 C 94.000 101.222 109.222 86.000 128.000 86.000 C 146.778 86.000 162.000 101.222 162.000 120.000 C 162.000 138.778 146.778 154.000 128.000 154.000 C 109.222 154.000 94.000 138.778 94.000 120.000 ZM 71.440 198.000 C 83.376 178.153 104.841 166.014 128.000 166.014 C 151.159 166.014 172.624 178.153 184.560 198.000 C 151.592 224.734 104.408 224.734 71.440 198.000 ZM 236.240 44.240 L 204.240 76.240 C 201.897 78.580 198.103 78.580 195.760 76.240 L 179.760 60.240 C 177.557 57.876 177.622 54.192 179.907 51.907 C 182.192 49.622 185.876 49.557 188.240 51.760 L 200.000 63.510 L 227.760 35.760 C 230.124 33.557 233.808 33.622 236.093 35.907 C 238.378 38.192 238.443 41.876 236.240 44.240 Z"),
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
        return _userCircleCheck!!
    }

private var _userCircleCheck: ImageVector? = null
