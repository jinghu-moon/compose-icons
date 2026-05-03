package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) return _stackOverflowLogo!!
        _stackOverflowLogo = phosphorLightIcon(
            name = "StackOverflowLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.000 152.090 L 214.000 216.000 C 214.000 219.314 211.314 222.000 208.000 222.000 L 48.000 222.000 C 44.686 222.000 42.000 219.314 42.000 216.000 L 42.000 152.090 C 42.000 148.776 44.686 146.090 48.000 146.090 C 51.314 146.090 54.000 148.776 54.000 152.090 L 54.000 210.000 L 202.000 210.000 L 202.000 152.090 C 202.000 148.776 204.686 146.090 208.000 146.090 C 211.314 146.090 214.000 148.776 214.000 152.090 ZM 88.000 182.090 L 168.000 182.090 C 171.314 182.090 174.000 179.404 174.000 176.090 C 174.000 172.776 171.314 170.090 168.000 170.090 L 88.000 170.090 C 84.686 170.090 82.000 172.776 82.000 176.090 C 82.000 179.404 84.686 182.090 88.000 182.090 ZM 93.400 129.160 L 170.670 149.830 C 172.782 150.528 175.108 150.001 176.712 148.459 C 178.316 146.917 178.935 144.614 178.320 142.476 C 177.705 140.337 175.958 138.715 173.780 138.260 L 96.500 117.540 C 94.395 116.873 92.093 117.417 90.509 118.955 C 88.925 120.493 88.313 122.777 88.917 124.901 C 89.521 127.025 91.243 128.646 93.400 129.120 ZM 112.330 79.420 L 181.610 119.420 C 182.523 119.943 183.557 120.219 184.610 120.220 C 187.315 120.208 189.676 118.387 190.377 115.775 C 191.078 113.163 189.945 110.405 187.610 109.040 L 118.330 69.000 C 116.470 67.818 114.112 67.750 112.187 68.824 C 110.263 69.898 109.082 71.941 109.112 74.145 C 109.142 76.348 110.377 78.358 112.330 79.380 ZM 200.080 92.770 C 202.444 94.973 206.128 94.908 208.413 92.623 C 210.698 90.338 210.763 86.654 208.560 84.290 L 152.000 27.760 C 150.514 26.118 148.245 25.428 146.097 25.965 C 143.949 26.502 142.271 28.178 141.732 30.325 C 141.193 32.473 141.880 34.742 143.520 36.230 Z"),
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
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
