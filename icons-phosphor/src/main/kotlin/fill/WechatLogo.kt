package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) return _wechatLogo!!
        _wechatLogo = phosphorFillIcon(
            name = "WechatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.070 186.760 C 243.285 163.500 242.583 136.257 230.185 113.605 C 217.787 90.954 195.217 75.679 169.580 72.590 C 158.078 46.067 133.160 27.813 104.403 24.843 C 75.646 21.873 47.524 34.649 30.844 58.261 C 14.163 81.874 11.520 112.649 23.930 138.760 L 16.660 163.470 C 15.004 169.089 16.552 175.164 20.694 179.306 C 24.836 183.448 30.911 184.996 36.530 183.340 L 61.240 176.070 C 69.168 179.907 77.682 182.391 86.430 183.420 C 95.010 203.520 111.440 219.235 131.901 226.913 C 152.363 234.591 175.075 233.564 194.760 224.070 L 219.470 231.340 C 225.089 232.996 231.164 231.448 235.306 227.306 C 239.448 223.164 240.996 217.089 239.340 211.470 ZM 132.000 152.000 C 125.373 152.000 120.000 146.627 120.000 140.000 C 120.000 133.373 125.373 128.000 132.000 128.000 C 138.627 128.000 144.000 133.373 144.000 140.000 C 144.000 146.627 138.627 152.000 132.000 152.000 ZM 80.000 152.000 C 80.006 156.796 80.441 161.582 81.300 166.300 C 75.903 165.035 70.696 163.068 65.810 160.450 C 63.969 159.465 61.816 159.239 59.810 159.820 L 32.000 168.000 L 40.170 140.240 C 40.751 138.234 40.525 136.081 39.540 134.240 C 22.472 103.273 33.738 64.333 64.705 47.265 C 95.672 30.197 134.612 41.463 151.680 72.430 C 110.966 76.743 80.053 111.058 80.000 152.000 ZM 188.000 152.000 C 181.373 152.000 176.000 146.627 176.000 140.000 C 176.000 133.373 181.373 128.000 188.000 128.000 C 194.627 128.000 200.000 133.373 200.000 140.000 C 200.000 146.627 194.627 152.000 188.000 152.000 Z"),
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
