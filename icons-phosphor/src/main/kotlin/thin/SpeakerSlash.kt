package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) return _speakerSlash!!
        _speakerSlash = phosphorThinIcon(
            name = "SpeakerSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 81.000 82.190 L 78.630 84.000 L 32.000 84.000 C 25.373 84.000 20.000 89.373 20.000 96.000 L 20.000 160.000 C 20.000 166.627 25.373 172.000 32.000 172.000 L 78.630 172.000 L 149.540 227.160 C 150.246 227.701 151.110 227.996 152.000 228.000 C 152.611 228.002 153.213 227.862 153.760 227.590 C 155.130 226.919 155.999 225.526 156.000 224.000 L 156.000 164.750 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 28.000 160.000 L 28.000 96.000 C 28.000 93.791 29.791 92.000 32.000 92.000 L 76.000 92.000 L 76.000 164.000 L 32.000 164.000 C 29.791 164.000 28.000 162.209 28.000 160.000 ZM 148.000 215.820 L 84.000 166.000 L 84.000 90.000 L 86.350 88.170 L 148.000 156.000 ZM 189.000 146.520 C 198.310 135.943 198.310 120.097 189.000 109.520 C 188.028 108.452 187.707 106.943 188.161 105.572 C 188.614 104.201 189.771 103.181 191.188 102.903 C 192.605 102.625 194.062 103.132 195.000 104.230 C 206.980 117.831 206.980 138.219 195.000 151.820 C 194.062 152.918 192.605 153.425 191.188 153.147 C 189.771 152.869 188.614 151.849 188.161 150.478 C 187.707 149.107 188.028 147.598 189.000 146.530 ZM 109.000 65.450 C 107.646 63.707 107.959 61.197 109.700 59.840 L 149.550 28.840 C 150.756 27.905 152.389 27.738 153.760 28.410 C 155.130 29.081 155.999 30.474 156.000 32.000 L 156.000 106.830 C 156.000 109.039 154.209 110.830 152.000 110.830 C 149.791 110.830 148.000 109.039 148.000 106.830 L 148.000 40.180 L 114.610 66.180 C 113.769 66.827 112.706 67.114 111.654 66.977 C 110.602 66.840 109.647 66.291 109.000 65.450 ZM 244.000 128.000 C 244.013 146.697 237.122 164.741 224.650 178.670 C 223.175 180.327 220.637 180.475 218.980 179.000 C 217.323 177.525 217.175 174.987 218.650 173.330 C 241.734 147.518 241.734 108.482 218.650 82.670 C 217.175 81.013 217.323 78.475 218.980 77.000 C 220.637 75.525 223.175 75.673 224.650 77.330 C 237.122 91.259 244.013 109.303 244.000 128.000 Z"),
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
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
