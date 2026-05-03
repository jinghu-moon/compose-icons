package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = phosphorFillIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 52.690 99.310 C 49.689 96.309 48.002 92.239 48.002 87.995 C 48.002 83.751 49.689 79.681 52.690 76.680 L 116.690 12.680 C 122.939 6.431 133.071 6.431 139.320 12.680 C 145.569 18.929 145.569 29.061 139.320 35.310 L 75.320 99.310 C 72.319 102.311 68.249 103.998 64.005 103.998 C 59.761 103.998 55.691 102.311 52.690 99.310 ZM 243.320 116.680 C 240.319 113.679 236.249 111.992 232.005 111.992 C 227.761 111.992 223.691 113.679 220.690 116.680 L 156.690 180.680 C 153.689 183.681 152.002 187.751 152.002 191.995 C 152.002 196.239 153.689 200.309 156.690 203.310 L 156.690 203.310 C 159.691 206.311 163.761 207.998 168.005 207.998 C 172.249 207.998 176.319 206.311 179.320 203.310 L 243.320 139.310 C 246.321 136.309 248.008 132.239 248.008 127.995 C 248.008 123.751 246.321 119.681 243.320 116.680 ZM 208.210 100.880 L 155.120 47.790 C 154.370 47.039 153.352 46.617 152.290 46.617 C 151.228 46.617 150.210 47.039 149.460 47.790 L 87.800 109.450 C 87.049 110.200 86.627 111.218 86.627 112.280 C 86.627 113.342 87.049 114.360 87.800 115.110 L 103.000 130.340 L 28.690 204.690 C 22.714 210.981 22.840 220.889 28.976 227.024 C 35.112 233.160 45.019 233.286 51.310 227.310 L 125.660 153.000 L 140.890 168.230 C 141.640 168.981 142.658 169.403 143.720 169.403 C 144.782 169.403 145.800 168.981 146.550 168.230 L 208.210 106.570 C 208.970 105.819 209.398 104.794 209.398 103.725 C 209.398 102.656 208.970 101.631 208.210 100.880 Z"),
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
        return _gavel!!
    }

private var _gavel: ImageVector? = null
