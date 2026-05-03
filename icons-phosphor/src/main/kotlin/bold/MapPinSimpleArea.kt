package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorBoldIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 106.320 L 116.000 176.000 C 116.000 182.627 121.373 188.000 128.000 188.000 C 134.627 188.000 140.000 182.627 140.000 176.000 L 140.000 106.320 C 161.127 100.331 174.604 79.681 171.581 57.930 C 168.558 36.180 149.960 19.988 128.000 19.988 C 106.040 19.988 87.442 36.180 84.419 57.930 C 81.396 79.681 94.873 100.331 116.000 106.320 ZM 128.000 44.000 C 139.046 44.000 148.000 52.954 148.000 64.000 C 148.000 75.046 139.046 84.000 128.000 84.000 C 116.954 84.000 108.000 75.046 108.000 64.000 C 108.000 52.954 116.954 44.000 128.000 44.000 ZM 244.000 176.000 C 244.000 197.590 220.100 210.000 205.850 215.480 C 184.860 223.560 157.220 228.000 128.000 228.000 C 70.360 228.000 12.000 210.140 12.000 176.000 C 12.000 153.770 38.120 135.800 81.880 127.940 C 86.129 127.114 90.493 128.641 93.301 131.934 C 96.109 135.228 96.926 139.778 95.438 143.843 C 93.951 147.908 90.391 150.856 86.120 151.560 C 51.930 157.710 36.000 169.780 36.000 176.000 C 36.000 180.000 43.120 187.070 58.770 193.080 C 77.070 200.080 101.660 204.000 128.000 204.000 C 154.340 204.000 178.930 200.120 197.230 193.080 C 212.870 187.070 220.000 180.000 220.000 176.000 C 220.000 169.780 204.070 157.710 169.880 151.560 C 165.609 150.856 162.049 147.908 160.562 143.843 C 159.074 139.778 159.891 135.228 162.699 131.934 C 165.507 128.641 169.871 127.114 174.120 127.940 C 217.880 135.800 244.000 153.770 244.000 176.000 Z"),
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
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
