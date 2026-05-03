package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorBoldIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 12.000 C 72.797 12.061 28.061 56.797 28.000 112.000 C 28.000 136.860 40.860 168.800 62.410 197.440 C 70.630 208.360 99.640 244.000 128.000 244.000 C 156.360 244.000 185.370 208.360 193.590 197.440 C 215.140 168.800 228.000 136.860 228.000 112.000 C 227.939 56.797 183.203 12.061 128.000 12.000 ZM 174.410 183.000 C 160.580 201.380 140.200 220.000 128.000 220.000 C 115.800 220.000 95.420 201.390 81.590 183.000 C 63.340 158.750 52.000 131.540 52.000 112.000 C 52.000 70.026 86.026 36.000 128.000 36.000 C 169.974 36.000 204.000 70.026 204.000 112.000 C 204.000 131.540 192.660 158.750 174.410 183.000 ZM 104.000 148.000 C 84.118 148.000 68.000 131.882 68.000 112.000 C 68.000 105.373 73.373 100.000 80.000 100.000 C 99.882 100.000 116.000 116.118 116.000 136.000 C 116.000 142.627 110.627 148.000 104.000 148.000 ZM 188.000 112.000 C 188.000 131.882 171.882 148.000 152.000 148.000 C 145.373 148.000 140.000 142.627 140.000 136.000 C 140.000 116.118 156.118 100.000 176.000 100.000 C 182.627 100.000 188.000 105.373 188.000 112.000 ZM 152.000 184.000 C 152.000 190.627 146.627 196.000 140.000 196.000 L 116.000 196.000 C 109.373 196.000 104.000 190.627 104.000 184.000 C 104.000 177.373 109.373 172.000 116.000 172.000 L 140.000 172.000 C 146.627 172.000 152.000 177.373 152.000 184.000 Z"),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
