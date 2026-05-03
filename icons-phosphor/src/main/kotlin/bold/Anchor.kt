package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorBoldIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 132.000 C 209.373 132.000 204.000 137.373 204.000 144.000 C 204.000 165.860 192.590 169.950 168.840 176.420 C 159.720 178.910 149.230 181.780 140.000 187.110 L 140.000 132.000 L 168.000 132.000 C 174.627 132.000 180.000 126.627 180.000 120.000 C 180.000 113.373 174.627 108.000 168.000 108.000 L 140.000 108.000 L 140.000 89.940 C 156.531 84.096 166.446 67.192 163.482 49.911 C 160.517 32.630 145.533 19.999 128.000 19.999 C 110.467 19.999 95.483 32.630 92.518 49.911 C 89.554 67.192 99.469 84.096 116.000 89.940 L 116.000 108.000 L 88.000 108.000 C 81.373 108.000 76.000 113.373 76.000 120.000 C 76.000 126.627 81.373 132.000 88.000 132.000 L 116.000 132.000 L 116.000 187.110 C 106.770 181.780 96.280 178.910 87.160 176.420 C 63.410 170.000 52.000 165.860 52.000 144.000 C 52.000 137.373 46.627 132.000 40.000 132.000 C 33.373 132.000 28.000 137.373 28.000 144.000 C 28.000 185.170 58.540 193.500 80.840 199.580 C 104.590 206.050 116.000 210.140 116.000 232.000 C 116.000 238.627 121.373 244.000 128.000 244.000 C 134.627 244.000 140.000 238.627 140.000 232.000 C 140.000 210.140 151.410 206.050 175.160 199.580 C 197.460 193.500 228.000 185.170 228.000 144.000 C 228.000 137.373 222.627 132.000 216.000 132.000 ZM 128.000 44.000 C 134.627 44.000 140.000 49.373 140.000 56.000 C 140.000 62.627 134.627 68.000 128.000 68.000 C 121.373 68.000 116.000 62.627 116.000 56.000 C 116.000 49.373 121.373 44.000 128.000 44.000 Z"),
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
        return _anchor!!
    }

private var _anchor: ImageVector? = null
