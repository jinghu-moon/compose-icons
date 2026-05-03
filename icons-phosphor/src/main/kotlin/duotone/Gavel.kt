package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = phosphorDuotoneIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 149.660 45.660 L 85.660 109.660 C 84.159 111.162 82.123 112.006 80.000 112.006 C 77.877 112.006 75.841 111.162 74.340 109.660 L 58.340 93.660 C 56.838 92.159 55.994 90.123 55.994 88.000 C 55.994 85.877 56.838 83.841 58.340 82.340 L 122.340 18.340 C 123.841 16.838 125.877 15.994 128.000 15.994 C 130.123 15.994 132.159 16.838 133.660 18.340 L 149.660 34.340 C 151.162 35.841 152.006 37.877 152.006 40.000 C 152.006 42.123 151.162 44.159 149.660 45.660 ZM 237.660 122.340 L 221.660 106.340 C 220.159 104.838 218.123 103.994 216.000 103.994 C 213.877 103.994 211.841 104.838 210.340 106.340 L 146.340 170.340 C 144.838 171.841 143.994 173.877 143.994 176.000 C 143.994 178.123 144.838 180.159 146.340 181.660 L 162.340 197.660 C 163.841 199.162 165.877 200.006 168.000 200.006 C 170.123 200.006 172.159 199.162 173.660 197.660 L 237.660 133.660 C 239.162 132.159 240.006 130.123 240.006 128.000 C 240.006 125.877 239.162 123.841 237.660 122.340 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 243.320 116.690 L 227.320 100.690 C 221.712 95.088 212.847 94.437 206.480 99.160 L 156.840 49.520 C 161.566 43.156 160.919 34.291 155.320 28.680 L 139.320 12.680 C 136.319 9.679 132.249 7.992 128.005 7.992 C 123.761 7.992 119.691 9.679 116.690 12.680 L 52.690 76.680 C 49.689 79.681 48.002 83.751 48.002 87.995 C 48.002 92.239 49.689 96.309 52.690 99.310 L 68.690 115.310 C 74.300 120.903 83.158 121.550 89.520 116.830 L 96.690 124.000 L 31.310 189.380 C 22.286 199.249 22.627 214.472 32.083 223.927 C 41.538 233.383 56.761 233.724 66.630 224.700 L 132.000 159.320 L 139.170 166.480 C 134.444 172.844 135.091 181.709 140.690 187.320 L 156.690 203.320 C 159.691 206.321 163.761 208.008 168.005 208.008 C 172.249 208.008 176.319 206.321 179.320 203.320 L 243.320 139.320 C 246.321 136.319 248.008 132.249 248.008 128.005 C 248.008 123.761 246.321 119.691 243.320 116.690 ZM 80.000 104.000 L 64.000 88.000 L 128.000 24.000 L 144.000 40.000 ZM 55.320 213.380 C 51.810 216.870 46.140 216.870 42.630 213.380 C 39.147 209.871 39.147 204.209 42.630 200.700 L 108.000 135.320 L 120.690 148.000 ZM 101.000 105.660 L 145.660 61.000 L 195.000 110.340 L 150.350 155.000 ZM 168.000 192.000 L 152.000 176.000 L 156.000 172.000 L 156.000 172.000 L 212.000 116.000 L 212.000 116.000 L 216.000 112.000 L 232.000 128.000 Z"),
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
