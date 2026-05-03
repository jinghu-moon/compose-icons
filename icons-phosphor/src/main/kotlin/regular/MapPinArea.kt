package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorRegularIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 112.000 80.000 C 112.000 71.163 119.163 64.000 128.000 64.000 C 136.837 64.000 144.000 71.163 144.000 80.000 C 144.000 88.837 136.837 96.000 128.000 96.000 C 119.163 96.000 112.000 88.837 112.000 80.000 ZM 64.000 80.000 C 64.000 44.654 92.654 16.000 128.000 16.000 C 163.346 16.000 192.000 44.654 192.000 80.000 C 192.000 139.950 134.420 173.540 132.000 174.950 C 129.540 176.356 126.520 176.356 124.060 174.950 C 121.580 173.540 64.000 140.000 64.000 80.000 ZM 80.000 80.000 C 80.000 122.200 115.840 150.210 128.000 158.500 C 140.150 150.220 176.000 122.200 176.000 80.000 C 176.000 53.490 154.510 32.000 128.000 32.000 C 101.490 32.000 80.000 53.490 80.000 80.000 ZM 202.770 147.630 C 198.677 146.278 194.249 148.411 192.756 152.455 C 191.263 156.498 193.241 160.997 197.230 162.630 C 213.740 168.740 224.000 176.920 224.000 184.000 C 224.000 197.360 187.480 216.000 128.000 216.000 C 68.520 216.000 32.000 197.360 32.000 184.000 C 32.000 176.920 42.260 168.740 58.770 162.640 C 62.759 161.007 64.737 156.508 63.244 152.465 C 61.751 148.421 57.323 146.288 53.230 147.640 C 29.220 156.490 16.000 169.410 16.000 184.000 C 16.000 215.180 73.710 232.000 128.000 232.000 C 182.290 232.000 240.000 215.180 240.000 184.000 C 240.000 169.410 226.780 156.490 202.770 147.630 Z"),
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
        return _mapPinArea!!
    }

private var _mapPinArea: ImageVector? = null
