package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Binary: ImageVector
    get() {
        if (_binary != null) return _binary!!
        _binary = phosphorBoldIcon(
            name = "Binary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 24.000 C 68.450 24.000 52.000 43.740 52.000 72.000 C 52.000 100.260 68.450 120.000 92.000 120.000 C 115.550 120.000 132.000 100.260 132.000 72.000 C 132.000 43.740 115.550 24.000 92.000 24.000 ZM 92.000 96.000 C 76.450 96.000 76.000 74.460 76.000 72.000 C 76.000 69.540 76.450 48.000 92.000 48.000 C 107.550 48.000 108.000 69.540 108.000 72.000 C 108.000 74.460 107.550 96.000 92.000 96.000 ZM 145.270 53.370 C 142.305 47.444 144.705 40.236 150.630 37.270 L 174.630 25.270 C 178.350 23.409 182.768 23.606 186.307 25.792 C 189.845 27.978 192.000 31.841 192.000 36.000 L 192.000 108.000 C 192.000 114.627 186.627 120.000 180.000 120.000 C 173.373 120.000 168.000 114.627 168.000 108.000 L 168.000 55.420 L 161.370 58.730 C 155.444 61.695 148.236 59.295 145.270 53.370 ZM 164.000 136.000 C 140.450 136.000 124.000 155.740 124.000 184.000 C 124.000 212.260 140.450 232.000 164.000 232.000 C 187.550 232.000 204.000 212.260 204.000 184.000 C 204.000 155.740 187.550 136.000 164.000 136.000 ZM 164.000 208.000 C 148.450 208.000 148.000 186.460 148.000 184.000 C 148.000 181.540 148.450 160.000 164.000 160.000 C 179.550 160.000 180.000 181.540 180.000 184.000 C 180.000 186.460 179.550 208.000 164.000 208.000 ZM 104.000 148.000 L 104.000 220.000 C 104.000 226.627 98.627 232.000 92.000 232.000 C 85.373 232.000 80.000 226.627 80.000 220.000 L 80.000 167.420 L 73.370 170.730 C 69.528 172.723 64.910 172.492 61.285 170.126 C 57.660 167.760 55.591 163.625 55.869 159.305 C 56.148 154.986 58.731 151.151 62.630 149.270 L 86.630 137.270 C 90.350 135.409 94.768 135.606 98.307 137.792 C 101.845 139.978 104.000 143.841 104.000 148.000 Z"),
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
        return _binary!!
    }

private var _binary: ImageVector? = null
