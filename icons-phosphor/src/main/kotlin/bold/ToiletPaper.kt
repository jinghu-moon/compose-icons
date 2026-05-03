package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) return _toiletPaper!!
        _toiletPaper = phosphorBoldIcon(
            name = "ToiletPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 80.000 120.000 C 80.000 128.837 72.837 136.000 64.000 136.000 C 55.163 136.000 48.000 128.837 48.000 120.000 C 48.000 111.163 55.163 104.000 64.000 104.000 C 72.837 104.000 80.000 111.163 80.000 120.000 ZM 244.000 120.000 L 244.000 208.000 C 244.000 219.046 235.046 228.000 224.000 228.000 L 112.000 228.000 C 100.954 228.000 92.000 219.046 92.000 208.000 L 92.000 198.390 C 84.000 207.070 74.460 212.000 64.000 212.000 C 34.350 212.000 12.000 172.450 12.000 120.000 C 12.000 67.550 34.350 28.000 64.000 28.000 L 192.000 28.000 C 221.650 28.000 244.000 67.550 244.000 120.000 ZM 92.000 120.000 C 92.000 100.740 88.190 82.080 81.550 68.800 C 76.290 58.280 69.730 52.000 64.000 52.000 C 58.270 52.000 51.710 58.280 46.450 68.800 C 39.810 82.080 36.000 100.740 36.000 120.000 C 36.000 139.260 39.810 157.920 46.450 171.200 C 51.710 181.720 58.270 188.000 64.000 188.000 C 69.730 188.000 76.290 181.720 81.550 171.200 C 88.190 157.920 92.000 139.260 92.000 120.000 ZM 220.000 204.000 L 220.000 132.000 L 212.000 132.000 C 205.373 132.000 200.000 126.627 200.000 120.000 C 200.000 113.373 205.373 108.000 212.000 108.000 L 219.500 108.000 C 218.270 93.150 214.800 79.290 209.550 68.800 C 204.300 58.310 197.730 52.000 192.000 52.000 L 99.740 52.000 C 108.350 66.110 114.090 85.560 115.600 108.000 L 124.000 108.000 C 130.627 108.000 136.000 113.373 136.000 120.000 C 136.000 126.627 130.627 132.000 124.000 132.000 L 116.000 132.000 L 116.000 204.000 ZM 172.000 108.000 L 164.000 108.000 C 157.373 108.000 152.000 113.373 152.000 120.000 C 152.000 126.627 157.373 132.000 164.000 132.000 L 172.000 132.000 C 178.627 132.000 184.000 126.627 184.000 120.000 C 184.000 113.373 178.627 108.000 172.000 108.000 Z"),
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
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
