package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = phosphorBoldIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 209.370 60.270 C 188.080 49.620 160.000 44.000 128.000 44.000 C 96.000 44.000 67.920 49.620 46.630 60.270 C 24.620 71.270 12.000 87.210 12.000 104.000 L 12.000 152.000 C 12.000 168.790 24.620 184.730 46.630 195.730 C 67.920 206.380 96.050 212.000 128.000 212.000 C 159.950 212.000 188.080 206.380 209.370 195.730 C 231.370 184.730 244.000 168.790 244.000 152.000 L 244.000 104.000 C 244.000 87.210 231.380 71.270 209.370 60.270 ZM 57.370 81.730 C 75.080 72.880 100.160 68.000 128.000 68.000 C 155.840 68.000 180.920 72.880 198.630 81.730 C 211.810 88.320 220.000 96.860 220.000 104.000 C 220.000 111.140 211.810 119.680 198.630 126.270 C 180.920 135.120 155.840 140.000 128.000 140.000 C 100.160 140.000 75.080 135.120 57.370 126.270 C 44.190 119.680 36.000 111.140 36.000 104.000 C 36.000 96.860 44.190 88.320 57.370 81.730 ZM 180.000 181.380 C 166.945 184.975 153.528 187.088 140.000 187.680 L 140.000 163.680 C 153.479 163.130 166.874 161.285 180.000 158.170 ZM 76.000 158.220 C 89.126 161.335 102.521 163.180 116.000 163.730 L 116.000 187.730 C 102.472 187.138 89.055 185.025 76.000 181.430 ZM 36.000 152.000 L 36.000 141.540 C 39.405 143.832 42.956 145.900 46.630 147.730 C 48.370 148.600 50.170 149.430 52.000 150.230 L 52.000 171.300 C 42.000 165.240 36.000 158.110 36.000 152.000 ZM 204.000 171.300 L 204.000 150.230 C 205.830 149.430 207.630 148.600 209.370 147.730 C 213.044 145.900 216.595 143.832 220.000 141.540 L 220.000 152.000 C 220.000 158.110 214.000 165.240 204.000 171.300 Z"),
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
        return _coin!!
    }

private var _coin: ImageVector? = null
