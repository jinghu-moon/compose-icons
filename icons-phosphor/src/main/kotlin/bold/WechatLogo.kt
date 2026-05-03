package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) return _wechatLogo!!
        _wechatLogo = phosphorBoldIcon(
            name = "WechatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 144.000 C 152.000 152.837 144.837 160.000 136.000 160.000 C 127.163 160.000 120.000 152.837 120.000 144.000 C 120.000 135.163 127.163 128.000 136.000 128.000 C 144.837 128.000 152.000 135.163 152.000 144.000 ZM 184.000 128.000 C 175.163 128.000 168.000 135.163 168.000 144.000 C 168.000 152.837 175.163 160.000 184.000 160.000 C 192.837 160.000 200.000 152.837 200.000 144.000 C 200.000 135.163 192.837 128.000 184.000 128.000 ZM 243.180 210.350 C 245.245 217.371 243.310 224.960 238.135 230.135 C 232.960 235.310 225.371 237.245 218.350 235.180 L 195.090 228.340 C 152.950 247.693 103.099 229.238 83.720 187.110 C 75.828 185.959 68.143 183.679 60.900 180.340 L 37.650 187.180 C 35.815 187.719 33.913 187.995 32.000 188.000 C 25.697 188.001 19.763 185.030 15.986 179.984 C 12.210 174.938 11.033 168.407 12.810 162.360 L 19.650 139.100 C 0.268 96.939 18.734 47.047 60.895 27.665 C 103.056 8.283 152.948 26.749 172.330 68.910 C 198.483 72.788 221.284 88.752 233.874 112.001 C 246.464 135.249 247.374 163.068 236.330 187.090 ZM 76.460 160.750 C 71.863 117.044 101.755 77.192 145.000 69.370 C 126.733 43.419 91.417 36.182 64.414 52.854 C 37.412 69.527 28.062 104.343 43.080 132.300 C 44.569 135.080 44.903 138.335 44.010 141.360 L 37.920 162.080 L 58.640 156.000 C 61.665 155.107 64.920 155.441 67.700 156.930 C 70.514 158.434 73.443 159.711 76.460 160.750 ZM 220.000 152.000 C 219.994 125.026 201.988 101.371 175.989 94.183 C 149.990 86.995 122.390 98.040 108.528 121.181 C 94.667 144.321 97.951 173.867 116.557 193.398 C 135.163 212.929 164.515 217.643 188.300 204.920 C 191.080 203.431 194.335 203.097 197.360 203.990 L 218.080 210.080 L 212.000 189.360 C 211.107 186.335 211.441 183.080 212.930 180.300 C 217.575 171.591 220.003 161.871 220.000 152.000 Z"),
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
        return _wechatLogo!!
    }

private var _wechatLogo: ImageVector? = null
