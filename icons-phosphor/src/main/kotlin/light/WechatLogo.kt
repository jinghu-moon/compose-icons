package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) return _wechatLogo!!
        _wechatLogo = phosphorLightIcon(
            name = "WechatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 142.000 140.000 C 142.000 145.523 137.523 150.000 132.000 150.000 C 126.477 150.000 122.000 145.523 122.000 140.000 C 122.000 134.477 126.477 130.000 132.000 130.000 C 137.523 130.000 142.000 134.477 142.000 140.000 ZM 188.000 130.000 C 182.477 130.000 178.000 134.477 178.000 140.000 C 178.000 145.523 182.477 150.000 188.000 150.000 C 193.523 150.000 198.000 145.523 198.000 140.000 C 198.000 134.477 193.523 130.000 188.000 130.000 ZM 237.420 212.000 C 238.892 216.929 237.542 222.267 233.905 225.905 C 230.267 229.542 224.929 230.892 220.000 229.420 L 194.540 221.930 C 175.147 231.505 152.649 232.597 132.420 224.947 C 112.190 217.297 96.045 201.591 87.840 181.580 C 78.646 180.636 69.696 178.045 61.420 173.930 L 36.000 181.420 C 31.071 182.892 25.733 181.542 22.095 177.905 C 18.458 174.267 17.108 168.929 18.580 164.000 L 26.070 138.540 C 13.481 112.976 15.835 82.581 32.210 59.260 C 48.585 35.938 76.374 23.403 104.694 26.562 C 133.014 29.722 157.357 48.073 168.190 74.430 C 193.570 77.105 216.036 92.027 228.344 114.384 C 240.652 136.741 241.244 163.704 229.930 186.580 ZM 83.860 168.870 C 78.918 146.661 83.930 123.401 97.581 105.198 C 111.231 86.995 132.155 75.667 154.860 74.190 C 138.032 41.854 98.176 29.282 65.840 46.110 C 33.504 62.938 20.932 102.794 37.760 135.130 C 38.501 136.521 38.669 138.146 38.230 139.660 L 30.060 167.420 C 29.851 168.122 30.043 168.883 30.560 169.402 C 31.077 169.922 31.837 170.116 32.540 169.910 L 60.310 161.740 C 61.824 161.302 63.449 161.470 64.840 162.210 C 70.797 165.402 77.213 167.649 83.860 168.870 ZM 218.210 183.130 C 233.635 154.283 225.602 118.489 199.329 99.000 C 173.055 79.511 136.471 82.208 113.339 105.339 C 90.208 128.471 87.511 165.055 107.000 191.329 C 126.489 217.602 162.283 225.635 191.130 210.210 C 192.521 209.470 194.146 209.302 195.660 209.740 L 223.430 217.910 C 224.131 218.114 224.888 217.921 225.404 217.404 C 225.921 216.888 226.114 216.131 225.910 215.430 L 217.740 187.660 C 217.301 186.146 217.469 184.521 218.210 183.130 Z"),
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
        return _wechatLogo!!
    }

private var _wechatLogo: ImageVector? = null
