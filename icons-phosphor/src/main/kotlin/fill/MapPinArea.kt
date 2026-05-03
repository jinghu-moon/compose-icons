package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorFillIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 124.000 175.000 C 126.460 176.406 129.480 176.406 131.940 175.000 C 134.390 173.590 191.940 140.000 191.940 80.050 C 190.895 45.482 162.578 17.998 127.994 17.984 C 93.411 17.971 65.072 45.433 64.000 80.000 C 64.000 140.000 121.580 173.540 124.000 175.000 ZM 128.000 56.000 C 141.255 56.000 152.000 66.745 152.000 80.000 C 152.000 93.255 141.255 104.000 128.000 104.000 C 114.745 104.000 104.000 93.255 104.000 80.000 C 104.000 66.745 114.745 56.000 128.000 56.000 ZM 240.000 184.000 C 240.000 215.180 182.290 232.000 128.000 232.000 C 73.710 232.000 16.000 215.180 16.000 184.000 C 16.000 169.410 29.220 156.490 53.230 147.630 C 57.323 146.278 61.751 148.411 63.244 152.455 C 64.737 156.498 62.759 160.997 58.770 162.630 C 42.260 168.740 32.000 176.920 32.000 184.000 C 32.000 197.360 68.520 216.000 128.000 216.000 C 187.480 216.000 224.000 197.360 224.000 184.000 C 224.000 176.920 213.740 168.740 197.230 162.640 C 193.241 161.007 191.263 156.508 192.756 152.465 C 194.249 148.421 198.677 146.288 202.770 147.640 C 226.780 156.490 240.000 169.410 240.000 184.000 Z"),
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
