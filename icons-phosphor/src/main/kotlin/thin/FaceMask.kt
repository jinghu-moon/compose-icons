package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = phosphorThinIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 104.000 C 172.000 106.209 170.209 108.000 168.000 108.000 L 88.000 108.000 C 85.791 108.000 84.000 106.209 84.000 104.000 C 84.000 101.791 85.791 100.000 88.000 100.000 L 168.000 100.000 C 170.209 100.000 172.000 101.791 172.000 104.000 ZM 168.000 132.000 L 88.000 132.000 C 85.791 132.000 84.000 133.791 84.000 136.000 C 84.000 138.209 85.791 140.000 88.000 140.000 L 168.000 140.000 C 170.209 140.000 172.000 138.209 172.000 136.000 C 172.000 133.791 170.209 132.000 168.000 132.000 ZM 252.000 104.000 L 252.000 128.000 C 252.000 143.464 239.464 156.000 224.000 156.000 L 216.160 156.000 C 209.750 172.000 195.420 185.760 173.790 196.580 C 159.482 203.598 144.336 208.760 128.720 211.940 C 128.243 212.020 127.757 212.020 127.280 211.940 C 111.664 208.760 96.518 203.598 82.210 196.580 C 60.580 185.760 46.250 172.000 39.840 156.000 L 32.000 156.000 C 16.536 156.000 4.000 143.464 4.000 128.000 L 4.000 104.000 C 4.000 88.536 16.536 76.000 32.000 76.000 L 36.060 76.000 C 36.480 71.372 39.534 67.402 43.900 65.810 L 123.900 36.720 C 126.549 35.757 129.451 35.757 132.100 36.720 L 212.100 65.810 C 216.466 67.402 219.520 71.372 219.940 76.000 L 224.000 76.000 C 239.464 76.000 252.000 88.536 252.000 104.000 ZM 37.350 148.000 C 36.450 144.063 35.997 140.038 36.000 136.000 L 36.000 84.000 L 32.000 84.000 C 20.954 84.000 12.000 92.954 12.000 104.000 L 12.000 128.000 C 12.000 139.046 20.954 148.000 32.000 148.000 ZM 212.000 136.000 L 212.000 77.090 C 212.001 75.408 210.950 73.906 209.370 73.330 L 129.370 44.240 C 128.485 43.917 127.515 43.917 126.630 44.240 L 46.630 73.330 C 45.050 73.906 43.999 75.408 44.000 77.090 L 44.000 136.000 C 44.000 185.420 119.760 202.240 128.000 203.920 C 136.240 202.240 212.000 185.420 212.000 136.000 ZM 244.000 104.000 C 244.000 92.954 235.046 84.000 224.000 84.000 L 220.000 84.000 L 220.000 136.000 C 220.003 140.038 219.550 144.063 218.650 148.000 L 224.000 148.000 C 235.046 148.000 244.000 139.046 244.000 128.000 Z"),
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
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
