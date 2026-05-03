package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Radioactive: ImageVector
    get() {
        if (_radioactive != null) return _radioactive!!
        _radioactive = phosphorRegularIcon(
            name = "Radioactive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 136.000 L 40.000 136.000 C 35.524 135.985 31.259 134.095 28.240 130.790 C 25.178 127.433 23.665 122.946 24.070 118.420 C 26.819 88.082 42.753 60.482 67.650 42.930 C 71.324 40.331 75.923 39.400 80.319 40.365 C 84.715 41.330 88.502 44.101 90.750 48.000 L 116.750 93.000 C 118.959 96.827 117.647 101.721 113.820 103.930 C 109.993 106.139 105.099 104.827 102.890 101.000 L 76.890 56.000 C 55.819 70.843 42.331 94.192 40.000 119.860 C 39.996 119.922 40.022 119.981 40.070 120.020 L 92.000 120.000 C 96.418 120.000 100.000 123.582 100.000 128.000 C 100.000 132.418 96.418 136.000 92.000 136.000 ZM 231.930 118.420 C 229.180 88.082 213.247 60.482 188.350 42.930 C 184.676 40.331 180.077 39.400 175.681 40.365 C 171.285 41.330 167.498 44.101 165.250 48.000 L 139.300 93.000 C 137.091 96.827 138.403 101.721 142.230 103.930 C 146.057 106.139 150.951 104.827 153.160 101.000 L 179.160 56.000 C 200.208 70.857 213.676 94.202 216.000 119.860 C 216.000 119.930 216.000 119.980 216.000 120.000 L 164.000 120.000 C 159.582 120.000 156.000 123.582 156.000 128.000 C 156.000 132.418 159.582 136.000 164.000 136.000 L 216.000 136.000 C 220.476 135.985 224.741 134.095 227.760 130.790 C 230.822 127.433 232.335 122.946 231.930 118.420 ZM 152.930 155.180 C 150.721 151.353 145.827 150.041 142.000 152.250 C 138.173 154.459 136.861 159.353 139.070 163.180 L 164.910 207.910 C 141.489 218.697 114.521 218.697 91.100 207.910 L 116.930 163.180 C 119.139 159.353 117.827 154.459 114.000 152.250 C 110.173 150.041 105.279 151.353 103.070 155.180 L 77.250 199.910 C 75.002 203.800 74.493 208.455 75.847 212.739 C 77.202 217.023 80.295 220.539 84.370 222.430 C 112.057 235.190 143.943 235.190 171.630 222.430 C 175.705 220.539 178.798 217.023 180.153 212.739 C 181.507 208.455 180.998 203.800 178.750 199.910 ZM 128.000 140.000 C 134.627 140.000 140.000 134.627 140.000 128.000 C 140.000 121.373 134.627 116.000 128.000 116.000 C 121.373 116.000 116.000 121.373 116.000 128.000 C 116.000 134.627 121.373 140.000 128.000 140.000 Z"),
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
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
