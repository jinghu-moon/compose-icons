package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = phosphorBoldIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 245.360 77.280 L 245.360 77.280 L 203.740 56.450 C 201.380 40.240 183.000 28.000 160.000 28.000 C 135.330 28.000 116.000 42.060 116.000 60.000 C 116.006 63.905 116.928 67.755 118.690 71.240 L 109.290 75.940 C 101.560 71.000 91.350 68.000 80.000 68.000 C 55.330 68.000 36.000 82.060 36.000 100.000 C 36.006 103.905 36.928 107.755 38.690 111.240 L 10.630 125.240 C 6.557 127.278 3.989 131.446 4.000 136.000 L 4.000 136.000 L 4.000 192.000 C 4.001 196.543 6.567 200.697 10.630 202.730 L 74.630 234.730 C 78.010 236.421 81.990 236.421 85.370 234.730 L 245.370 154.730 C 249.433 152.697 251.999 148.543 252.000 144.000 L 252.000 88.000 C 251.994 83.458 249.424 79.309 245.360 77.280 ZM 80.000 154.580 L 42.830 136.000 L 58.640 128.100 C 65.452 130.728 72.698 132.051 80.000 132.000 C 104.670 132.000 124.000 117.940 124.000 100.000 C 123.994 98.531 123.860 97.066 123.600 95.620 L 138.600 88.100 C 145.425 90.733 152.685 92.056 160.000 92.000 C 174.720 92.000 187.530 87.000 195.470 79.150 L 213.170 88.000 ZM 160.000 52.000 C 172.910 52.000 180.000 58.000 180.000 60.000 C 180.000 62.000 172.910 68.000 160.000 68.000 C 147.090 68.000 140.000 62.000 140.000 60.000 C 140.000 58.000 147.090 52.000 160.000 52.000 ZM 80.000 92.000 C 92.910 92.000 100.000 98.000 100.000 100.000 C 100.000 102.000 92.910 108.000 80.000 108.000 C 67.090 108.000 60.000 102.000 60.000 100.000 C 60.000 98.000 67.090 92.000 80.000 92.000 ZM 28.000 155.420 L 68.000 175.420 L 68.000 204.580 L 28.000 184.580 ZM 92.000 204.580 L 92.000 175.420 L 228.000 107.420 L 228.000 136.580 Z"),
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
        return _lego!!
    }

private var _lego: ImageVector? = null
