package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = phosphorLightIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 46.000 56.000 L 46.000 200.000 C 46.000 203.314 43.314 206.000 40.000 206.000 C 36.686 206.000 34.000 203.314 34.000 200.000 L 34.000 56.000 C 34.000 52.686 36.686 50.000 40.000 50.000 C 43.314 50.000 46.000 52.686 46.000 56.000 ZM 140.580 112.410 L 118.000 119.740 L 118.000 96.000 C 118.000 92.686 115.314 90.000 112.000 90.000 C 108.686 90.000 106.000 92.686 106.000 96.000 L 106.000 119.740 L 83.420 112.410 C 81.369 111.702 79.096 112.156 77.474 113.597 C 75.853 115.039 75.136 117.243 75.600 119.363 C 76.063 121.483 77.635 123.187 79.710 123.820 L 102.290 131.150 L 88.290 150.360 C 86.973 152.090 86.695 154.397 87.564 156.391 C 88.432 158.384 90.311 159.752 92.475 159.965 C 94.638 160.179 96.749 159.205 97.990 157.420 L 111.990 138.210 L 125.990 157.420 C 127.967 160.017 131.656 160.557 134.295 158.637 C 136.934 156.716 137.553 153.039 135.690 150.360 L 121.690 131.150 L 144.270 123.820 C 146.345 123.187 147.917 121.483 148.380 119.363 C 148.844 117.243 148.127 115.039 146.506 113.597 C 144.884 112.156 142.611 111.702 140.560 112.410 ZM 244.140 116.260 C 243.115 113.110 239.731 111.386 236.580 112.410 L 214.000 119.740 L 214.000 96.000 C 214.000 92.686 211.314 90.000 208.000 90.000 C 204.686 90.000 202.000 92.686 202.000 96.000 L 202.000 119.740 L 179.420 112.410 C 177.369 111.702 175.096 112.156 173.474 113.597 C 171.853 115.039 171.136 117.243 171.600 119.363 C 172.063 121.483 173.635 123.187 175.710 123.820 L 198.290 131.150 L 184.340 150.360 C 183.023 152.090 182.745 154.397 183.614 156.391 C 184.482 158.384 186.361 159.752 188.525 159.965 C 190.688 160.179 192.799 159.205 194.040 157.420 L 208.040 138.210 L 222.040 157.420 C 224.017 160.017 227.706 160.557 230.345 158.637 C 232.984 156.716 233.603 153.039 231.740 150.360 L 217.790 131.150 L 240.370 123.820 C 243.488 122.762 245.171 119.388 244.140 116.260 Z"),
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
        return _password!!
    }

private var _password: ImageVector? = null
