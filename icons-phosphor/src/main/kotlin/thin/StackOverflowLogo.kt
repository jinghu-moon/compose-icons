package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) return _stackOverflowLogo!!
        _stackOverflowLogo = phosphorThinIcon(
            name = "StackOverflowLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 152.090 L 212.000 216.000 C 212.000 218.209 210.209 220.000 208.000 220.000 L 48.000 220.000 C 45.791 220.000 44.000 218.209 44.000 216.000 L 44.000 152.090 C 44.000 149.881 45.791 148.090 48.000 148.090 C 50.209 148.090 52.000 149.881 52.000 152.090 L 52.000 212.000 L 204.000 212.000 L 204.000 152.090 C 204.000 149.881 205.791 148.090 208.000 148.090 C 210.209 148.090 212.000 149.881 212.000 152.090 ZM 88.000 180.090 L 168.000 180.090 C 170.209 180.090 172.000 178.299 172.000 176.090 C 172.000 173.881 170.209 172.090 168.000 172.090 L 88.000 172.090 C 85.791 172.090 84.000 173.881 84.000 176.090 C 84.000 178.299 85.791 180.090 88.000 180.090 ZM 93.920 127.230 L 171.190 147.900 C 171.515 147.992 171.852 148.039 172.190 148.040 C 174.172 147.999 175.825 146.513 176.076 144.546 C 176.326 142.580 175.099 140.726 173.190 140.190 L 96.000 119.470 C 94.598 119.029 93.067 119.393 92.013 120.417 C 90.958 121.441 90.551 122.961 90.951 124.375 C 91.352 125.790 92.495 126.870 93.930 127.190 ZM 113.330 77.690 L 182.610 117.640 C 183.850 118.428 185.422 118.473 186.705 117.757 C 187.988 117.041 188.775 115.679 188.756 114.210 C 188.736 112.741 187.912 111.401 186.610 110.720 L 117.330 70.730 C 116.090 69.942 114.518 69.897 113.235 70.613 C 111.952 71.329 111.165 72.691 111.184 74.160 C 111.204 75.629 112.028 76.969 113.330 77.650 ZM 201.490 91.350 C 203.068 92.785 205.494 92.729 207.005 91.224 C 208.515 89.719 208.579 87.293 207.150 85.710 L 150.580 29.210 C 149.580 28.155 148.086 27.726 146.679 28.089 C 145.271 28.452 144.172 29.550 143.806 30.957 C 143.441 32.364 143.867 33.858 144.920 34.860 Z"),
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
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
