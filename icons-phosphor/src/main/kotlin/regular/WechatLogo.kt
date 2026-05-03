package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) return _wechatLogo!!
        _wechatLogo = phosphorRegularIcon(
            name = "WechatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 140.000 C 144.000 146.627 138.627 152.000 132.000 152.000 C 125.373 152.000 120.000 146.627 120.000 140.000 C 120.000 133.373 125.373 128.000 132.000 128.000 C 138.627 128.000 144.000 133.373 144.000 140.000 ZM 188.000 128.000 C 181.373 128.000 176.000 133.373 176.000 140.000 C 176.000 146.627 181.373 152.000 188.000 152.000 C 194.627 152.000 200.000 146.627 200.000 140.000 C 200.000 133.373 194.627 128.000 188.000 128.000 ZM 239.340 211.470 C 240.996 217.089 239.448 223.164 235.306 227.306 C 231.164 231.448 225.089 232.996 219.470 231.340 L 194.760 224.070 C 175.075 233.564 152.363 234.591 131.901 226.913 C 111.440 219.235 95.010 203.520 86.430 183.420 C 77.682 182.391 69.168 179.907 61.240 176.070 L 36.530 183.340 C 30.911 184.996 24.836 183.448 20.694 179.306 C 16.552 175.164 15.004 169.089 16.660 163.470 L 23.930 138.760 C 11.520 112.649 14.163 81.874 30.844 58.261 C 47.524 34.649 75.646 21.873 104.403 24.843 C 133.160 27.813 158.078 46.067 169.580 72.590 C 195.217 75.679 217.787 90.954 230.185 113.605 C 242.583 136.257 243.285 163.500 232.070 186.760 ZM 81.300 166.300 C 77.300 144.391 82.621 121.807 95.981 103.988 C 109.341 86.169 129.528 74.731 151.680 72.430 C 134.625 41.466 95.699 30.190 64.735 47.245 C 33.771 64.300 22.495 103.226 39.550 134.190 C 40.535 136.031 40.761 138.184 40.180 140.190 L 32.000 168.000 L 59.760 159.830 C 61.766 159.249 63.919 159.475 65.760 160.460 C 70.662 163.079 75.887 165.042 81.300 166.300 ZM 216.450 182.190 C 231.408 154.217 223.618 119.508 198.141 100.609 C 172.663 81.711 137.187 84.327 114.757 106.757 C 92.327 129.187 89.711 164.663 108.609 190.141 C 127.508 215.618 162.217 223.408 190.190 208.450 C 192.031 207.465 194.184 207.239 196.190 207.820 L 224.000 216.000 L 215.830 188.240 C 215.232 186.220 215.455 184.046 216.450 182.190 Z"),
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
