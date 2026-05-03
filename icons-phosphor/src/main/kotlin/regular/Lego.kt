package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = phosphorRegularIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.580 72.840 L 197.290 49.700 C 191.540 39.240 177.210 32.000 160.000 32.000 C 137.570 32.000 120.000 44.300 120.000 60.000 C 120.002 62.219 120.360 64.424 121.060 66.530 L 101.540 76.290 C 94.732 73.391 87.399 71.930 80.000 72.000 C 57.570 72.000 40.000 84.300 40.000 100.000 C 40.002 102.219 40.360 104.424 41.060 106.530 L 12.420 120.840 C 9.709 122.197 7.998 124.969 8.000 128.000 L 8.000 192.000 C 7.998 195.031 9.709 197.803 12.420 199.160 L 76.420 231.160 C 78.673 232.288 81.327 232.288 83.580 231.160 L 243.580 151.160 C 246.291 149.803 248.002 147.031 248.000 144.000 L 248.000 80.000 C 248.002 76.969 246.291 74.197 243.580 72.840 ZM 80.000 151.060 L 33.890 128.000 L 51.000 119.450 C 58.240 124.740 68.480 128.000 80.000 128.000 C 102.430 128.000 120.000 115.700 120.000 100.000 C 119.962 95.352 118.438 90.839 115.650 87.120 L 131.000 79.450 C 138.240 84.740 148.480 88.000 160.000 88.000 C 178.380 88.000 193.490 79.740 198.350 68.120 L 222.110 80.000 ZM 160.000 48.000 C 173.740 48.000 184.000 54.340 184.000 60.000 C 184.000 65.660 173.740 72.000 160.000 72.000 C 146.260 72.000 136.000 65.660 136.000 60.000 C 136.000 54.340 146.260 48.000 160.000 48.000 ZM 80.000 88.000 C 93.740 88.000 104.000 94.340 104.000 100.000 C 104.000 105.660 93.740 112.000 80.000 112.000 C 70.330 112.000 62.390 108.860 58.530 105.000 C 58.274 104.669 57.993 104.358 57.690 104.070 C 56.678 102.946 56.082 101.510 56.000 100.000 C 56.000 94.340 66.260 88.000 80.000 88.000 ZM 24.000 140.940 L 72.000 164.940 L 72.000 211.060 L 24.000 187.060 ZM 88.000 211.060 L 88.000 164.940 L 232.000 92.940 L 232.000 139.060 Z"),
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
        return _lego!!
    }

private var _lego: ImageVector? = null
